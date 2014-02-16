/**
 * 
 */
package org.delta.b2b.edi.handler.header;

import java.math.BigInteger;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t271.EGS01FunctionalIdentifierCode;
import org.delta.b2b.edi.t271.EGS02ApplicationSenderSCode;
import org.delta.b2b.edi.t271.EGS03ApplicationReceiverSCode;
import org.delta.b2b.edi.t271.EGS04Date;
import org.delta.b2b.edi.t271.EGS05Time;
import org.delta.b2b.edi.t271.EGS06GroupControlNumber;
import org.delta.b2b.edi.t271.EGS07ResponsibleAgencyCode;
import org.delta.b2b.edi.t271.EGS08VersionReleaseIndustryIdentifierCode;
import org.delta.b2b.edi.t271.SGSFunctionalGroupHeader;
import org.delta.b2b.edi.t271.T271;

/**
 * @author ca31085
 *
 */
public class GSHandler {
	

	private SGSFunctionalGroupHeader sgs;
	
	public GSHandler(T271 t271, Row row) {
		sgs = t271.getSGSFunctionalGroupHeader();
		process(row);		
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		System.out.println("GS array size "+arr.length);
		
		EGS01FunctionalIdentifierCode e01 = new EGS01FunctionalIdentifierCode();
		e01.setValue(arr[0]);
		sgs.setEGS01FunctionalIdentifierCode(e01);
		EGS02ApplicationSenderSCode e02 = new EGS02ApplicationSenderSCode();
		e02.setValue(arr[1]);
		sgs.setEGS02ApplicationSenderSCode(e02);
		EGS03ApplicationReceiverSCode e03 = new EGS03ApplicationReceiverSCode();
		e03.setValue(arr[2]);
		sgs.setEGS03ApplicationReceiverSCode(e03);
		EGS04Date e04 = new EGS04Date();
		e04.setValue(arr[3]);
		sgs.setEGS04Date(e04);
		EGS05Time e05 = new EGS05Time();
		e05.setValue(arr[4]);
		sgs.setEGS05Time(e05);
		EGS06GroupControlNumber e06 = new EGS06GroupControlNumber();
		e06.setValue(BigInteger.valueOf(100));
		sgs.setEGS06GroupControlNumber(e06);
		EGS07ResponsibleAgencyCode e07 = new EGS07ResponsibleAgencyCode();
		e07.setValue(arr[6]);
		sgs.setEGS07ResponsibleAgencyCode(e07);
		EGS08VersionReleaseIndustryIdentifierCode e08 = new EGS08VersionReleaseIndustryIdentifierCode();
		e08.setValue(arr[7]);
		sgs.setEGS08VersionReleaseIndustryIdentifierCode(e08);
		
		
	}
}
