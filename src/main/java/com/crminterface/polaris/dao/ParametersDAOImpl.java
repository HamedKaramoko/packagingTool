package com.crminterface.polaris.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.crminterface.polaris.model.Parameters;

@Repository
public class ParametersDAOImpl implements ParametersDAO {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Parameters getParameters() {
		TypedQuery<Parameters> query = entityManager.createQuery(
                "SELECT p FROM Parameters p",
                Parameters.class);
        return query.getSingleResult();
	}

	@Override
	public void update(Parameters parameters) {
		// TODO Auto-generated method stub
	}

}
