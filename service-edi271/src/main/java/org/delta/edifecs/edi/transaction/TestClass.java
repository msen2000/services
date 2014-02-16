package org.delta.edifecs.edi.transaction;

import com.edifecs.xengine.utils.XEUtils;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	 	//String testMsg=new String(XEUtils.readBytesFromFile("C:\\B2BGateway\\E&B Service\\May6\\837Leg.xml"));
	 	//String testMsg=new String(XEUtils.readBytesFromFile("C:\\Senthil\\02 PROJECTS\\EDI\\270_271\\Non_DDPA_TC_270_MTV_2_10_SET_1_5010_example_1\\PND_DDPA_270_MTV_2_10_TC_7_5010_example_1.xml"));
	 				
		String testMsg="ISA*00*          *00*          *ZZ*DDNEIC00       *ZZ*DC             *110204*1015*^*00501*000000001*0*T*:~GS*HS*DDNEIC00*DC*20110204*1015*1*X*005010X279A1~ST*270*0001*005010X279A1~BHT*0022*13*DDNEICOO-123456*20110204*1015~HL*1**20*1~NM1*PR*2*Delta Dental District of Columbia*****PI*DC~HL*2*1*21*1~NM1*1P*2*DESIGNER DENTAL*****XX*1316993660~REF*TJ*412087527~HL*3*2*22*0~NM1*IL*1*Pollard*Alfred****MI*242783333~REF*6P*10162-00001~DMG*D8*19520207~EQ*30~SE*13*0001~GE*1*1~IEA*1*000000001~";		
		String ediXmlMsg= EdiValidationSvc.validateRTTx(testMsg,"EDI");
		System.out.println(ediXmlMsg);
	}

}
