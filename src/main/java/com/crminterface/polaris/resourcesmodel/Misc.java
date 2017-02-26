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
@XmlRootElement(name="misc")
@XmlAccessorType(XmlAccessType.FIELD)
public class Misc {

	@XmlElements({@XmlElement(name="adl", type=ADL.class)})
	private Set<ADL> adls;
	/**
	 * 
	 */
	public Misc() {
		super();
	}
	/**
	 * @param adls
	 */
	public Misc(Set<ADL> adls) {
		super();
		this.adls = adls;
	}
	/**
	 * @return the adls
	 */
	public Set<ADL> getAdls() {
		return adls;
	}
	/**
	 * @param adls the adls to set
	 */
	public void setAdls(Set<ADL> adls) {
		this.adls = adls;
	}
	
}
