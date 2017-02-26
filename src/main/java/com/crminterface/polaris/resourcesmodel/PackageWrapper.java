/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

/**
 * @author hkaramok
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PackageWrapper {

	@XmlElements({@XmlElement(name="package", type=PackageElement.class)})
	private Set<PackageElement> packageElements;
	@XmlElements({@XmlElement(name="configpackage", type=ConfigPackage.class)})
	private Set<ConfigPackage> configPackages;
	/**
	 * 
	 */
	public PackageWrapper() {
		super();
	}
	/**
	 * @param packageElements
	 * @param configPackages
	 */
	public PackageWrapper(Set<PackageElement> packageElements, Set<ConfigPackage> configPackages) {
		super();
		this.packageElements = packageElements;
		this.configPackages = configPackages;
	}
	/**
	 * @return the packageElements
	 */
	public Set<PackageElement> getPackageElements() {
		return packageElements;
	}
	/**
	 * @param packageElements the packageElements to set
	 */
	public void setPackageElements(Set<PackageElement> packageElements) {
		this.packageElements = packageElements;
	}
	/**
	 * @return the configPackages
	 */
	public Set<ConfigPackage> getConfigPackages() {
		return configPackages;
	}
	/**
	 * @param configPackages the configPackages to set
	 */
	public void setConfigPackages(Set<ConfigPackage> configPackages) {
		this.configPackages = configPackages;
	}
	
}
