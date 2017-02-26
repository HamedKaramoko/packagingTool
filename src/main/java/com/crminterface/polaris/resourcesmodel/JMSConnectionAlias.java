/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name="JMSConnectionAlias")
@XmlAccessorType(XmlAccessType.FIELD)
public class JMSConnectionAlias {
	
	@XmlAttribute
	private String id;
	@XmlAttribute
	private String aliasName;
	@XmlAttribute
	private String description;
	@XmlAttribute
	private String clientID;
	
	@XmlElement(name="BrokerServer", type=BrokerServer.class)
	private BrokerServer brokerServer;
	/**
	 * 
	 */
	public JMSConnectionAlias() {
		super();
	}
	/**
	 * @param id
	 * @param aliasName
	 * @param description
	 * @param clientID
	 * @param brokerServer
	 */
	public JMSConnectionAlias(String id, String aliasName, String description, String clientID,
			BrokerServer brokerServer) {
		super();
		this.id = id;
		this.aliasName = aliasName;
		this.description = description;
		this.clientID = clientID;
		this.brokerServer = brokerServer;
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
	 * @return the aliasName
	 */
	public String getAliasName() {
		return aliasName;
	}
	/**
	 * @param aliasName the aliasName to set
	 */
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the clientID
	 */
	public String getClientID() {
		return clientID;
	}
	/**
	 * @param clientID the clientID to set
	 */
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	/**
	 * @return the brokerServer
	 */
	public BrokerServer getBrokerServer() {
		return brokerServer;
	}
	/**
	 * @param brokerServer the brokerServer to set
	 */
	public void setBrokerServer(BrokerServer brokerServer) {
		this.brokerServer = brokerServer;
	}
	
}
