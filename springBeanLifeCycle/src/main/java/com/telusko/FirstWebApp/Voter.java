package com.telusko.FirstWebApp;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Voter {
 
	
	static 
	{
		System.out.println("static method invoked");
	}
	
	public Voter()
	{
		System.out.println("constructor invoked");
		
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("post construct");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method");
	}
}
