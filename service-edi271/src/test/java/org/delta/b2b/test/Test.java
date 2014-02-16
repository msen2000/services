package org.delta.b2b.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;
import org.w3c.dom.traversal.TreeWalker;

/**
 * This sample program using node-iterator for
 * linear traverse of DOM-document.
 */

public class Test {

	private static final void traverseLevel(TreeWalker walker, String indent) {
		  
	    // describe current node:
	    Node parend = walker.getCurrentNode();
	    System.out.println(indent + "- " +((Element) parend).getTagName()+", "+((Element) parend).getTextContent());

	    // traverse children:
	    for (Node n = walker.firstChild(); n != null; n = walker.nextSibling()) {
	      traverseLevel(walker, indent + '\t');
	    }

	    // return position to the current (level up):
	    walker.setCurrentNode(parend);
	}

  public static void main(String[] args) {
	  try {
	  
		// load the document from a file:
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder loader = factory.newDocumentBuilder();    
	    String ROOT_DIR = "C:\\Temp\\v5010_270.xml";    
	    Document document = loader.parse(ROOT_DIR);
	      
	    // this cast is checked on Apache implementation (Xerces):
	    DocumentTraversal traversal = (DocumentTraversal) document;
	
	    NodeIterator iterator = traversal.createNodeIterator(document.getDocumentElement(), NodeFilter.SHOW_ELEMENT|NodeFilter.SHOW_COMMENT, null, true);
	    //NodeFilter.SHOW_ELEMENT 
	    
	    for (Node n = iterator.nextNode(); n != null; n = iterator.nextNode()) {
	      System.out.println("Element: " + ((Element) n).getTagName());
	    }
	    // Iterate over the comments
	      Node node;
	      while ((node = iterator.nextNode()) != null) {
	        System.out.println(node.getNodeValue());
	      }
	    /*
	    Element root = document.getDocumentElement();
	    System.out.println("RotElement: "+root.getTagName());
	    NodeList child = root.getChildNodes();
	    for(int i=0; i<child.getLength();i++) {
	    	Node isa = child.item(i);
	    	System.out.println("IsaElement: "+isa.getNodeName());	    	
	    }
	    */
	    TreeWalker walker = traversal.createTreeWalker(document.getDocumentElement(),NodeFilter.SHOW_ELEMENT, null, true);
	    
	    traverseLevel(walker, "");    
	    
	  } catch (Exception ex) {
	    ex.printStackTrace();
	  }
  }
}