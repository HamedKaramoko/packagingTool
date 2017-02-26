/**
 * 
 */
package com.crminterface.polaris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name = "CustomException")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public CustomException() {
		super();
	}
	/**
	 * @param message
	 */
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
}
