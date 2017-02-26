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
@XmlRootElement(name="JMSQueues")
@XmlAccessorType(XmlAccessType.FIELD)
public class JMSQueues {

	@XmlElements({@XmlElement(name="JMSQueue", type=JMSQueue.class)})
	private Set<JMSQueue> jmsQueues;
	/**
	 * 
	 */
	public JMSQueues() {
		super();
	}
	/**
	 * @param jmsQueues
	 */
	public JMSQueues(Set<JMSQueue> jmsQueues) {
		super();
		this.jmsQueues = jmsQueues;
	}
	/**
	 * @return the jmsQueues
	 */
	public Set<JMSQueue> getJmsQueues() {
		return jmsQueues;
	}
	/**
	 * @param jmsQueues the jmsQueues to set
	 */
	public void setJmsQueues(Set<JMSQueue> jmsQueues) {
		this.jmsQueues = jmsQueues;
	}
	
}
