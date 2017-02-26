/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name="scheduler")
@XmlAccessorType(XmlAccessType.FIELD)
public class Scheduler {
	
	@XmlAttribute
	private String id;
	@XmlAttribute
	private String type;
	@XmlAttribute
	private String days;
	@XmlAttribute
	private String hours;
	@XmlAttribute
	private String mins;
	@XmlAttribute
	private String separator;
	/**
	 * 
	 */
	public Scheduler() {
		super();
	}
	/**
	 * @param id
	 * @param type
	 * @param days
	 * @param hours
	 * @param mins
	 * @param separator
	 */
	public Scheduler(String id, String type, String days, String hours, String mins, String separator) {
		super();
		this.id = id;
		this.type = type;
		this.days = days;
		this.hours = hours;
		this.mins = mins;
		this.separator = separator;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the days
	 */
	public String getDays() {
		return days;
	}
	/**
	 * @param days the days to set
	 */
	public void setDays(String days) {
		this.days = days;
	}
	/**
	 * @return the hours
	 */
	public String getHours() {
		return hours;
	}
	/**
	 * @param hours the hours to set
	 */
	public void setHours(String hours) {
		this.hours = hours;
	}
	/**
	 * @return the mins
	 */
	public String getMins() {
		return mins;
	}
	/**
	 * @param mins the mins to set
	 */
	public void setMins(String mins) {
		this.mins = mins;
	}
	/**
	 * @return the separator
	 */
	public String getSeparator() {
		return separator;
	}
	/**
	 * @param separator the separator to set
	 */
	public void setSeparator(String separator) {
		this.separator = separator;
	}
}
