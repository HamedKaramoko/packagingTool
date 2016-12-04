/**
 * 
 */
package com.crminterface.polaris.utils;

import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * @author hkaramok
 *
 */
public class JAXBUtils<T> {



	@SuppressWarnings("unchecked")
	public T convertXMLFileToObject(String xmlFilePath, T object) throws JAXBException{

		try {
			File xmlFile = new File(xmlFilePath);
			JAXBContext jaxbContext;

			jaxbContext = JAXBContext.newInstance(object.getClass());


			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			T o = (T)jaxbUnmarshaller.unmarshal(xmlFile);
			return o;

		} catch (JAXBException jaxbe) {
			throw jaxbe;
		}
	}

	public File convertObjectToXmlFile(T object, String xmlFilePath) throws JAXBException, IOException{

		File xmlFile = new File(xmlFilePath);
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(object, System.out);
			jaxbMarshaller.marshal(object, xmlFile);


		} catch (JAXBException jaxbe) {
			throw jaxbe;
		}
		return xmlFile;
	}

}
