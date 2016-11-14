/**
 * 
 */
package com.crminterface.polaris.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author hkaramok
 *
 */
@Entity
public class IS {
	
	@Id
	private String name;
	private String host;
	private String port;
	private String outBoundPackagePath;

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
}
