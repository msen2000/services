package org.delta.b2b.edi.generator.loop;

import org.delta.b2b.edi.t837.L2000A;
import org.delta.b2b.edi.t837.SHLBillingProviderHierarchicalLevel;
import org.delta.b2b.edi.t837.SNM1PayerName;

public class L2000AGenerator {

	private StringBuilder strL2000A = new StringBuilder();
	private static String eleSeperator = "*";
	private static String segSeperator = "~";
	
	public String generateL2000A(L2000A l2000a) {
		
		SHLBillingProviderHierarchicalLevel shl = l2000a.getSHLBillingProviderHierarchicalLevel();
		//strL2000A.append(this.generateSHLInformationSourceLevel(shl));
		
		//L2100A l2100a = l2000a.getL2100A();
		//strL2000A.append(this.generateL2100A(l2100a));
		
		return strL2000A.toString();
	}
	
	/*
	//NM1*PR*2*Delta Dental District of Columbia*****PI*52147~
	public String generateL2100A(L2100A l2100a) {
		SNM1PayerName snm1 = l2100a.getSNM1PayerName();
		StringBuilder strBul = new StringBuilder();
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
				strBul.append(snm1.getENM106NamePrefix().getValue().getType());
			strBul.append(eleSeperator);
			if(null != snm1.getENM107NameSuffix())
				strBul.append(snm1.getENM107NameSuffix().getValue());
			strBul.append(eleSeperator);
			strBul.append(snm1.getENM108IdentificationCodeQualifier().getValue());
			strBul.append(eleSeperator);
			strBul.append(snm1.getENM109IdentificationCode().getValue());
			strBul.append(eleSeperator);
			if(null != snm1.getENM110EntityRelationshipCode())
				strBul.append(snm1.getENM110EntityRelationshipCode().getValue().getType());
			strBul.append(eleSeperator);
			if(null != snm1.getENM111EntityIdentifierCode())
				strBul.append(snm1.getENM111EntityIdentifierCode().getValue().getType());
			strBul.append(eleSeperator);
			if(null != snm1.getENM112NameLastOrOrganizationName())
				strBul.append(snm1.getENM112NameLastOrOrganizationName().getValue().getType());
			strBul.append(segSeperator);
		}			
		return strBul.toString();
	}
	
	//HL*1**20*1~
	public String generateSHLInformationSourceLevel(SHLInformationSourceLevel shl) {
		StringBuilder strBul = new StringBuilder();
		if(null != shl) {
			strBul.append("HL");
			strBul.append(eleSeperator);
			strBul.append(shl.getEHL01HierarchicalIDNumber().getValue());
			strBul.append(eleSeperator);
			if(null != shl.getEHL02HierarchicalParentIDNumber())
				strBul.append(shl.getEHL02HierarchicalParentIDNumber().getValue().getType());
			strBul.append(eleSeperator);
			strBul.append(shl.getEHL03HierarchicalLevelCode().getValue());
			strBul.append(eleSeperator);
			strBul.append(shl.getEHL04HierarchicalChildCode().getValue());
			strBul.append(segSeperator);
		}
		return strBul.toString();
	}
	*/
}
