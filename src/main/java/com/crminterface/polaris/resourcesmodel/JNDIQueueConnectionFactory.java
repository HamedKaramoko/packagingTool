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
@XmlRootElement(name="JNDIQueueConnectionFactory")
@XmlAccessorType(XmlAccessType.FIELD)
public class JNDIQueueConnectionFactory {
	
	@XmlAttribute
	private String id;
	@XmlAttribute
	private String lookupName;
	@XmlAttribute
	private String clientGroup;
	/**
	 * 
	 */
	public JNDIQueueConnectionFactory() {
		super();
	}
	/**
	 * @param id
	 * @param lookupName
	 * @param clientGroup
	 */
	public JNDIQueueConnectionFactory(String id, String lookupName, String clientGroup) {
		super();
		this.id = id;
		this.lookupName = lookupName;
		this.clientGroup = clientGroup;
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
	 * @return the clientGroup
	 */
	public String getClientGroup() {
		return clientGroup;
	}
	/**
	 * @param clientGroup the clientGroup to set
	 */
	public void setClientGroup(String clientGroup) {
		this.clientGroup = clientGroup;
	}
	
}
