package org.delta.b2b.edi.handler.loop;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.delta.b2b.edi.handler.element.NM1ReceiverHandler;
import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t276.EREF01ReferenceIdentificationQualifier;
import org.delta.b2b.edi.t276.EREF02ReferenceIdentification;
import org.delta.b2b.edi.t276.L2000B;
import org.delta.b2b.edi.t276.L2100B;
import org.delta.b2b.edi.t276.ObjectFactory;
import org.delta.b2b.edi.t276.SNM1InformationReceiverName;

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
		/*
		//REF
		if ("REF".equalsIgnoreCase(segName)) {
			System.out.println("REF array lenght :"+arr.length);			
			
			List<SREFInformationReceiverAdditionalIdentification> listRef = l2100b.getSREFInformationReceiverAdditionalIdentification();
			
			SREFInformationReceiverAdditionalIdentification ref1 = objFac.createSREFInformationReceiverAdditionalIdentification();
						
			
			EREF01ReferenceIdentificationQualifier eref01 = new EREF01ReferenceIdentificationQualifier();
			eref01.setValue(arr[0]);
			ref1.setEREF01ReferenceIdentificationQualifier(eref01);
			
			EREF02ReferenceIdentification eref02 = new EREF02ReferenceIdentification();
			eref02.setValue(arr[1]);
			ref1.setEREF02ReferenceIdentification(eref02);
						
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
						
			
			JAXBElement<SPRVInformationReceiverProviderInformation> jaxsprv = new JAXBElement(QName.valueOf("S-PRV-Information_Receiver_Provider_Information"), SPRVInformationReceiverProviderInformation.class, null, sprv);
			l2100b.setSPRVInformationReceiverProviderInformation(jaxsprv);
		}
		*/
		l2000b.setL2100B(l2100b);
		
	}
}
