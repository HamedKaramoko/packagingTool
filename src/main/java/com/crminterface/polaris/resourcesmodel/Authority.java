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
@XmlRootElement(name="authority")
@XmlAccessorType(XmlAccessType.FIELD)
public class Authority {

	@XmlAttribute
	private String id;
	@XmlAttribute
	private String repoName;
	@XmlAttribute
	private String truststoreAlias;
	/**
	 * 
	 */
	public Authority() {
		super();
	}
	/**
	 * @param id
	 * @param repoName
	 * @param truststoreAlias
	 */
	public Authority(String id, String repoName, String truststoreAlias) {
		super();
		this.id = id;
		this.repoName = repoName;
		this.truststoreAlias = truststoreAlias;
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
	 * @return the truststoreAlias
	 */
	public String getTruststoreAlias() {
		return truststoreAlias;
	}
	/**
	 * @param truststoreAlias the truststoreAlias to set
	 */
	public void setTruststoreAlias(String truststoreAlias) {
		this.truststoreAlias = truststoreAlias;
	}
	
}
