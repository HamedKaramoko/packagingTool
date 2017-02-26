/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author hkaramok
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigPackage {
	
	@XmlAttribute
	private String id;
	@XmlAttribute
	private String dir;
	/**
	 * 
	 */
	public ConfigPackage() {
		super();
	}
	/**
	 * @param id
	 * @param dir
	 */
	public ConfigPackage(String id, String dir) {
		super();
		this.id = id;
		this.dir = dir;
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
	 * @return the dir
	 */
	public String getDir() {
		return dir;
	}
	/**
	 * @param dir the dir to set
	 */
	public void setDir(String dir) {
		this.dir = dir;
	}
	
}
