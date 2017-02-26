/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name="properties")
@XmlAccessorType(XmlAccessType.FIELD)
public class Properties {

	@XmlElements({@XmlElement(name="property", type=Property.class)})
	private Set<Property> properties;
	
	/**
	 * 
	 */
	public Properties() {
		super();
	}

	/**
	 * @param properties
	 */
	public Properties(Set<Property> properties) {
		super();
		this.properties = properties;
	}

	/**
	 * @return the properties
	 */
	public Set<Property> getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Set<Property> properties) {
		this.properties = properties;
	}

}
