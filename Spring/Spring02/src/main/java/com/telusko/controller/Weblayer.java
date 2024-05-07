package com.telusko.controller;

import org.springframework.stereotype.Controller;

@Controller
public class Weblayer {
	
	public Weblayer()
	{
		System.out.println("weblayer bean is created");
	}
	
	public void disp()
	{
		System.out.println("inside weblayer");
	}
	

}
