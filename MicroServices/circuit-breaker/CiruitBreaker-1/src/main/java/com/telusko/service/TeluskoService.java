package com.telusko.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class TeluskoService 
{

	
//	@HystrixCommand(fallbackMethod="courseServiceFallback)
	@CircuitBreaker(name="default", fallbackMethod="courseServiceFallback")
	public String courseService()
	{
		/* if(Math.random()>0.4) */
//		if(10<4)
		if(new Random().nextInt(10)<=10)
		{
			//seeking help of another API
			throw new RuntimeException("Failed to get proper response");
		}
		return "SpringBootCourse for 7Days";
	}
	
	public String courseServiceFallback(String r,Throwable t)
	{
		return "SpringBootCourse for 7Days coming from fall back";
	}

}
