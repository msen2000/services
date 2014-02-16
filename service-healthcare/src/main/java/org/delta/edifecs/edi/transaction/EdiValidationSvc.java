package org.delta.edifecs.edi.transaction;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
/*
import com.edifecs.xengine.XEConsts;
import com.edifecs.xengine.xeobjects.XEAudit;
import com.edifecs.xengine.xeobjects.XEDataProc;
import com.edifecs.xengine.xeobjects.XEHelper;
import com.edifecs.xengine.xeobjects.XEResultProc;
import com.edifecs.xengine.xeobjects.XESource;
import com.edifecs.xengine.xeobjects.XESystem;
import com.edifecs.xengine.extensions.XEMemOStreamFactory;
*/
public class EdiValidationSvc {
  /*
	public static String validateEDI(String ediMessage){
	   XESource src =null;
	   XEDataProc dataProc = null;
	   XEMemOStreamFactory strmFact = null;
	   XEAudit audit = null;
	   String respEdiMsg = null;
	   try{


		   //ByteArrayInputStream byteStream = new ByteArrayInputStream(ediMessage.getBytes());
	       //src = XEHelper.createSourceFromStream("123",byteStream);
		   src=XEHelper.createSourceFromBLOB("123", ediMessage.getBytes());
	       dataProc = XEHelper.createN2X();
	       strmFact = new XEMemOStreamFactory();
	       dataProc.setDestination(strmFact, "UTF-8");
	       audit = dataProc.execute(src, XEDataProc.MODE_VALIDATOR|XEDataProc.MODE_CONVERTER);

	       //XEHelper.createN2XBDF(arg0, arg1)
	       int nResCount = strmFact.getCount();
	       if(audit.getEventViewer()!=null)
	        	System.err.println(audit.getEventViewer().getDescription());
	        for (int i = 0; i< nResCount; i++ )
	        {
	            //XEMemOStreamFactory.StreamDetails details =  strmFact.getDetails(i);
	           // System.err.println("Result name: " + details.getEngineName()+ "_"+  details.getResultType() +"_" + details.getDataName());

	        //    System.err.println("Result size: " + strmFact.getContentSize(i));
	         //   System.err.println("Result content: {");
	           respEdiMsg=new String(strmFact.getContent(i),"UTF-8");
	            //System.err.println("}");
	        }


	   }catch(Exception e){
		   respEdiMsg=e.getMessage();
		   e.printStackTrace();
	   }finally{
		   if(src!=null)
		    src.destroy();
		   if(dataProc!=null)
	        dataProc.destroy();
		   if(audit!=null)
	        audit.destroy();
	   }
	   //return respEdiMsg;
	   if(respEdiMsg!=null)
		   respEdiMsg=respEdiMsg.substring(1,respEdiMsg.length());
	   return respEdiMsg;

   }
   public static ArrayList<String> validateSplitEDI(String fileName){
	   XESource src =null;
	   XEDataProc dataProc = null;
	   XEMemOStreamFactory strmFact = null;
	   XEAudit audit = null;
	   String respEdiMsg = null;
	   XEResultProc rProc =null;
	   ArrayList<String> indEdiMsg =null;
	   try{
		   //XESystem.start();
		   //ByteArrayInputStream byteStream = new ByteArrayInputStream(ediMessage.getBytes());
	       //src = XEHelper.createSourceFromStream("123",byteStream);
		   src=XEHelper.createSourceFromFile(fileName);
	       dataProc = XEHelper.createN2X();
	       strmFact = new XEMemOStreamFactory();
	       dataProc.setDestination(strmFact, "UTF-8");
	       audit = dataProc.execute(src, XEDataProc.MODE_VALIDATOR|XEDataProc.MODE_LDNSB);
	       rProc=XEHelper.createResultProc();
	       rProc.addProc(XEConsts.ENGINE_LDNSP, strmFact, "UTF-8");
	       rProc.execute(audit);

	       int nResCount = strmFact.getCount();
	       indEdiMsg =new ArrayList<String>();
	     //  if(audit.getEventViewer()!=null)
	       // 	System.err.println(audit.getEventViewer().getDescription());
	        for (int i = 1; i< nResCount; i++ )
	        {
	            //XEMemOStreamFactory.StreamDetails details =  strmFact.getDetails(i);
	           // System.err.println("Result name: " + details.getEngineName()+ "_"+  details.getResultType() +"_" + details.getDataName());

	        //    System.err.println("Result size: " + strmFact.getContentSize(i));
	         //   System.err.println("Result content: {");
	           respEdiMsg=new String(strmFact.getContent(i),"UTF-8");
	           indEdiMsg.add(respEdiMsg);
	            //System.err.println("}");
	        }


	   }catch(Exception e){
		   respEdiMsg=e.getMessage();
		   e.printStackTrace();
	   }finally{
		   if(src!=null)
		    src.destroy();
		   if(dataProc!=null)
	        dataProc.destroy();
		   if(rProc!=null)
			   rProc.destroy();
		   if(audit!=null)
	        audit.destroy();
	   }

	   return indEdiMsg;

   }
   public static String translateEDI(String xmlMessage){
	   XESource src =null;
	   XEDataProc dataProc = null;
	   XEMemOStreamFactory strmFact = null;
	   XEAudit audit = null;
	   String respEdiMsg = null;
	   try{
		   //XESystem.start();
		   //src = XEHelper.createSourceFromFile("c:/EEP_files/277.xml");
		   String convMessage=xmlMessage.substring(1,xmlMessage.length());
		   src = XEHelper.createSourceFromBLOB("123",convMessage.getBytes());
		   //System.err.println(convMessage);
	       dataProc = XEHelper.createX2N();
	       strmFact = new XEMemOStreamFactory();
	       dataProc.setDestination(strmFact, "UTF-8");

	       audit = dataProc.execute(src, XEDataProc.MODE_CONVERTER);

	       int nResCount = strmFact.getCount();
	       if(audit.getEventViewer()!=null)
	        	System.err.println(audit.getEventViewer().getDescription());
	        for (int i = 0; i< nResCount; i++ )
	        {
	            //XEMemOStreamFactory.StreamDetails details =  strmFact.getDetails(i);
	         //   System.err.println("Result name: " + details.getEngineName()+ "_"+  details.getResultType() +"_" + details.getDataName());

	           // System.err.println("Result size: " + strmFact.getContentSize(i));
	            //System.err.println("Result content: {");
	            respEdiMsg=new String(strmFact.getContent(i),"UTF-8");
	            //System.err.println("Message from Ram"+respEdiMsg);
	            //System.err.println("}");
	        }


	   }catch(Exception e){
		   respEdiMsg=e.getMessage();
		   e.printStackTrace();
	   }finally{
		   if(src!=null)
		    src.destroy();
		   if(dataProc!=null)
	        dataProc.destroy();
		   if(audit!=null)
	        audit.destroy();
	   }
	   return respEdiMsg;

   }
   public static String translateXML(String ediMessage){
	   XESource src =null;
	   XEDataProc dataProc = null;
	   XEMemOStreamFactory strmFact = null;
	   XEAudit audit = null;
	   String respEdiMsg = null;
	   try{
		   //XESystem.start();
		   //src = XEHelper.createSourceFromFile("c:/EEP_files/277.xml");
		  // String convMessage=ediMessage.substring(1,ediMessage.length());
		   src = XEHelper.createSourceFromBLOB("123",ediMessage.getBytes());
		   //System.err.println(convMessage);
	       dataProc = XEHelper.createN2X();
	       strmFact = new XEMemOStreamFactory();
	       dataProc.setDestination(strmFact, "UTF-8");

	       audit = dataProc.execute(src, XEDataProc.MODE_CONVERTER);

	       int nResCount = strmFact.getCount();
	       if(audit.getEventViewer()!=null)
	        	System.err.println(audit.getEventViewer().getDescription());
	        for (int i = 0; i< nResCount; i++ )
	        {
	            //XEMemOStreamFactory.StreamDetails details =  strmFact.getDetails(i);
	         //   System.err.println("Result name: " + details.getEngineName()+ "_"+  details.getResultType() +"_" + details.getDataName());

	           // System.err.println("Result size: " + strmFact.getContentSize(i));
	            //System.err.println("Result content: {");
	            respEdiMsg=new String(strmFact.getContent(i),"UTF-8");
	            respEdiMsg=respEdiMsg.substring(1,respEdiMsg.length());
	            //System.err.println("Message from Ram"+respEdiMsg);
	            //System.err.println("}");
	        }


	   }catch(Exception e){
		   respEdiMsg=e.getMessage();
		   e.printStackTrace();
	   }finally{
		   if(src!=null)
		    src.destroy();
		   if(dataProc!=null)
	        dataProc.destroy();
		   if(audit!=null)
	        audit.destroy();
	   }
	   return respEdiMsg;

   }

   public static String validateRTTx(String rtMsg,String type){
	   XESource src =null;
	   XEDataProc dataProc = null;
	   XEMemOStreamFactory strmFact = null;
	   XEAudit audit = null;
	   String respEdiMsg = null;
	   String errorDesc=null;
	   try{
		   XESystem.start();

		   //ByteArrayInputStream byteStream = new ByteArrayInputStream(ediMessage.getBytes());
	       //src = XEHelper.createSourceFromStream("123",byteStream);
		   src=XEHelper.createSourceFromBLOB("123", rtMsg.getBytes());
		   if(type.startsWith("EDI")){
			   dataProc = XEHelper.createN2X();
		   }else{
			   dataProc = XEHelper.createX2N();
		   }

	       strmFact = new XEMemOStreamFactory();
	       dataProc.setDestination(strmFact, "UTF-8");
	       audit = dataProc.execute(src, XEDataProc.MODE_VALIDATOR|XEDataProc.MODE_CONVERTER);
	       //XEResultProc resProc=XEHelper.createResultProc();
	       //resProc.addProc(XEConsts.ENGINE_REPORT_XML, strmFact,"UTF-8");
	     //  resProc.addProc(XEConsts.ENGINE_ACK, strmFact,"UTF-8");
	       //resProc.execute(audit);
	       int nResCount = strmFact.getCount();

	       if(audit.getEventViewer()!=null){

	    	   //System.err.println(audit.getEventViewer().getBrief());
	    	   //System.err.println(audit.getEventViewer().getDescription());
	        	if(audit.getEventViewer().getBrief().contains("Parse Error")){
	        		errorDesc="";
	        	}else if(audit.getEventViewer().getBrief().contains("Selector configuration")){

	        		if (audit.getEventViewer().getDescription().contains("The trading partner agreement for Group Level could not be found")){

	        			errorDesc="The Functional Group Header failed the HIPAA/EDI validation.Please check the following fields for possible errors:  GS02 (Application Sender code),  GS08 (Version/Release/Industry ID code).";
	        		}
	        		else {
	        			errorDesc="The Interchange Control Header failed the HIPAA/EDI validation. Please check the following fields for possible errors:  ISA06 (Sender ID) , ISA08 (Receiver ID), ISA12 (Interchange Control Version Number).";

	        		}
	        	}else if(audit.getEventViewer().getDescription().contains("ISA")){
	        		//System.err.println(audit.getEventViewer().getDescription());
	        		errorDesc="The Functional Group Header failed the HIPAA/EDI validation. Please check the following fields for possible errors:  GS03 (Application Receivers code),  GS08 (Version/Release/Industry ID code)";
	        	}else{
	        			errorDesc="The HL Segment failed the HIPAA/EDI validation. Please check the following fields for possible errors:  HL01 (Hierarchical ID Number), HL02 (Hierarchical Parent ID Number),  HL03 (Hierarchical Level Code) and HL04 (Hierarchical Child Code)";
	        	}
	       }
	        for (int i = 0; i< nResCount; i++ )
	        {
	            //XEMemOStreamFactory.StreamDetails details =  strmFact.getDetails(i);
	           // System.err.println("Result name: " + details.getEngineName()+ "_"+  details.getResultType() +"_" + details.getDataName());

	        //    System.err.println("Result size: " + strmFact.getContentSize(i));
	         //   System.err.println("Result content: {");
	           respEdiMsg=new String(strmFact.getContent(i),"UTF-8");
	            //System.err.println("}");
	       /*    XEMemOStreamFactory.StreamDetails details =  strmFact.getDetails(i);
	         //  String auditReport = null;
	           //if(details.getResultType().equals("Report")){
	        	   auditReport = new String(strmFact.getContent(i),"UTF-8");
	        	   System.err.println("AuditReport is "+auditReport);
	        	  }
	        	   */
/*
	        }
*/
/*
	   }catch(Exception e){
		   respEdiMsg=e.getMessage();
		   e.printStackTrace();
	   }finally{
		   if(src!=null)
		    src.destroy();
		   if(dataProc!=null)
	        dataProc.destroy();
		   if(audit!=null)
	        audit.destroy();
	   }
	   //return respEdiMsg;
	   if(respEdiMsg!=null){
		   respEdiMsg=respEdiMsg.substring(1,respEdiMsg.length());
	   	   return respEdiMsg;
	   }else{
		   return errorDesc;
	   }


   }
   public static String getOrigClmId(String ediMsg){
   		String origClmId= null;

   		int beginIndexREF = ediMsg.indexOf("REF*D9*");
   		int endIndexREF = ediMsg.indexOf("~", beginIndexREF);
   		if(beginIndexREF!=-1){
   			origClmId = ediMsg.substring(beginIndexREF+7, endIndexREF);
   		}else{
   			int beginIndexCLM = ediMsg.indexOf("~CLM*");
   			int endIndexCLM = ediMsg.indexOf("*", beginIndexCLM);
   			int finalEndIndexCLM = ediMsg.indexOf("*", endIndexCLM+1);
   			origClmId = ediMsg.substring(beginIndexCLM+5, finalEndIndexCLM);
   		}
   		return origClmId;
	}
	public static String getSenderId(String ediMsg){
		return ediMsg.substring(35, 50);
    }
    public static String getReceiverId(String ediMsg){
		return ediMsg.substring(54, 69);
    }
    public static String getCntlNum(String ediMsg){
		return ediMsg.substring(90, 99);
    }
*/
}


