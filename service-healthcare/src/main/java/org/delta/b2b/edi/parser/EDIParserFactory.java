package org.delta.b2b.edi.parser;

public class EDIParserFactory {
	
	private EDIParser ediParser = null;
	
	public EDIParser getEDIParser(String parserType) {
		if("V270".equalsIgnoreCase(parserType)) {
			ediParser = new T270EDIParser();
		}
		return ediParser;
	}
}
