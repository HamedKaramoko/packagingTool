package com.crminterface.polaris.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.TransactionException;
import org.springframework.stereotype.Repository;

import com.crminterface.polaris.model.ApplicationConfiguration;

@Repository
public class ApplicationConfigurationDAOImpl implements ApplicationConfigurationDAO {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public ApplicationConfiguration findByProjectName(String projectName) throws IllegalArgumentException {
		return entityManager.find(ApplicationConfiguration.class, projectName);
	}

	@Override
	public ApplicationConfiguration createApplicationConfiguration(ApplicationConfiguration appConf) throws EntityExistsException, IllegalArgumentException, TransactionException{
		entityManager.persist(appConf);
		
		return entityManager.find(ApplicationConfiguration.class, appConf.getProjectName());
		
	}

	@Override
	public List<ApplicationConfiguration> getAllApplicationConfiguration() throws IllegalArgumentException {
		TypedQuery<ApplicationConfiguration> query = entityManager.createQuery(
                "SELECT appConf FROM ApplicationConfiguration appConf",
                ApplicationConfiguration.class);
        return query.getResultList();
	}

}
