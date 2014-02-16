package org.delta.b2b.edi.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.delta.b2b.edi.generator.T271EDIGenerator;
import org.delta.b2b.edi.handler.element.HLHandler;
import org.delta.b2b.edi.handler.element.LSHandler;
import org.delta.b2b.edi.handler.header.GSHandler;
import org.delta.b2b.edi.handler.header.ISAHandler;
import org.delta.b2b.edi.handler.header.STHandler;
import org.delta.b2b.edi.handler.loop.L2000AHandler;
import org.delta.b2b.edi.handler.loop.L2000BHandler;
import org.delta.b2b.edi.handler.loop.L2000CHandler;
import org.delta.b2b.edi.handler.loop.L2000DHandler;
import org.delta.b2b.edi.handler.loop.L2115CHandler;
import org.delta.b2b.edi.handler.segment.BHTHandler;
import org.delta.b2b.edi.handler.trailer.GEHandler;
import org.delta.b2b.edi.handler.trailer.IEAHandler;
import org.delta.b2b.edi.handler.trailer.SEHandler;
import org.delta.b2b.edi.t271.L2000A;
import org.delta.b2b.edi.t271.L2000B;
import org.delta.b2b.edi.t271.L2000C;
import org.delta.b2b.edi.t271.L2000D;
import org.delta.b2b.edi.t271.ObjectFactory;
import org.delta.b2b.edi.t271.T271;
import org.delta.b2b.xml.marshaller.XML271Marshaller;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

public class T271EDIParser implements EDIParser {

	private BufferedReader buffReader;
	private StreamResult out;	
	private TransformerHandler th;
	private AttributesImpl atts;
	private String currentLoopName = "";
	private ObjectFactory fac = new ObjectFactory();
	private T271 t271 = null;
	public static String segSeperator = "~";
	public static String eleSeperator = "*";
	
	private ObjectFactory objFac = new ObjectFactory(); 
	
	public T271EDIParser() {
		t271 = fac.createT271();	
	}
	
	public T271 convertEDI2Object(String ediFileLoc) throws Exception {
		
		try{
			//String ediFileLoc = "C:\\Temp\\edi271_1.dat";
			Reader fileReader = new FileReader(ediFileLoc);
			BufferedReader buffReader = new BufferedReader(fileReader);
			
			String str = null;
			while ((str = buffReader.readLine()) != null) {
				Row row = this.parseEDIRow(str);
				t271 = this.getProxyObject(row);				
			}
			buffReader.close();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		return t271;
	}
	
	public T271 convertXML2Object(String xml) throws Exception {
		XML271Marshaller m = new XML271Marshaller();
		T271 t271 = (T271)m.unmarshall(xml);
		return t271;
	}
	
	public String convertObject2XML(T271 t271Obj) throws Exception {
		XML271Marshaller m = new XML271Marshaller();
		String xmlRes = m.marshall(t271Obj);
		return xmlRes;
	}
	
	public String convertObject2EDI(T271 t271Obj) throws Exception {
		String str271EDI = ""; 
		try {
			T271EDIGenerator ediGen = new T271EDIGenerator(t271Obj);			
			str271EDI = ediGen.generateEDI();
			System.out.println("EDI is "+str271EDI);			
		} catch (Exception umex) {
			throw new Exception("Received a general exception when unmarshaling the message.",umex);
		}
		return str271EDI;
	}
	
	public String convertEDI2XML () throws Exception {
		String xmlRes = "";
		try{
			String ediFileLoc = "C:\\Temp\\edi271_1.dat";
			Reader fileReader = new FileReader(ediFileLoc);
			BufferedReader buffReader = new BufferedReader(fileReader);
			
			String str = null;
			while ((str = buffReader.readLine()) != null) {
				Row row = this.parseEDIRow(str);
				t271 = this.getProxyObject(row);				
			}
			XML271Marshaller m = new XML271Marshaller();
			xmlRes = m.marshall(t271);
			buffReader.close();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		return xmlRes;
	}
		
	public T271 getProxyObject(Row row) {
		String segCode = row.getSegName();			
		
		//Header / trailer
		if(segCode.equalsIgnoreCase("ISA"))	{		
			t271.setSISAInterchangeControlHeader(fac.createSISAInterchangeControlHeader());
			ISAHandler ish = new ISAHandler(t271,row);
		}
		if(segCode.equalsIgnoreCase("IEA")) {
			t271.setSIEAInterchangeControlTrailer(fac.createSIEAInterchangeControlTrailer());
			IEAHandler ieah = new IEAHandler(t271,row);
		}
		if(segCode.equalsIgnoreCase("GE")) {
			t271.setSGEFunctionalGroupTrailer(fac.createSGEFunctionalGroupTrailer());
			GEHandler geh = new GEHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("GS")) {
			t271.setSGSFunctionalGroupHeader(fac.createSGSFunctionalGroupHeader());
			GSHandler gsh = new GSHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("ST")) {
			t271.setSSTTransactionSetHeader(fac.createSSTTransactionSetHeader());
			STHandler sth = new STHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("SE")) {
			t271.setSSETransactionSetTrailer(fac.createSSETransactionSetTrailer());
			SEHandler seh = new SEHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("BHT")) {
			t271.setSBHTBeginningOfHierarchicalTransaction(fac.createSBHTBeginningOfHierarchicalTransaction());
			BHTHandler bhh = new BHTHandler(t271, row);
		}
		
		//-----loop
		if(segCode.equalsIgnoreCase("HL")) {
			HLHandler hlh = new HLHandler(t271, row);
			currentLoopName = hlh.getLoopName(row);
			System.out.println("currentLoopName->"+currentLoopName);		
			
		}
		if(segCode.equalsIgnoreCase("NM1") || segCode.equalsIgnoreCase("REF") || segCode.equalsIgnoreCase("N3") || 
				segCode.equalsIgnoreCase("N4") || segCode.equalsIgnoreCase("PRV") || segCode.equalsIgnoreCase("DMG") || segCode.equalsIgnoreCase("EQ")) {
			List<Object> list = t271.getL2000AOrL2000BOrL2000C();
			for(Object ob : list) {
				if(ob instanceof L2000A && "L2000A".equalsIgnoreCase(currentLoopName)) {
					L2000A l2000a = (L2000A)ob;
					L2000AHandler lh = new L2000AHandler(l2000a, row);
				} else if(ob instanceof L2000B && "L2000B".equalsIgnoreCase(currentLoopName)) {
					L2000B l2000b = (L2000B)ob;
					L2000BHandler lh = new L2000BHandler(l2000b, row);
				} else if(ob instanceof L2000C && "L2000C".equalsIgnoreCase(currentLoopName)) {
					L2000C l2000c = (L2000C)ob;
					L2000CHandler lh = new L2000CHandler(l2000c, row);
				} else if(ob instanceof L2000D && "L2000D".equalsIgnoreCase(currentLoopName)) {
					L2000D l2000d = (L2000D)ob;
					L2000DHandler lh = new L2000DHandler(l2000d, row);
				}
			}			
		}		
		if(segCode.equalsIgnoreCase("III")) {
			L2115CHandler hand = new L2115CHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("LS")) {
			//LSHandler hand = new LSHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("PER")) {
			//LSHandler hand = new LSHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("PRV")) {
			//LSHandler hand = new LSHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("LE")) {
			//LSHandler hand = new LSHandler(t271, row);
		}
		
		return t271;
	}
	
	public String scrub(String line) {		
		String scrubLine = line.substring(0, line.length()-1);
		
		return scrubLine;
	}
	
	public Row parseEDIRow (String sLine) throws SAXException {
		System.out.println("Row : "+sLine);	
		sLine = this.scrub(sLine);
		Row row = this.tokenize(sLine);
		System.out.println(row.toString());
		return row;
	}

	public Row tokenize(String str) {
		Row row = new Row();
				
		StringTokenizer strTok = new StringTokenizer(str, eleSeperator);
		String seg = strTok.nextToken();
		//int count = strTok.countTokens();
				
		List<String> eles = new ArrayList<String>();
		
		int lineLength = str.length();		
		int beginIndex = 0;
		int endIndex = 0;
		boolean firstNode = true;
		while (lineLength >= 0 && endIndex != -1 ) {
			endIndex = str.indexOf(eleSeperator);
			String ele = "";
			if(endIndex != -1) {
				ele = str.substring(beginIndex, endIndex);
				str = str.substring(endIndex+1,lineLength);
			} else {
				ele = str;
			}
			if(firstNode == false) {
				eles.add(ele);				
			}
			firstNode = false;			
			beginIndex = 0;
			lineLength = str.length();
		}
		/*while (strTok.hasMoreTokens()) {
			String tok = strTok.nextToken();
			eles.add(tok);
		}*/
		row.setSegName(seg);
		row.setNumElements(eles.size());
		row.setElements(eles);
		
		return row;
	}
	
	public static void main(String arg[]) {	
		String str = "NM1*PR*2*Delta Dental District of Columbia*****PI*DC~";
		T271EDIParser par = new T271EDIParser();
		Row row = par.tokenize(str);
		System.out.println(row.toString());
	}
}