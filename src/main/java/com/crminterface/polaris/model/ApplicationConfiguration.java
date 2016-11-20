/**
 * 
 */
package com.crminterface.polaris.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author hkaramok
 *
 */
@Entity
public class ApplicationConfiguration {


	@Id
	private String projectName;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="IS_NAME")
	private Set<IntegrationServer> isList = new HashSet<IntegrationServer>();
	private String internDelivery;
	private String propertiesPath;
	private String ressourceFile;
	private String lastDeliveryVersion;
	private String currentDeliveryVersion;

	@OneToOne(cascade=CascadeType.ALL)
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
}
