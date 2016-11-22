package com.crminterface.polaris.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
	public void createApplicationConfiguration(ApplicationConfiguration appConf) {
		entityManager.persist(appConf);
	}

	@Override
	public List<ApplicationConfiguration> getAllApplicationConfiguration() {
		TypedQuery<ApplicationConfiguration> query = entityManager.createQuery(
                "SELECT FROM ApplicationConfiguration appConf ORDER BY appConf.projectName",
                ApplicationConfiguration.class);
        return query.getResultList();
	}

}
