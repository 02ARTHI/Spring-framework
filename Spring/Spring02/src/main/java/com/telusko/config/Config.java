package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    
	public Config()
	{
		System.out.println("Config bean is created");
	}
	
	public void disp()
	{
		System.out.println("inside config");
	}
	
	@Bean
	public Beta betaInstance()
	{
		Beta b = new Beta();
		return b;
	}

}
