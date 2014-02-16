/*
 * @(#)NameService.java 1.0 Oct 22, 2008
 * Copyrights 2008 Delta Dental, Inc. All rights reserved.
 * DELTA DENTAL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.delta.crossplane.edifecs.service;

import org.delta.crossplane.common.service.Service;
import org.delta.crossplane.transport.CrossPlaneTransportException;
import org.delta.crossplane.edifecs.dao.EdifecsDao;

/***************************************************************************************************
 * 
 * The <code>NameService</code> class is TODO.
 * 
 * <pre> 
 * <strong>Copyrights</strong> Copyrights 2008 Delta Dental, Inc. All rights reserved.
 * <strong>Date</strong>       Oct 30, 2008
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




public interface EdifecsService {

	public String invokeEdifecsService(String xmlRequest) throws CrossPlaneTransportException;

	public void setEdifecsDao(EdifecsDao edifecsDao);

	public EdifecsDao getEdifecsDao();
}

