package org.delta.b2b.test;

import java.io.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.w3c.dom.traversal.NodeIterator;
import org.xml.sax.InputSource;
import com.sun.org.apache.xpath.internal.CachedXPathAPI;

public class PathSelector {

	public static void main(String arg[]) throws Exception {
		String ROOT_DIR = "C:\\Temp\\v5010_270.xml";
		String filename = ROOT_DIR;
		String xpath = null;

	// xpath = arg[1];
	xpath = "//T-270/*";
	//xpath = "//T-270/S-ISA-Interchange_Control_Header/*";
	// set up a dom tree
	
	 InputSource in = new InputSource(new FileInputStream(filename));
	 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	 Document doc = dbf.newDocumentBuilder().parse(in);
	 System.out.println("Querying Dom using : " + xpath);
	 CachedXPathAPI path = new CachedXPathAPI();
	 NodeIterator nl = path.selectNodeIterator(doc, xpath);
	 // the actual XPath selector
	 Transformer trans = TransformerFactory.newInstance().newTransformer();
	 trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	
	 System.out.println("");
	
	 Node n;
	
	 while ((n = nl.nextNode()) != null) {
	  trans.transform(new DOMSource(n), new StreamResult(
	    new OutputStreamWriter(System.out)));
	 }
	
	 System.out.println("");
	}
}