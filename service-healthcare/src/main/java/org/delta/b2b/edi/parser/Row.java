package org.delta.b2b.edi.parser;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Row {

	public enum SegmentType {
		ISA("ISA", "intercahnge"),
		GS("gS", "functinalGroup"),
		ST("ST", "transaction"),
		BHT("BHT", "transaction"),
		HL("HL", "transaction");
		
		private String id;
		private String code;		
		
		private SegmentType(String id, String code) {
			this.id = id;
			this.code = code;
		}
		
		public String getCode(String id) {
			if(this.id.equals(id)) {
				return this.code;
			}
			return "";
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	}
	
	private String segName;
	private int numElements;
	private List<String> elements;
	
	public String getSegName() {
		return segName;
	}
	public void setSegName(String segName) {
		this.segName = segName;
	}
	
	public int getNumElements() {
		return numElements;
	}
	public void setNumElements(int numElements) {
		this.numElements = numElements;
	}
	public List<String> getElements() {
		return elements;
	}
	public void setElements(List<String> elements) {
		this.elements = elements;
	}
	
	public String[] getElementsInArray() {
		String[] arr = new String[elements.size()];		
		return elements.toArray(arr);
	}
	
	public String toString() {
		
		StringBuilder bu = new StringBuilder();
		bu.append(this.segName);
		bu.append(" || ");
		bu.append(this.numElements);
		bu.append(" --> ");
		//String[] arr = getElementsInArray();
		//for(int i=0;i<arr.length;i++) {
			//bu.append(arr[i]);
			//bu.append(" $ ");
		//}
		for(String st : getElements()) {
			bu.append(st);
			bu.append(" $ ");
		}
	
		return bu.toString();
	}
	
}
