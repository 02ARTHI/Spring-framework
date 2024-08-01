package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TeluskoController {
	
	
	@GetMapping
	public String get()
	{
	  return "this course starts soon";
	}
}
