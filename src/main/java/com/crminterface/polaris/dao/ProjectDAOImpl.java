package com.crminterface.polaris.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.crminterface.polaris.model.Project;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Project findByProjectName(String projectName){
		return entityManager.find(Project.class, projectName);
	}

	@Override
	public void createProject(Project appConf){
		entityManager.persist(appConf);		
	}

	@Override
	public List<Project> getAllProject(){
		TypedQuery<Project> query = entityManager.createQuery(
                "SELECT p FROM Project p",
                Project.class);
        return query.getResultList();
	}

}
