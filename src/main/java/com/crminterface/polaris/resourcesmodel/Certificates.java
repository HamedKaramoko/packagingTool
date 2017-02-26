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
@XmlRootElement(name="certificates")
@XmlAccessorType(XmlAccessType.FIELD)
public class Certificates {

	@XmlElements({@XmlElement(name="certificate", type=Certificate.class)})
	private Set<Certificate> certificates;
	/**
	 * 
	 */
	public Certificates() {
		super();
	}
	/**
	 * @param certificates
	 */
	public Certificates(Set<Certificate> certificates) {
		super();
		this.certificates = certificates;
	}
	/**
	 * @return the certificates
	 */
	public Set<Certificate> getCertificates() {
		return certificates;
	}
	/**
	 * @param certificates the certificates to set
	 */
	public void setCertificates(Set<Certificate> certificates) {
		this.certificates = certificates;
	}
	
}
