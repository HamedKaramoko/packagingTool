/**
 * 
 */
package com.crminterface.polaris.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
/*import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;*/

/**
 * @author hkaramok
 *
 */
public class Helper {


	/**
	 * This service copy a file from one place to another one.
	 * 
	 * @param srcFile represents the path of the file to copy
	 * @param dstFile represents the path where to create the file
	 * @throws IOException
	 */
	public void copyFile(String srcFile, String dstFile) throws IOException{
		try {
			File src = new File(srcFile);
			File dst = new File(dstFile);
			FileUtils.copyFile(src, dst);
		} catch (IOException ioe) {
			throw ioe;
		} catch (NullPointerException npe) {
			throw npe;
		}
	}

	/**
	 * This service copy a folder from one place to another one.
	 * 
	 * @param directorySrc represents the path of the folder to copy
	 * @param directoryDst represents the path where to create the folder
	 * @throws IOException
	 */
	public void copyDirectory(String directorySrc, String directoryDst) throws IOException{
		try {
			File srcDir = new File(directorySrc);
			File srcDest = new File(directoryDst);

			FileUtils.copyDirectory(srcDir, srcDest);
		} catch (IOException ioe) {
			throw ioe;
		} catch (NullPointerException npe) {
			throw npe;
		}
	}

	/**
	 * This service create a file.
	 * 
	 * @param fileName represents the path of the file to create
	 * @return boolean value (true if the file is created and else if not)
	 * @throws IOException
	 */
	public boolean createFile(String fileName) throws IOException{
		try {
			File file = new File(fileName);
			return file.createNewFile();
		} catch (IOException ioe) {
			throw ioe;
		}
	}

	/**
	 * This service create a folder.
	 * 
	 * @param directoryName represents the path of the folder to create
	 * @return boolean value (true if the folder is created and else if not)
	 */
	public boolean createDirectory(String directoryName){
		File directory = new File(directoryName);
		return directory.mkdirs();
	}

	public void deleteDirectory(String directoryName) throws IOException
	{
		try
		{
			FileUtils.deleteDirectory(new File(directoryName));
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			throw ioe;
		}
	}



	/*@SuppressWarnings("unchecked")
	public List<Element> getListOfPackagesInRessourceFile(String resourceFilePath){
		SAXBuilder builder = new SAXBuilder();
		File ressourceFile = null;
		List<Element> list = null;
		ressourceFile = new File(resourceFilePath);
		//ressourceFile = new File(getClass().getClassLoader().getResource(resourceFilePath).getPath());
		System.out.println(ressourceFile.exists());

		try {
			Document document = (Document) builder.build(ressourceFile);
			Element rootNode = document.getRootElement();
			Element packagesNode = rootNode.getChild("packages");
			list = (List<Element>) packagesNode.getChildren("package");
		} catch (JDOMException | IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Element> getListOfPackagesUpdatedFromRessourceFile(String resourceFilePath, List<String> packagesUpdated){
		List<Element> packagesInResourceFile = getListOfPackagesInRessourceFile(resourceFilePath);
		List<Element> elements = null;
		if(packagesInResourceFile != null && packagesUpdated != null){
			for(String packageUpdate : packagesUpdated){
				for(Element packageInResourceFile : packagesInResourceFile){
					if(packageUpdate.equals(packageInResourceFile.getAttributeValue("name"))){
						if(elements == null){
							elements = new ArrayList<Element>();
						}
						elements.add(packageInResourceFile);
					}
				}
			}

		}
			return elements;
	}*/

	public File copyFileToFolder(String fileToCopy, String directoryInWhichPaste) throws IOException{
		File srcFile = new File(fileToCopy);
		File destFile = new File(directoryInWhichPaste);
		try {
			FileUtils.copyFile(srcFile, destFile);

		} catch (IOException e) {
			e.printStackTrace();
			throw new IOException();
		}
		return destFile;
	}

	/**
	 * Allow to know if one delivery had already been done for this release version.
	 * It takes the delivery name and the release version to do that check since the delivery folder is named
	 * AAAAMMDD_DeliveryName_releaseVersion.
	 * It checks if there is no existing folder with the same deliveryName and the same releaseVersion.
	 * @return
	 */
	public boolean isDeliveryPackageAlreadyExist(){
		return true;
	}

	/**
	 * The packageDir takes in the resources files consists of special characters like "[% or %]".
	 * It just takes to remove those special characters.
	 * 
	 * @param packageDir represents the package directory takes from the resource file
	 * @param stringsToRemove represents the list of special character to remove.
	 * 
	 * @return packageDir without special characters put as argument
	 */
	public String formatPackageDirString(String packageDir, List<String> stringsToRemove){
		for(String stringToRemove : stringsToRemove){
			packageDir = StringUtils.remove(packageDir, stringToRemove);
		}
		return packageDir;
	}

}
