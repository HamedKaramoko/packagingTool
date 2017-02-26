/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

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
@XmlRootElement(name="schedulers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Schedulers {

	@XmlElements({@XmlElement(name="scheduler", type=Scheduler.class)})
	private Set<Scheduler> schedulers;
	/**
	 * 
	 */
	public Schedulers() {
		super();
	}
	/**
	 * @param schedulers
	 */
	public Schedulers(Set<Scheduler> schedulers) {
		super();
		this.schedulers = schedulers;
	}
	/**
	 * @return the schedulers
	 */
	public Set<Scheduler> getSchedulers() {
		return schedulers;
	}
	/**
	 * @param schedulers the schedulers to set
	 */
	public void setSchedulers(Set<Scheduler> schedulers) {
		this.schedulers = schedulers;
	}
	
}
