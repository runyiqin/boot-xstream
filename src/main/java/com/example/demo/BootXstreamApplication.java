package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.UserAuthenticationRequest;
import com.example.demo.util.XsteamUtil;

@SpringBootApplication
public class BootXstreamApplication {

	public static void main(String[] args) {
		UserAuthenticationRequest userRequest = new UserAuthenticationRequest();
		userRequest.setPassword("111111");
		userRequest.setUsername("测试用户");
		String xmlString = XsteamUtil.toXml(UserAuthenticationRequest.class,userRequest);
		System.out.println(xmlString);
		UserAuthenticationRequest ss= (UserAuthenticationRequest) XsteamUtil.toBean(UserAuthenticationRequest.class, xmlString);
		System.out.println(ss.getUsername());
		//		SpringApplication.run(BootXstreamApplication.class, args);
	}

}
