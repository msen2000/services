package org.delta.b2b.xml.marshaller;

public class XMLMarshallerFactory {

	private XMLMarshaller marshaller = null;
	
	public XMLMarshaller getXMLMarshaller(String txType) {
		if("V270".equalsIgnoreCase(txType)) {
			marshaller = new XML837Marshaller();
		}
		return marshaller;
	}
}
