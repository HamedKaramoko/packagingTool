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
public class Project {


	@Id
	@XmlAttribute
	private String projectName;
	
	@XmlAttribute
	private String description;

	@XmlElementWrapper(name="integrationServers")
	@XmlElements({@XmlElement(name="integrationServer", type=IntegrationServer.class)})
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch = FetchType.EAGER)
	@JoinTable(name = "Project_IntegrationServer", joinColumns = @JoinColumn(name = "project_name"), inverseJoinColumns = @JoinColumn(name = "IntegrationServer_name"))
	private Set<IntegrationServer> integrationServers;
	
	private String internDelivery;
	private String propertiesPath;
	private String ressourceFile;
	private String lastDeliveryVersion;
	private String currentDeliveryVersion;

	public Project() {
		super();
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Set<IntegrationServer> getIntegrationServers() {
		return integrationServers;
	}

	public void setIntegrationServers(Set<IntegrationServer> integrationServers) {
		this.integrationServers = integrationServers;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}
}
