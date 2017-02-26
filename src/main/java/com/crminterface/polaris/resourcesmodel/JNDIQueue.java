/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name="JNDIQueue")
@XmlAccessorType(XmlAccessType.FIELD)
public class JNDIQueue {
	
	@XmlAttribute
	private String id;
	@XmlAttribute
	private String lookupName;
	@XmlAttribute
	private String queueName;
	/**
	 * 
	 */
	public JNDIQueue() {
		super();
	}
	/**
	 * @param id
	 * @param lookupName
	 * @param queueName
	 */
	public JNDIQueue(String id, String lookupName, String queueName) {
		super();
		this.id = id;
		this.lookupName = lookupName;
		this.queueName = queueName;
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
	 * @return the lookupName
	 */
	public String getLookupName() {
		return lookupName;
	}
	/**
	 * @param lookupName the lookupName to set
	 */
	public void setLookupName(String lookupName) {
		this.lookupName = lookupName;
	}
	/**
	 * @return the queueName
	 */
	public String getQueueName() {
		return queueName;
	}
	/**
	 * @param queueName the queueName to set
	 */
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	
}
