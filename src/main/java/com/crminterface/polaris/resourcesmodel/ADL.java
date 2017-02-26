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
@XmlRootElement(name="adl")
@XmlAccessorType(XmlAccessType.FIELD)
public class ADL {

	@XmlAttribute
	private String id;
	@XmlAttribute
	private String path;
	@XmlAttribute
	private String transversal;
	/**
	 * 
	 */
	public ADL() {
		super();
	}
	/**
	 * @param id
	 * @param path
	 * @param transversal
	 */
	public ADL(String id, String path, String transversal) {
		super();
		this.id = id;
		this.path = path;
		this.transversal = transversal;
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
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * @return the transversal
	 */
	public String getTransversal() {
		return transversal;
	}
	/**
	 * @param transversal the transversal to set
	 */
	public void setTransversal(String transversal) {
		this.transversal = transversal;
	}
	
}
