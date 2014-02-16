package org.delta.b2b.edi.parser;

import org.delta.b2b.edi.t271.T271;

public interface EDIParser {
	public String convertEDI2XML () throws Exception;
	public T271 convertEDI2Object(String ediFileLoc) throws Exception;
	public T271 convertXML2Object(String xml) throws Exception ;
	public String convertObject2XML(T271 t271Obj) throws Exception;
	public String convertObject2EDI(T271 t271Obj) throws Exception;
}
