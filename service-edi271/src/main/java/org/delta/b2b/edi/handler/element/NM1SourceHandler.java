package org.delta.b2b.edi.handler.element;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t271.ENM101EntityIdentifierCode;
import org.delta.b2b.edi.t271.ENM102EntityTypeQualifier;
import org.delta.b2b.edi.t271.ENM103NameLastOrOrganizationName;
import org.delta.b2b.edi.t271.ENM104NameFirst;
import org.delta.b2b.edi.t271.ENM105NameMiddle;
import org.delta.b2b.edi.t271.ENM106NamePrefix;
import org.delta.b2b.edi.t271.ENM107NameSuffix;
import org.delta.b2b.edi.t271.ENM108IdentificationCodeQualifier;
import org.delta.b2b.edi.t271.ENM109IdentificationCode;
import org.delta.b2b.edi.t271.SNM1InformationSourceName;

public class NM1SourceHandler {

	private SNM1InformationSourceName snm1;
	
	public NM1SourceHandler(SNM1InformationSourceName snm1, Row row) {
		this.snm1 = snm1; 		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
		System.out.println("NM1 array lenght :"+arr.length);
		ENM101EntityIdentifierCode e01 = new ENM101EntityIdentifierCode();
		e01.setValue(arr[0]);
		snm1.setENM101EntityIdentifierCode(e01);
		
		ENM102EntityTypeQualifier e02 = new ENM102EntityTypeQualifier();
		e02.setValue(arr[1]);
		snm1.setENM102EntityTypeQualifier(e02);
		
		ENM103NameLastOrOrganizationName e03 = new ENM103NameLastOrOrganizationName();
		e03.setValue(arr[2]);
		snm1.setENM103NameLastOrOrganizationName(e03);
		
		ENM104NameFirst e04 = new ENM104NameFirst();
		e04.setValue(arr[3]);
		JAXBElement<ENM104NameFirst> jaxe04 = new JAXBElement(QName.valueOf("E-NM104-Name_First"), ENM104NameFirst.class, null, e04);
		snm1.setENM104NameFirst(jaxe04);
		
		ENM105NameMiddle e05 = new ENM105NameMiddle();
		e05.setValue(arr[4]);
		JAXBElement<ENM105NameMiddle> jaxe05 = new JAXBElement(QName.valueOf("E-NM105-Name_Middle"), ENM105NameMiddle.class, null, e05);
		snm1.setENM105NameMiddle(jaxe05);
		
		ENM106NamePrefix e06 = new ENM106NamePrefix();
		e06.setType(arr[5]);
		JAXBElement<ENM106NamePrefix> jaxe06 = new JAXBElement(QName.valueOf("E-NM106-Name_Prefix"), ENM106NamePrefix.class, null, e06);
		snm1.setENM106NamePrefix(jaxe06);
		
		ENM107NameSuffix e07 = new ENM107NameSuffix();
		e07.setValue(arr[6]);
		JAXBElement<ENM107NameSuffix> jaxe07 = new JAXBElement(QName.valueOf("E-NM107-Name_Suffix"), ENM107NameSuffix.class, null, e07);
		snm1.setENM107NameSuffix(jaxe07);
		
		ENM108IdentificationCodeQualifier e08 = new ENM108IdentificationCodeQualifier();
		e08.setValue(arr[7]);
		snm1.setENM108IdentificationCodeQualifier(e08);
		
		ENM109IdentificationCode e09 = new ENM109IdentificationCode();
		e09.setValue(arr[8]);
		snm1.setENM109IdentificationCode(e09);
		
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
