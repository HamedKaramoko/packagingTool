/**
 * 
 */
package com.crminterface.polaris.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name = "IS")
@Entity
public class IS {
	
	@Id
	private String name;
	private String host;
	private String port;
	private String outBoundPackagePath;

	@ManyToOne
	private ApplicationConfiguration applicationConfiguration;

	public IS() {
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
	public ApplicationConfiguration getApplicationConfiguration() {
		return applicationConfiguration;
	}
	public void setApplicationConfiguration(ApplicationConfiguration applicationConfiguration) {
		this.applicationConfiguration = applicationConfiguration;
	}
}
