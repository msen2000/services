package org.delta.b2b.edi.generator.loop;

import java.util.List;

import org.delta.b2b.edi.t270.EEQ01ServiceTypeCode;
import org.delta.b2b.edi.t270.L2000D;
import org.delta.b2b.edi.t270.L2100D;
import org.delta.b2b.edi.t270.L2110D;
import org.delta.b2b.edi.t270.SDMGDependentDemographicInformation;
import org.delta.b2b.edi.t270.SEQDependentEligibilityOrBenefitInquiry;
import org.delta.b2b.edi.t270.SHLDependentLevel;
import org.delta.b2b.edi.t270.SNM1DependentName;
import org.delta.b2b.edi.t270.SREFDependentAdditionalIdentification;
import org.delta.b2b.edi.t270.STRNDependentTraceNumber;

public class L2000DGenerator {

	private StringBuilder strL2000D = new StringBuilder();
	private static String eleSeperator = "*";
	private static String segSeperator = "~";
	
	public String generateL2000D(L2000D l2000d) {
		
		
		SHLDependentLevel shl = l2000d.getSHLDependentLevel();
		strL2000D.append(this.generateSHLDependentLevel(shl));
		
		List<STRNDependentTraceNumber> trns = l2000d.getSTRNDependentTraceNumber();
		strL2000D.append(this.generateSTRNDependentTraceNumber(trns));
		
		L2100D l2100d = l2000d.getL2100D();
		strL2000D.append(this.generateL2100D(l2100d));
		
		return strL2000D.toString();
	}	
		
	//HL*4*3*23*0~
	public String generateSHLDependentLevel(SHLDependentLevel shl) {
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
	public String generateSTRNDependentTraceNumber(List<STRNDependentTraceNumber> trns) {
		StringBuilder strBul = new StringBuilder();
		for(STRNDependentTraceNumber trn : trns) {
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
	
	public String generateL2100D(L2100D l2100D) {
		StringBuilder strBul = new StringBuilder();
		
		SNM1DependentName nm1 = l2100D.getSNM1DependentName();
		strBul.append(this.generateSNM1DependentName(nm1));
		
		if(null != l2100D.getSDMGDependentDemographicInformation()) {
			SDMGDependentDemographicInformation dmg = l2100D.getSDMGDependentDemographicInformation().getValue();
			strBul.append(this.generateSDMGDependentDemographicInformation(dmg));
		}
		
		List<SREFDependentAdditionalIdentification> refs = l2100D.getSREFDependentAdditionalIdentification();
		strBul.append(this.generateSREFDependentAdditionalIdentification(refs));
		
		List<L2110D> L2110D = l2100D.getL2110D();
		strBul.append(this.generateL2110D(L2110D));
		
		l2100D.getSDTPDependentDate();
		l2100D.getSHIDependentHealthCareDiagnosisCode();		
		l2100D.getSINSDependentRelationship();
		l2100D.getSN3DependentAddress();
		l2100D.getSN4DependentCityStateZIPCode();		
		l2100D.getSPRVProviderInformation();	
		
		return strBul.toString();
	}
	//REF*6P*05461-00002~
	public String generateSREFDependentAdditionalIdentification(List<SREFDependentAdditionalIdentification> refs ) {
		StringBuilder strBul = new StringBuilder();	
		for (SREFDependentAdditionalIdentification ref : refs) {
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
	public String generateSNM1DependentName(SNM1DependentName nm1) {
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
				strBul.append(nm1.getENM108IdentificationCodeQualifier().getValue().getType());
			strBul.append(eleSeperator);
			if(null != nm1.getENM109IdentificationCode())
				strBul.append(nm1.getENM109IdentificationCode().getValue().getType());
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
	public String generateSDMGDependentDemographicInformation(SDMGDependentDemographicInformation dmg) {
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
	
	public String generateL2110D(List<L2110D> L2110DList) {
		StringBuilder strBul = new StringBuilder();	
		for (L2110D L2110D : L2110DList) {
			SEQDependentEligibilityOrBenefitInquiry eq =L2110D.getSEQDependentEligibilityOrBenefitInquiry();
			strBul.append(this.generateSEQDependentEligibilityOrBenefitInquiry(eq));
		}		
		return strBul.toString();
	}
	
	//EQ*30~
	public String generateSEQDependentEligibilityOrBenefitInquiry(SEQDependentEligibilityOrBenefitInquiry eq) {
		StringBuilder strBul = new StringBuilder();
		strBul.append("EQ");
		strBul.append(eleSeperator);	
		
		List<EEQ01ServiceTypeCode> codes = eq.getEEQ01ServiceTypeCode();
		for(EEQ01ServiceTypeCode code : codes) {
			strBul.append(code.getValue());
		}
		return strBul.toString();
	}
	
}
