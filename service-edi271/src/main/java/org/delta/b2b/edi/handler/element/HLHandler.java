/**
 * 
 */
package org.delta.b2b.edi.handler.element;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t271.EHL01HierarchicalIDNumber;
import org.delta.b2b.edi.t271.EHL02HierarchicalParentIDNumber;
import org.delta.b2b.edi.t271.EHL02HierarchicalParentIDNumber1;
import org.delta.b2b.edi.t271.EHL03HierarchicalLevelCode;
import org.delta.b2b.edi.t271.EHL03HierarchicalLevelCode1;
import org.delta.b2b.edi.t271.EHL03HierarchicalLevelCode2;
import org.delta.b2b.edi.t271.EHL03HierarchicalLevelCode3;
import org.delta.b2b.edi.t271.EHL04HierarchicalChildCode;
import org.delta.b2b.edi.t271.EHL04HierarchicalChildCode1;
import org.delta.b2b.edi.t271.L2000A;
import org.delta.b2b.edi.t271.L2000B;
import org.delta.b2b.edi.t271.L2000C;
import org.delta.b2b.edi.t271.L2000D;
import org.delta.b2b.edi.t271.ObjectFactory;
import org.delta.b2b.edi.t271.SHLDependentLevel;
import org.delta.b2b.edi.t271.SHLInformationReceiverLevel;
import org.delta.b2b.edi.t271.SHLInformationSourceLevel;
import org.delta.b2b.edi.t271.SHLSubscriberLevel;
import org.delta.b2b.edi.t271.T271;

/**
 * @author ca31085
 *
 */
public class HLHandler {

	private List<Object> list = null;
	
	public HLHandler(T271 t271, Row row) {
		list = t271.getL2000AOrL2000BOrL2000C(); 	
		System.out.println("Loop List Size -->"+list.size());
		this.process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		System.out.println("HL array lenght :"+arr.length);
		
		String currentLoopName = this.getLoopName(row);
		if("L2000A".equalsIgnoreCase(currentLoopName)) {
			L2000A l2000a = new L2000A();
			
			SHLInformationSourceLevel hl = new SHLInformationSourceLevel();
			
			EHL01HierarchicalIDNumber e01 = new EHL01HierarchicalIDNumber();
			e01.setValue(arr[0]);
			hl.setEHL01HierarchicalIDNumber(e01);
			
			EHL02HierarchicalParentIDNumber e02t = new EHL02HierarchicalParentIDNumber();			
			e02t.setType(arr[1]);			
			JAXBElement<EHL02HierarchicalParentIDNumber> jaxe02 = new JAXBElement(QName.valueOf("E-HL02-Hierarchical_Parent_ID_Number"), EHL02HierarchicalParentIDNumber.class, null, e02t);
			hl.setEHL02HierarchicalParentIDNumber(jaxe02);
			
			EHL03HierarchicalLevelCode e03 = new EHL03HierarchicalLevelCode();
			e03.setValue(arr[2]);
			hl.setEHL03HierarchicalLevelCode(e03);
			
			EHL04HierarchicalChildCode e04 = new EHL04HierarchicalChildCode();
			e04.setValue(arr[3]);
			hl.setEHL04HierarchicalChildCode(e04);
					
			l2000a.setSHLInformationSourceLevel(hl);
			
			list.add(l2000a);
		} else if("L2000B".equalsIgnoreCase(currentLoopName)) {
			ObjectFactory obj = new ObjectFactory();
			L2000B l2000b = obj.createL2000B();			
			SHLInformationReceiverLevel shlRec = l2000b.getSHLInformationReceiverLevel();
			if(null == shlRec) {
				shlRec = obj.createSHLInformationReceiverLevel();
			}
			
			EHL01HierarchicalIDNumber ehl01 = shlRec.getEHL01HierarchicalIDNumber();
			if(null == ehl01) {
				ehl01 = new EHL01HierarchicalIDNumber();
			}
			ehl01.setValue(arr[0]);			
			shlRec.setEHL01HierarchicalIDNumber(ehl01);
						
			EHL02HierarchicalParentIDNumber1 e02 = new EHL02HierarchicalParentIDNumber1();			
			e02.setValue(arr[1]);			
			shlRec.setEHL02HierarchicalParentIDNumber(e02);
			
			EHL03HierarchicalLevelCode1 e03 = new EHL03HierarchicalLevelCode1();
			e03.setValue(arr[2]);			
			shlRec.setEHL03HierarchicalLevelCode(e03);
			
			if(arr.length == 4) {
				EHL04HierarchicalChildCode e04 = new EHL04HierarchicalChildCode();
				e04.setValue(arr[3]);				
				shlRec.setEHL04HierarchicalChildCode(e04);
			}
			
			l2000b.setSHLInformationReceiverLevel(shlRec);
			list.add(l2000b);
		} else if("L2000C".equalsIgnoreCase(currentLoopName)) {
			L2000C l2000c = new L2000C();			
			SHLSubscriberLevel hl = new SHLSubscriberLevel();
			
			EHL01HierarchicalIDNumber e01 = new EHL01HierarchicalIDNumber();
			e01.setValue(arr[0]);
			hl.setEHL01HierarchicalIDNumber(e01);
			
			EHL02HierarchicalParentIDNumber1 e02 = new EHL02HierarchicalParentIDNumber1();
			e02.setValue(arr[1]);
			hl.setEHL02HierarchicalParentIDNumber(e02);
			
			EHL03HierarchicalLevelCode2 e03 = new EHL03HierarchicalLevelCode2();
			e03.setValue(arr[2]);
			hl.setEHL03HierarchicalLevelCode(e03);
			
			if(arr.length == 4) {
				EHL04HierarchicalChildCode e04 = new EHL04HierarchicalChildCode();
				e04.setValue(arr[3]);
				hl.setEHL04HierarchicalChildCode(e04);
			}
			
			l2000c.setSHLSubscriberLevel(hl);
			list.add(l2000c);
		} else if("L2000D".equalsIgnoreCase(currentLoopName)) {
			L2000D l2000d = new L2000D();
			SHLDependentLevel hl = new SHLDependentLevel();
			
			EHL01HierarchicalIDNumber e01 = new EHL01HierarchicalIDNumber();
			e01.setValue(arr[0]);
			hl.setEHL01HierarchicalIDNumber(e01);
			
			EHL02HierarchicalParentIDNumber1 e02 = new EHL02HierarchicalParentIDNumber1();
			e02.setValue(arr[1]);
			hl.setEHL02HierarchicalParentIDNumber(e02);
			
			EHL03HierarchicalLevelCode3 e03 = new EHL03HierarchicalLevelCode3();
			e03.setValue(arr[2]);
			hl.setEHL03HierarchicalLevelCode(e03);
			
			if(arr.length == 4) {
				EHL04HierarchicalChildCode1 e04 = new EHL04HierarchicalChildCode1();
				e04.setValue(arr[3]);
				hl.setEHL04HierarchicalChildCode(e04);
			}
			
			l2000d.setSHLDependentLevel(hl);
			list.add(l2000d);
		}
	}
	
	public String getLoopName(Row row) {
		String loopName = null;
		String[] ele = row.getElementsInArray();
		System.out.println("loopname ->"+ele[0]);		
		if("1".equalsIgnoreCase(ele[0])) {
			loopName = "L2000A";
		} else if("2".equalsIgnoreCase(ele[0])) {
			loopName = "L2000B";
		} else if("3".equalsIgnoreCase(ele[0])) {
			loopName = "L2000C";
		} else if("4".equalsIgnoreCase(ele[0])) {
			loopName = "L2000D";
		}
		return loopName;
	}

}
