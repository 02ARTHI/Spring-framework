package com.telusko.ThirdSpringWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
  
	@GetMapping("/home")
	public String homePage()
	{
		return"home";
	}
	
	@GetMapping("/response")
	public String homePageresponse(Map<String, Object> model)
	{
		String []booksName=new String[] {"java","java8","servlet"};
		model.put("books", booksName);
		return"response";
	}
}
