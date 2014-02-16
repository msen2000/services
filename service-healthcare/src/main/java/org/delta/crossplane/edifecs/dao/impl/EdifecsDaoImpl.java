/*
 * @(#)EdifecsDaoImpl.java 1.0 Oct 22, 2008
 * Copyrights 2008 Delta Dental, Inc. All rights reserved.
 * DELTA DENTAL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.delta.crossplane.edifecs.dao.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.delta.crossplane.domain.EdifecsReport;
import org.delta.crossplane.domain.EdifecsRequestResponse;
import org.delta.crossplane.edifecs.dao.EdifecsDao;
import org.delta.crossplane.edifecs.util.StartXEServer;
import org.delta.crossplane.transport.CrossPlaneTransportException;

import com.edifecs.xengine.XEConsts;
import com.edifecs.xengine.XEException;
import com.edifecs.xengine.extensions.XEMemOStreamFactory;
import com.edifecs.xengine.xeobjects.XEAudit;
import com.edifecs.xengine.xeobjects.XEDataProc;
import com.edifecs.xengine.xeobjects.XEHelper;
import com.edifecs.xengine.xeobjects.XEResultProc;
import com.edifecs.xengine.xeobjects.XESource;

/*******************************************************************************
 * 
 * The <code>EdifecsDaoImpl</code> class is TODO.
 * 
 * <pre>
 *  
 * &lt;strong&gt;Copyrights&lt;/strong&gt; Copyrights 2008 Delta Dental, Inc. All rights reserved.
 * &lt;strong&gt;Date&lt;/strong&gt;       Oct 22, 2008
 * 
 * &lt;strong&gt;History&lt;/strong&gt;    Name              Date            Description
 * &lt;strong&gt;History&lt;/strong&gt;    --------------------------------------------------------------------
 * &lt;strong&gt;History&lt;/strong&gt;    Sridevi S    Oct 22, 2008     Created.
 * </pre>
 * 
 * @author Sridevi S
 * @version 1.0
 * 
 ******************************************************************************/

public class EdifecsDaoImpl implements EdifecsDao {

	private static final Log logger = LogFactory.getLog(EdifecsDaoImpl.class);

	public void validateAndTransform(
			EdifecsRequestResponse edifecsRequestResponse) {
		if (logger.isTraceEnabled()) {
			logger.trace("First line in dao validate and transform..");
		}
		String validationResults = "fail";

		if (edifecsRequestResponse == null) {
			if (logger.isTraceEnabled()) {
				logger.error("edifecsRequestResponse domain object is null");
			}
			throw new IllegalArgumentException("Request is null");
		}
		// Start XEServer
		StartXEServer.instance();

		// It's important that the path to the XEngine .dll/.so files
		if (logger.isTraceEnabled()) {
			logger.debug("java.library.path = "
					+ System.getProperty("java.library.path"));
		}

		XESource src = null;
		XEDataProc dataProc = null;
		XEResultProc resProc = null;
		XEAudit audit = null;

		try {
			// --------------------------------------------------
			// Data processing
			// --------------------------------------------------

			// Create data source
			if (logger.isTraceEnabled()) {
				logger.debug(" creating data source");
			}
			InputStream is = new ByteArrayInputStream(edifecsRequestResponse
					.getEdiRequest().getBytes());
			src = XEHelper.createSourceFromStream("sTaskID", is);

			// Create data processor
			if (logger.isTraceEnabled()) {
				logger.debug(" creating data processor");
			}
			dataProc = XEHelper.createN2X();

			// Execute data processing
			if (logger.isTraceEnabled()) {
				logger.debug(" executing data processing");
			}
			audit = dataProc.execute(src, XEDataProc.MODE_VALIDATOR);

			// Check for errors
			int numErrors = audit.getREventCount();
			if (numErrors == 0) {
				validationResults = "pass";
			}

			// -------------------------------------------------
			// Result processing
			// --------------------------------------------------

			// Create result processor
			if (logger.isTraceEnabled()) {
				logger.debug(" creating result processor");
			}
			resProc = XEHelper.createResultProc();

			// // Create stream factories
			// logger.debug(
			// " creating stream factories");
			XEMemOStreamFactory strmFact_mem = new XEMemOStreamFactory();
			// XEFilesOStreamFactory strmFact_evtHTML = new
			// XEFilesOStreamFactory("C:\\viewstore\\esp_lynx_dap\\esp\\dap\\edifecs\\poc\\justin\\34_UnwrapOf27XMsgs\\output\\",
			// "html");
			// XEFilesOStreamFactory strmFact_evtXML = new
			// XEFilesOStreamFactory("C:\\viewstore\\esp_lynx_dap\\esp\\dap\\edifecs\\poc\\justin\\34_UnwrapOf27XMsgs\\output\\",
			// "xml");
			// XEFilesOStreamFactory strmFact_ack = new
			// XEFilesOStreamFactory("C:\\viewstore\\esp_lynx_dap\\esp\\dap\\edifecs\\poc\\justin\\34_UnwrapOf27XMsgs\\output\\",
			// "dat");
			// XEFilesOStreamFactory strmFact_summary = new
			// XEFilesOStreamFactory("C:\\viewstore\\esp_lynx_dap\\esp\\dap\\edifecs\\poc\\justin\\34_UnwrapOf27XMsgs\\output\\",
			// "xml");
			// XEFilesOStreamFactory strmFact_ldnsp = new
			// XEFilesOStreamFactory("C:\\viewstore\\esp_lynx_dap\\esp\\dap\\edifecs\\poc\\justin\\34_UnwrapOf27XMsgs\\output\\",
			// "xml");

			// Set memory stream factory as destination
			if (logger.isTraceEnabled()) {
				logger
						.debug(" settting memory stream factory as destination for data proc");
			}
			dataProc.setDestination(strmFact_mem, "UTF-8");

			// Add EventReporterHTML result processor
			if (logger.isTraceEnabled()) {
				logger
						.debug(" adding EventReporterHTML result processor for result proc");
			}
			resProc.addProc(XEConsts.ENGINE_REPORT_HTM, strmFact_mem, "UTF-8");

			// Add EventReporterXML result processor
			if (logger.isTraceEnabled()) {
				logger
						.debug(" adding EventReporterXML result processor for result proc");
			}
			resProc.addProc(XEConsts.ENGINE_REPORT_XML, strmFact_mem, "ASCII");

			// Add AckCreator result processor
			if (logger.isTraceEnabled()) {
				logger
						.debug(" adding AckCreator result processor for result proc");
			}
			int nAckHandle = resProc.addProc(XEConsts.ENGINE_ACK, strmFact_mem,
					"UTF-8");

			if (logger.isTraceEnabled()) {
				logger
						.debug(" setting acknowledgement mode to output native EDI");
			}
			resProc.setParam(nAckHandle, XEConsts.PARAM_ACK_MODE,
					XEConsts.MODE_NATIVE);

			// Add Summary result processor
			if (logger.isTraceEnabled()) {
				logger
						.debug(" adding Summary result processor for result proc");
			}
			resProc.addProc(XEConsts.ENGINE_SUMMARY, strmFact_mem, "UTF-8");

			// Execute result processing
			if (logger.isTraceEnabled()) {
				logger.debug(" executing result processing");
			}
			resProc.execute(audit);

			// Get results count
			// Note that this is assumed to always be *** ONE ***!
			int nResCount = strmFact_mem.getCount();
			if (logger.isTraceEnabled()) {
				logger.debug(" result count = " + nResCount);
			}
			if (nResCount > 0) {
				List<EdifecsReport> lEdifecsReports = edifecsRequestResponse
						.getReports();
				List<EdifecsReport> lnewEdifecsReports = new ArrayList<EdifecsReport>();
				for (int j = 0; j < nResCount; j++) {
					com.edifecs.xengine.extensions.XEMemOStreamFactory.StreamDetails streamdetails = strmFact_mem
							.getDetails(j);
					// logger.debug("Result Type : " +
					// streamdetails.getResultType());
					for (Iterator<EdifecsReport> itEdifecsReport = lEdifecsReports
							.iterator(); itEdifecsReport.hasNext();) {
						EdifecsReport voEdifecsReport = itEdifecsReport.next();
						if (streamdetails.getResultType().equalsIgnoreCase(
								voEdifecsReport.getReportType())) {
							// logger.debug("Result Type Matches : " +
							// streamdetails.getResultType());
							voEdifecsReport.setReportData(new String(
									strmFact_mem.getContent(j)));
							lnewEdifecsReports.add(voEdifecsReport);
						}
					}
				}

				if (logger.isTraceEnabled()) {
					logger.debug("Printing result list ***** ");
					for (Iterator<EdifecsReport> itEdifecsReport = lnewEdifecsReports
							.iterator(); itEdifecsReport.hasNext();) {
						EdifecsReport voEdifecsReport = itEdifecsReport.next();
						logger.debug("Report Data :: "
								+ voEdifecsReport.getReportData());
						logger.debug("Report Name :: "
								+ voEdifecsReport.getReportName());
						logger.debug("Report type :: "
								+ voEdifecsReport.getReportType());
					}
				}
				edifecsRequestResponse.setReports(lnewEdifecsReports);

			}

			// --------------------------------------------------
			// Print out results
			// --------------------------------------------------

			// Print out conversion results
			// for (int i = 0; i < nResCount; i++) {
			// String result = getResult(strmFact_mem, i);
			// logger.debug(
			// " result = " + result);
			// }

		} catch (XEException e) {
			if (logger.isTraceEnabled()) {
				logger.error(" unable to tranform xml to edi: " + e.toString());
			}
			throw new CrossPlaneTransportException(
					"Unable to tranform edi to xml: " + e);
		} finally {
			src.destroy();
			dataProc.destroy();
			resProc.destroy();
			audit.destroy();
		}
		if (logger.isTraceEnabled()) {
			logger.debug(" result = " + validationResults);
		}

	}

	/**
	 * Get the result from the XE Stream.
	 * 
	 * @param strmFact
	 *            the stream factory
	 * @param i
	 *            the index from which we would be getting the result from
	 * 
	 * @return the EDI result
	 * 
	 * @throws CrossPlaneTransportException
	 */
	private String getResult(XEMemOStreamFactory strmFact, int i)
			throws CrossPlaneTransportException {
		String result = null;

		XEMemOStreamFactory.StreamDetails details = strmFact.getDetails(i);
		if (logger.isTraceEnabled()) {
			logger.debug(" getting result details");
			logger.debug(" Result name: " + details.getEngineName() + "_"
					+ details.getResultType() + "_" + details.getDataName());
			logger.debug(" Result size: " + strmFact.getContentSize(i));
		}
		try {
			result = new String(strmFact.getContent(i), "UTF-8");
			if (logger.isTraceEnabled()) {
				logger.debug(" result = " + result);
			}
		} catch (UnsupportedEncodingException e) {
			if (logger.isTraceEnabled()) {
				logger.error(" error getting results = " + e.toString());
			}
			throw new CrossPlaneTransportException(
					"Unable to tranform edi to xml: " + e);
		}
		if (logger.isTraceEnabled()) {
			logger.debug(" Result content: " + result);
		}

		return result;
	}
}
