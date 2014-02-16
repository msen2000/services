package org.delta.b2b.edi.handler.element;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t271.L2115C;
import org.delta.b2b.edi.t271.T271;

public class LSHandler {
	private L2115C l2115c;
	
	public LSHandler(T271 t271, Row row) {
				
		l2115c = new L2115C(); 		
		process(row);
	}
	
	public void process(Row row) {
	
	}
}
