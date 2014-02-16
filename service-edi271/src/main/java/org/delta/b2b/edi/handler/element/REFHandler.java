package org.delta.b2b.edi.handler.element;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t271.SBHTBeginningOfHierarchicalTransaction;
import org.delta.b2b.edi.t271.T271;

public class REFHandler {

	private SBHTBeginningOfHierarchicalTransaction sbht;
	
	public REFHandler(T271 t271, Row row) {
		sbht = t271.getSBHTBeginningOfHierarchicalTransaction(); 
		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
	}

}
