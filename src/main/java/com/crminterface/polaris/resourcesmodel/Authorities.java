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
@XmlRootElement(name="authorities")
@XmlAccessorType(XmlAccessType.FIELD)
public class Authorities {

	@XmlElements({@XmlElement(name="authority", type=Authority.class)})
	private Set<Authority> authorities;
	/**
	 * 
	 */
	public Authorities() {
		super();
	}
	/**
	 * @param authorities
	 */
	public Authorities(Set<Authority> authorities) {
		super();
		this.authorities = authorities;
	}
	/**
	 * @return the authorities
	 */
	public Set<Authority> getAuthorities() {
		return authorities;
	}
	/**
	 * @param authorities the authorities to set
	 */
	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}
	
}
