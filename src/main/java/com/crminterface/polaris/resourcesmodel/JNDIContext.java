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
@XmlRootElement(name="JNDIContext")
@XmlAccessorType(XmlAccessType.FIELD)
public class JNDIContext {

	@XmlElements({@XmlElement(name="JNDIQueue", type=JNDIQueue.class)})
	private Set<JNDIQueue> jndiQueues;
	@XmlElements({@XmlElement(name="JNDIQueueConnectionFactory", type=JNDIQueueConnectionFactory.class)})
	private Set<JNDIQueueConnectionFactory> jndiQueueConnectionFactories;
	/**
	 * 
	 */
	public JNDIContext() {
		super();
	}
	/**
	 * @param jndiQueues
	 * @param jndiQueueConnectionFactories
	 */
	public JNDIContext(Set<JNDIQueue> jndiQueues, Set<JNDIQueueConnectionFactory> jndiQueueConnectionFactories) {
		super();
		this.jndiQueues = jndiQueues;
		this.jndiQueueConnectionFactories = jndiQueueConnectionFactories;
	}
	/**
	 * @return the jndiQueues
	 */
	public Set<JNDIQueue> getJndiQueues() {
		return jndiQueues;
	}
	/**
	 * @param jndiQueues the jndiQueues to set
	 */
	public void setJndiQueues(Set<JNDIQueue> jndiQueues) {
		this.jndiQueues = jndiQueues;
	}
	/**
	 * @return the jndiQueueConnectionFactories
	 */
	public Set<JNDIQueueConnectionFactory> getJndiQueueConnectionFactories() {
		return jndiQueueConnectionFactories;
	}
	/**
	 * @param jndiQueueConnectionFactories the jndiQueueConnectionFactories to set
	 */
	public void setJndiQueueConnectionFactories(Set<JNDIQueueConnectionFactory> jndiQueueConnectionFactories) {
		this.jndiQueueConnectionFactories = jndiQueueConnectionFactories;
	}
	
}
