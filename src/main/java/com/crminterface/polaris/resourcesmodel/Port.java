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
@XmlRootElement(name="port")
@XmlAccessorType(XmlAccessType.FIELD)
public class Port {

	@XmlAttribute
	private String id;
	@XmlAttribute
	private String portNumber;
	@XmlAttribute
	private String portAlias;
	@XmlAttribute
	private String bindPackage;
	@XmlAttribute
	private String modeByDefault;
	@XmlAttribute
	private String allowServicesList;
	/**
	 * 
	 */
	public Port() {
		super();
	}
	/**
	 * @param id
	 * @param portNumber
	 * @param portAlias
	 * @param bindPackage
	 * @param modeByDefault
	 * @param allowServicesList
	 */
	public Port(String id, String portNumber, String portAlias, String bindPackage, String modeByDefault,
			String allowServicesList) {
		super();
		this.id = id;
		this.portNumber = portNumber;
		this.portAlias = portAlias;
		this.bindPackage = bindPackage;
		this.modeByDefault = modeByDefault;
		this.allowServicesList = allowServicesList;
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
	 * @return the portAlias
	 */
	public String getPortAlias() {
		return portAlias;
	}
	/**
	 * @param portAlias the portAlias to set
	 */
	public void setPortAlias(String portAlias) {
		this.portAlias = portAlias;
	}
	/**
	 * @return the bindPackage
	 */
	public String getBindPackage() {
		return bindPackage;
	}
	/**
	 * @param bindPackage the bindPackage to set
	 */
	public void setBindPackage(String bindPackage) {
		this.bindPackage = bindPackage;
	}
	/**
	 * @return the modeByDefault
	 */
	public String getModeByDefault() {
		return modeByDefault;
	}
	/**
	 * @param modeByDefault the modeByDefault to set
	 */
	public void setModeByDefault(String modeByDefault) {
		this.modeByDefault = modeByDefault;
	}
	/**
	 * @return the allowServicesList
	 */
	public String getAllowServicesList() {
		return allowServicesList;
	}
	/**
	 * @param allowServicesList the allowServicesList to set
	 */
	public void setAllowServicesList(String allowServicesList) {
		this.allowServicesList = allowServicesList;
	}
	
}
