/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name="adapters")
@XmlAccessorType(XmlAccessType.FIELD)
public class Adapters {

	@XmlElements({@XmlElement(name="JDBCAdapterConfiguration", type=JDBCAdapterConfiguration.class)})
	private Set<JDBCAdapterConfiguration> jdbcAdapterConfigurations;
	
	/**
	 * 
	 */
	public Adapters() {
		super();
	}

	/**
	 * @param jdbcAdapterConfigurations
	 */
	public Adapters(Set<JDBCAdapterConfiguration> jdbcAdapterConfigurations) {
		super();
		this.jdbcAdapterConfigurations = jdbcAdapterConfigurations;
	}

	/**
	 * @return the jdbcAdapterConfigurations
	 */
	public Set<JDBCAdapterConfiguration> getJdbcAdapterConfigurations() {
		return jdbcAdapterConfigurations;
	}

	/**
	 * @param jdbcAdapterConfigurations the jdbcAdapterConfigurations to set
	 */
	public void setJdbcAdapterConfigurations(Set<JDBCAdapterConfiguration> jdbcAdapterConfigurations) {
		this.jdbcAdapterConfigurations = jdbcAdapterConfigurations;
	}
	
}
