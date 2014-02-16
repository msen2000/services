package org.delta.b2b.edi.handler.loop;
/**
 * 
 * 324 2600 III Subscriber Eligibility or Benefit Additional Information S 1
 * 
 */
import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t271.EIII01CodeListQualifierCode;
import org.delta.b2b.edi.t271.L2115C;
import org.delta.b2b.edi.t271.SIIISubscriberEligibilityOrBenefitAdditionalInformation;
import org.delta.b2b.edi.t271.T271;

public class L2115CHandler {
	private L2115C l2115c;
	
	public L2115CHandler(T271 t271, Row row) {
				
		l2115c = new L2115C(); 		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		String segName = row.getSegName();
		
		System.out.println("REF array lenght :"+arr.length);
		
		SIIISubscriberEligibilityOrBenefitAdditionalInformation iii = new SIIISubscriberEligibilityOrBenefitAdditionalInformation();
		EIII01CodeListQualifierCode e01 = new EIII01CodeListQualifierCode();
		
		iii.setEIII01CodeListQualifierCode(null);
		iii.setEIII02IndustryCode(null);
		iii.setEIII03CodeCategory(null);
		iii.setEIII04FreeFormMessageText(null);
		iii.setEIII05Quantity(null);
		iii.setEIII07SurfaceLayerPositionCode(null);
		iii.setEIII08SurfaceLayerPositionCode(null);
		iii.setEIII09SurfaceLayerPositionCode(null);
		
		l2115c.setSIIISubscriberEligibilityOrBenefitAdditionalInformation(null);
						
	}
}
