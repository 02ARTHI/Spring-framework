package com.telusko.ThirdSpringWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller 
public class PathParamController {
	
	//localhost:7081/get/arthi
	@GetMapping("/get/{name}/{course}")
	public String getSomemsg(@PathVariable("name") String name,@PathVariable("course") String course, Map<String, Object> map)
	{
		String msg="hey, " +name+ " you can join the course "+course ;
		map.put("msg", msg);
		return"index";
	}

}
