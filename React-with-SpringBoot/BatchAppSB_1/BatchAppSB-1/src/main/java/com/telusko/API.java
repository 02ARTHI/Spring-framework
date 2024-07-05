package com.telusko;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API 
{

	@GetMapping("/apicall")
	public String getSomeInfo()
	{
		return "Make sure you write code and practice not just understand to be confident in Spring Boot";
	}

	
}
