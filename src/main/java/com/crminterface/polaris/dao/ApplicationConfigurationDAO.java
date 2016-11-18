package com.crminterface.polaris.dao;

import com.crminterface.polaris.model.ApplicationConfiguration;

public interface ApplicationConfigurationDAO {
	public ApplicationConfiguration findByProjectName(String projectName);
	public void saveProject(ApplicationConfiguration appConf);
}
