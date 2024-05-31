package com.telusko.ThirdSpringWebApp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.ThirdSpringWebApp.service.IGreetingService;

import jakarta.servlet.http.HttpServletResponse;

@Controller 
public class GreetingController {
	
	@Autowired
	private IGreetingService greet;
	
	@GetMapping("/greeting")
	public String greeting(Map<String, Object> map)
	{
		map.put("wish",greet.generateGreetings() );
		return "greeting";
	}
	
	@GetMapping("/greeting2")
	public Map<String, Object> greeting2()
	{
		Map<String, Object> map = new HashMap<>();
		map.put("wish",greet.generateGreetings() );
		return map;
	}
	
	@GetMapping("/getgreet")
	public void greeting3(HttpServletResponse res) throws IOException
	{
		PrintWriter writer = res.getWriter();
		writer.println("<h1> Hello world this is from controller directly using servlet " + greet.generateGreetings()+"</h1>");
		
	}


}
