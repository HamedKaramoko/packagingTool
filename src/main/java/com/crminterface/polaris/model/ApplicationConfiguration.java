/**
 * 
 */
package com.crminterface.polaris.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationConfiguration {


	@Id
	@XmlAttribute
	private String projectName;
	
	private String description;

	@XmlElementWrapper(name="isList")
	@XmlElements({@XmlElement(name="integrationServer", type=IntegrationServer.class)})
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch = FetchType.EAGER)
	@JoinTable(name = "AppConf_IS", joinColumns = @JoinColumn(name = "appConf_name"), inverseJoinColumns = @JoinColumn(name = "IS_name"))
	private Set<IntegrationServer> isList;
	
	private String internDelivery;
	private String propertiesPath;
	private String ressourceFile;
	private String lastDeliveryVersion;
	private String currentDeliveryVersion;

	@OneToOne(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="SFTP_ID")
	private SFTPparameter sftpParameter;

	public ApplicationConfiguration() {
		super();
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Set<IntegrationServer> getIsList() {
		return isList;
	}

	public void setIsList(Set<IntegrationServer> isList) {
		this.isList = isList;
	}

	public String getInternDelivery() {
		return internDelivery;
	}

	public void setInternDelivery(String internDelivery) {
		this.internDelivery = internDelivery;
	}

	public String getPropertiesPath() {
		return propertiesPath;
	}

	public void setPropertiesPath(String propertiesPath) {
		this.propertiesPath = propertiesPath;
	}

	public String getRessourceFile() {
		return ressourceFile;
	}

	public void setRessourceFile(String ressourceFile) {
		this.ressourceFile = ressourceFile;
	}

	public String getLastDeliveryVersion() {
		return lastDeliveryVersion;
	}

	public void setLastDeliveryVersion(String lastDeliveryVersion) {
		this.lastDeliveryVersion = lastDeliveryVersion;
	}

	public String getCurrentDeliveryVersion() {
		return currentDeliveryVersion;
	}

	public void setCurrentDeliveryVersion(String currentDeliveryVersion) {
		this.currentDeliveryVersion = currentDeliveryVersion;
	}

	public SFTPparameter getSftpParameter() {
		return sftpParameter;
	}

	public void setSftpParameter(SFTPparameter sftpParameter) {
		this.sftpParameter = sftpParameter;
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
}
