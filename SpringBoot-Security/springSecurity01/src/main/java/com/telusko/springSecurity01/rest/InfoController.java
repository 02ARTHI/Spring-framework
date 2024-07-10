package com.telusko.springSecurity01.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
	
	@GetMapping("/info")
	public String get()
	{
		return "telusko will launch new course on devops";
	}

}
