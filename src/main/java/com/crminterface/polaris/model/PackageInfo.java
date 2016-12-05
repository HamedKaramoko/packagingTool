/**
 * 
 */
package com.crminterface.polaris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name = "PackageInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class PackageInfo {
	private String name;
	private String description;
	private String version;
	private String jvm_version;
	private String specificFilter;
	private Boolean toExport;
	/**
	 * 
	 */
	public PackageInfo() {
		super();
	}
	
	/**
	 * @param name
	 * @param description
	 * @param version
	 * @param jvm_version
	 * @param specificFilter
	 * @param toExport
	 */
	public PackageInfo(String name, String description, String version, String jvm_version, String specificFilter,
			Boolean toExport) {
		super();
		this.name = name;
		this.description = description;
		this.version = version;
		this.jvm_version = jvm_version;
		this.specificFilter = specificFilter;
		this.toExport = toExport;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * @return the jvm_version
	 */
	public String getJvm_version() {
		return jvm_version;
	}
	/**
	 * @param jvm_version the jvm_version to set
	 */
	public void setJvm_version(String jvm_version) {
		this.jvm_version = jvm_version;
	}
	/**
	 * @return the specificFilter
	 */
	public String getSpecificFilter() {
		return specificFilter;
	}
	/**
	 * @param specificFilter the specificFilter to set
	 */
	public void setSpecificFilter(String specificFilter) {
		this.specificFilter = specificFilter;
	}
	/**
	 * @return the toExport
	 */
	public Boolean getToExport() {
		return toExport;
	}
	/**
	 * @param toExport the toExport to set
	 */
	public void setToExport(Boolean toExport) {
		this.toExport = toExport;
	}
	
	
}
