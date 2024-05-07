package com.telusko.service;

import org.springframework.stereotype.Service;

@Service
public class Servicelayer {
     
	public  Servicelayer() 
	{
		System.out.println("Servicelayer bean is created");
	}
	
	public void disp()
	{
		System.out.println("inside servicelayer");
	}
}
