package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.UserAuthenticationRequest;
import com.example.demo.model.UserLog;
import com.example.demo.util.XsteamUtil;

@SpringBootApplication
public class BootXstreamApplication {

	public static void main(String[] args) {
		UserAuthenticationRequest userRequest = new UserAuthenticationRequest();
		userRequest.setPassword("111111");
		userRequest.setUsername("测试用户");
		
		List<UserLog> userlogList = new ArrayList<UserLog>();
		UserLog userLog = new UserLog();
		userLog.setCreateDate(new Date());
		userLog.setCreateUser("cshi");
		userlogList.add(userLog);
		
		userRequest.setLogs(userlogList);
			
		String xmlString = XsteamUtil.toXml(UserAuthenticationRequest.class,userRequest);
		System.out.println(xmlString);
		UserAuthenticationRequest ss= (UserAuthenticationRequest) XsteamUtil.toBean(UserAuthenticationRequest.class, xmlString);
		System.out.println(ss.getUsername());
		//		SpringApplication.run(BootXstreamApplication.class, args);
	}

}
