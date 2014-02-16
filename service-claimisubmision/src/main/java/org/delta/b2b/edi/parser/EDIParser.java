package org.delta.b2b.edi.parser;

import org.delta.b2b.edi.t837.T837;

public interface EDIParser {
	public String convertEDI2XML () throws Exception;
	public T837 convertEDI2Object(String ediFileLoc) throws Exception;
	public T837 convertXML2Object(String xml) throws Exception ;
	public String convertObject2XML(T837 t837Obj) throws Exception;
	public String convertObject2EDI(T837 t837Obj) throws Exception;
}
