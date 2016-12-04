/**
 * 
 */
package com.crminterface.polaris.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author hkaramok
 *
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class IntegrationServer implements Serializable{
	
	/**
	 * 
	 */
	@XmlTransient
	private static final long serialVersionUID = 1L;
	@Id
	@XmlAttribute
	private String name;
	private String host;
	private String port;
	private String outBoundPackagePath;

	public IntegrationServer() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getOutBoundPackagePath() {
		return outBoundPackagePath;
	}
	public void setOutBoundPackagePath(String outBoundPackagePath) {
		this.outBoundPackagePath = outBoundPackagePath;
	}
}
