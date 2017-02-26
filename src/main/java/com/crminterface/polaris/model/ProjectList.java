/**
 * 
 */
package com.crminterface.polaris.model;

import java.util.HashSet;
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
@XmlRootElement(name="Projects")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProjectList {

	@XmlElements({@XmlElement(name="Project", type=Project.class)})
	private Set<Project> projectList;

	public ProjectList() {
		super();
		this.projectList = new HashSet<Project>();
	}
	public ProjectList(Set<Project> projectList) {
		super();
		this.projectList = projectList;
	}
	public Set<Project> getProjectList() {
		return projectList;
	}
	public void setProjectList(Set<Project> projectList) {
		this.projectList = projectList;
	}

}
