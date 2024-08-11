package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.service.TeluskoService;

@RestController
public class ControllerCB {
	
	@Autowired
	private TeluskoService service;
	
	@GetMapping("/getinfo")
	public String course()
	{
		return service.courseService();
	}

}
