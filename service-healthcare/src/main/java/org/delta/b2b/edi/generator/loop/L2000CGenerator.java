package org.delta.b2b.edi.generator.loop;

import java.util.List;

import org.delta.b2b.edi.t270.*;

public class L2000CGenerator {

	private StringBuilder strL2000C = new StringBuilder();
	private static String eleSeperator = "*";
	private static String segSeperator = "~";
	
	public String generateL2000C(L2000C l2000c) {
				
		SHLSubscriberLevel shl = l2000c.getSHLSubscriberLevel();
		strL2000C.append(this.generateSHLSubscriberLevel(shl));
		
		List<STRNSubscriberTraceNumber> trns = l2000c.getSTRNSubscriberTraceNumber();		
		strL2000C.append(this.generateSTRNSubscriberTraceNumber(trns));
		
		L2100C l2100c = l2000c.getL2100C();
		strL2000C.append(this.generateL2100C(l2100c));
		
		return strL2000C.toString();
	}	
	
	public String generateL2100C(L2100C l2100c) {
		StringBuilder strBul = new StringBuilder();
		
		SNM1SubscriberName nm1 = l2100c.getSNM1SubscriberName();
		strBul.append(this.generateSNM1SubscriberName(nm1));
		
		List<SREFSubscriberAdditionalIdentification> refs = l2100c.getSREFSubscriberAdditionalIdentification();
		strBul.append(this.generateSREFSubscriberAdditionalIdentification(refs));
		
		if(null != l2100c.getSDMGSubscriberDemographicInformation()) {
			SDMGSubscriberDemographicInformation dmg = l2100c.getSDMGSubscriberDemographicInformation().getValue();
			strBul.append(this.generateSDMGSubscriberDemographicInformation(dmg));
		}
		
		List<L2110C> L2110c = l2100c.getL2110C();
		strBul.append(this.generateL2110C(L2110c));
		
		l2100c.getSDTPSubscriberDate();
		l2100c.getSHISubscriberHealthCareDiagnosisCode();		
		l2100c.getSINSMultipleBirthSequenceNumber();
		l2100c.getSN3SubscriberAddress();
		l2100c.getSN4SubscriberCityStateZIPCode();		
		l2100c.getSPRVProviderInformation();	
		
		return strBul.toString();
	}
	//REF*6P*05461-00002~
	public String generateSREFSubscriberAdditionalIdentification(List<SREFSubscriberAdditionalIdentification> refs ) {
		StringBuilder strBul = new StringBuilder();	
		for (SREFSubscriberAdditionalIdentification ref : refs) {
			strBul.append("REF");
			strBul.append(eleSeperator);
			strBul.append(ref.getEREF01ReferenceIdentificationQualifier().getValue());
			strBul.append(eleSeperator);
			strBul.append(ref.getEREF02ReferenceIdentification().getValue());
			strBul.append(eleSeperator);
			if(null != ref.getEREF03Description())
				strBul.append(ref.getEREF03Description().getValue());
			strBul.append(segSeperator);
		}
		return strBul.toString();
	}
	//NM1*IL*1*Pirnie*Abby****MI*138409709~
	public String generateSNM1SubscriberName(SNM1SubscriberName nm1) {
		StringBuilder strBul = new StringBuilder();	
		if(null != nm1) {
			strBul.append("NM1");
			strBul.append(eleSeperator);
			if(null != nm1.getENM101EntityIdentifierCode()) 
				strBul.append(nm1.getENM101EntityIdentifierCode().getValue());
			strBul.append(eleSeperator);				
			if(null != nm1.getENM102EntityTypeQualifier())
				strBul.append(nm1.getENM102EntityTypeQualifier().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM103NameLastOrOrganizationName())
				strBul.append(nm1.getENM103NameLastOrOrganizationName().getValue().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM104NameFirst())
				strBul.append(nm1.getENM104NameFirst().getValue().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM105NameMiddle())
				strBul.append(nm1.getENM105NameMiddle().getValue().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM106NamePrefix())
				strBul.append(nm1.getENM106NamePrefix().getValue().getType());
			strBul.append(eleSeperator);
			if(null != nm1.getENM107NameSuffix())
				strBul.append(nm1.getENM107NameSuffix().getValue().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM108IdentificationCodeQualifier())
				strBul.append(nm1.getENM108IdentificationCodeQualifier().getValue().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM109IdentificationCode())
				strBul.append(nm1.getENM109IdentificationCode().getValue().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM110EntityRelationshipCode())
				strBul.append(nm1.getENM110EntityRelationshipCode().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM111EntityIdentifierCode())
				strBul.append(nm1.getENM111EntityIdentifierCode().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM112NameLastOrOrganizationName())
				strBul.append(nm1.getENM112NameLastOrOrganizationName().getValue());
			strBul.append(segSeperator);
		}
		return strBul.toString();
	}
	
	//DMG*D8*19871228~
	public String generateSDMGSubscriberDemographicInformation(SDMGSubscriberDemographicInformation dmg) {
		StringBuilder strBul = new StringBuilder();	
		
		strBul.append("DMG");
		strBul.append(eleSeperator);	
		strBul.append(dmg.getEDMG01DateTimePeriodFormatQualifier().getValue().getValue());
		strBul.append(eleSeperator);	
		strBul.append(dmg.getEDMG02DateTimePeriod().getValue().getValue());
		
		dmg.getEDMG03GenderCode();
		dmg.getEDMG04MaritalStatusCode();
		dmg.getEDMG06CitizenshipStatusCode();
		dmg.getEDMG07CountryCode();
		dmg.getEDMG08BasisOfVerificationCode();
		dmg.getEDMG09Quantity();
		dmg.getEDMG10CodeListQualifierCode();
		dmg.getEDMG11IndustryCode();
		strBul.append(segSeperator);
		
		return strBul.toString();
	}
	
	public String generateL2110C(List<L2110C> L2110cList) {
		StringBuilder strBul = new StringBuilder();	
		for (L2110C L2110c : L2110cList) {
			SEQSubscriberEligibilityOrBenefitInquiry eq =L2110c.getSEQSubscriberEligibilityOrBenefitInquiry();
			strBul.append(this.generateSEQSubscriberEligibilityOrBenefitInquiry(eq));
		}
		
		return strBul.toString();
	}
	
	//EQ*30~
	public String generateSEQSubscriberEligibilityOrBenefitInquiry(SEQSubscriberEligibilityOrBenefitInquiry eq) {
		StringBuilder strBul = new StringBuilder();
		strBul.append("EQ");
		strBul.append(eleSeperator);	
		
		List<EEQ01ServiceTypeCode> codes = eq.getEEQ01ServiceTypeCode();
		for(EEQ01ServiceTypeCode code : codes) {
			strBul.append(code.getValue());
			strBul.append(eleSeperator);
		}
		
		strBul.append(segSeperator);
		return strBul.toString();
	}
	//HL*3*2*22*1~
	public String generateSHLSubscriberLevel(SHLSubscriberLevel shl) {
		StringBuilder strBul = new StringBuilder();	
		if(null != shl) {
			strBul.append("HL");
			strBul.append(eleSeperator);				
			strBul.append(shl.getEHL01HierarchicalIDNumber().getValue());
			strBul.append(eleSeperator);
			strBul.append(shl.getEHL02HierarchicalParentIDNumber().getValue());
			strBul.append(eleSeperator);
			strBul.append(shl.getEHL03HierarchicalLevelCode().getValue());
			strBul.append(eleSeperator);
			strBul.append(shl.getEHL04HierarchicalChildCode().getValue());
			strBul.append(segSeperator);
		}
		return strBul.toString();
		
	}
	public String generateSTRNSubscriberTraceNumber(List<STRNSubscriberTraceNumber> trns) {
		StringBuilder strBul = new StringBuilder();
		for(STRNSubscriberTraceNumber trn : trns) {
			strBul.append("STRN");
			strBul.append(eleSeperator);
			strBul.append(trn.getETRN01TraceTypeCode().getValue());
			strBul.append(eleSeperator);
			strBul.append(trn.getETRN02ReferenceIdentification().getValue());
			strBul.append(eleSeperator);
			strBul.append(trn.getETRN03OriginatingCompanyIdentifier().getValue());
			strBul.append(eleSeperator);
			strBul.append(trn.getETRN04ReferenceIdentification().getValue());
			strBul.append(segSeperator);
		}
		return strBul.toString();

	}	

}
