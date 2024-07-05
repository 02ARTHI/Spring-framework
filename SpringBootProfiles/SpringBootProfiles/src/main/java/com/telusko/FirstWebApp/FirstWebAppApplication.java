package com.telusko.FirstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.telusko.FirstWebApp.services.Courses;
import com.telusko.FirstWebApp.services.Mockito;

@SpringBootApplication
public class FirstWebAppApplication implements CommandLineRunner 
{
	@Autowired
	private Courses course;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(FirstWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Boolean status=course.getTheCourse();
		if(status)
			System.out.println("Enrolled to course successfully");
		else
			System.out.println("Failed to enroll");
		
	}
	
	@Bean
	@Profile("mock")
	public Mockito createMocBean()
	{
		return new Mockito();
	}

}
