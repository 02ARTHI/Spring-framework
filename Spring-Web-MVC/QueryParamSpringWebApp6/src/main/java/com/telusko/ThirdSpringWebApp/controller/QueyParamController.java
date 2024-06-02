package com.telusko.ThirdSpringWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueyParamController {
   
	//localhost:7081/get?name=arthi&&course=springboot
	@GetMapping("/get")
	public String generateSomemsg(@RequestParam("name") String name,@RequestParam("course")String course, Map<String, Object> map)
	{
		String msg="Hello there "+name+" I hope youre leaning telusko " +course;
		map.put("msg", msg);
		return"index";
	}
}
