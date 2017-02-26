/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name="list")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListElement {

	@XmlAttribute
	private String id;
	@XmlAttribute
	private String delimiter;
	@XmlValue
	private String value;
	
	/**
	 * 
	 */
	public ListElement() {
		super();
	}

	/**
	 * @param id
	 * @param delimiter
	 * @param value
	 */
	public ListElement(String id, String delimiter, String value) {
		super();
		this.id = id;
		this.delimiter = delimiter;
		this.value = value;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the delimiter
	 */
	public String getDelimiter() {
		return delimiter;
	}

	/**
	 * @param delimiter the delimiter to set
	 */
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
}
