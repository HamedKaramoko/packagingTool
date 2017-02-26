/**
 * 
 */
package com.crminterface.polaris.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

/**
 * @author hkaramok
 *
 */
public class SFTPUtils {

	private static Session session = null;
	private static Channel channel = null;
	private static ChannelSftp channelSftp = null;

	/**
	 * Allows connection to the server at a specific folder.
	 * 
	 * @param host represents the host of the remote machine.
	 * @param port represents the port of the remote machine.
	 * @param username represents the username of the remote machine.
	 * @param password represents the password of the remote machine.
	 * @param serverPath  represents the server folder path in which to point.
	 * @throws RuntimeException in case of JSchException or SftpException.
	 */
	public static void connection(String host, int port, String username, String password, String serverPath){
		try{
			JSch jsch = new JSch();
			session = jsch.getSession(username,host, port);
			session.setPassword(password);
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			session.setConfig(config);
			session.connect();
			channel = session.openChannel("sftp");
			channel.connect();
			channelSftp = (ChannelSftp)channel;
			channelSftp.cd(serverPath);
		} catch (JSchException | SftpException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Allows downloading a file on the server.
	 * 
	 * @param remoteFileName represents the file path on the server.
	 * @param localFilePath represents the path where putting the downloaded file. 
	 * @throws RuntimeException in case of SftpException or IOException.
	 */
	public static void download(String remoteFileName, String localFilePath){

		try{
		byte[] buffer = new byte[999999];
		BufferedInputStream bis;
		bis = new BufferedInputStream(channelSftp.get(remoteFileName));

		File newFile = new File(localFilePath);
		OutputStream os = new FileOutputStream(newFile);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		int readCount;

		while( (readCount = bis.read(buffer)) > 0) {
			bos.write(buffer, 0, readCount);
		}
		bis.close();
		bos.close();
		} catch (SftpException | IOException e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * Allows uploading a file on the server.
	 * 
	 * @param fileName represents the file path to updload.
	 * @throws RuntimeException in case of SftpException or FileNotFoundException.
	 */
	public static void upload(String fileName){

		File f = new File(fileName);
		try{
		channelSftp.put(new FileInputStream(f), f.getName());
		} catch (SftpException | FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}
}
