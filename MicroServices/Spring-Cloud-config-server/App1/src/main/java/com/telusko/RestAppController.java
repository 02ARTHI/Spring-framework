package com.telusko;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAppController 
{
	@Value("${msg}")
	private String msg;
	
	@GetMapping("/course")
	public String getCourseUpdate()
	{
		return msg;
	}
	
	
	

}
