/**
 * 
 */
package com.crminterface.polaris.utils;

import java.io.File;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.Selectors;
import org.apache.commons.vfs2.impl.StandardFileSystemManager;
import org.apache.commons.vfs2.provider.sftp.SftpFileSystemConfigBuilder;

/**
 * @author hkaramok
 *
 */
public class FTPUtils {

	public static void download(String hostName, String username, String password, String localFilePath, String remoteFilePath){
		StandardFileSystemManager manager = new StandardFileSystemManager();
		try{
			manager.init();
			String downloadFilePath = localFilePath;

			// Create local file object
			FileObject localFile = manager.resolveFile(downloadFilePath);

			// Create remote file object
			FileObject remoteFile = manager.resolveFile(
					createConnectionString(hostName, username, password,
							remoteFilePath), createDefaultOptions());
			//manager.close();

			// Copy local file to sftp server
			localFile.copyFrom(remoteFile, Selectors.SELECT_SELF);

			System.out.println("File download success");

		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	// Check remote file is exist function:
	public static boolean exist(String hostName, String username,
			String password, String remoteFilePath) {
		StandardFileSystemManager manager = new StandardFileSystemManager();

		try {
			manager.init();

			// Create remote object
			FileObject remoteFile = manager.resolveFile(
					createConnectionString(hostName, username, password,
							remoteFilePath), createDefaultOptions());

			System.out.println("File exist: " + remoteFile.exists());

			return remoteFile.exists();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			manager.close();
		}
	}


	// Establishing connection
	private static String createConnectionString(String hostName,
			String username, String password, String remoteFilePath) {
		return "sftp://" + username + ":" + password + "@" + hostName + "/" + remoteFilePath;
	}
	//  Method to setup default SFTP config:
	private static FileSystemOptions createDefaultOptions()
			throws FileSystemException {
		// Create SFTP options
		FileSystemOptions opts = new FileSystemOptions();

		// SSH Key checking
		SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(
				opts, "no");

		// Root directory set to user home
		SftpFileSystemConfigBuilder.getInstance().setUserDirIsRoot(opts, false); // by default true

		// Timeout is count by Milliseconds
		SftpFileSystemConfigBuilder.getInstance().setTimeout(opts, 10000);

		return opts;
	}

	// Delete file in remote system:
	public static void delete(String hostName, String username,
			String password, String remoteFilePath) {
		StandardFileSystemManager manager = new StandardFileSystemManager();

		try {
			manager.init();

			// Create remote object
			FileObject remoteFile = manager.resolveFile(
					createConnectionString(hostName, username, password,
							remoteFilePath), createDefaultOptions());

			if (remoteFile.exists()) {
				remoteFile.delete();
				System.out.println("Delete remote file success");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			manager.close();
		}
	}

	// Method to upload a file in Remote server
	public static void upload(String hostName, String username,
			String password, String localFilePath, String remoteFilePath) {

		File file = new File(localFilePath);
		if (!file.exists())
			throw new RuntimeException("Error. Local file not found");

		StandardFileSystemManager manager = new StandardFileSystemManager();

		try {
			manager.init();

			// Create local file object
			FileObject localFile = manager.resolveFile(file.getAbsolutePath());

			// Create remote file object
			FileObject remoteFile = manager.resolveFile(
					createConnectionString(hostName, username, password,
							remoteFilePath), createDefaultOptions());

			// Copy local file to sftp server
			remoteFile.copyFrom(localFile, Selectors.SELECT_SELF);

			System.out.println("File upload success");
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			manager.close();
		}
	}
}
