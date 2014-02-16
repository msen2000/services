package org.delta.b2b.edi.handler.element;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t270.SBHTBeginningOfHierarchicalTransaction;
import org.delta.b2b.edi.t270.T270;

public class REFHandler {

	private SBHTBeginningOfHierarchicalTransaction sbht;
	
	public REFHandler(T270 t270, Row row) {
		sbht = t270.getSBHTBeginningOfHierarchicalTransaction(); 
		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
	}

}
