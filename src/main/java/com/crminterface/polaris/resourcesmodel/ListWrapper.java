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
@XmlRootElement(name="lists")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListWrapper {

	@XmlElements({@XmlElement(name="list", type=ListElement.class)})
	private Set<ListElement> listElements;
	/**
	 * 
	 */
	public ListWrapper() {
		super();
	}
	/**
	 * @param listElements
	 */
	public ListWrapper(Set<ListElement> listElements) {
		super();
		this.listElements = listElements;
	}
	/**
	 * @return the listElements
	 */
	public Set<ListElement> getListElements() {
		return listElements;
	}
	/**
	 * @param listElements the listElements to set
	 */
	public void setListElements(Set<ListElement> listElements) {
		this.listElements = listElements;
	}
	
}
