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
@XmlRootElement(name="JDBCAdapterConfiguration")
@XmlAccessorType(XmlAccessType.FIELD)
public class JDBCAdapterConfiguration {
	
	@XmlAttribute
	private String id;
	@XmlAttribute
	private String packageName;
	@XmlAttribute
	private String connectionAlias;
	
	private ConnectionSettings connectionSettings;
	private ConnectionManagerSettings connectionManagerSettings;
	/**
	 * 
	 */
	public JDBCAdapterConfiguration() {
		super();
	}
	/**
	 * @param id
	 * @param packageName
	 * @param connectionAlias
	 * @param connectionSettings
	 * @param connectionManagerSettings
	 */
	public JDBCAdapterConfiguration(String id, String packageName, String connectionAlias,
			ConnectionSettings connectionSettings, ConnectionManagerSettings connectionManagerSettings) {
		super();
		this.id = id;
		this.packageName = packageName;
		this.connectionAlias = connectionAlias;
		this.connectionSettings = connectionSettings;
		this.connectionManagerSettings = connectionManagerSettings;
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
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}
	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	/**
	 * @return the connectionAlias
	 */
	public String getConnectionAlias() {
		return connectionAlias;
	}
	/**
	 * @param connectionAlias the connectionAlias to set
	 */
	public void setConnectionAlias(String connectionAlias) {
		this.connectionAlias = connectionAlias;
	}
	/**
	 * @return the connectionSettings
	 */
	public ConnectionSettings getConnectionSettings() {
		return connectionSettings;
	}
	/**
	 * @param connectionSettings the connectionSettings to set
	 */
	public void setConnectionSettings(ConnectionSettings connectionSettings) {
		this.connectionSettings = connectionSettings;
	}
	/**
	 * @return the connectionManagerSettings
	 */
	public ConnectionManagerSettings getConnectionManagerSettings() {
		return connectionManagerSettings;
	}
	/**
	 * @param connectionManagerSettings the connectionManagerSettings to set
	 */
	public void setConnectionManagerSettings(ConnectionManagerSettings connectionManagerSettings) {
		this.connectionManagerSettings = connectionManagerSettings;
	}
}
