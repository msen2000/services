package org.delta.b2b.edi.handler.loop;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.delta.b2b.edi.handler.element.NM1ReceiverHandler;
import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t270.CC035ProviderSpecialtyInformation;
import org.delta.b2b.edi.t270.CC040ReferenceIdentifier;
import org.delta.b2b.edi.t270.EN301AddressInformation;
import org.delta.b2b.edi.t270.EN302AddressInformation;
import org.delta.b2b.edi.t270.EN401CityName;
import org.delta.b2b.edi.t270.EN402StateOrProvinceCode;
import org.delta.b2b.edi.t270.EN403PostalCode;
import org.delta.b2b.edi.t270.EN404CountryCode;
import org.delta.b2b.edi.t270.EPRV01ProviderCode;
import org.delta.b2b.edi.t270.EPRV02ReferenceIdentificationQualifier;
import org.delta.b2b.edi.t270.EPRV03ReferenceIdentification;
import org.delta.b2b.edi.t270.EPRV04StateOrProvinceCode;
import org.delta.b2b.edi.t270.EPRV06ProviderOrganizationCode;
import org.delta.b2b.edi.t270.EREF01ReferenceIdentificationQualifier;
import org.delta.b2b.edi.t270.EREF02ReferenceIdentification;
import org.delta.b2b.edi.t270.EREF03Description;
import org.delta.b2b.edi.t270.L2000B;
import org.delta.b2b.edi.t270.L2100B;
import org.delta.b2b.edi.t270.ObjectFactory;
import org.delta.b2b.edi.t270.SN3InformationReceiverAddress;
import org.delta.b2b.edi.t270.SN4InformationReceiverCityStateZIPCode;
import org.delta.b2b.edi.t270.SNM1InformationReceiverName;
import org.delta.b2b.edi.t270.SPRVInformationReceiverProviderInformation;
import org.delta.b2b.edi.t270.SREFInformationReceiverAdditionalIdentification;

public class L2000BHandler {
	private L2000B l2000b;
	
	public L2000BHandler(L2000B obj, Row row) {
		l2000b = obj; 		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		String segName = row.getSegName();
		L2100B l2100b = null;
		
		ObjectFactory objFac = new ObjectFactory(); 
		
		l2100b = l2000b.getL2100B();
		if(null == l2100b) {
			l2100b = objFac.createL2100B();
			l2000b.setL2100B(l2100b);
		}
		
		//NM1
		if ("NM1".equalsIgnoreCase(segName)) {
			SNM1InformationReceiverName snm1 = new SNM1InformationReceiverName();
			NM1ReceiverHandler nm1rh = new NM1ReceiverHandler(snm1, row);		
			l2100b.setSNM1InformationReceiverName(snm1);
		}
		
		//REF
		if ("REF".equalsIgnoreCase(segName)) {
			System.out.println("REF array lenght :"+arr.length);			
			
			List<SREFInformationReceiverAdditionalIdentification> listRef = l2100b.getSREFInformationReceiverAdditionalIdentification();
			
			SREFInformationReceiverAdditionalIdentification ref1 = objFac.createSREFInformationReceiverAdditionalIdentification();
			//SREFInformationReceiverAdditionalIdentification ref1 = new SREFInformationReceiverAdditionalIdentification();			
			
			EREF01ReferenceIdentificationQualifier eref01 = new EREF01ReferenceIdentificationQualifier();
			eref01.setValue(arr[0]);
			ref1.setEREF01ReferenceIdentificationQualifier(eref01);
			
			EREF02ReferenceIdentification eref02 = new EREF02ReferenceIdentification();
			eref02.setValue(arr[1]);
			ref1.setEREF02ReferenceIdentification(eref02);
			
			/*
			objFac.createEREF03Description();
			JAXBElement<EREF03Description> jaxref03 = ref1.getEREF03Description();			
			EREF03Description ref03 = jaxref03.getValue();
			if(null == ref03) {
				ref03 = new EREF03Description();
				jaxref03.setValue(ref03);
			}
			ref03.setValue(null);
			ref1.setEREF03Description(jaxref03);	
			
			JAXBElement<CC040ReferenceIdentifier> jaxcc040 = ref1.getCC040ReferenceIdentifier();
			CC040ReferenceIdentifier cc040 = jaxcc040.getValue();
			if(null == cc040) {
				cc040 = new CC040ReferenceIdentifier();
				jaxcc040.setValue(cc040);
			}			
			ref1.setCC040ReferenceIdentifier(jaxcc040);
			*/
			listRef.add(ref1);
		}
		
		//N3
		if ("N3".equalsIgnoreCase(segName)) {
			System.out.println("N3 array lenght :"+arr.length);
			
			SN3InformationReceiverAddress n3 = objFac.createSN3InformationReceiverAddress();
			
			EN301AddressInformation n301 = objFac.createEN301AddressInformation();
			n301.setValue(arr[0]);
			n3.setEN301AddressInformation(n301);

			EN302AddressInformation n302 = objFac.createEN302AddressInformation();
			n302.setValue(arr[1]);			
			JAXBElement<EN302AddressInformation> jaxn302 = new JAXBElement(QName.valueOf("E-N302-Address_Information"), EN302AddressInformation.class, null, n302);			
			n3.setEN302AddressInformation(jaxn302);
			
			JAXBElement<SN3InformationReceiverAddress> jaxn3 = new JAXBElement(QName.valueOf("S-N3-Information_Receiver_Address"), SN3InformationReceiverAddress.class, null, n3);						
			
			l2100b.setSN3InformationReceiverAddress(jaxn3);			
		}
		
		//N4
		if ("N4".equalsIgnoreCase(segName)) {
			System.out.println("N4 array lenght :"+arr.length);			
			
			SN4InformationReceiverCityStateZIPCode n4 = objFac.createSN4InformationReceiverCityStateZIPCode();
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
						
			EN404CountryCode en404 = objFac.createEN404CountryCode();
			en404.setValue(arr[3]);			
			JAXBElement<EN404CountryCode> jaxen404 = new JAXBElement(QName.valueOf("E-N404-Country_Code"), EN404CountryCode.class, null, en404);
			n4.setEN404CountryCode(jaxen404);
			
			n4.setEN405LocationQualifier(null);
			n4.setEN406LocationIdentifier(null);
			n4.setEN407CountrySubdivisionCode(null);
			
			JAXBElement<SN4InformationReceiverCityStateZIPCode> jaxn4 = new JAXBElement(QName.valueOf("S-N4-Information_Receiver_City__State__ZIP_Code"), SN4InformationReceiverCityStateZIPCode.class, null, n4);
			
			l2100b.setSN4InformationReceiverCityStateZIPCode(jaxn4);
		}
		
		//PRV
		if ("PRV".equalsIgnoreCase(segName)) {
			System.out.println("PRV array lenght :"+arr.length);
			
			SPRVInformationReceiverProviderInformation sprv = objFac.createSPRVInformationReceiverProviderInformation();
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
			
			/*
			EPRV04StateOrProvinceCode eprv404 = objFac.createEPRV04StateOrProvinceCode();
			eprv404.setType(arr[3]);
			JAXBElement<EPRV04StateOrProvinceCode> jaxeprv04 = new JAXBElement(QName.valueOf("E-PRV04-State_or_Province_Code"), EPRV04StateOrProvinceCode.class, null, eprv404);
			sprv.setEPRV04StateOrProvinceCode(jaxeprv04);
			
			EPRV06ProviderOrganizationCode eprv06 = objFac.createEPRV06ProviderOrganizationCode();			
			eprv06.setType(arr[4]);
			JAXBElement<EPRV06ProviderOrganizationCode> jaxeprv06 = new JAXBElement(QName.valueOf("E-PRV06-Provider_Organization_Code"), EPRV06ProviderOrganizationCode.class, null, eprv06);
			sprv.setEPRV06ProviderOrganizationCode(jaxeprv06);
			
			CC035ProviderSpecialtyInformation ecc035 = objFac.createCC035ProviderSpecialtyInformation();
			ecc035.setEPRV01ProviderSpecialtyCode(null);
			ecc035.setEPRV02AgencyQualifierCode(null);
			ecc035.setEPRV03YesNoConditionOrResponseCode(null);
			JAXBElement<CC035ProviderSpecialtyInformation> jaxecc035 = new JAXBElement(QName.valueOf("C-C035-Provider_Specialty_Information"), CC035ProviderSpecialtyInformation.class, null, ecc035);
			sprv.setCC035ProviderSpecialtyInformation(jaxecc035);
			*/
			
			JAXBElement<SPRVInformationReceiverProviderInformation> jaxsprv = new JAXBElement(QName.valueOf("S-PRV-Information_Receiver_Provider_Information"), SPRVInformationReceiverProviderInformation.class, null, sprv);
			l2100b.setSPRVInformationReceiverProviderInformation(jaxsprv);
		}
		
		l2000b.setL2100B(l2100b);
		
	}
}
