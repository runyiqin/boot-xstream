package com.example.demo.model;

import java.util.Date;
import java.util.List;

import com.example.demo.xs.coverters.DateConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

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
	
	@XStreamConverter(DateConverter.class)
	private Date birthday;
	
	@XStreamImplicit()
	private List<UserLog> logs;

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
	
	

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public List<UserLog> getLogs() {
		return logs;
	}

	public void setLogs(List<UserLog> logs) {
		this.logs = logs;
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
