package com.telusko.FirstWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstWebAppApplication  
{

	
	public static void main(String[] args) 
	{
		System.out.println("Spring ioc container started");
		ConfigurableApplicationContext context = SpringApplication.run(FirstWebAppApplication.class, args);
	
		Voter voter = context.getBean(Voter.class);
		String msg=voter.checkEligibility(18);
		System.out.println(msg);
		context.close();
		
		System.out.println("Spring ioc container stopped");
	}

	

}
