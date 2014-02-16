package org.delta.b2b.edi.handler.trailer;

import java.math.BigInteger;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t276.*;

public class GEHandler {

	private SGEFunctionalGroupTrailer sge;
	
	public GEHandler(T276 t276, Row row) {
		sge = t276.getSGEFunctionalGroupTrailer(); 
		process(row);
	}
	//GE*1*1~
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		System.out.println("GE array lenght :"+arr.length);
		
		EGE01NumberOfTransactionSetsIncluded e01 = new EGE01NumberOfTransactionSetsIncluded();
		e01.setValue(BigInteger.valueOf(Integer.parseInt(arr[0])));
		sge.setEGE01NumberOfTransactionSetsIncluded(e01);
		
		EGE02GroupControlNumber e02 = new EGE02GroupControlNumber();
		e02.setValue(BigInteger.valueOf(Integer.parseInt(arr[1])));
		sge.setEGE02GroupControlNumber(e02);
	}
}
