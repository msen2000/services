/**
 * 
 */
package org.delta.b2b.xml.marshaller;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

import org.delta.b2b.edi.generator.T271EDIGenerator;
import org.delta.b2b.edi.t271.T271;

import com.sun.xml.bind.StringInputStream;

/**
 * @author ca31085
 *
 */
public class XML271Marshaller implements XMLMarshaller {
	
	private JAXBContext jc;
	String contextPath = "";

	public XML271Marshaller() {
		contextPath = "org.delta.b2b.edi.t271";
	}
	
	public String marshall(T271 dObject) throws Exception {
		String outboundXML = "";
		
		try {
			if (null == dObject) {
				throw new Exception("Cound not generate the xml from nll object");
			}
			StringWriter strWriter = new StringWriter(2000);
			Marshaller mar = this.getMarshaller();				
			mar.marshal(dObject, strWriter);
			outboundXML = strWriter.getBuffer().toString();
			//this.getMarshaller().marshal(p, System.out);			
		} catch (Exception e) {
			throw new Exception("Received JAXB exception while marshaling.", e);
		}
		return outboundXML;
	}

	public Object unmarshall(String xml) throws Exception {
		Object jaxbObject = null;
		StringInputStream xmlTextString = null;		
		try {
			Unmarshaller u = this.getUnmarshaller();			
			xmlTextString = new StringInputStream(xml);
			jaxbObject = u.unmarshal(xmlTextString);
			
		} catch (Exception ex) {
			throw new Exception("Received a general exception when unmarshaling the message.",ex);
		}
		return jaxbObject;
	}
	
	public T271 unmarshall() throws Exception {
		T271 t271 = null;
		try {
			//String ROOT_DIR = "C:\\Temp\\v5010_271.xml";
			String ROOT_DIR = "C:\\Temp\\t1.xml";
			File f = new File(ROOT_DIR);
			FileInputStream ins = new FileInputStream(f);
			
			Unmarshaller u = this.getUnmarshaller();			
			t271 = (T271)u.unmarshal(ins);			
			System.out.println(t271.getName());
			System.out.println(t271.getStandard());
			
			T271EDIGenerator gen = new T271EDIGenerator(t271);			
			String str271 = gen.generateEDI();
			System.out.println("EDI is "+str271);
			
		} catch (UnmarshalException umex) {
			throw new Exception("Received a general exception when unmarshaling the message.",umex);
		} catch (JAXBException jex) {
			throw new Exception("Received a JAXB exception while unmarshalling the message.",jex);
		}
		return t271;
	}

	protected Marshaller getMarshaller() throws JAXBException {
		return createContext().createMarshaller();
	}

	protected Unmarshaller getUnmarshaller() throws JAXBException {
		return createContext().createUnmarshaller();
	}

	protected JAXBContext createContext() throws JAXBException {
		if (jc == null) {
			jc = JAXBContext.newInstance(contextPath);
		}
		return jc;
	}
}
