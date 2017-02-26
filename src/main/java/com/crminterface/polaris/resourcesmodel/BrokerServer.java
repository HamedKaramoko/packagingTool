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
@XmlRootElement(name="BrokerServer")
@XmlAccessorType(XmlAccessType.FIELD)
public class BrokerServer {
	
	@XmlAttribute
	private String BrokerServerHost;
	@XmlAttribute
	private String BrokerServerPort;
	@XmlAttribute
	private String BrokerName;
	@XmlAttribute
	private String clientGroup;
	/**
	 * 
	 */
	public BrokerServer() {
		super();
	}
	/**
	 * @param brokerServerHost
	 * @param brokerServerPort
	 * @param brokerName
	 * @param clientGroup
	 */
	public BrokerServer(String brokerServerHost, String brokerServerPort, String brokerName, String clientGroup) {
		super();
		BrokerServerHost = brokerServerHost;
		BrokerServerPort = brokerServerPort;
		BrokerName = brokerName;
		this.clientGroup = clientGroup;
	}
	/**
	 * @return the brokerServerHost
	 */
	public String getBrokerServerHost() {
		return BrokerServerHost;
	}
	/**
	 * @param brokerServerHost the brokerServerHost to set
	 */
	public void setBrokerServerHost(String brokerServerHost) {
		BrokerServerHost = brokerServerHost;
	}
	/**
	 * @return the brokerServerPort
	 */
	public String getBrokerServerPort() {
		return BrokerServerPort;
	}
	/**
	 * @param brokerServerPort the brokerServerPort to set
	 */
	public void setBrokerServerPort(String brokerServerPort) {
		BrokerServerPort = brokerServerPort;
	}
	/**
	 * @return the brokerName
	 */
	public String getBrokerName() {
		return BrokerName;
	}
	/**
	 * @param brokerName the brokerName to set
	 */
	public void setBrokerName(String brokerName) {
		BrokerName = brokerName;
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
