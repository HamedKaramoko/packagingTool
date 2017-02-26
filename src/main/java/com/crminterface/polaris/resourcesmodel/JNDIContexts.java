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
@XmlRootElement(name="JNDIContexts")
@XmlAccessorType(XmlAccessType.FIELD)
public class JNDIContexts {

	@XmlElements({@XmlElement(name="JNDIContext", type=JNDIContext.class)})
	private Set<JNDIContext> jndiContexts;
	
	/**
	 * 
	 */
	public JNDIContexts() {
		super();
	}

	/**
	 * @param jndiContexts
	 */
	public JNDIContexts(Set<JNDIContext> jndiContexts) {
		super();
		this.jndiContexts = jndiContexts;
	}

	/**
	 * @return the jndiContexts
	 */
	public Set<JNDIContext> getJndiContexts() {
		return jndiContexts;
	}

	/**
	 * @param jndiContexts the jndiContexts to set
	 */
	public void setJndiContexts(Set<JNDIContext> jndiContexts) {
		this.jndiContexts = jndiContexts;
	}
	
}
