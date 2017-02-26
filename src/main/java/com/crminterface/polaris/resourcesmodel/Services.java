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
@XmlRootElement(name="services")
@XmlAccessorType(XmlAccessType.FIELD)
public class Services {

	@XmlElements({@XmlElement(name="service", type=Service.class)})
	private Set<Service> services;
	/**
	 * 
	 */
	public Services() {
		super();
	}
	/**
	 * @param service
	 */
	public Services(Set<Service> services) {
		super();
		this.services = services;
	}
	/**
	 * @return the service
	 */
	public Set<Service> getServices() {
		return services;
	}
	/**
	 * @param service the service to set
	 */
	public void setServices(Set<Service> services) {
		this.services = services;
	}
}
