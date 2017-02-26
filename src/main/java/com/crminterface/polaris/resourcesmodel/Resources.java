/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name="resources")
@XmlAccessorType(XmlAccessType.FIELD)
public class Resources {
	@XmlElement(name="security", type=Security.class)
	private Security security;
	@XmlElement(name="packages", type=PackageWrapper.class)
	private PackageWrapper packageWrapper;
	@XmlElement(name="services", type=Services.class)
	private Services services;
	@XmlElement(name="adapters", type=Adapters.class)
	private Adapters adapters;
	@XmlElement(name="schedulers", type=Schedulers.class)
	private Schedulers schedulers;
	@XmlElement(name="ports", type=Ports.class)
	private Ports ports;
	@XmlElement(name="certificates", type=Certificates.class)
	private Certificates certificates;
	@XmlElement(name="authorities", type=Authorities.class)
	private Authorities authorities;
	@XmlElement(name="misc", type=Misc.class)
	private Misc misc;
	@XmlElement(name="lists", type=ListWrapper.class)
	private ListWrapper listWrapper;
	@XmlElement(name="JMSConnectionAliases", type=JMSConnectionAliases.class)
	private JMSConnectionAliases jmsConnectionAliases;
	@XmlElement(name="JMSQueues", type=JMSQueues.class)
	private JMSQueues jmsQueues;
	@XmlElement(name="JMSGroups", type=JMSGroups.class)
	private JMSGroups jmsGroups;
	@XmlElement(name="JNDIContexts", type=JNDIContexts.class)
	private JNDIContexts jndiContexts;
	/**
	 * 
	 */
	public Resources() {
		super();
	}
	/**
	 * @param security
	 * @param packageWrapper
	 * @param services
	 * @param adapters
	 * @param schedulers
	 * @param ports
	 * @param certificates
	 * @param authorities
	 * @param misc
	 * @param listWrapper
	 * @param jmsConnectionAliases
	 * @param jmsQueues
	 * @param jmsGroups
	 * @param jndiContexts
	 */
	public Resources(Security security, PackageWrapper packageWrapper, Services services, Adapters adapters,
			Schedulers schedulers, Ports ports, Certificates certificates, Authorities authorities, Misc misc,
			ListWrapper listWrapper, JMSConnectionAliases jmsConnectionAliases, JMSQueues jmsQueues,
			JMSGroups jmsGroups, JNDIContexts jndiContexts) {
		super();
		this.security = security;
		this.packageWrapper = packageWrapper;
		this.services = services;
		this.adapters = adapters;
		this.schedulers = schedulers;
		this.ports = ports;
		this.certificates = certificates;
		this.authorities = authorities;
		this.misc = misc;
		this.listWrapper = listWrapper;
		this.jmsConnectionAliases = jmsConnectionAliases;
		this.jmsQueues = jmsQueues;
		this.jmsGroups = jmsGroups;
		this.jndiContexts = jndiContexts;
	}
	/**
	 * @return the security
	 */
	public Security getSecurity() {
		return security;
	}
	/**
	 * @param security the security to set
	 */
	public void setSecurity(Security security) {
		this.security = security;
	}
	/**
	 * @return the packageWrapper
	 */
	public PackageWrapper getPackageWrapper() {
		return packageWrapper;
	}
	/**
	 * @param packageWrapper the packageWrapper to set
	 */
	public void setPackageWrapper(PackageWrapper packageWrapper) {
		this.packageWrapper = packageWrapper;
	}
	/**
	 * @return the services
	 */
	public Services getServices() {
		return services;
	}
	/**
	 * @param services the services to set
	 */
	public void setServices(Services services) {
		this.services = services;
	}
	/**
	 * @return the adapters
	 */
	public Adapters getAdapters() {
		return adapters;
	}
	/**
	 * @param adapters the adapters to set
	 */
	public void setAdapters(Adapters adapters) {
		this.adapters = adapters;
	}
	/**
	 * @return the schedulers
	 */
	public Schedulers getSchedulers() {
		return schedulers;
	}
	/**
	 * @param schedulers the schedulers to set
	 */
	public void setSchedulers(Schedulers schedulers) {
		this.schedulers = schedulers;
	}
	/**
	 * @return the ports
	 */
	public Ports getPorts() {
		return ports;
	}
	/**
	 * @param ports the ports to set
	 */
	public void setPorts(Ports ports) {
		this.ports = ports;
	}
	/**
	 * @return the certificates
	 */
	public Certificates getCertificates() {
		return certificates;
	}
	/**
	 * @param certificates the certificates to set
	 */
	public void setCertificates(Certificates certificates) {
		this.certificates = certificates;
	}
	/**
	 * @return the authorities
	 */
	public Authorities getAuthorities() {
		return authorities;
	}
	/**
	 * @param authorities the authorities to set
	 */
	public void setAuthorities(Authorities authorities) {
		this.authorities = authorities;
	}
	/**
	 * @return the misc
	 */
	public Misc getMisc() {
		return misc;
	}
	/**
	 * @param misc the misc to set
	 */
	public void setMisc(Misc misc) {
		this.misc = misc;
	}
	/**
	 * @return the listWrapper
	 */
	public ListWrapper getListWrapper() {
		return listWrapper;
	}
	/**
	 * @param listWrapper the listWrapper to set
	 */
	public void setListWrapper(ListWrapper listWrapper) {
		this.listWrapper = listWrapper;
	}
	/**
	 * @return the jmsConnectionAliases
	 */
	public JMSConnectionAliases getJmsConnectionAliases() {
		return jmsConnectionAliases;
	}
	/**
	 * @param jmsConnectionAliases the jmsConnectionAliases to set
	 */
	public void setJmsConnectionAliases(JMSConnectionAliases jmsConnectionAliases) {
		this.jmsConnectionAliases = jmsConnectionAliases;
	}
	/**
	 * @return the jmsQueues
	 */
	public JMSQueues getJmsQueues() {
		return jmsQueues;
	}
	/**
	 * @param jmsQueues the jmsQueues to set
	 */
	public void setJmsQueues(JMSQueues jmsQueues) {
		this.jmsQueues = jmsQueues;
	}
	/**
	 * @return the jmsGroups
	 */
	public JMSGroups getJmsGroups() {
		return jmsGroups;
	}
	/**
	 * @param jmsGroups the jmsGroups to set
	 */
	public void setJmsGroups(JMSGroups jmsGroups) {
		this.jmsGroups = jmsGroups;
	}
	/**
	 * @return the jndiContexts
	 */
	public JNDIContexts getJndiContexts() {
		return jndiContexts;
	}
	/**
	 * @param jndiContexts the jndiContexts to set
	 */
	public void setJndiContexts(JNDIContexts jndiContexts) {
		this.jndiContexts = jndiContexts;
	}
}
