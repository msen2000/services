package org.delta.b2b.edi.parser;

public class EDIParserFactory {
	
	private EDIParser ediParser = null;
	
	public EDIParser getEDIParser(String parserType) {
		if("V276".equalsIgnoreCase(parserType)) {
			ediParser = new T837EDIParser();
		}
		return ediParser;
	}
}
