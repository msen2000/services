package org.delta.crossplane.edifecs.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.edifecs.xengine.XEException;
import com.edifecs.xengine.xeobjects.XESystem;

public class StartXEServer {
	private static final Log logger = LogFactory.getLog(StartXEServer.class);

	static private StartXEServer _instance = null;
	
	static public StartXEServer instance(){
		if (null == _instance){
			_instance = new StartXEServer();
		}
		return _instance;
	}
	/*
	 * Static block to start the XEServer
	 */
	static {
		startServer();
		if (logger.isDebugEnabled()) {
			logger.debug("XEServer started");
		}
	}
	
	private static void startServer(){
		try {
	        if (logger.isDebugEnabled()) {
				logger.debug("Before XEStart");
			}        
			XESystem.start();
			if (logger.isDebugEnabled()) {
				logger.debug("after XEStart");
			}
		} catch (XEException e) {
			logger.error("ValidateUtils XESystem initialization error: " + e);
		}
	}

}
