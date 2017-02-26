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
@XmlRootElement(name="security")
@XmlAccessorType(XmlAccessType.FIELD)
public class Security {

	@XmlElements({@XmlElement(name="acl", type=ACL.class)})
	private Set<ACL> acls;
	@XmlElements({@XmlElement(name="user", type=User.class)})
	private Set<User> users;
	@XmlElements({@XmlElement(name="group", type=Group.class)})
	private Set<Group> groups;
	/**
	 * 
	 */
	public Security() {
		super();
	}
	/**
	 * @param acls
	 * @param users
	 * @param groups
	 */
	public Security(Set<ACL> acls, Set<User> users, Set<Group> groups) {
		super();
		this.acls = acls;
		this.users = users;
		this.groups = groups;
	}
	/**
	 * @return the acls
	 */
	public Set<ACL> getAcls() {
		return acls;
	}
	/**
	 * @param acls the acls to set
	 */
	public void setAcls(Set<ACL> acls) {
		this.acls = acls;
	}
	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	/**
	 * @return the groups
	 */
	public Set<Group> getGroups() {
		return groups;
	}
	/**
	 * @param groups the groups to set
	 */
	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}
	
}
