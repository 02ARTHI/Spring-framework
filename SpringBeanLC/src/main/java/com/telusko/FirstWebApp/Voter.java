package com.telusko.FirstWebApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@PropertySource(value="classpath:application.properties")
public class Voter 
{
	@Value("${voter.info.name}")
	private String name;
	
	@Value("${voter.info.id}")
	private Integer id;
	
	
	static
	{
		System.out.println("Voter classis loaded");
	}
	
	public Voter()
	{
		System.out.println("Voter bean is initilaized");
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("Init method getting invocked post construct");
		
	}
	
	//Business logic method
	public String checkEligibility(int age)
	{
		System.out.println("Hello! "+ name + " Your Id number is "+ id);
		
		if(age<18)
		   return "Have Patience! Your time will come to vote";
		else
			return "You're Eligibile to vote";
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroyed");
	}

}
