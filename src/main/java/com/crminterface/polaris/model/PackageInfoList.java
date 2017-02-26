/**
 * 
 */
package com.crminterface.polaris.model;

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
@XmlRootElement(name="PackagesInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class PackageInfoList {

	@XmlElements({@XmlElement(name = "PackageInfo", type=PackageInfo.class)})
	private Set<PackageInfo> packageInfos;

	/**
	 * 
	 */
	public PackageInfoList() {
		super();
	}

	/**
	 * @param packageInfos
	 */
	public PackageInfoList(Set<PackageInfo> packageInfos) {
		super();
		this.packageInfos = packageInfos;
	}

	/**
	 * @return the packageInfos
	 */
	public Set<PackageInfo> getPackageInfos() {
		return packageInfos;
	}

	/**
	 * @param packageInfos the packageInfos to set
	 */
	public void setPackageInfos(Set<PackageInfo> packageInfos) {
		this.packageInfos = packageInfos;
	}
	
}
