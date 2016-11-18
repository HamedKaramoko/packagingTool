package com.crminterface.polaris.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.crminterface.polaris.model.ApplicationConfiguration;

@Repository
public class ApplicationConfigurationDAOImpl implements ApplicationConfigurationDAO {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public ApplicationConfiguration findByProjectName(String projectName) {
		return entityManager.find(ApplicationConfiguration.class, projectName);
	}

	@Override
	public void saveProject(ApplicationConfiguration appConf) {
		entityManager.persist(appConf);
	}

}
