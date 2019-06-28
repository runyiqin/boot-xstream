package com.example.demo.model;

import java.util.Date;

import com.example.demo.xs.coverters.DateConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;

@XStreamAlias("userLog")
public class UserLog {
	
	@XStreamAsAttribute
	@XStreamAlias("updateuser")
	private String updateUser;
	
	@XStreamConverter(DateConverter.class)
	private Date updateDate;
	
	@XStreamAlias("createUser")
	private String createUser;
	
	@XStreamConverter(DateConverter.class)
	private Date createDate;

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
