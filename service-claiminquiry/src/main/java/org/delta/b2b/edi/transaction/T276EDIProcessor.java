package org.delta.b2b.edi.transaction;

import org.delta.b2b.edi.parser.EDIParser;
import org.delta.b2b.edi.parser.EDIParserFactory;
import org.delta.b2b.edi.t276.T276;
import org.delta.b2b.xml.marshaller.XML270Marshaller;

public class T276EDIProcessor implements EDIProcessor {
	
	private EDIParserFactory ediParserFac = new EDIParserFactory();
	private XML270Marshaller xmlParser = new XML270Marshaller();
	
	public void convertEDI2XML () throws Exception {
		EDIParser ediParser = ediParserFac.getEDIParser("V276");
		String xml = ediParser.convertEDI2XML();
		System.out.println("XML : "+xml);
	}
	
	public void convertXML2EDI () throws Exception{

		String ediFileLoc = "C:\\Temp\\5010_276.dat";		
		EDIParser ediParser = ediParserFac.getEDIParser("V276");
		T276 t276Obj = ediParser.convertEDI2Object(ediFileLoc);
		System.out.println("Converted EDI from file into T276 Object -->"+t276Obj);
		
		String xml = ediParser.convertObject2XML(t276Obj);
		System.out.println("Converted Object into XML -->"+xml);
		
		String strEDI = ediParser.convertObject2EDI(t276Obj);
		System.out.println("EDI : "+strEDI);
	}
	
	public static void main(String arg[]) {
		T276EDIProcessor pros = new T276EDIProcessor();
		try {
			pros.convertEDI2XML();
			//pros.convertXML2EDI();
			
			//XML270Marshaller xmlParser = new XML270Marshaller();
			//xmlParser.unmarshall();
		} catch(Exception e) {
			
		}
	} 
}
