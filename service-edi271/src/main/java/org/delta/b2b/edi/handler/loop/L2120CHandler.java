package org.delta.b2b.edi.handler.loop;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t271.EN301AddressInformation;
import org.delta.b2b.edi.t271.EN302AddressInformation;
import org.delta.b2b.edi.t271.EN401CityName;
import org.delta.b2b.edi.t271.EN402StateOrProvinceCode;
import org.delta.b2b.edi.t271.EN403PostalCode;
import org.delta.b2b.edi.t271.EN404CountryCode;
import org.delta.b2b.edi.t271.ENM101EntityIdentifierCode3;
import org.delta.b2b.edi.t271.ENM102EntityTypeQualifier2;
import org.delta.b2b.edi.t271.ENM103NameLastOrOrganizationName;
import org.delta.b2b.edi.t271.ENM104NameFirst;
import org.delta.b2b.edi.t271.ENM105NameMiddle;
import org.delta.b2b.edi.t271.ENM106NamePrefix;
import org.delta.b2b.edi.t271.ENM107NameSuffix;
import org.delta.b2b.edi.t271.ENM108IdentificationCodeQualifier3;
import org.delta.b2b.edi.t271.ENM109IdentificationCode;
import org.delta.b2b.edi.t271.EPER01ContactFunctionCode;
import org.delta.b2b.edi.t271.EPER02Name;
import org.delta.b2b.edi.t271.EPER03CommunicationNumberQualifier;
import org.delta.b2b.edi.t271.EPRV01ProviderCode;
import org.delta.b2b.edi.t271.EPRV02ReferenceIdentificationQualifier;
import org.delta.b2b.edi.t271.EPRV03ReferenceIdentification;
import org.delta.b2b.edi.t271.L2120C;
import org.delta.b2b.edi.t271.ObjectFactory;
import org.delta.b2b.edi.t271.SN3SubscriberBenefitRelatedEntityAddress;
import org.delta.b2b.edi.t271.SN4SubscriberBenefitRelatedEntityCityStateZIPCode;
import org.delta.b2b.edi.t271.SNM1SubscriberBenefitRelatedEntityName;
import org.delta.b2b.edi.t271.SPERSubscriberBenefitRelatedEntityContactInformation;
import org.delta.b2b.edi.t271.SPRVSubscriberBenefitRelatedProviderInformation;

public class L2120CHandler {
	private L2120C l2120c;
	
	public L2120CHandler(L2120C obj, Row row) {
		l2120c = obj; 		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		String segName = row.getSegName();
		
		//NM1
		if ("NM1".equalsIgnoreCase(segName)) {
			System.out.println("NM1 array lenght :"+arr.length);
			
			SNM1SubscriberBenefitRelatedEntityName snm1 = new SNM1SubscriberBenefitRelatedEntityName();
			
			ENM101EntityIdentifierCode3 e01 = new ENM101EntityIdentifierCode3();
			e01.setValue(arr[0]);
			snm1.setENM101EntityIdentifierCode(e01);
			
			ENM102EntityTypeQualifier2 e02 = new ENM102EntityTypeQualifier2();
			e02.setValue(arr[1]);
			snm1.setENM102EntityTypeQualifier(e02);
			
			ENM103NameLastOrOrganizationName e03 = new ENM103NameLastOrOrganizationName();
			e03.setValue(arr[2]);
			JAXBElement<ENM103NameLastOrOrganizationName> jaxe03 = new JAXBElement(QName.valueOf("E-NM103-Name_Last_or_Organization_Name"), ENM103NameLastOrOrganizationName.class, null, e03);
			snm1.setENM103NameLastOrOrganizationName(jaxe03);
			
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
			
			ENM108IdentificationCodeQualifier3 e08 = new ENM108IdentificationCodeQualifier3();
			e08.setValue(arr[7]);
			JAXBElement<ENM108IdentificationCodeQualifier3> jaxe08 = new JAXBElement(QName.valueOf("E-NM108-Identification_Code_Qualifier"), ENM108IdentificationCodeQualifier3.class, null, e08);
			snm1.setENM108IdentificationCodeQualifier(jaxe08);
			
			ENM109IdentificationCode e09 = new ENM109IdentificationCode();
			e09.setValue(arr[8]);
			JAXBElement<ENM109IdentificationCode> jaxe09 = new JAXBElement(QName.valueOf("E-NM109-Identification_Code"), ENM109IdentificationCode.class, null, e09);
			snm1.setENM109IdentificationCode(jaxe09);					
					
			l2120c.setSNM1SubscriberBenefitRelatedEntityName(snm1);		
		}		
				
		//N3
		if ("N3".equalsIgnoreCase(segName)) {
			System.out.println("N3 array lenght :"+arr.length);
			ObjectFactory objFac = new ObjectFactory();
			
			SN3SubscriberBenefitRelatedEntityAddress n3 = objFac.createSN3SubscriberBenefitRelatedEntityAddress();
			
			EN301AddressInformation n301 = objFac.createEN301AddressInformation();
			n301.setValue(arr[0]);
			n3.setEN301AddressInformation(n301);

			EN302AddressInformation n302 = objFac.createEN302AddressInformation();
			n302.setValue(arr[1]);			
			JAXBElement<EN302AddressInformation> jaxn302 = new JAXBElement(QName.valueOf("E-N302-Address_Information"), EN302AddressInformation.class, null, n302);			
			n3.setEN302AddressInformation(jaxn302);
			
			JAXBElement<SN3SubscriberBenefitRelatedEntityAddress> jaxn3 = new JAXBElement(QName.valueOf("S-N3-Subscriber_Benefit_Related_Entity_Address"), SN3SubscriberBenefitRelatedEntityAddress.class, null, n3);						
			
			l2120c.setSN3SubscriberBenefitRelatedEntityAddress(jaxn3);		
		}
		
		//N4
		if ("N4".equalsIgnoreCase(segName)) {
			System.out.println("N4 array lenght :"+arr.length);			
			
			ObjectFactory objFac = new ObjectFactory();
			
			SN4SubscriberBenefitRelatedEntityCityStateZIPCode n4 = objFac.createSN4SubscriberBenefitRelatedEntityCityStateZIPCode();
			EN401CityName en401 = new EN401CityName();
			en401.setValue(arr[0]);
			n4.setEN401CityName(en401);
											
			EN402StateOrProvinceCode en402 = objFac.createEN402StateOrProvinceCode();
			en402.setValue(arr[1]);			
			JAXBElement<EN402StateOrProvinceCode> jaxen402 = new JAXBElement(QName.valueOf("E-N402-State_or_Province_Code"), EN402StateOrProvinceCode.class, null, en402);
			n4.setEN402StateOrProvinceCode(jaxen402);
						
			EN403PostalCode en403 = objFac.createEN403PostalCode();			
			en403.setValue(arr[2]);
			JAXBElement<EN403PostalCode> jaxen403 = new JAXBElement(QName.valueOf("E-N403-Postal_Code"), EN403PostalCode.class, null, en403);
			n4.setEN403PostalCode(jaxen403);
			if (arr.length == 4) {			
				EN404CountryCode en404 = objFac.createEN404CountryCode();
				en404.setValue(arr[3]);	
				JAXBElement<EN404CountryCode> jaxen404 = new JAXBElement(QName.valueOf("E-N404-Country_Code"), EN404CountryCode.class, null, en404);
				n4.setEN404CountryCode(jaxen404);
			}
			
			n4.setEN405LocationQualifier(null);
			n4.setEN406LocationIdentifier(null);
			n4.setEN407CountrySubdivisionCode(null);
			
			JAXBElement<SN4SubscriberBenefitRelatedEntityCityStateZIPCode> jaxn4 = new JAXBElement(QName.valueOf("S-N4-Subscriber_Benefit_Related_Entity_City__State__ZIP_Code"), SN4SubscriberBenefitRelatedEntityCityStateZIPCode.class, null, n4);
			
			l2120c.setSN4SubscriberBenefitRelatedEntityCityStateZIPCode(null);	
		}
		
		//PRV
		if ("PRV".equalsIgnoreCase(segName)) {
			System.out.println("PRV array lenght :"+arr.length);
			
			ObjectFactory objFac = new ObjectFactory();
			
			SPRVSubscriberBenefitRelatedProviderInformation sprv = objFac.createSPRVSubscriberBenefitRelatedProviderInformation();
			EPRV01ProviderCode eprv01 = new EPRV01ProviderCode();			
			eprv01.setValue(arr[0]);
			sprv.setEPRV01ProviderCode(eprv01);
			
			EPRV02ReferenceIdentificationQualifier eprv402 = objFac.createEPRV02ReferenceIdentificationQualifier();
			eprv402.setValue(arr[1]);
			JAXBElement<EPRV02ReferenceIdentificationQualifier> jaxeprv02 = new JAXBElement(QName.valueOf("E-PRV02-Reference_Identification_Qualifier"), EPRV02ReferenceIdentificationQualifier.class, null, eprv402);
			sprv.setEPRV02ReferenceIdentificationQualifier(jaxeprv02);
						
			EPRV03ReferenceIdentification eprv403 = objFac.createEPRV03ReferenceIdentification();
			eprv403.setValue(arr[2]);
			JAXBElement<EPRV03ReferenceIdentification> jaxeprv03 = new JAXBElement(QName.valueOf("E-PRV03-Reference_Identification"), EPRV03ReferenceIdentification.class, null, eprv403);
			sprv.setEPRV03ReferenceIdentification(jaxeprv03);
			
			JAXBElement<SPRVSubscriberBenefitRelatedProviderInformation> jaxsprv = new JAXBElement(QName.valueOf("S-PRV-Subscriber_Benefit_Related_Provider_Information"), SPRVSubscriberBenefitRelatedProviderInformation.class, null, sprv);
			
			l2120c.setSPRVSubscriberBenefitRelatedProviderInformation(null);
		}
		
		//PER
		if ("PER".equalsIgnoreCase(segName)) {
			System.out.println("PER array lenght :"+arr.length);
			
			ObjectFactory objFac = new ObjectFactory();
			
			List<SPERSubscriberBenefitRelatedEntityContactInformation> sperList = l2120c.getSPERSubscriberBenefitRelatedEntityContactInformation();
			
			SPERSubscriberBenefitRelatedEntityContactInformation sper = objFac.createSPERSubscriberBenefitRelatedEntityContactInformation();
			
			EPER01ContactFunctionCode eper01 = new EPER01ContactFunctionCode();
			eper01.setValue(arr[0]);
			sper.setEPER01ContactFunctionCode(eper01);
			
			EPER02Name eper02 = new EPER02Name();
			eper02.setValue(arr[1]);
			sper.setEPER02Name(null);
			
			EPER03CommunicationNumberQualifier per03 = new EPER03CommunicationNumberQualifier();
			per03.setValue(arr[2]);
			sper.setEPER03CommunicationNumberQualifier(null);
			
			sper.setEPER04CommunicationNumber(null);
			sper.setEPER05CommunicationNumberQualifier(null);
			sper.setEPER06CommunicationNumber(null);
			sper.setEPER07CommunicationNumberQualifier(null);
			sper.setEPER08CommunicationNumber(null);
			sper.setEPER09ContactInquiryReference(null);		
			
			sperList.add(sper);
		}
		
	}
}