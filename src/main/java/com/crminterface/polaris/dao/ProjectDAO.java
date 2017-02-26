package com.crminterface.polaris.dao;

import java.util.List;

import com.crminterface.polaris.model.Project;

public interface ProjectDAO {
	public Project findByProjectName(String projectName);
	public List<Project> getAllProject();
	public void createProject(Project appConf);
}
