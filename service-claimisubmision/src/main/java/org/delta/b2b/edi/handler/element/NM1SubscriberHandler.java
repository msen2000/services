package org.delta.b2b.edi.handler.element;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t837.ENM101EntityIdentifierCode2;
import org.delta.b2b.edi.t837.ENM102EntityTypeQualifier1;
import org.delta.b2b.edi.t837.ENM103NameLastOrOrganizationName;
import org.delta.b2b.edi.t837.ENM104NameFirst;
import org.delta.b2b.edi.t837.ENM105NameMiddle;
import org.delta.b2b.edi.t837.ENM106NamePrefix;
import org.delta.b2b.edi.t837.ENM107NameSuffix;
import org.delta.b2b.edi.t837.ENM108IdentificationCodeQualifier2;
import org.delta.b2b.edi.t837.ENM109IdentificationCode;
import org.delta.b2b.edi.t837.SNM1SubscriberName;

public class NM1SubscriberHandler {
	private SNM1SubscriberName snm1;
	
	public NM1SubscriberHandler(SNM1SubscriberName snm1, Row row) {
		this.snm1 = snm1; 
		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
		System.out.println("NM1 array lenght :"+arr.length);
		ENM101EntityIdentifierCode2 e01 = new ENM101EntityIdentifierCode2();
		e01.setValue(arr[0]);
		//snm1.setENM101EntityIdentifierCode(e01);
		
		ENM102EntityTypeQualifier1 e02 = new ENM102EntityTypeQualifier1();
		e02.setValue(arr[1]);
		//snm1.setENM102EntityTypeQualifier(e02);
		
		ENM103NameLastOrOrganizationName e03 = new ENM103NameLastOrOrganizationName();
		e03.setValue(arr[2]);
		JAXBElement<ENM103NameLastOrOrganizationName> jaxe03 = new JAXBElement(QName.valueOf("E-NM103-Name_Last_or_Organization_Name"), ENM103NameLastOrOrganizationName.class, null, e03);
		//snm1.setENM103NameLastOrOrganizationName(jaxe03);
		
		ENM104NameFirst e04 = new ENM104NameFirst();
		//e04.setValue(arr[3]);
		JAXBElement<ENM104NameFirst> jaxe04 = new JAXBElement(QName.valueOf("E-NM104-Name_First"), ENM104NameFirst.class, null, e04);
		//snm1.setENM104NameFirst(jaxe04);
		
		ENM105NameMiddle e05 = new ENM105NameMiddle();
		//e05.setValue(arr[4]);
		JAXBElement<ENM105NameMiddle> jaxe05 = new JAXBElement(QName.valueOf("E-NM105-Name_Middle"), ENM105NameMiddle.class, null, e05);
		//snm1.setENM105NameMiddle(jaxe05);
		
		ENM106NamePrefix e06 = new ENM106NamePrefix();
		e06.setType(arr[5]);
		JAXBElement<ENM106NamePrefix> jaxe06 = new JAXBElement(QName.valueOf("E-NM106-Name_Prefix"), ENM106NamePrefix.class, null, e06);
		snm1.setENM106NamePrefix(jaxe06);
		
		ENM107NameSuffix e07 = new ENM107NameSuffix();
		//e07.setValue(arr[6]);
		JAXBElement<ENM107NameSuffix> jaxe07 = new JAXBElement(QName.valueOf("E-NM107-Name_Suffix"), ENM107NameSuffix.class, null, e07);
		//snm1.setENM107NameSuffix(jaxe07);
		
		ENM108IdentificationCodeQualifier2 e08 = new ENM108IdentificationCodeQualifier2();
		//e08.setValue(arr[7]);
		JAXBElement<ENM108IdentificationCodeQualifier2> jaxe08 = new JAXBElement(QName.valueOf("E-NM108-Identification_Code_Qualifier"), ENM108IdentificationCodeQualifier2.class, null, e08);
		//snm1.setENM108IdentificationCodeQualifier(jaxe08);
		
		ENM109IdentificationCode e09 = new ENM109IdentificationCode();
		e09.setValue(arr[8]);
		JAXBElement<ENM109IdentificationCode> jaxe09 = new JAXBElement(QName.valueOf("E-NM109-Identification_Code"), ENM109IdentificationCode.class, null, e09);
		//snm1.setENM109IdentificationCode(jaxe09);
		
	}
}
