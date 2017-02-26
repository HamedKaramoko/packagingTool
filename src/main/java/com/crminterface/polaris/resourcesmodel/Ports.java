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
@XmlRootElement(name="ports")
@XmlAccessorType(XmlAccessType.FIELD)
public class Ports {

	@XmlElements({@XmlElement(name="port", type=Port.class)})
	private Set<Port> ports;
	/**
	 * 
	 */
	public Ports() {
		super();
	}
	/**
	 * @param ports
	 */
	public Ports(Set<Port> ports) {
		super();
		this.ports = ports;
	}
	/**
	 * @return the ports
	 */
	public Set<Port> getPorts() {
		return ports;
	}
	/**
	 * @param ports the ports to set
	 */
	public void setPorts(Set<Port> ports) {
		this.ports = ports;
	}
	
}
