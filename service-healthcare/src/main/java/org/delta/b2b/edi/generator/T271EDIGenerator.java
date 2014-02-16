package org.delta.b2b.edi.generator;

import java.util.List;

import org.delta.b2b.edi.t270.L2000A;
import org.delta.b2b.edi.t270.L2000B;
import org.delta.b2b.edi.t270.L2000C;
import org.delta.b2b.edi.t270.L2000D;
import org.delta.b2b.edi.t270.L2100A;
import org.delta.b2b.edi.t270.L2100B;
import org.delta.b2b.edi.t270.L2100C;
import org.delta.b2b.edi.t270.L2100D;
import org.delta.b2b.edi.t270.SBHTBeginningOfHierarchicalTransaction;
import org.delta.b2b.edi.t270.SDTPDependentDate;
import org.delta.b2b.edi.t270.SDTPSubscriberDate;
import org.delta.b2b.edi.t270.SGEFunctionalGroupTrailer;
import org.delta.b2b.edi.t270.SGSFunctionalGroupHeader;
import org.delta.b2b.edi.t270.SHLDependentLevel;
import org.delta.b2b.edi.t270.SHLInformationReceiverLevel;
import org.delta.b2b.edi.t270.SHLInformationSourceLevel;
import org.delta.b2b.edi.t270.SHLSubscriberLevel;
import org.delta.b2b.edi.t270.SIEAInterchangeControlTrailer;
import org.delta.b2b.edi.t270.SISAInterchangeControlHeader;
import org.delta.b2b.edi.t270.SNM1DependentName;
import org.delta.b2b.edi.t270.SNM1InformationReceiverName;
import org.delta.b2b.edi.t270.SNM1InformationSourceName;
import org.delta.b2b.edi.t270.SNM1SubscriberName;
import org.delta.b2b.edi.t270.SREFDependentAdditionalIdentification;
import org.delta.b2b.edi.t270.SREFInformationReceiverAdditionalIdentification;
import org.delta.b2b.edi.t270.SREFSubscriberAdditionalIdentification;
import org.delta.b2b.edi.t270.SSETransactionSetTrailer;
import org.delta.b2b.edi.t270.SSTTransactionSetHeader;
import org.delta.b2b.edi.t270.STRNDependentTraceNumber;
import org.delta.b2b.edi.t270.STRNSubscriberTraceNumber;
import org.delta.b2b.edi.t270.T270;

public class T271EDIGenerator implements EDIGenerator { 

	private T270 t270;
	private StringBuilder str270 = new StringBuilder();
	private static String eleSeperator = "*";
	private static String segSeperator = "~";
	
	public T271EDIGenerator() {
		
	}
	public T271EDIGenerator(T270 t270){
		this.t270 = t270;
	}
		
	@Override
	public String generateEDI() {
		str270.append(generateSISA());
		str270.append(segSeperator);
		str270.append(generateSGS());
		str270.append(segSeperator);
		str270.append(generateSST());
		str270.append(segSeperator);
		str270.append(generateSBHT());
		str270.append(segSeperator);
		str270.append(generateSHL());
		str270.append(segSeperator);
		str270.append(generateSSE());
		str270.append(segSeperator);
		str270.append(generateSIEA());
		
		return str270.toString();
	}
	
	//HL*1**20*1~
	public String generateSHL(){
		
		List<Object> list = t270.getL2000AOrL2000BOrL2000C();		
		if(null == list) 
			return "";
		
		StringBuilder strBul = new StringBuilder();		
				
		for(Object obj : list) {
			if(obj instanceof L2000A) {
				System.out.println("L2000A loop");
				L2000A l2000a = (L2000A)obj;
				SHLInformationSourceLevel shl = l2000a.getSHLInformationSourceLevel();
				if(null != shl) {
					strBul.append("HL");
					strBul.append(eleSeperator);
					strBul.append(shl.getEHL01HierarchicalIDNumber().getValue());
					strBul.append(eleSeperator);
					if(null != shl.getEHL02HierarchicalParentIDNumber())
						strBul.append(shl.getEHL02HierarchicalParentIDNumber().getValue());
					strBul.append(eleSeperator);
					strBul.append(shl.getEHL03HierarchicalLevelCode().getValue());
					strBul.append(eleSeperator);
					strBul.append(shl.getEHL04HierarchicalChildCode().getValue());
					strBul.append(segSeperator);
				}				
				
				L2100A l2100A = l2000a.getL2100A();
				SNM1InformationSourceName snm1 = l2100A.getSNM1InformationSourceName();
				if(null != snm1) {
					strBul.append("NM1");
					strBul.append(eleSeperator);
					strBul.append(snm1.getENM101EntityIdentifierCode().getValue());
					strBul.append(eleSeperator);
					strBul.append(snm1.getENM102EntityTypeQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(snm1.getENM103NameLastOrOrganizationName().getValue());
					strBul.append(eleSeperator);
					if(null != snm1.getENM104NameFirst())
						strBul.append(snm1.getENM104NameFirst().getValue());
					strBul.append(eleSeperator);
					if(null != snm1.getENM105NameMiddle())
						strBul.append(snm1.getENM105NameMiddle().getValue());
					strBul.append(eleSeperator);
					if(null != snm1.getENM106NamePrefix())
						strBul.append(snm1.getENM106NamePrefix().getValue());
					strBul.append(eleSeperator);
					if(null != snm1.getENM107NameSuffix())
						strBul.append(snm1.getENM107NameSuffix().getValue());
					strBul.append(eleSeperator);
					strBul.append(snm1.getENM108IdentificationCodeQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(snm1.getENM109IdentificationCode().getValue());
					strBul.append(eleSeperator);
					if(null != snm1.getENM110EntityRelationshipCode())
						strBul.append(snm1.getENM110EntityRelationshipCode().getValue());
					strBul.append(eleSeperator);
					if(null != snm1.getENM111EntityIdentifierCode())
						strBul.append(snm1.getENM111EntityIdentifierCode().getValue());
					strBul.append(eleSeperator);
					if(null != snm1.getENM112NameLastOrOrganizationName())
						strBul.append(snm1.getENM112NameLastOrOrganizationName().getValue());
				}				
			}
			
			if(obj instanceof L2000B) {
				System.out.println("L2000B loop");
				L2000B l2000b = (L2000B)obj;
				SHLInformationReceiverLevel shl = l2000b.getSHLInformationReceiverLevel();
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
				L2100B l2100B = l2000b.getL2100B();
				//strBul.append(l2100B.getSN3InformationReceiverAddress().getValue());
				//strBul.append(l2100B.getSN4InformationReceiverCityStateZIPCode().getValue());				
				//strBul.append(l2100B.getSPRVInformationReceiverProviderInformation().getValue());
				//strBul.append(l2100B.getSPRVInformationReceiverProviderInformation().getValue());				
				
				SNM1InformationReceiverName nm1 = l2100B.getSNM1InformationReceiverName();
				if(null != nm1) {
					strBul.append("NM1");
					strBul.append(eleSeperator);
					if(null != nm1.getENM101EntityIdentifierCode()) 
						strBul.append(nm1.getENM101EntityIdentifierCode().getValue());
					strBul.append(eleSeperator);				
					strBul.append(nm1.getENM102EntityTypeQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(nm1.getENM103NameLastOrOrganizationName().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM104NameFirst())
						strBul.append(nm1.getENM104NameFirst().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM105NameMiddle())
						strBul.append(nm1.getENM105NameMiddle().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM106NamePrefix())
						strBul.append(nm1.getENM106NamePrefix().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM107NameSuffix())
						strBul.append(nm1.getENM107NameSuffix().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM108IdentificationCodeQualifier())
						strBul.append(nm1.getENM108IdentificationCodeQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(nm1.getENM109IdentificationCode().getValue());
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
				List<SREFInformationReceiverAdditionalIdentification> refs = l2100B.getSREFInformationReceiverAdditionalIdentification();
				for(SREFInformationReceiverAdditionalIdentification ref : refs) {
					strBul.append("NM1");
					strBul.append(eleSeperator);
					strBul.append(ref.getEREF01ReferenceIdentificationQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(ref.getEREF02ReferenceIdentification().getValue());
					strBul.append(eleSeperator);
					if(null != ref.getEREF03Description())
						strBul.append(ref.getEREF03Description().getValue());
					strBul.append(segSeperator);
				}		
			}
			
			if(obj instanceof L2000C) {
				System.out.println("L2000C loop");
				L2000C l2000c = (L2000C)obj;
				
				SHLSubscriberLevel shl = l2000c.getSHLSubscriberLevel();
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
												
				
				
				L2100C l2100C = l2000c.getL2100C();
				//strBul.append(l2100C.getSDMGSubscriberDemographicInformation().getValue());				
				//strBul.append(l2100C.getSHISubscriberHealthCareDiagnosisCode().getValue());
				//strBul.append(l2100C.getSINSMultipleBirthSequenceNumber().getValue());
				//strBul.append(l2100C.getSN3SubscriberAddress().getValue());
				//strBul.append(l2100C.getSN4SubscriberCityStateZIPCode().getValue());				
				//strBul.append(l2100C.getSPRVProviderInformation().getValue());
				
				SNM1SubscriberName nm1 = l2100C.getSNM1SubscriberName();
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
						strBul.append(nm1.getENM103NameLastOrOrganizationName().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM104NameFirst())
						strBul.append(nm1.getENM104NameFirst().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM105NameMiddle())
						strBul.append(nm1.getENM105NameMiddle().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM106NamePrefix())
						strBul.append(nm1.getENM106NamePrefix().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM107NameSuffix())
						strBul.append(nm1.getENM107NameSuffix().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM108IdentificationCodeQualifier())
						strBul.append(nm1.getENM108IdentificationCodeQualifier().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM109IdentificationCode())
						strBul.append(nm1.getENM109IdentificationCode().getValue());
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
				List<SREFSubscriberAdditionalIdentification> refs = l2100C.getSREFSubscriberAdditionalIdentification();
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
				List<STRNSubscriberTraceNumber> trns = l2000c.getSTRNSubscriberTraceNumber();
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
				List<SDTPSubscriberDate> dtps = l2100C.getSDTPSubscriberDate();
				for(SDTPSubscriberDate dtp : dtps) {
					strBul.append("DTP");
					strBul.append(eleSeperator);
					strBul.append(dtp.getEDTP01DateTimeQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(dtp.getEDTP02DateTimePeriodFormatQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(dtp.getEDTP03DateTimePeriod().getValue());
					strBul.append(segSeperator);
				}				
			}
				
			if(obj instanceof L2000D) {
				System.out.println("L2000D loop");				
				L2000D l2000d = (L2000D)obj;				
								
				SHLDependentLevel hld = l2000d.getSHLDependentLevel();
				if (null != hld) {
					strBul.append("HL");
					strBul.append(eleSeperator);
					strBul.append(hld.getEHL01HierarchicalIDNumber().getValue());
					strBul.append(eleSeperator);
					strBul.append(hld.getEHL02HierarchicalParentIDNumber().getValue());
					strBul.append(eleSeperator);
					strBul.append(hld.getEHL03HierarchicalLevelCode().getValue());
					strBul.append(eleSeperator);
					strBul.append(hld.getEHL04HierarchicalChildCode().getValue());
					strBul.append(segSeperator);
				}
				
				List<STRNDependentTraceNumber> trns = l2000d.getSTRNDependentTraceNumber();
				for(STRNDependentTraceNumber trn : trns) {
					strBul.append("TRN");
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
				
				L2100D l2100D = l2000d.getL2100D();
				//strBul.append(l2100D.getSDMGDependentDemographicInformation().getValue());
				//strBul.append(l2100D.getSHIDependentHealthCareDiagnosisCode().getValue());
				//strBul.append(l2100D.getSINSDependentRelationship().getValue());
				//strBul.append(l2100D.getSN3DependentAddress().getValue());
				//strBul.append(l2100D.getSN4DependentCityStateZIPCode().getValue());
				//strBul.append(l2100D.getSPRVProviderInformation().getValue());
								
				SNM1DependentName nm1 = l2100D.getSNM1DependentName();
				if (null != nm1) {
					strBul.append("NM1");
					strBul.append(eleSeperator);
					if(null != nm1.getENM101EntityIdentifierCode()) 
						strBul.append(nm1.getENM101EntityIdentifierCode().getValue());
					strBul.append(eleSeperator);				
					strBul.append(nm1.getENM102EntityTypeQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(nm1.getENM103NameLastOrOrganizationName().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM104NameFirst())
						strBul.append(nm1.getENM104NameFirst().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM105NameMiddle())
						strBul.append(nm1.getENM105NameMiddle().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM106NamePrefix())
						strBul.append(nm1.getENM106NamePrefix().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM107NameSuffix())
						strBul.append(nm1.getENM107NameSuffix().getValue());
					strBul.append(eleSeperator);
					if(null != nm1.getENM108IdentificationCodeQualifier())
						strBul.append(nm1.getENM108IdentificationCodeQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(nm1.getENM109IdentificationCode().getValue());
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
				List<SREFDependentAdditionalIdentification> refs = l2100D.getSREFDependentAdditionalIdentification();
				for (SREFDependentAdditionalIdentification ref : refs) {
					strBul.append("REF");
					strBul.append(eleSeperator);
					strBul.append(ref.getEREF01ReferenceIdentificationQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(ref.getEREF02ReferenceIdentification().getValue());
					strBul.append(eleSeperator);
					strBul.append(ref.getEREF03Description().getValue());
					strBul.append(segSeperator);					
				}
				
				List<SDTPDependentDate> dtps = l2100D.getSDTPDependentDate();
				for(SDTPDependentDate dtp : dtps) {
					strBul.append("DTP");
					strBul.append(eleSeperator);
					strBul.append(dtp.getEDTP01DateTimeQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(dtp.getEDTP02DateTimePeriodFormatQualifier().getValue());
					strBul.append(eleSeperator);
					strBul.append(dtp.getEDTP03DateTimePeriod().getValue());
					strBul.append(segSeperator);					
				}
			}
		}
		return strBul.toString();
	}
		
		
	
	//IEA*1*000000001~
	public String generateSIEA(){
		SIEAInterchangeControlTrailer siea = t270.getSIEAInterchangeControlTrailer();
		if(null == siea) 
			return "";
		
		StringBuilder strBul = new StringBuilder();		
		strBul.append("IEA");
		strBul.append(eleSeperator);
		strBul.append(siea.getEIEA01NumberOfIncludedFunctionalGroups().getValue());
		strBul.append(eleSeperator);
		strBul.append(siea.getEIEA02InterchangeControlNumber().getValue());
		strBul.append(eleSeperator);
		return strBul.toString();
	}
	
	//GE*1*1~
	public String generateSGE(){
		SGEFunctionalGroupTrailer sge = t270.getSGEFunctionalGroupTrailer();
		
		StringBuilder strBul = new StringBuilder();		
		strBul.append("GE");
		strBul.append(eleSeperator);
		strBul.append(sge.getEGE01NumberOfTransactionSetsIncluded().getValue());
		strBul.append(eleSeperator);
		strBul.append(sge.getEGE02GroupControlNumber().getValue());
		strBul.append(eleSeperator);
		return strBul.toString();
	}
	
	//SE*13*0001~
	public String generateSSE(){
		SSETransactionSetTrailer sse = t270.getSSETransactionSetTrailer();
		if(null == sse) 
			return "";
		
		StringBuilder strBul = new StringBuilder();		
		strBul.append("SE");
		strBul.append(eleSeperator);
		strBul.append(sse.getESE01NumberOfIncludedSegments().getValue());
		strBul.append(eleSeperator);
		strBul.append(sse.getESE02TransactionSetControlNumber().getValue());
		strBul.append(eleSeperator);
		return strBul.toString();
	}
	
	//BHT*0022*13*DDPA-123456*20110204*1015~
	public String generateSBHT(){
		SBHTBeginningOfHierarchicalTransaction sbht = t270.getSBHTBeginningOfHierarchicalTransaction();
		if(null == sbht) 
			return "";
		StringBuilder strBul = new StringBuilder();		
		strBul.append("BHT");
		strBul.append(eleSeperator);
		strBul.append(sbht.getEBHT01HierarchicalStructureCode().getValue());
		strBul.append(eleSeperator);
		strBul.append(sbht.getEBHT02TransactionSetPurposeCode().getValue());
		strBul.append(eleSeperator);
		if(null != sbht.getEBHT03ReferenceIdentification())
			strBul.append(sbht.getEBHT03ReferenceIdentification().getValue());
		strBul.append(eleSeperator);
		strBul.append(sbht.getEBHT04Date().getValue());
		strBul.append(eleSeperator);
		strBul.append(sbht.getEBHT05Time().getValue());
		strBul.append(eleSeperator);
		if(null != sbht.getEBHT06TransactionTypeCode()) 
			strBul.append(sbht.getEBHT06TransactionTypeCode().getValue());
		strBul.append(eleSeperator);
		
		return strBul.toString();
	}
	
	//ST*270*0001~
	public String generateSST(){
		SSTTransactionSetHeader sst = t270.getSSTTransactionSetHeader();
		if(null == sst) 
			return "";
		
		StringBuilder strBul = new StringBuilder();		
		strBul.append("ST");
		strBul.append(eleSeperator);
		strBul.append(sst.getEST01TransactionSetIdentifierCode().getValue());
		strBul.append(eleSeperator);
		strBul.append(sst.getEST02TransactionSetControlNumber().getValue());
		strBul.append(eleSeperator);
		if(null != sst.getEST03ImplementationConventionReference())
			strBul.append(sst.getEST03ImplementationConventionReference().getValue());
		strBul.append(eleSeperator);
		return strBul.toString();
	}
	
	//GS*HS*DDPA*TX*20110204*1015*1*X*004010X092~
	public String generateSGS(){
		SGSFunctionalGroupHeader sgs = t270.getSGSFunctionalGroupHeader();
		if(null == sgs)
			return null;
		
		StringBuilder strGS = new StringBuilder();		
		strGS.append("GS");
		strGS.append(eleSeperator);
		if(null != sgs.getEGS01FunctionalIdentifierCode())
			strGS.append(sgs.getEGS01FunctionalIdentifierCode().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS02ApplicationSenderSCode().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS03ApplicationReceiverSCode().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS04Date().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS05Time().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS06GroupControlNumber().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS07ResponsibleAgencyCode().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS08VersionReleaseIndustryIdentifierCode().getValue());
		strGS.append(eleSeperator);
		return strGS.toString();
	}
	
	//ISA*00*          *00*          *ZZ*DDPA           *ZZ*TX             *110204*1015*U*00401*000000001*0*T*:~
	public String generateSISA() {
		SISAInterchangeControlHeader isa = t270.getSISAInterchangeControlHeader();		
		if(null == isa) 
			return "";		
		StringBuilder sISA = new StringBuilder();		
		sISA.append("ISA");
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA01AuthorizationInformationQualifier().getValue());
		sISA.append(eleSeperator);
		//sISA.append(isa.getEISA02AuthorizationInformation().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA03SecurityInformationQualifier().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA04SecurityInformation().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA05InterchangeIDQualifier().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA06InterchangeSenderID().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA07InterchangeIDQualifier().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA08InterchangeReceiverID().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA09InterchangeDate().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA10InterchangeTime().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA11RepetitionSeparator().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA12InterchangeControlVersionNumber().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA13InterchangeControlNumber().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA14AcknowledgmentRequested().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA15InterchangeUsageIndicator().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA16ComponentElementSeparator().getValue());
		
		return sISA.toString();
	}
}

