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
@XmlRootElement(name="JMSConnectionAliases")
@XmlAccessorType(XmlAccessType.FIELD)
public class JMSConnectionAliases {

	@XmlElements({@XmlElement(name="JMSConnectionAlias", type=JMSConnectionAlias.class)})
	private Set<JMSConnectionAlias> jmsConnectionAlias;
	/**
	 * 
	 */
	public JMSConnectionAliases() {
		super();
	}
	/**
	 * @param jmsConnectionAlias
	 */
	public JMSConnectionAliases(Set<JMSConnectionAlias> jmsConnectionAlias) {
		super();
		this.jmsConnectionAlias = jmsConnectionAlias;
	}
	/**
	 * @return the jmsConnectionAlias
	 */
	public Set<JMSConnectionAlias> getJmsConnectionAlias() {
		return jmsConnectionAlias;
	}
	/**
	 * @param jmsConnectionAlias the jmsConnectionAlias to set
	 */
	public void setJmsConnectionAlias(Set<JMSConnectionAlias> jmsConnectionAlias) {
		this.jmsConnectionAlias = jmsConnectionAlias;
	}
	
}
