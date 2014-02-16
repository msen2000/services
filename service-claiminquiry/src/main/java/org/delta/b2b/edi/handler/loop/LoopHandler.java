/**
 * 
 */
package org.delta.b2b.edi.handler.loop;

import java.util.List;

import org.delta.b2b.edi.parser.Row;
import org.delta.b2b.edi.t276.L2000A;
import org.delta.b2b.edi.t276.L2000B;
import org.delta.b2b.edi.t276.L2000C;
import org.delta.b2b.edi.t276.L2000D;
import org.delta.b2b.edi.t276.SBHTBeginningOfHierarchicalTransaction;
import org.delta.b2b.edi.t276.*;

/**
 * @author ca31085
 *
 */
public class LoopHandler {
	private SBHTBeginningOfHierarchicalTransaction sbht;
	
	public LoopHandler(T276 t276, Row row) {
		List<Object> loops  = t276.getL2000AOrL2000BOrL2000C(); 
		for(Object obj : loops) {
			if(obj instanceof L2000A) {
				System.out.println("L2000A loop");
				L2000AHandler hand = new L2000AHandler((L2000A)obj, row ); 
			} else if(obj instanceof L2000B) {
				System.out.println("L2000B loop");
				L2000BHandler hand = new L2000BHandler((L2000B)obj, row);
			} else if(obj instanceof L2000C) {
				System.out.println("L2000C loop");
				L2000CHandler hand = new L2000CHandler((L2000C)obj, row);
			} else if(obj instanceof L2000D) {
				System.out.println("L2000D loop");
				L2000DHandler hand = new L2000DHandler((L2000D)obj, row);
			}
		}
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
	}
}
