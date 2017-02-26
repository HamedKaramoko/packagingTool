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
@XmlRootElement(name="connectionSettings")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConnectionSettings {
	
	@XmlAttribute
	private String password;
	@XmlAttribute
	private String user;
	@XmlAttribute
	private String serverName;
	@XmlAttribute
	private String portNumber;
	@XmlAttribute
	private String databaseName;
	@XmlAttribute
	private String databasourceClass;
	@XmlAttribute
	private String transactionType;
	@XmlAttribute
	private boolean modeContainer;
	/**
	 * 
	 */
	public ConnectionSettings() {
		super();
	}
	/**
	 * @param password
	 * @param user
	 * @param serverName
	 * @param portNumber
	 * @param databaseName
	 * @param databasourceClass
	 * @param transactionType
	 * @param modeContainer
	 */
	public ConnectionSettings(String password, String user, String serverName, String portNumber, String databaseName,
			String databasourceClass, String transactionType, boolean modeContainer) {
		super();
		this.password = password;
		this.user = user;
		this.serverName = serverName;
		this.portNumber = portNumber;
		this.databaseName = databaseName;
		this.databasourceClass = databasourceClass;
		this.transactionType = transactionType;
		this.modeContainer = modeContainer;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the serverName
	 */
	public String getServerName() {
		return serverName;
	}
	/**
	 * @param serverName the serverName to set
	 */
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	/**
	 * @return the portNumber
	 */
	public String getPortNumber() {
		return portNumber;
	}
	/**
	 * @param portNumber the portNumber to set
	 */
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}
	/**
	 * @return the databaseName
	 */
	public String getDatabaseName() {
		return databaseName;
	}
	/**
	 * @param databaseName the databaseName to set
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	/**
	 * @return the databasourceClass
	 */
	public String getDatabasourceClass() {
		return databasourceClass;
	}
	/**
	 * @param databasourceClass the databasourceClass to set
	 */
	public void setDatabasourceClass(String databasourceClass) {
		this.databasourceClass = databasourceClass;
	}
	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the modeContainer
	 */
	public boolean isModeContainer() {
		return modeContainer;
	}
	/**
	 * @param modeContainer the modeContainer to set
	 */
	public void setModeContainer(boolean modeContainer) {
		this.modeContainer = modeContainer;
	}

}
