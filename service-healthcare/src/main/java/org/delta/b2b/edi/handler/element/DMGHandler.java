package org.delta.b2b.edi.handler.element;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t270.SSTTransactionSetHeader;
import org.delta.b2b.edi.t270.T270;

public class DMGHandler {

	private SSTTransactionSetHeader sst;
	
	public DMGHandler(T270 t270, Row row) {
		sst = t270.getSSTTransactionSetHeader(); 
		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
	}
}
