package com.example.demo.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 发单工具用户验证请求
 * */
@XStreamAlias("user")
public class UserAuthenticationRequest {

	@XStreamAsAttribute
	@XStreamAlias("UserName")
	private String username;
	
	@XStreamAlias("Password")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserAuthenticationRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserAuthenticationRequest() {
		super();
	}

}
