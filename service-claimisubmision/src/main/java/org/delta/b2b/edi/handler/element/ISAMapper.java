package org.delta.b2b.edi.handler.element;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t837.SBHTBeginningOfHierarchicalTransaction;
import org.delta.b2b.edi.t837.T837;

public class ISAMapper {

	private SBHTBeginningOfHierarchicalTransaction sbht;
	
	public ISAMapper(T837 t837, Row row) {
		sbht = t837.getSBHTBeginningOfHierarchicalTransaction(); 
		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
	}

	
}
