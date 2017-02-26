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
@XmlRootElement(name="JMSGroups")
@XmlAccessorType(XmlAccessType.FIELD)
public class JMSGroups {

	@XmlElements({@XmlElement(name="JMSGroup", type=JMSGroup.class)})
	private Set<JMSGroup> jmsGroups;
	/**
	 * 
	 */
	public JMSGroups() {
		super();
	}
	/**
	 * @param jmsGroups
	 */
	public JMSGroups(Set<JMSGroup> jmsGroups) {
		super();
		this.jmsGroups = jmsGroups;
	}
	/**
	 * @return the jmsGroups
	 */
	public Set<JMSGroup> getJmsGroups() {
		return jmsGroups;
	}
	/**
	 * @param jmsGroups the jmsGroups to set
	 */
	public void setJmsGroups(Set<JMSGroup> jmsGroups) {
		this.jmsGroups = jmsGroups;
	}
	
}
