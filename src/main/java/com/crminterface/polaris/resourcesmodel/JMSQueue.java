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
@XmlRootElement(name="JMSQueue")
@XmlAccessorType(XmlAccessType.FIELD)
public class JMSQueue {
	
	@XmlAttribute
	private String id;
	@XmlAttribute
	private String name;
	@XmlAttribute
	private String priorityOrdering;
	@XmlAttribute
	private String sharedState;
	@XmlAttribute
	private String sharedStateOrdering;
	/**
	 * 
	 */
	public JMSQueue() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param priorityOrdering
	 * @param sharedState
	 * @param sharedStateOrdering
	 */
	public JMSQueue(String id, String name, String priorityOrdering, String sharedState, String sharedStateOrdering) {
		super();
		this.id = id;
		this.name = name;
		this.priorityOrdering = priorityOrdering;
		this.sharedState = sharedState;
		this.sharedStateOrdering = sharedStateOrdering;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the priorityOrdering
	 */
	public String getPriorityOrdering() {
		return priorityOrdering;
	}
	/**
	 * @param priorityOrdering the priorityOrdering to set
	 */
	public void setPriorityOrdering(String priorityOrdering) {
		this.priorityOrdering = priorityOrdering;
	}
	/**
	 * @return the sharedState
	 */
	public String getSharedState() {
		return sharedState;
	}
	/**
	 * @param sharedState the sharedState to set
	 */
	public void setSharedState(String sharedState) {
		this.sharedState = sharedState;
	}
	/**
	 * @return the sharedStateOrdering
	 */
	public String getSharedStateOrdering() {
		return sharedStateOrdering;
	}
	/**
	 * @param sharedStateOrdering the sharedStateOrdering to set
	 */
	public void setSharedStateOrdering(String sharedStateOrdering) {
		this.sharedStateOrdering = sharedStateOrdering;
	}
	
}
