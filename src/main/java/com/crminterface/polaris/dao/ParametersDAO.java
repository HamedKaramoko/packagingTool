package com.crminterface.polaris.dao;

import com.crminterface.polaris.model.Parameters;

public interface ParametersDAO {
	public Parameters getParameters();
	public void save(Parameters parameters);
}
