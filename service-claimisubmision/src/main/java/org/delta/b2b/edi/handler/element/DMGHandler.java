package org.delta.b2b.edi.handler.element;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t837.SSTTransactionSetHeader;
import org.delta.b2b.edi.t837.T837;

public class DMGHandler {

	private SSTTransactionSetHeader sst;
	
	public DMGHandler(T837 t837, Row row) {
		sst = t837.getSSTTransactionSetHeader(); 
		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
	}
}
