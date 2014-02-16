package org.delta.b2b.edi.handler.loop;


public class L2000DHandler {

	
	/*
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		String segName = row.getSegName();
		
		L2100D l2100d = null;		
		ObjectFactory objFac = new ObjectFactory();
		l2100d = l2000d.getL2100D();
		if (null == l2100d) {
			l2100d = objFac.createL2100D();
			l2000d.setL2100D(l2100d);
		}
		
		//NM1
		if ("NM1".equalsIgnoreCase(segName)) {
			SNM1DependentName snm1 = new SNM1DependentName();
			NM1DependetHandler nm1rh = new NM1DependetHandler(snm1, row);		
			l2100d.setSNM1DependentName(snm1);		
		}
		
		//REF
		if ("REF".equalsIgnoreCase(segName)) {
			System.out.println("REF array lenght :"+arr.length);			
			
			List<SREFDependentAdditionalIdentification> listRef = l2100d.getSREFDependentAdditionalIdentification();
			
			SREFDependentAdditionalIdentification ref1 = objFac.createSREFDependentAdditionalIdentification();
			EREF01ReferenceIdentificationQualifier4 eref01 = new EREF01ReferenceIdentificationQualifier4();
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
			
			SN3DependentAddress n3 = objFac.createSN3DependentAddress();
			
			EN301AddressInformation n301 = objFac.createEN301AddressInformation();
			n301.setValue(arr[0]);
			n3.setEN301AddressInformation(n301);

			EN302AddressInformation n302 = objFac.createEN302AddressInformation();
			n302.setValue(arr[1]);			
			JAXBElement<EN302AddressInformation> jaxn302 = new JAXBElement(QName.valueOf("E-N302-Address_Information"), EN302AddressInformation.class, null, n302);			
			n3.setEN302AddressInformation(jaxn302);
			
			JAXBElement<SN3DependentAddress> jaxn3 = new JAXBElement(QName.valueOf("S-N3-Dependent_Address"), SN3DependentAddress.class, null, n3);						
			
			l2100d.setSN3DependentAddress(jaxn3);			
		}
		
		//N4
		if ("N4".equalsIgnoreCase(segName)) {
			System.out.println("N4 array lenght :"+arr.length);			
			
			SN4DependentCityStateZIPCode n4 = objFac.createSN4DependentCityStateZIPCode();
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
			
			JAXBElement<SN4DependentCityStateZIPCode> jaxn4 = new JAXBElement(QName.valueOf("S-N4-Dependent_City__State__ZIP_Code"), SN4DependentCityStateZIPCode.class, null, n4);
			
			l2100d.setSN4DependentCityStateZIPCode(jaxn4);
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
			l2100d.setSPRVProviderInformation(jaxsprv);
		}
		
		//DMG*D8*Date Time Period*F~
		if ("DMG".equalsIgnoreCase(segName)) {
			System.out.println("DMG array lenght :"+arr.length);
			SDMGDependentDemographicInformation sdmg = objFac.createSDMGDependentDemographicInformation();
			
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
			JAXBElement<SDMGDependentDemographicInformation> jaxsdmg = new JAXBElement(QName.valueOf("S-DMG-Dependent_Demographic_Information"), SDMGDependentDemographicInformation.class, null, sdmg);
			
			l2100d.setSDMGDependentDemographicInformation(jaxsdmg);
		}
		//INS*Y*18***************47601~
		if ("INS".equalsIgnoreCase(segName)) {
			System.out.println("INS array lenght :"+arr.length);
			SINSDependentRelationship ins = new SINSDependentRelationship();
			
			EINS01YesNoConditionOrResponseCode ins01 = new EINS01YesNoConditionOrResponseCode();
			ins01.setValue(arr[0]);
			ins.setEINS01YesNoConditionOrResponseCode(null);

			EINS02IndividualRelationshipCode ins02 = new EINS02IndividualRelationshipCode();
			ins02.setValue(arr[0]);
			ins.setEINS02IndividualRelationshipCode(null);
			ins.setEINS03MaintenanceTypeCode(null);
			ins.setEINS04MaintenanceReasonCode(null);
			ins.setEINS05BenefitStatusCode(null);
			ins.setEINS07ConsolidatedOmnibusBudgetReconciliationActCOBRAQualifyingEventCode(null);
			
			JAXBElement<SINSDependentRelationship> jaxins = new JAXBElement(QName.valueOf("S-INS-Dependent_Relationship"), SINSDependentRelationship.class, null, ins);			
			l2100d.setSINSDependentRelationship(jaxins);
		}
		//HI*BK\0010*BF\0010*BF\0010*BF\0010*BF\0010*BF\0010*BF\0010*BF\0010~
		if ("HI".equalsIgnoreCase(segName)) {
			System.out.println("HI array lenght :"+arr.length);
			
			SHIDependentHealthCareDiagnosisCode shis = new SHIDependentHealthCareDiagnosisCode();
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
			
			JAXBElement<SHIDependentHealthCareDiagnosisCode> jaxshis = new JAXBElement(QName.valueOf("S-HI-Dependent_Health_Care_Diagnosis_Code"), SHIDependentHealthCareDiagnosisCode.class, null, shis);
			l2100d.setSHIDependentHealthCareDiagnosisCode(jaxshis);
		}
		//DTP*102*D8*Date Time Period~
		if ("DTP".equalsIgnoreCase(segName)) {
			System.out.println("DTP array lenght :"+arr.length);
			List<L2110D> listL2110d = l2100d.getL2110D();
			L2110D l2110d = listL2110d.get(0);
			if(null == l2110d) {
				l2110d = new L2110D();
				listL2110d.add(l2110d);
			}			
			SDTPDependentEligibilityBenefitDate sdtp = new SDTPDependentEligibilityBenefitDate();
			sdtp.setEDTP01DateTimeQualifier(null);
			sdtp.setEDTP02DateTimePeriodFormatQualifier(null);
			sdtp.setEDTP03DateTimePeriod(null);			
			JAXBElement<SDTPDependentEligibilityBenefitDate> jaxsdtp = new JAXBElement(QName.valueOf("S-DTP-Dependent_Eligibility_Benefit_Date"), SDTPDependentEligibilityBenefitDate.class, null, sdtp);
			l2110d.setSDTPDependentEligibilityBenefitDate(jaxsdtp);
		}
		//EQ*30*AD\0001\9505P\9505P\9505P\9505P*FAM**15\2\18\1~
		if ("EQ".equalsIgnoreCase(segName)) {
			System.out.println("EQ array lenght :"+arr.length);
			List<L2110D> listL2110d = l2100d.getL2110D();
			L2110D l2110d = null;
			if (listL2110d.size() == 0) {
				l2110d = new L2110D();				
			} else {
				l2110d = listL2110d.get(0);
			}			
						
			SEQDependentEligibilityOrBenefitInquiry seq = new SEQDependentEligibilityOrBenefitInquiry();
			List<EEQ01ServiceTypeCode> listEeq01 = seq.getEEQ01ServiceTypeCode();
			
			EEQ01ServiceTypeCode eeq01 = new EEQ01ServiceTypeCode();
			eeq01.setValue(arr[0]);
			listEeq01.add(eeq01);
			
						
			EEQ03CoverageLevelCode1 eq03 = new EEQ03CoverageLevelCode1();
			eq03.setType(null);
			JAXBElement<EEQ03CoverageLevelCode1> jaxeq03 = new JAXBElement(QName.valueOf("E-EQ03-Coverage_Level_Code_1"), EEQ03CoverageLevelCode1.class, null, eq03);
			seq.setEEQ03CoverageLevelCode(jaxeq03);
			
			EEQ04InsuranceTypeCode eq04 = new EEQ04InsuranceTypeCode();
			eq04.setType(null);
			JAXBElement<EEQ04InsuranceTypeCode> jaxeq04 = new JAXBElement(QName.valueOf("E-EQ04-Insurance_Type_Code"), EEQ04InsuranceTypeCode.class, null, eq04);
			seq.setEEQ04InsuranceTypeCode(jaxeq04);	
			
			l2110d.setSEQDependentEligibilityOrBenefitInquiry(seq);			
			
			//l2110d.setSREFDependentAdditionalInformation(value);			
			
			listL2110d.add(l2110d);
		}
		//AMT*R*164~
		if ("AMT".equalsIgnoreCase(segName)) {
			System.out.println("PRV array lenght :"+arr.length);
		}
		//III*ZZ*01~
		if ("III".equalsIgnoreCase(segName)) {
			System.out.println("PRV array lenght :"+arr.length);
		}
		
		l2000d.setL2100D(l2100d);
		
	}
	*/
}


