package org.delta.b2b.edi.transaction;

import org.delta.b2b.edi.parser.EDIParser;
import org.delta.b2b.edi.parser.EDIParserFactory;
import org.delta.b2b.edi.t270.T270;
import org.delta.b2b.xml.marshaller.XML270Marshaller;

public class T270EDIProcessor implements EDIProcessor {
	
	private EDIParserFactory ediParserFac = new EDIParserFactory();
	private XML270Marshaller xmlParser = new XML270Marshaller();
	
	public void convertEDI2XML () throws Exception{
		EDIParser ediParser = ediParserFac.getEDIParser("V270");
		String xml = ediParser.convertEDI2XML();
		System.out.println("XML : "+xml);
	}
	
	public void convertXML2EDI () throws Exception{
		String ediFileLoc = "C:\\Temp\\edi270_1.dat";
		EDIParser ediParser = ediParserFac.getEDIParser("V270");
		T270 t270Obj = ediParser.convertEDI2Object(ediFileLoc);
		System.out.println("Converted EDI from file into T270 Object -->"+t270Obj);
		
		String xml = ediParser.convertObject2XML(t270Obj);
		System.out.println("Converted Object into XML -->"+xml);
		
		String strEDI = ediParser.convertObject2EDI(t270Obj);
		System.out.println("EDI : "+strEDI);
	}
	
	public static void main(String arg[]) {
		T270EDIProcessor pros = new T270EDIProcessor();
		try {
			pros.convertEDI2XML();
			//pros.convertXML2EDI();
			
			//XML270Marshaller xmlParser = new XML270Marshaller();
			//xmlParser.unmarshall();
		} catch(Exception e) {
			
		}
	}
}
