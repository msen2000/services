package org.delta.b2b.edi.generator;


public class EDIGeneratorFactory {
	private EDIGenerator ediGenerator = null;
	
	public EDIGenerator getEDIGenerator(String trxType) {
		if("V270".equalsIgnoreCase(trxType)) {
			ediGenerator = new T270EDIGenerator();
		}
		return ediGenerator;
	}
}
