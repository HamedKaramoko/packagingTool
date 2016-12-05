/**
 * 
 */
package com.crminterface.polaris.model;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationConfigurationList {

	@XmlElementWrapper(name="ApplicationConfigurations")
	@XmlElements({@XmlElement(name="ApplicationConfiguration", type=ApplicationConfiguration.class)})
	private Set<ApplicationConfiguration> applicationConfigurationList;

	public ApplicationConfigurationList() {
		super();
		this.applicationConfigurationList = new HashSet<ApplicationConfiguration>();
	}
	public ApplicationConfigurationList(Set<ApplicationConfiguration> applicationConfigurationList) {
		super();
		this.applicationConfigurationList = applicationConfigurationList;
	}
	public Set<ApplicationConfiguration> getApplicationConfigurationList() {
		return applicationConfigurationList;
	}
	public void setApplicationConfigurationList(Set<ApplicationConfiguration> applicationConfigurationList) {
		this.applicationConfigurationList = applicationConfigurationList;
	}

}
