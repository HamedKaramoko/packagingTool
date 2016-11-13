/**
 * 
 */
package com.crminterface.polaris.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name = "SFTPparameter")
@Entity
public class SFTPparameter {
	
	@Id
	private int id;
	private String host;
	private String port;
	private String username;
	private String password;
	
	public SFTPparameter() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
