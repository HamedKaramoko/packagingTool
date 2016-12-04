/**
 * 
 */
package com.crminterface.polaris.utils;

import java.io.File;

import org.tmatesoft.svn.core.SVNDepth;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.BasicAuthenticationManager;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.tmatesoft.svn.core.wc.SVNUpdateClient;

/**
 * @author hkaramok
 *
 */
public class SVNUtils {

	@SuppressWarnings("deprecation")
	public static void export(String username, String password, String svnUrl, String destPath) throws SVNException{
		DAVRepositoryFactory.setup();
		SVNURL url = SVNURL.parseURIDecoded(svnUrl);
		SVNRepository repository = DAVRepositoryFactory.create(url);
		//create authentication data
		ISVNAuthenticationManager authManager = new BasicAuthenticationManager(username, password);
		repository.setAuthenticationManager(authManager);
		
		//output some data to verify connection
		System.out.println( "Repository Root: " + repository.getRepositoryRoot( true ) );
		System.out.println(  "Repository UUID: " + repository.getRepositoryUUID( true ) );
		//need to identify latest revision
		long latestRevision = repository.getLatestRevision();
		System.out.println(  "Repository Latest Revision: " + latestRevision);
		
		//create client manager and set authentication
		SVNClientManager ourClientManager = SVNClientManager.newInstance();
		ourClientManager.setAuthenticationManager(authManager);
		//use SVNUpdateClient to do the export
		SVNUpdateClient updateClient = ourClientManager.getUpdateClient( );
		updateClient.setIgnoreExternals( false );
		updateClient.doExport( repository.getLocation(), new File(destPath), 
				SVNRevision.create(latestRevision), SVNRevision.create(latestRevision), 
				null, true, SVNDepth.INFINITY);
	}
}
