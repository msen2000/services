package org.delta.b2b.edi.handler.loop;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t837.L2000C;

public class L2000CHandler {
	private L2000C l2000c;
	
	public L2000CHandler(L2000C obj, Row row) {
		l2000c = obj; 		
		//process(row);
	}
	/*
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		String segName = row.getSegName();
		
		L2100C l2100c = null;		
		ObjectFactory objFac = new ObjectFactory();
		l2100c = l2000c.getL2100C();
		if (null == l2100c) {
			l2100c = objFac.createL2100C();
			l2000c.setL2100C(l2100c);
		}
		
		//NM1
		if ("NM1".equalsIgnoreCase(segName)) {
			SNM1SubscriberName snm1 = new SNM1SubscriberName();
			NM1SubscriberHandler nm1rh = new NM1SubscriberHandler(snm1, row);		
			l2100c.setSNM1SubscriberName(snm1);		
		}
		
		//REF
		if ("REF".equalsIgnoreCase(segName)) {
			System.out.println("REF array lenght :"+arr.length);			
			
			List<SREFSubscriberAdditionalIdentification> listRef = l2100c.getSREFSubscriberAdditionalIdentification();
			
			SREFSubscriberAdditionalIdentification ref1 = objFac.createSREFSubscriberAdditionalIdentification();
			EREF01ReferenceIdentificationQualifier2 eref01 = new EREF01ReferenceIdentificationQualifier2();
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
			
			SN3SubscriberAddress n3 = objFac.createSN3SubscriberAddress();
			
			EN301AddressInformation n301 = objFac.createEN301AddressInformation();
			n301.setValue(arr[0]);
			n3.setEN301AddressInformation(n301);

			EN302AddressInformation n302 = objFac.createEN302AddressInformation();
			n302.setValue(arr[1]);			
			JAXBElement<EN302AddressInformation> jaxn302 = new JAXBElement(QName.valueOf("E-N302-Address_Information"), EN302AddressInformation.class, null, n302);			
			n3.setEN302AddressInformation(jaxn302);
			
			JAXBElement<SN3SubscriberAddress> jaxn3 = new JAXBElement(QName.valueOf("S-N3-Subscriber_Address"), SN3SubscriberAddress.class, null, n3);						
			
			l2100c.setSN3SubscriberAddress(jaxn3);			
		}
		
		//N4
		if ("N4".equalsIgnoreCase(segName)) {
			System.out.println("N4 array lenght :"+arr.length);			
			
			SN4SubscriberCityStateZIPCode n4 = objFac.createSN4SubscriberCityStateZIPCode();
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
			
			JAXBElement<SN4SubscriberCityStateZIPCode> jaxn4 = new JAXBElement(QName.valueOf("S-N4-Subscriber_City__State__ZIP_Code"), SN4SubscriberCityStateZIPCode.class, null, n4);
			
			l2100c.setSN4SubscriberCityStateZIPCode(jaxn4);
		}
		
		//PRV
		if ("PRV".equalsIgnoreCase(segName)) {
			System.out.println("PRV array lenght :"+arr.length);
			
			SPRVProviderInformation sprv = objFac.createSPRVProviderInformation();
			EPRV01ProviderCode1 eprv01 = new EPRV01ProviderCode1();			
			eprv01.setValue(arr[0]);
			sprv.setEPRV01ProviderCode(eprv01);
			
			EPRV02ReferenceIdentificationQualifier1 eprv402 = objFac.createEPRV02ReferenceIdentificationQualifier1();
			eprv402.setValue(arr[1]);
			JAXBElement<EPRV02ReferenceIdentificationQualifier1> jaxeprv02 = new JAXBElement(QName.valueOf("E-PRV02-Reference_Identification_Qualifier"), EPRV02ReferenceIdentificationQualifier1.class, null, eprv402);
			sprv.setEPRV02ReferenceIdentificationQualifier(jaxeprv02);
						
			EPRV03ReferenceIdentification eprv403 = objFac.createEPRV03ReferenceIdentification();
			eprv403.setValue(arr[2]);
			JAXBElement<EPRV03ReferenceIdentification> jaxeprv03 = new JAXBElement(QName.valueOf("E-PRV03-Reference_Identification"), EPRV03ReferenceIdentification.class, null, eprv403);
			sprv.setEPRV03ReferenceIdentification(jaxeprv03);
			
			
			
			JAXBElement<SPRVProviderInformation> jaxsprv = new JAXBElement(QName.valueOf("S-PRV-Provider_Information"), SPRVProviderInformation.class, null, sprv);
			l2100c.setSPRVProviderInformation(jaxsprv);
		}
		
		//DMG*D8*Date Time Period*F~
		if ("DMG".equalsIgnoreCase(segName)) {
			System.out.println("DMG array lenght :"+arr.length);
			SDMGSubscriberDemographicInformation sdmg = objFac.createSDMGSubscriberDemographicInformation();
			
			EDMG01DateTimePeriodFormatQualifier dmg01 = new EDMG01DateTimePeriodFormatQualifier();
			dmg01.setValue(arr[0]);
			JAXBElement<EDMG01DateTimePeriodFormatQualifier> jaxdmg01 = new JAXBElement(QName.valueOf("E-DMG01-Date_Time_Period_Format_Qualifier"), EDMG01DateTimePeriodFormatQualifier.class, null, dmg01);
			sdmg.setEDMG01DateTimePeriodFormatQualifier(jaxdmg01);
			
			EDMG02DateTimePeriod dmg02 = new EDMG02DateTimePeriod();
			dmg02.setValue(arr[1]);
			JAXBElement<EDMG02DateTimePeriod> jaxdmg02 = new JAXBElement(QName.valueOf("E-DMG02-Date_Time_Period"), EDMG02DateTimePeriod.class, null, dmg02);
			sdmg.setEDMG02DateTimePeriod(jaxdmg02);
			
			//sdmg.setEDMG03GenderCode(value);
			//sdmg.setEDMG04MaritalStatusCode(value);
			//sdmg.setEDMG06CitizenshipStatusCode(value);
			//sdmg.setEDMG07CountryCode(value);
			//sdmg.setEDMG08BasisOfVerificationCode(value);
			//sdmg.setEDMG09Quantity(value);
			//sdmg.setEDMG10CodeListQualifierCode(value);
			//sdmg.setEDMG11IndustryCode(value);			
			JAXBElement<SDMGSubscriberDemographicInformation> jaxsdmg = new JAXBElement(QName.valueOf("S-DMG-Subscriber_Demographic_Information"), SDMGSubscriberDemographicInformation.class, null, sdmg);
			
			l2100c.setSDMGSubscriberDemographicInformation(jaxsdmg);
		}
		//INS*Y*18***************47601~
		if ("INS".equalsIgnoreCase(segName)) {
			System.out.println("INS array lenght :"+arr.length);
			SINSMultipleBirthSequenceNumber ins = new SINSMultipleBirthSequenceNumber();
			
			EINS01YesNoConditionOrResponseCode ins01 = new EINS01YesNoConditionOrResponseCode();
			ins01.setValue(arr[0]);
			ins.setEINS01YesNoConditionOrResponseCode(ins01);

			EINS02IndividualRelationshipCode ins02 = new EINS02IndividualRelationshipCode();
			ins02.setValue(arr[0]);
			ins.setEINS02IndividualRelationshipCode(ins02);
			
			//ins.setEINS03MaintenanceTypeCode(value)
			//ins.setEINS04MaintenanceReasonCode(value);
			//ins.setEINS05BenefitStatusCode(value);
			
			JAXBElement<SINSMultipleBirthSequenceNumber> jaxins = new JAXBElement(QName.valueOf("S-HI-Subscriber_Health_Care_Diagnosis_Code"), SINSMultipleBirthSequenceNumber.class, null, ins);			
			l2100c.setSINSMultipleBirthSequenceNumber(jaxins);
		}
		//HI*BK\0010*BF\0010*BF\0010*BF\0010*BF\0010*BF\0010*BF\0010*BF\0010~
		if ("HI".equalsIgnoreCase(segName)) {
			System.out.println("HI array lenght :"+arr.length);
			
			SHISubscriberHealthCareDiagnosisCode shis = new SHISubscriberHealthCareDiagnosisCode();
			CC022HealthCareCodeInformation cc022 = new CC022HealthCareCodeInformation();
			EHI01CodeListQualifierCode ehi01 = new EHI01CodeListQualifierCode();
			ehi01.setValue(arr[0]);
			cc022.setEHI01CodeListQualifierCode(ehi01);
			//shis.setCC022HealthCareCodeInformation(value);
			//shis.setCC022HealthCareCodeInformation1(value);
			//shis.setCC022HealthCareCodeInformation2(value)
			//shis.setCC022HealthCareCodeInformation3(value)
			//shis.setCC022HealthCareCodeInformation4(value)
			//shis.setCC022HealthCareCodeInformation5(value)
			
			JAXBElement<SHISubscriberHealthCareDiagnosisCode> jaxshis = new JAXBElement(QName.valueOf("S-HI-Subscriber_Health_Care_Diagnosis_Code"), SHISubscriberHealthCareDiagnosisCode.class, null, shis);
			l2100c.setSHISubscriberHealthCareDiagnosisCode(jaxshis);
		}
		//DTP*102*D8*Date Time Period~
		if ("DTP".equalsIgnoreCase(segName)) {
			System.out.println("DTP array lenght :"+arr.length);
			List<L2110C> listL2110c = l2100c.getL2110C();
			L2110C l2110c = listL2110c.get(0);
			if(null == l2110c) {
				l2110c = new L2110C();
				listL2110c.add(l2110c);
			}			
			SDTPSubscriberEligibilityBenefitDate sdtp = new SDTPSubscriberEligibilityBenefitDate();
			sdtp.setEDTP01DateTimeQualifier(null);
			sdtp.setEDTP02DateTimePeriodFormatQualifier(null);
			sdtp.setEDTP03DateTimePeriod(null);			
			JAXBElement<SDTPSubscriberEligibilityBenefitDate> jaxsdtp = new JAXBElement(QName.valueOf("S-DTP-Subscriber_Eligibility_Benefit_Date"), SDTPSubscriberEligibilityBenefitDate.class, null, sdtp);
			l2110c.setSDTPSubscriberEligibilityBenefitDate(jaxsdtp);
		}
		
		//EQ*30*AD\0001\9505P\9505P\9505P\9505P*FAM**15\2\18\1~
		if ("EQ".equalsIgnoreCase(segName)) {
			System.out.println("EQ array lenght :"+arr.length);
			List<L2110C> listL2110c = l2100c.getL2110C();
			L2110C l2110c = null;
			if (listL2110c.size() == 0) {
				l2110c = new L2110C();				
			} else {
				l2110c = listL2110c.get(0);
			}			
						
			SEQSubscriberEligibilityOrBenefitInquiry seq = new SEQSubscriberEligibilityOrBenefitInquiry();
			List<EEQ01ServiceTypeCode> listEeq01 = seq.getEEQ01ServiceTypeCode();
			
			EEQ01ServiceTypeCode eeq01 = new EEQ01ServiceTypeCode();
			eeq01.setValue(arr[0]);
			listEeq01.add(eeq01);
			
			
			
			EEQ03CoverageLevelCode eq03 = new EEQ03CoverageLevelCode();
			eq03.setValue(null);
			JAXBElement<EEQ03CoverageLevelCode> jaxeq03 = new JAXBElement(QName.valueOf("E-EQ03-Coverage_Level_Code"), EEQ03CoverageLevelCode.class, null, eq03);
			seq.setEEQ03CoverageLevelCode(jaxeq03);
			
			EEQ04InsuranceTypeCode eq04 = new EEQ04InsuranceTypeCode();
			eq04.setType(null);
			JAXBElement<EEQ04InsuranceTypeCode> jaxeq04 = new JAXBElement(QName.valueOf("E-EQ04-Insurance_Type_Code"), EEQ04InsuranceTypeCode.class, null, eq04);
			seq.setEEQ04InsuranceTypeCode(jaxeq04);	
			
			l2110c.setSEQSubscriberEligibilityOrBenefitInquiry(seq);			
			
			//l2110c.setSREFSubscriberAdditionalInformation(value);			
			
			listL2110c.add(l2110c);
		}
		//AMT*R*164~
		if ("AMT".equalsIgnoreCase(segName)) {
			System.out.println("AMT array lenght :"+arr.length);
						
		}
		//III*ZZ*01~
		if ("III".equalsIgnoreCase(segName)) {
			System.out.println("III array lenght :"+arr.length);
			List<L2110C> listL2110c = l2100c.getL2110C();
			L2110C l2110c = listL2110c.get(0);
			if(null == l2110c) {
				l2110c = new L2110C();
				listL2110c.add(l2110c);
			}	
			SIIISubscriberEligibilityOrBenefitAdditionalInquiryInformation siii = new SIIISubscriberEligibilityOrBenefitAdditionalInquiryInformation();
			EIII01CodeListQualifierCode e01 = new EIII01CodeListQualifierCode();
			e01.setValue(arr[0]);
			siii.setEIII01CodeListQualifierCode(e01);
			
			EIII02IndustryCode e02 = new EIII02IndustryCode();
			e02.setValue(arr[1]);
			siii.setEIII02IndustryCode(e02);
			
			//siii.setEIII03CodeCategory(value);
			//siii.setEIII04FreeFormMessageText(value);
			//siii.setEIII05Quantity(value);
			//siii.setEIII07SurfaceLayerPositionCode(value);
			//siii.setEIII08SurfaceLayerPositionCode(value);
			//siii.setEIII09SurfaceLayerPositionCode(value);
			JAXBElement<SIIISubscriberEligibilityOrBenefitAdditionalInquiryInformation> jaxsiii = new JAXBElement(QName.valueOf("S-DTP-Subscriber_Eligibility_Benefit_Date"), SIIISubscriberEligibilityOrBenefitAdditionalInquiryInformation.class, null, siii);
			
			l2110c.setSIIISubscriberEligibilityOrBenefitAdditionalInquiryInformation(jaxsiii);
		}
		
		l2000c.setL2100C(l2100c);
		
	}
	*/
}
