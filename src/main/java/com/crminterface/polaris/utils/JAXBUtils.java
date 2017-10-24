/**
 * 
 */
package com.crminterface.polaris.utils;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


/**
 * @author hkaramok
 *
 */
public class JAXBUtils<T> {


	/**
	 * Runs a xml file for creating an object.
	 * 
	 * @param xmlFilePath represents the xml file to load inside an object.
	 * @param object represents the object in which the xmlFile will be load.
	 * @return the object.
	 * @throws RuntimeException when JAXBException occurs during operation.
	 */
	@SuppressWarnings("unchecked")
	public T convertXMLFileToObject(String xmlFilePath, T object){

		try{
			File xmlFile = new File(xmlFilePath);
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(object.getClass());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			T o = (T)jaxbUnmarshaller.unmarshal(xmlFile);

			return o;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * Converts an object into a xml file.
	 * 
	 * @param object represents the object that has to be convert into xml file.
	 * @param xmlFilePath represents the xml file.
	 * @return the file.
	 * @throws RuntimeException when JAXBException occurs during operation.
	 */
	public File convertObjectToXmlFile(T object, String xmlFilePath){

		try{
			File xmlFile = new File(xmlFilePath);

			JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(object, xmlFile);

			return xmlFile;
		} catch (NullPointerException | IllegalArgumentException | JAXBException e) {
			throw new RuntimeException(e);
		}
	}
}
