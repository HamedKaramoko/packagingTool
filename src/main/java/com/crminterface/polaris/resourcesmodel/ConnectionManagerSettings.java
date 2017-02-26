/**
 * 
 */
package com.crminterface.polaris.resourcesmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hkaramok
 *
 */
@XmlRootElement(name="connectionManagerSettings")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConnectionManagerSettings {
	
	@XmlAttribute
	private String startupBackoffSecs;
	@XmlAttribute
	private String startupRetryCount;
	@XmlAttribute
	private String expireTimeout;
	@XmlAttribute
	private String blockingTimeout;
	@XmlAttribute
	private String poolIncrementSize;
	@XmlAttribute
	private String maximumPoolSize;
	@XmlAttribute
	private String minimumPoolSize;
	@XmlAttribute
	private boolean poolable;
	/**
	 * 
	 */
	public ConnectionManagerSettings() {
		super();
	}
	/**
	 * @param startupBackoffSecs
	 * @param startupRetryCount
	 * @param expireTimeout
	 * @param blockingTimeout
	 * @param poolIncrementSize
	 * @param maximumPoolSize
	 * @param minimumPoolSize
	 * @param poolable
	 */
	public ConnectionManagerSettings(String startupBackoffSecs, String startupRetryCount, String expireTimeout,
			String blockingTimeout, String poolIncrementSize, String maximumPoolSize, String minimumPoolSize, boolean poolable) {
		super();
		this.startupBackoffSecs = startupBackoffSecs;
		this.startupRetryCount = startupRetryCount;
		this.expireTimeout = expireTimeout;
		this.blockingTimeout = blockingTimeout;
		this.poolIncrementSize = poolIncrementSize;
		this.maximumPoolSize = maximumPoolSize;
		this.minimumPoolSize = minimumPoolSize;
		this.poolable = poolable;
	}
	/**
	 * @return the startupBackoffSecs
	 */
	public String getStartupBackoffSecs() {
		return startupBackoffSecs;
	}
	/**
	 * @param startupBackoffSecs the startupBackoffSecs to set
	 */
	public void setStartupBackoffSecs(String startupBackoffSecs) {
		this.startupBackoffSecs = startupBackoffSecs;
	}
	/**
	 * @return the startupRetryCount
	 */
	public String getStartupRetryCount() {
		return startupRetryCount;
	}
	/**
	 * @param startupRetryCount the startupRetryCount to set
	 */
	public void setStartupRetryCount(String startupRetryCount) {
		this.startupRetryCount = startupRetryCount;
	}
	/**
	 * @return the expireTimeout
	 */
	public String getExpireTimeout() {
		return expireTimeout;
	}
	/**
	 * @param expireTimeout the expireTimeout to set
	 */
	public void setExpireTimeout(String expireTimeout) {
		this.expireTimeout = expireTimeout;
	}
	/**
	 * @return the blockingTimeout
	 */
	public String getBlockingTimeout() {
		return blockingTimeout;
	}
	/**
	 * @param blockingTimeout the blockingTimeout to set
	 */
	public void setBlockingTimeout(String blockingTimeout) {
		this.blockingTimeout = blockingTimeout;
	}
	/**
	 * @return the poolIncrementSize
	 */
	public String getPoolIncrementSize() {
		return poolIncrementSize;
	}
	/**
	 * @param poolIncrementSize the poolIncrementSize to set
	 */
	public void setPoolIncrementSize(String poolIncrementSize) {
		this.poolIncrementSize = poolIncrementSize;
	}
	/**
	 * @return the maximumPoolSize
	 */
	public String getMaximumPoolSize() {
		return maximumPoolSize;
	}
	/**
	 * @param maximumPoolSize the maximumPoolSize to set
	 */
	public void setMaximumPoolSize(String maximumPoolSize) {
		this.maximumPoolSize = maximumPoolSize;
	}
	/**
	 * @return the minimumPoolSize
	 */
	public String getMinimumPoolSize() {
		return minimumPoolSize;
	}
	/**
	 * @param minimumPoolSize the minimumPoolSize to set
	 */
	public void setMinimumPoolSize(String minimumPoolSize) {
		this.minimumPoolSize = minimumPoolSize;
	}
	/**
	 * @return the minimumPoolSize
	 */
	public boolean getPoolable() {
		return poolable;
	}
	/**
	 * @param minimumPoolSize the minimumPoolSize to set
	 */
	public void setPoolable(boolean poolable) {
		this.poolable = poolable;
	}
	
}
