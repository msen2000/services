package org.delta.b2b.edi.generator.loop;

import java.util.List;

import org.delta.b2b.edi.t276.L2000B;
import org.delta.b2b.edi.t276.L2100B;
import org.delta.b2b.edi.t276.SHLInformationReceiverLevel;
import org.delta.b2b.edi.t276.SNM1InformationReceiverName;

public class L2000BGenerator {

	private StringBuilder strL2000B = new StringBuilder();
	private static String eleSeperator = "*";
	private static String segSeperator = "~";
	
	public String generateL2000B(L2000B l2000b) {
		
		SHLInformationReceiverLevel shl = l2000b.getSHLInformationReceiverLevel();
		strL2000B.append(this.generateSHLInformationReceiverLevel(shl));
		
		L2100B l2100b = l2000b.getL2100B();
		strL2000B.append(this.generateL2100B(l2100b));
				
		return strL2000B.toString();
	}	
	
	public String generateL2100B(L2100B l2100b) {
		StringBuilder strBul = new StringBuilder();	
		
		SNM1InformationReceiverName snm = l2100b.getSNM1InformationReceiverName();	
		strBul.append(this.generateSNM1InformationReceiverName(snm));
		
		SNM1InformationReceiverName refList = l2100b.getSNM1InformationReceiverName();
		
		/*
		strBul.append(this.generateSREFInformationReceiver(refList));		
		if (null != l2100b.getSN3InformationReceiverAddress()) {
			SN3InformationReceiverAddress an3Add = l2100b.getSN3InformationReceiverAddress().getValue();
			this.generateSN3InformationReceiverAddress(an3Add);
		}
		
		if (null != l2100b.getSN4InformationReceiverCityStateZIPCode()) {
			SN4InformationReceiverCityStateZIPCode sn4 = l2100b.getSN4InformationReceiverCityStateZIPCode().getValue();
			this.generateSN4InformationReceiverCityStateZIPCode(sn4);
		}
		
		if (null != l2100b.getSPRVInformationReceiverProviderInformation()) {
			SPRVInformationReceiverProviderInformation sprv = l2100b.getSPRVInformationReceiverProviderInformation().getValue();
			this.generateSPRVInformationReceiverProviderInformation(sprv);
		}
		*/
		
		return strBul.toString();
	}
	
	/*
	public void generateSN4InformationReceiverCityStateZIPCode(SN4InformationReceiverCityStateZIPCode an3Add) {
		//TODO
	}
	public void generateSPRVInformationReceiverProviderInformation(SPRVInformationReceiverProviderInformation an3Add) {
		//TODO
	}
	public void generateSN3InformationReceiverAddress(SN3InformationReceiverAddress an3Add) {
		//TODO
	}
	
	//REF*TJ*412087527~	
	public String generateSREFInformationReceiver(List<SREFInformationReceiverAdditionalIdentification> refs) {
		StringBuilder strBul = new StringBuilder();	
		for(SREFInformationReceiverAdditionalIdentification ref : refs) {
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
	*/
	
	//NM1*1P*2*DESIGNER DENTAL*****XX*1316993660~
	public String generateSNM1InformationReceiverName(SNM1InformationReceiverName nm1) {
		StringBuilder strBul = new StringBuilder();	
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
				strBul.append(nm1.getENM104NameFirst().getValue().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM105NameMiddle())
				strBul.append(nm1.getENM105NameMiddle().getValue().getValue());
			strBul.append(eleSeperator);
			if(null != nm1.getENM106NamePrefix())
				strBul.append(nm1.getENM106NamePrefix().getValue().getType());
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
		return strBul.toString();
	}
	
	//HL*2*1*21*1~
	public String generateSHLInformationReceiverLevel(SHLInformationReceiverLevel shl) {
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
}
