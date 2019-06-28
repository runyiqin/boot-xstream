package com.example.demo.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 发单工具用户验证返回
 * */
@XStreamAlias("user")
public class UserAuthenticationResponse {
	@XStreamAsAttribute
	@XStreamAlias("Status")
	private String status;
	
	@XStreamAlias("UserNmae")
	private String username;
	
	@XStreamAlias("Errormsg")
	private String Errormsg;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getErrormsg() {
		return Errormsg;
	}

	public void setErrormsg(String errormsg) {
		Errormsg = errormsg;
	}

	public UserAuthenticationResponse(String status, String username, String errormsg) {
		super();
		this.status = status;
		this.username = username;
		Errormsg = errormsg;
	}

	public UserAuthenticationResponse() {
		super();
	}
	
	
}
