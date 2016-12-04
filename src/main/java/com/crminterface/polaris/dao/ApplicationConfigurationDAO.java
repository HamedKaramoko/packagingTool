package com.crminterface.polaris.dao;

import java.util.List;

import com.crminterface.polaris.model.ApplicationConfiguration;

public interface ApplicationConfigurationDAO {
	public ApplicationConfiguration findByProjectName(String projectName);
	public List<ApplicationConfiguration> getAllApplicationConfiguration();
	public ApplicationConfiguration createApplicationConfiguration(ApplicationConfiguration appConf);
}
