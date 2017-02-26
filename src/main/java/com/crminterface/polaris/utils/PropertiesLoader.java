/**
 * 
 */
package com.crminterface.polaris.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;


/**
 * @author hkaramok
 *
 */
public class PropertiesLoader {


	/**
	 * @param fileName represents the path of the file.
	 * 
	 * It loads a properties file path and returns it as a Properties object
	 * 
	 * @return a properties file.
	 * 			It can also return null if fileName is null or 
	 * 			if the input stream contains a malformed Unicode escape sequence
	 * @throws RuntimeException in case of IOException.
	 */
	public static Properties load(String fileName){

		if(!StringUtils.equals(fileName, null)){
			try{
				File file = new File(fileName);
				InputStream iS = FileUtils.openInputStream(file);
				Properties propertiesFile = new Properties();

				propertiesFile.load(iS);
				return propertiesFile;
			} catch(IOException e){
				throw new RuntimeException(e);
			}
			
		}
		return null;
	}

	/**
	 * It loads a properties file path and returns it as a Map
	 * 
	 * @param fileName that represents the path of the file
	 * 
	 * @return a Map<String, String> that represents a list of couple key, value or null if the file hadn't been loaded.
	 * 
	 */
	public static Map<String, String> loadPropertiesInMap(String fileName){

		Properties propertiesFile = load(fileName);
		if(propertiesFile != null){
			Map<String, String> map = new HashMap<String, String>();

			Enumeration<?> e = propertiesFile.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = propertiesFile.getProperty(key);
				map.put(key, value);
			}
			if(!map.isEmpty()){
				return map;
			}
		}
		return null;
	}
}