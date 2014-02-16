package org.delta.b2b.edi.handler.element;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t276.ENM101EntityIdentifierCode3;
import org.delta.b2b.edi.t276.ENM102EntityTypeQualifier1;
import org.delta.b2b.edi.t276.ENM103NameLastOrOrganizationName;
import org.delta.b2b.edi.t276.ENM104NameFirst;
import org.delta.b2b.edi.t276.ENM105NameMiddle;
import org.delta.b2b.edi.t276.ENM107NameSuffix;
import org.delta.b2b.edi.t276.SNM1DependentName;

public class NM1DependetHandler {
	private SNM1DependentName snm1;
	
	public NM1DependetHandler(SNM1DependentName snm1, Row row) {
		this.snm1 = snm1; 
		
		process(row);
	}
	//
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
		System.out.println("NM1 array lenght :"+arr.length);
		
		ENM101EntityIdentifierCode3 e01 = new ENM101EntityIdentifierCode3();
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
		
		if(arr.length == 5) {
			ENM105NameMiddle e05 = new ENM105NameMiddle();
			//e05.setValue(arr[4]);
			JAXBElement<ENM105NameMiddle> jaxe05 = new JAXBElement(QName.valueOf("E-NM105-Name_Middle"), ENM105NameMiddle.class, null, e05);
			//snm1.setENM105NameMiddle(jaxe05);
		}
		if(arr.length == 6) {
			ENM107NameSuffix e07 = new ENM107NameSuffix();
			//e07.setValue(arr[5]);
			JAXBElement<ENM107NameSuffix> jaxe07 = new JAXBElement(QName.valueOf("E-NM107-Name_Suffix"), ENM107NameSuffix.class, null, e07);
			//snm1.setENM107NameSuffix(jaxe07);
		}
		
		//Not Used
		/*
		ENM106NamePrefix e06 = new ENM106NamePrefix();
		e06.setType(arr[5]);
		JAXBElement<ENM106NamePrefix> jaxe06 = new JAXBElement(QName.valueOf("E-NM106-Name_Prefix"), ENM106NamePrefix.class, null, e06);
		snm1.setENM106NamePrefix(jaxe06);
		*/
		
		
		//Not Used
		/*
		ENM108IdentificationCodeQualifier3 e08 = new ENM108IdentificationCodeQualifier3();
		e08.setType(arr[7]);
		JAXBElement<ENM108IdentificationCodeQualifier3> jaxe08 = new JAXBElement(QName.valueOf("E-NM108-Identification_Code_Qualifier"), ENM108IdentificationCodeQualifier3.class, null, e08);
		snm1.setENM108IdentificationCodeQualifier(jaxe08);
		
		ENM109IdentificationCode1 e09 = new ENM109IdentificationCode1();
		e09.setType(arr[8]);
		JAXBElement<ENM109IdentificationCode1> jaxe09 = new JAXBElement(QName.valueOf("E-NM109-Identification_Code"), ENM109IdentificationCode1.class, null, e09);
		snm1.setENM109IdentificationCode(jaxe09);
		/*
		ENM110EntityRelationshipCode e10 = new ENM110EntityRelationshipCode();
		e10.setType(arr[9]);
		JAXBElement<ENM110EntityRelationshipCode> jaxe10 = new JAXBElement(QName.valueOf("E-NM110-Entity_Relationship_Code"), ENM110EntityRelationshipCode.class, null, e10);
		snm1.setENM110EntityRelationshipCode(jaxe10);
		
		ENM111EntityIdentifierCode e11 = new ENM111EntityIdentifierCode();
		e11.setType(arr[10]);
		JAXBElement<ENM111EntityIdentifierCode> jaxe11 = new JAXBElement(QName.valueOf("E-NM111-Entity_Identifier_Code"), ENM111EntityIdentifierCode.class, null, e11);
		snm1.setENM111EntityIdentifierCode(jaxe11);
		
		ENM112NameLastOrOrganizationName e12 = new ENM112NameLastOrOrganizationName();
		e12.setType(arr[11]);
		JAXBElement<ENM112NameLastOrOrganizationName> jaxe12 = new JAXBElement(QName.valueOf("E-NM112-Name_Last_or_Organization_Name"), ENM112NameLastOrOrganizationName.class, null, e12);
		snm1.setENM112NameLastOrOrganizationName(jaxe12);
		*/			
	}
}