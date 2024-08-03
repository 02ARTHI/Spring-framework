package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class TeluskoService {
	
	@Autowired
	private Environment envi;

	public String courseInfo()
	{
		String property = envi.getProperty("server.port");
		return "java spring microservice course launched" + property;
	}
}
