package org.delta.b2b.edi.parser;

import org.delta.b2b.edi.t276.T276;

public interface EDIParser {
	public String convertEDI2XML () throws Exception;
	public T276 convertEDI2Object(String ediFileLoc) throws Exception;
	public T276 convertXML2Object(String xml) throws Exception ;
	public String convertObject2XML(T276 t276Obj) throws Exception;
	public String convertObject2EDI(T276 t276Obj) throws Exception;
}
