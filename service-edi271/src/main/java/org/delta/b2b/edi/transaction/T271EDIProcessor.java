package org.delta.b2b.edi.transaction;

import org.delta.b2b.edi.parser.EDIParser;
import org.delta.b2b.edi.parser.EDIParserFactory;
import org.delta.b2b.edi.t271.T271;
import org.delta.b2b.xml.marshaller.XML271Marshaller;

public class T271EDIProcessor implements EDIProcessor {
	
	private EDIParserFactory ediParserFac = new EDIParserFactory();
	private XML271Marshaller xmlParser = new XML271Marshaller();
	
	public void convertEDI2XML () throws Exception{
		EDIParser ediParser = ediParserFac.getEDIParser("V271");
		String xml = ediParser.convertEDI2XML();
		System.out.println("XML : "+xml);
	}
	
	public void convertXML2EDI () throws Exception{
		String ediFileLoc = "C:\\Temp\\edi271_1.dat";
		EDIParser ediParser = ediParserFac.getEDIParser("V271");
		T271 t271Obj = ediParser.convertEDI2Object(ediFileLoc);
		System.out.println("Converted EDI from file into T271 Object -->"+t271Obj);
		
		String xml = ediParser.convertObject2XML(t271Obj);
		System.out.println("Converted Object into XML -->"+xml);
		
		String strEDI = ediParser.convertObject2EDI(t271Obj);
		System.out.println("EDI : "+strEDI);
	}
	
	public static void main(String arg[]) {
		T271EDIProcessor pros = new T271EDIProcessor();
		try {
			pros.convertEDI2XML();
			//pros.convertXML2EDI();
			
			//XML271Marshaller xmlParser = new XML271Marshaller();
			//xmlParser.unmarshall();
		} catch(Exception e) {
			
		}
	}
}
