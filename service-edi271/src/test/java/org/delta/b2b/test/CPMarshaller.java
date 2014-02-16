package org.delta.b2b.test;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

//import org.delta.edi.v270.ObjectFactory;
//import org.delta.edi.v270.Person;



/**
 * Wrapper for Jaxb marshaller to isolate the code. Also handles JaxB exception.
 */
public class CPMarshaller {
/*
	private JAXBContext jc;
	String contextPath = "org.delta.edi.v270";


	public String marshall() throws Exception {

		try {
			ObjectFactory of = new ObjectFactory();
			Person p = of.createPerson();
			p.setName("SENTHIL");
			p.setAge("10");
			p.setPlace("KKK");
			p.setSex("M");
			this.getMarshaller().marshal(p, System.out);
			
			this.getMarshaller();
		} catch (Exception e) {
			throw new Exception("Received JAXB exception while marshaling.", e);
		}
		return "";
	}

	public void unmarshall() throws Exception {
		Object jaxbObject;
		try {
			String ROOT_DIR = "C:\\Temp\\NewXMLSchema.xml";
			File f = new File(ROOT_DIR);
			FileInputStream ins = new FileInputStream(f);
			
			Unmarshaller u = getUnmarshaller();
			
			Person  pt = (Person)u.unmarshal(ins);
			
			System.out.println(pt.getName());
			System.out.println(pt.getPlace());
			
		} catch (UnmarshalException umex) {
			throw new Exception("Received a general exception when unmarshaling the message.",umex);
		} catch (JAXBException jex) {
			throw new Exception("Received a JAXB exception while unmarshalling the message.",jex);
		}
		
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
	

	public static void main(String arg[]) {
		CPMarshaller m = new CPMarshaller();
		try {
			m.unmarshall();	
			m.marshall();	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
}
