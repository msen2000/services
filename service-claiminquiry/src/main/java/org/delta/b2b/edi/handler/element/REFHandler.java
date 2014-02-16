package org.delta.b2b.edi.handler.element;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t276.SBHTBeginningOfHierarchicalTransaction;
import org.delta.b2b.edi.t276.T276;

public class REFHandler {

	private SBHTBeginningOfHierarchicalTransaction sbht;
	
	public REFHandler(T276 t276, Row row) {
		sbht = t276.getSBHTBeginningOfHierarchicalTransaction(); 
		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
	}

}
