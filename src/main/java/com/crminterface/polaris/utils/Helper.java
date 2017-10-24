/**
 * 
 */
package com.crminterface.polaris.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import com.crminterface.polaris.model.PackageInfo;
import com.crminterface.polaris.resourcesmodel.PackageElement;
import com.crminterface.polaris.resourcesmodel.Resources;

/**
 * @author hkaramok
 *
 */
public class Helper {

	public static final JAXBUtils<Resources> jaxbUtils = new JAXBUtils<>();

	/**
	 * This service copies a file from one place to another one.
	 * 
	 * @param srcFile represents the path of the file to copy.
	 * @param dstFile represents the path where to create the file.
	 * @param deleteIfExist if false and dstFile exists, it won't be rewrite.
	 * @return a Boolean that indicates whether the operation worked or not.
	 * @throws RuntimeException when source or destination is invalid or if an error occurs during copying.
	 */
	public static Boolean copyFile(String srcFile, String dstFile, Boolean deleteIfExist) {
		File file = new File(dstFile);
		try {
			if (file.isFile() && !deleteIfExist) {
				return false;
			}
			FileUtils.copyFile(new File(srcFile), new File(dstFile));
			return true;
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}
	}

	/**
	 * This service copies a folder from one place to another one.
	 * 
	 * @param directorySrc represents the path of the folder to copy.
	 * @param directoryDst represents the path where to create the folder.
	 * @param deleteIfExist if false and directoryDst exists, it won't be rewrite.
	 * @return a Boolean that indicates whether the operation worked or not.
	 * @throws RuntimeException when source or destination is invalid or if an error occurs during copying.
	 */
	public static Boolean copyDirectory(String directorySrc, String directoryDst, Boolean deleteIfExist) {
		File file = new File(directoryDst);
		try {
			if (file.isDirectory() && !deleteIfExist) {
				return false;
			}
			FileUtils.copyDirectory(new File(directorySrc), file);
			return true;
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}
	}

	/**
	 * Models the resources file as an object.
	 * 
	 * @param filePath represents the path of the resources file.
	 * @return an object representing the resources file.
	 */
	public static Resources getResourcesFileAsObject(String filePath) {
		Resources resourcesObject = new Resources();
		return jaxbUtils.convertXMLFileToObject(filePath, resourcesObject);
	}

	/**
	 * It gets all the packageElement object present in Resources object and also the ones not present.
	 * 
	 * @param resources represents a {@link Resources} that contains some information about packages.
	 * @param packages represents a Set of packages for which information have to be taken from resources object.
	 * @param suffix represents a string used as a discriminant when there is more than one package having the same name.
	 * @return a Map that represents all the packages present and the ones not present.
	 */
	public static Map<String, Set<PackageElement>> getPackagesInResources(Resources resources, Set<PackageInfo> packages, String suffix) {

		Map<String, Set<PackageElement>> result = new HashMap<>();
		Set<PackageElement> packageElementsPresent = new HashSet<>();
		Set<PackageElement> packageElementsNotPresent = new HashSet<>();
		for (PackageInfo updatedPackage : packages) {
			PackageElement tmpPkg = null;
			for (PackageElement pkg : resources.getPackageWrapper().getPackageElements()) {
				if (StringUtils.equals(updatedPackage.getName(), pkg.getName())) {
					if (suffix == null || StringUtils.equals(pkg.getId(), pkg.getName() + suffix)) {
						packageElementsPresent.add(pkg);
						tmpPkg = null; // In case while running "tmpPkg" has been valued
						break;
					} else if (StringUtils.equals(pkg.getId(), pkg.getName())) {
						tmpPkg = pkg;
					}
				}
			}
			if (tmpPkg != null) {
				packageElementsPresent.add(tmpPkg);
			} else {
				// For the packages not presents in resources file
				packageElementsNotPresent.add(new PackageElement(null, updatedPackage.getName(), null, null));
			}
		}
		if (packageElementsPresent.isEmpty()) {
			packageElementsPresent = null;
		}
		if (packageElementsNotPresent.isEmpty()) {
			packageElementsNotPresent = null;
		}
		result.put("present", packageElementsPresent);
		result.put("notPresent", packageElementsNotPresent);
		return result;
	}

	/**
	 * Removes specific characters inside Dir of PackageElement list.
	 * 
	 * @param packageElements represents a list of PackageElement.
	 * @param specialCharacters represents a string list that have to be stripped out from the PackageElement "Dir" properties .
	 * @return a Set of PackageElement containing Dir attribute without given specialCharacter.
	 */
	public static Set<PackageElement> removeSpecialCharacterOfPackagesList(Set<PackageElement> packageElements, List<String> specialCharacters) {
		for (PackageElement packageElement : packageElements) {
			packageElement.setDir(formatPackageDirString(packageElement.getDir(), specialCharacters));
		}
		return packageElements;
	}

	/**
	 * The packageDir takes in the resources files consists of special characters like "[% or %]".
	 * It just takes to remove those special characters.
	 * 
	 * @param packageDir represents the package directory takes from the resource file.
	 * @param stringsToRemove represents the list of special character to remove.
	 * 
	 * @return packageDir without special characters put as argument
	 */
	public static String formatPackageDirString(String packageDir, List<String> stringsToRemove) {
		for (String stringToRemove : stringsToRemove) {
			packageDir = StringUtils.remove(packageDir, stringToRemove);
		}
		return packageDir;
	}

}
