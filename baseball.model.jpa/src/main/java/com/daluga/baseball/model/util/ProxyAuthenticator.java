package com.daluga.baseball.model.util;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class ProxyAuthenticator extends Authenticator {
	
	private String username;
	private String password;
	
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username, password.toCharArray());
	}
	
	public ProxyAuthenticator(String username, String password) {
		this.username = username;
		this.password = password;
	} 
	
} 