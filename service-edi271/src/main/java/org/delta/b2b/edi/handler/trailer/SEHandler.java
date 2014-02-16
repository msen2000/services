package org.delta.b2b.edi.handler.trailer;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t271.ESE01NumberOfIncludedSegments;
import org.delta.b2b.edi.t271.ESE02TransactionSetControlNumber;
import org.delta.b2b.edi.t271.SSETransactionSetTrailer;
import org.delta.b2b.edi.t271.T271;

public class SEHandler {

	private SSETransactionSetTrailer sse;
	
	public SEHandler(T271 t271, Row row) {
		sse = t271.getSSETransactionSetTrailer(); 
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
		ESE01NumberOfIncludedSegments e01 = new ESE01NumberOfIncludedSegments();
		e01.setValue(arr[0]);
		sse.setESE01NumberOfIncludedSegments(e01);
		
		ESE02TransactionSetControlNumber e02 = new ESE02TransactionSetControlNumber();
		e02.setValue(arr[1]);
		sse.setESE02TransactionSetControlNumber(e02);
	}
}
