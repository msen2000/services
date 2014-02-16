/**
 * 
 */
package org.delta.b2b.edi.handler.segment;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t270.EBHT01HierarchicalStructureCode;
import org.delta.b2b.edi.t270.EBHT02TransactionSetPurposeCode;
import org.delta.b2b.edi.t270.EBHT03ReferenceIdentification;
import org.delta.b2b.edi.t270.EBHT04Date;
import org.delta.b2b.edi.t270.EBHT05Time;
import org.delta.b2b.edi.t270.EBHT06TransactionTypeCode;
import org.delta.b2b.edi.t270.ENM109IdentificationCode;
import org.delta.b2b.edi.t270.SBHTBeginningOfHierarchicalTransaction;
import org.delta.b2b.edi.t270.T270;

/**
 * @author ca31085
 *
 */
public class BHTHandler {

	private SBHTBeginningOfHierarchicalTransaction sbht;
	
	public BHTHandler(T270 t270, Row row) {
		sbht = t270.getSBHTBeginningOfHierarchicalTransaction(); 
		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
		EBHT01HierarchicalStructureCode e01 = new EBHT01HierarchicalStructureCode();
		e01.setValue(arr[0]);
		sbht.setEBHT01HierarchicalStructureCode(e01);
		
		EBHT02TransactionSetPurposeCode e02 = new EBHT02TransactionSetPurposeCode();
		e02.setValue(arr[1]);
		sbht.setEBHT02TransactionSetPurposeCode(e02);
				
		EBHT03ReferenceIdentification e03 = new EBHT03ReferenceIdentification();
		e03.setValue(arr[2]);
		JAXBElement<EBHT03ReferenceIdentification> jaxe03 = new JAXBElement(QName.valueOf("E-BHT03-Reference_Identification"), EBHT03ReferenceIdentification.class, null, e03);
		sbht.setEBHT03ReferenceIdentification(jaxe03);
		
		EBHT04Date e04 = new EBHT04Date();
		e04.setValue(arr[3]);
		sbht.setEBHT04Date(e04);
		
		EBHT05Time e05 = new EBHT05Time();
		e05.setValue(arr[4]);
		sbht.setEBHT05Time(e05);

		/*
		EBHT06TransactionTypeCode e06 = new EBHT06TransactionTypeCode();
		e1.setValue(arr[5]);
		JAXBElement<EBHT06TransactionTypeCode> jaxe06 = new JAXBElement(QName.valueOf("E-BHT06-Transaction_Type_Code"), EBHT06TransactionTypeCode.class, null, e06);
		sbht.setEBHT06TransactionTypeCode(jaxe06);
		*/			
	}

}
