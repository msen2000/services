package org.delta.b2b.edi.parser;

import org.delta.b2b.edi.t270.T270;

public interface EDIParser {
	public String convertEDI2XML () throws Exception;
	public T270 convertEDI2Object(String ediFileLoc) throws Exception;
	public T270 convertXML2Object(String xml) throws Exception ;
	public String convertObject2XML(T270 t270Obj) throws Exception;
	public String convertObject2EDI(T270 t270Obj) throws Exception;
}
