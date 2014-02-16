package org.delta.b2b.edi.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.delta.b2b.edi.generator.T837EDIGenerator;
import org.delta.b2b.edi.handler.element.HLHandler;
import org.delta.b2b.edi.handler.header.GSHandler;
import org.delta.b2b.edi.handler.header.ISAHandler;
import org.delta.b2b.edi.handler.header.STHandler;
import org.delta.b2b.edi.handler.loop.L2000AHandler;
import org.delta.b2b.edi.handler.loop.L2000BHandler;
import org.delta.b2b.edi.handler.loop.L2000CHandler;
import org.delta.b2b.edi.handler.segment.BHTHandler;
import org.delta.b2b.edi.handler.trailer.GEHandler;
import org.delta.b2b.edi.handler.trailer.IEAHandler;
import org.delta.b2b.edi.handler.trailer.SEHandler;
import org.delta.b2b.edi.t837.L2000A;
import org.delta.b2b.edi.t837.L2000B;
import org.delta.b2b.edi.t837.L2000C;
import org.delta.b2b.edi.t837.ObjectFactory;
import org.delta.b2b.edi.t837.T837;
import org.delta.b2b.xml.marshaller.XML837Marshaller;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

public class T837EDIParser implements EDIParser {

	private BufferedReader buffReader;
	private StreamResult out;	
	private TransformerHandler th;
	private AttributesImpl atts;
	private String currentLoopName = "";
	private ObjectFactory fac = new ObjectFactory();
	private T837 t837 = null;
	public static String segSeperator = "~";
	public static String eleSeperator = "*";
	
	private ObjectFactory objFac = new ObjectFactory(); 
	
	public T837EDIParser() {
		t837 = fac.createT837();	
	}
	
	public T837 convertEDI2Object(String ediFileLoc) throws Exception {
		
		try{
			//String ediFileLoc = "C:\\Temp\\edi270_1.dat";
			Reader fileReader = new FileReader(ediFileLoc);
			BufferedReader buffReader = new BufferedReader(fileReader);
			
			String str = null;
			while ((str = buffReader.readLine()) != null) {
				Row row = this.parseEDIRow(str);
				t837 = this.getProxyObject(row);				
			}
			buffReader.close();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		return t837;
	}
	
	public T837 convertXML2Object(String xml) throws Exception {
		XML837Marshaller m = new XML837Marshaller();
		T837 t837 = (T837)m.unmarshall(xml);
		return t837;
	}
	
	public String convertObject2XML(T837 t837Obj) throws Exception {
		XML837Marshaller m = new XML837Marshaller();
		String xmlRes = m.marshall(t837Obj);
		return xmlRes;
	}
	
	public String convertObject2EDI(T837 t837Obj) throws Exception {
		String str270EDI = ""; 
		try {
			T837EDIGenerator ediGen = new T837EDIGenerator(t837Obj);			
			str270EDI = ediGen.generateEDI();
			System.out.println("EDI is "+str270EDI);			
		} catch (Exception umex) {
			throw new Exception("Received a general exception when unmarshaling the message.",umex);
		}
		return str270EDI;
	}
	
	public String convertEDI2XML () throws Exception {
		String xmlRes = "";
		try{
			String ediFileLoc = "C:\\Temp\\5010_276.dat";
			Reader fileReader = new FileReader(ediFileLoc);
			BufferedReader buffReader = new BufferedReader(fileReader);
			
			String str = null;
			while ((str = buffReader.readLine()) != null) {
				Row row = this.parseEDIRow(str);
				t837 = this.getProxyObject(row);				
			}
			XML837Marshaller m = new XML837Marshaller();
			xmlRes = m.marshall(t837);
			buffReader.close();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		return xmlRes;
	}
		
	public T837 getProxyObject(Row row) {
		String segCode = row.getSegName();			
		
		//Header / trailer
		if(segCode.equalsIgnoreCase("ISA"))	{		
			t837.setSISAInterchangeControlHeader(fac.createSISAInterchangeControlHeader());
			ISAHandler ish = new ISAHandler(t837,row);
		}
		if(segCode.equalsIgnoreCase("IEA")) {
			t837.setSIEAInterchangeControlTrailer(fac.createSIEAInterchangeControlTrailer());
			IEAHandler ieah = new IEAHandler(t837,row);
		}
		if(segCode.equalsIgnoreCase("GE")) {
			t837.setSGEFunctionalGroupTrailer(fac.createSGEFunctionalGroupTrailer());
			GEHandler geh = new GEHandler(t837, row);
		}
		if(segCode.equalsIgnoreCase("GS")) {
			t837.setSGSFunctionalGroupHeader(fac.createSGSFunctionalGroupHeader());
			GSHandler gsh = new GSHandler(t837, row);
		}
		if(segCode.equalsIgnoreCase("ST")) {
			t837.setSSTTransactionSetHeader(fac.createSSTTransactionSetHeader());
			STHandler sth = new STHandler(t837, row);
		}
		if(segCode.equalsIgnoreCase("SE")) {
			t837.setSSETransactionSetTrailer(fac.createSSETransactionSetTrailer());
			SEHandler seh = new SEHandler(t837, row);
		}
		if(segCode.equalsIgnoreCase("BHT")) {
			t837.setSBHTBeginningOfHierarchicalTransaction(fac.createSBHTBeginningOfHierarchicalTransaction());
			BHTHandler bhh = new BHTHandler(t837, row);
		}
		
		//-----loop
		if(segCode.equalsIgnoreCase("HL")) {
			HLHandler hlh = new HLHandler(t837, row);
			currentLoopName = hlh.getLoopName(row);
			System.out.println("currentLoopName->"+currentLoopName);		
			
		}
		if(segCode.equalsIgnoreCase("NM1") || segCode.equalsIgnoreCase("REF") || segCode.equalsIgnoreCase("N3") || 
				segCode.equalsIgnoreCase("N4") || segCode.equalsIgnoreCase("PRV") || segCode.equalsIgnoreCase("DMG") || segCode.equalsIgnoreCase("EQ")) {
			List<Object> list = t837.getL2000AOrL2000BOrL2000C();
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
				} 
			}			
		}		
		return t837;
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
		T837EDIParser par = new T837EDIParser();
		Row row = par.tokenize(str);
		System.out.println(row.toString());
	}
}