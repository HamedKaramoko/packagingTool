/**
 * 
 */
package com.crminterface.polaris.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Parameters {
	
	/**
	 * 
	 */
	@Id
	private String id;
	private String projectConfigurationPath;
	private String deliveryPath;
	private Boolean deleteDeliveryFolder;
	private Boolean deletePackages;
	/**
	 * 
	 */
	public Parameters() {
		super();
	}
	/**
	 * @param id
	 * @param projectConfigurationPath
	 * @param deliveryPath
	 * @param deleteDeliveryFolder
	 * @param deletePackages
	 */
	public Parameters(String id, String projectConfigurationPath, String deliveryPath, Boolean deleteDeliveryFolder,
			Boolean deletePackages) {
		super();
		this.id = id;
		this.projectConfigurationPath = projectConfigurationPath;
		this.deliveryPath = deliveryPath;
		this.deleteDeliveryFolder = deleteDeliveryFolder;
		this.deletePackages = deletePackages;
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
	 * @return the projectConfigurationPath
	 */
	public String getProjectConfigurationPath() {
		return projectConfigurationPath;
	}
	/**
	 * @param projectConfigurationPath the projectConfigurationPath to set
	 */
	public void setProjectConfigurationPath(String projectConfigurationPath) {
		this.projectConfigurationPath = projectConfigurationPath;
	}
	/**
	 * @return the deliveryPath
	 */
	public String getDeliveryPath() {
		return deliveryPath;
	}
	/**
	 * @param deliveryPath the deliveryPath to set
	 */
	public void setDeliveryPath(String deliveryPath) {
		this.deliveryPath = deliveryPath;
	}
	/**
	 * @return the deleteDeliveryFolder
	 */
	public Boolean getDeleteDeliveryFolder() {
		return deleteDeliveryFolder;
	}
	/**
	 * @param deleteDeliveryFolder the deleteDeliveryFolder to set
	 */
	public void setDeleteDeliveryFolder(Boolean deleteDeliveryFolder) {
		this.deleteDeliveryFolder = deleteDeliveryFolder;
	}
	/**
	 * @return the deletePackages
	 */
	public Boolean getDeletePackages() {
		return deletePackages;
	}
	/**
	 * @param deletePackages the deletePackages to set
	 */
	public void setDeletePackages(Boolean deletePackages) {
		this.deletePackages = deletePackages;
	}
}
