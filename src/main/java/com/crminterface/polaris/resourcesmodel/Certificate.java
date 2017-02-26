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
@XmlRootElement(name="certificate")
@XmlAccessorType(XmlAccessType.FIELD)
public class Certificate {

	@XmlAttribute
	private String id;
	@XmlAttribute
	private String repoName;
	@XmlAttribute
	private String applicationGroup;
	@XmlAttribute
	private String keystoreAlias;
	/**
	 * 
	 */
	public Certificate() {
		super();
	}
	/**
	 * @param id
	 * @param repoName
	 * @param applicationGroup
	 * @param keystoreAlias
	 */
	public Certificate(String id, String repoName, String applicationGroup, String keystoreAlias) {
		super();
		this.id = id;
		this.repoName = repoName;
		this.applicationGroup = applicationGroup;
		this.keystoreAlias = keystoreAlias;
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
	 * @return the repoName
	 */
	public String getRepoName() {
		return repoName;
	}
	/**
	 * @param repoName the repoName to set
	 */
	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}
	/**
	 * @return the applicationGroup
	 */
	public String getApplicationGroup() {
		return applicationGroup;
	}
	/**
	 * @param applicationGroup the applicationGroup to set
	 */
	public void setApplicationGroup(String applicationGroup) {
		this.applicationGroup = applicationGroup;
	}
	/**
	 * @return the keystoreAlias
	 */
	public String getKeystoreAlias() {
		return keystoreAlias;
	}
	/**
	 * @param keystoreAlias the keystoreAlias to set
	 */
	public void setKeystoreAlias(String keystoreAlias) {
		this.keystoreAlias = keystoreAlias;
	}
}
