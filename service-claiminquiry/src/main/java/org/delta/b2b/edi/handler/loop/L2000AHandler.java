package org.delta.b2b.edi.handler.loop;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t276.L2000A;
import org.delta.b2b.edi.t276.L2100A;

public class L2000AHandler {
	
	public L2000AHandler(L2000A obj, Row row ) {
		process(row, obj);
	}
	
	public void process(Row row, L2000A obj) {
		String[] arr = row.getElementsInArray();		
		
		L2100A l2100a = new L2100A();
		L2100AHandler l2100h = new L2100AHandler(l2100a, row);		
		obj.setL2100A(l2100a);
	
		
	}
}
