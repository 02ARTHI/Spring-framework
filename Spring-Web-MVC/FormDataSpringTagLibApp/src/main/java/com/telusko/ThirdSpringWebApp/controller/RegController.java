package com.telusko.ThirdSpringWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegController {
  
	@GetMapping("/register")
	public String msg(@ModelAttribute("impl") Implementer impl)
	{
		return"register";
	}
	
	@PostMapping("/register")
	public String msg(Map<String,Object> map,@ModelAttribute("impl") Implementer impl)
	{
		System.out.println(impl);
		map.put("impl", impl);
		return"response";
	}
}
