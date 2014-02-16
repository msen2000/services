package org.delta.b2b.edi.generator;


public class EDIGeneratorFactory {
	private EDIGenerator ediGenerator = null;
	
	public EDIGenerator getEDIGenerator(String trxType) {
		if("V837".equalsIgnoreCase(trxType)) {
			ediGenerator = new T837EDIGenerator();
		}
		return ediGenerator;
	}
}
