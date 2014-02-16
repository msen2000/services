/*
 * @(#)EdifecsServiceImpl.java 1.0 Oct 22, 2008
 * Copyrights 2008 Delta Dental, Inc. All rights reserved.
 * DELTA DENTAL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.delta.crossplane.edifecs.service.impl;

import org.delta.crossplane.common.service.AbstractService;
import org.delta.crossplane.domain.EdifecsRequestResponse;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.delta.crossplane.edifecs.service.EdifecsService;

import org.delta.crossplane.edifecs.dao.EdifecsDao;
import org.delta.crossplane.edifecs.request.ReportType;
import org.delta.crossplane.edifecs.request.impl.*;

import org.delta.crossplane.transport.CrossPlaneTransportException;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

/***************************************************************************************************
 * 
 * The <code>EdifecsServiceImpl</code> class is TODO.
 * 
 * <pre> 
 * <strong>Copyrights</strong> Copyrights 2008 Delta Dental, Inc. All rights reserved.
 * <strong>Date</strong>       Oct 22, 2008
 *
 * <strong>History</strong>    Name              Date            Description
 * <strong>History</strong>    --------------------------------------------------------------------
 * <strong>History</strong>    Sridevi S    Oct 30, 2008     Created.
 * </pre>
 * 
 * @author Sridevi S
 * @version 1.0
 * 
 **************************************************************************************************/

public class EdifecsServiceImpl implements EdifecsService {

	private static final Log logger = LogFactory
			.getLog(EdifecsServiceImpl.class);

	private static final String EDIFECS_PACKAGE_PREFIX = "org.delta.crossplane.edifecs.";

	private static final String EDIFECS_PACKAGE_REQUEST_PACKAGE = EDIFECS_PACKAGE_PREFIX
	+ "request";

	private static final String EDIFECS_PACKAGE_RESPONSE_PACKAGE = EDIFECS_PACKAGE_PREFIX
	+ "response";

	private static final String CDATA_START = "<![CDATA[\"";
	private static final String CDATA_END = "\"]]]>";
	
	private EdifecsDao edifecsDao;

	public EdifecsDao getEdifecsDao() {
		return edifecsDao;
	}

	public void setEdifecsDao(EdifecsDao edifecsDao) {
		this.edifecsDao = edifecsDao;
	}
	
	public String invokeEdifecsService(String xmlRequest) throws CrossPlaneTransportException{
		
		EdifecsRequestResponse edifecsRequestResponse = null;
		if (logger.isTraceEnabled()) {
			logger.trace("before unmarshal ");
		}
		edifecsRequestResponse = unmarshalXMLRequest(xmlRequest);
		
		if(edifecsRequestResponse == null){
			// TODO create a new Edifecs exception class
			throw new CrossPlaneTransportException("Error while parsing the xml request.");
		}
		
		String xmlResponse = null;
		if (logger.isTraceEnabled()) {
			logger.trace("before validate and transform");
		}
		validateAndTransform(edifecsRequestResponse);
		
//		if (edifecsRequestResponse.isTransform() && edifecsRequestResponse.isValidate()) {
//			xmlResponse = validateAndTransform(edifecsRequestResponse.getEdiRequest());
//		} else if (edifecsRequestResponse.isValidate()) {
//			xmlResponse = validate(edifecsRequestResponse.getEdiRequest());
//		} else if (edifecsRequestResponse.isTransform()) {
//			xmlResponse = transform(edifecsRequestResponse.getEdiRequest());
//		}
		
//		// Set result data to 
//		edifecsRequestResponse.setAuditResponse(xmlResponse);
		if (logger.isTraceEnabled()) {
			logger.trace("before marshall");
		}
		xmlResponse = marshalXMLResponse(edifecsRequestResponse);
		
		return xmlResponse;
	}

	private String marshalXMLResponse(EdifecsRequestResponse edifecsRequestResponse){
		String xmlResponse = null;
		if(edifecsRequestResponse == null) {
			throw new IllegalArgumentException(
			"Reponse object is null.");
		}
		try {
			// Set validate and tranform detail in response
			org.delta.crossplane.edifecs.response.Operation operation = new org.delta.crossplane.edifecs.response.impl.OperationImpl();
			operation.setValidate(edifecsRequestResponse.isValidate());
			operation.setTransform(edifecsRequestResponse.isTransform());

			org.delta.crossplane.edifecs.response.Header header = new org.delta.crossplane.edifecs.response.impl.HeaderImpl();
			header.setOperation(operation);

			// Set Output tag values in response
			org.delta.crossplane.edifecs.response.Output output = new org.delta.crossplane.edifecs.response.impl.OutputImpl();
			List<org.delta.crossplane.edifecs.response.Report> lReports = output.getReport();
			// Set individual report name, type and audit result data in response
			List<org.delta.crossplane.domain.EdifecsReport> lVoReports = edifecsRequestResponse.getReports();
			for(Iterator<org.delta.crossplane.domain.EdifecsReport> itReport = lVoReports.iterator(); itReport.hasNext();) {
				org.delta.crossplane.domain.EdifecsReport voReport = (org.delta.crossplane.domain.EdifecsReport)itReport.next();
				org.delta.crossplane.edifecs.response.Report report = new org.delta.crossplane.edifecs.response.impl.ReportImpl();
				report.setName(voReport.getReportName());
				report.setType(voReport.getReportType());
				report.setData(CDATA_START + voReport.getReportData() + CDATA_END);
				lReports.add(report);
			}
			
			org.delta.crossplane.edifecs.response.EdifecsServiceResponse response = new org.delta.crossplane.edifecs.response.impl.EdifecsServiceResponseImpl();
			response.setHeader(header);
			response.setOutput(output);

			// Marshal the request object into XML string.
			JAXBContext jc = JAXBContext.newInstance(EDIFECS_PACKAGE_RESPONSE_PACKAGE, getClass().getClassLoader());
			Marshaller marshaller = jc.createMarshaller();

//			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT);

			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			marshaller.marshal(response, stream);
			xmlResponse = stream.toString();

			if (logger.isTraceEnabled()) {
				logger.trace("Response :: " + xmlResponse);
			}
		} catch (JAXBException jxbe) {
			throw new CrossPlaneTransportException(jxbe);
		}
		return xmlResponse;
	}
	
	private EdifecsRequestResponse unmarshalXMLRequest(String xmlRequest) {
		
		EdifecsRequestResponse edifecsRequestResponse = null;
			
		if(StringUtils.isBlank(xmlRequest)) {
			throw new IllegalArgumentException(
			"Request to Edifecs service cannot be null.");
		}
		
		try {
			edifecsRequestResponse = new EdifecsRequestResponse();
			
			JAXBContext requestJc = JAXBContext.newInstance(
					EDIFECS_PACKAGE_REQUEST_PACKAGE, this.getClass()
							.getClassLoader());
			Unmarshaller u = requestJc.createUnmarshaller();

			org.delta.crossplane.edifecs.request.EdifecsServiceRequest requestMessage = (org.delta.crossplane.edifecs.request.EdifecsServiceRequest) u
					.unmarshal(new StreamSource(new StringReader(xmlRequest)));

			if (logger.isDebugEnabled()) {
				logger.debug("Request :: "
						+ requestMessage.getClass());
			}
			
			// Set validate in VO
			boolean isValidate = false;
			isValidate = requestMessage.getHeader().getOperation().isValidate();
			edifecsRequestResponse.setValidate(isValidate);
			
			// Set transform in VO
			boolean isTransform = false;
			isTransform = requestMessage.getHeader().getOperation().isTransform();
			edifecsRequestResponse.setTransform(isTransform);
			
			// Set list of Report Requests in VO
			List<ReportType> reports = requestMessage.getOutput().getReport(); // This ReportType is from jaxb generated classes
			List<org.delta.crossplane.domain.EdifecsReport> voReports = new ArrayList<org.delta.crossplane.domain.EdifecsReport>(); // This Report class is value object
			
			for (Iterator<ReportType> itReport =  reports.iterator(); 
													   itReport.hasNext();){
				ReportType report = itReport.next();
				org.delta.crossplane.domain.EdifecsReport voReport = new org.delta.crossplane.domain.EdifecsReport();
				voReport.setReportName(report.getName());
				voReport.setReportType(report.getType());
				voReports.add(voReport);
			}
			edifecsRequestResponse.setReports(voReports);
			
    		// Set request in VO 
			String ediRequest = null;
			ediRequest = requestMessage.getContent().getEDI();
			if(StringUtils.isEmpty(ediRequest)){ // right check?
				// TODO create a new Edifecs exception class
				throw new CrossPlaneTransportException("Empty EDI request");
			}
			edifecsRequestResponse.setEdiRequest(ediRequest);
			
		} catch (JAXBException jxbe) {
			throw new CrossPlaneTransportException(jxbe);
		}
		
		return edifecsRequestResponse;
	}

	private void validateAndTransform(EdifecsRequestResponse edifecsRequestResponse) {
		if (logger.isTraceEnabled()) {
			logger.trace("Before invoking dao from service");
		}
		edifecsDao.validateAndTransform(edifecsRequestResponse);
		if (logger.isTraceEnabled()) {
			logger.trace("After invoking dao from service");
		}
	}
}

