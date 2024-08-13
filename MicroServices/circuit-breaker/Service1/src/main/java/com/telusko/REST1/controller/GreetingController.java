package com.telusko.REST1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.REST1.service.IGreetingService;


@RestController
@RequestMapping("/api")
public class GreetingController 
{
	@Autowired
	IGreetingService service;
	
	@GetMapping("/greet")
    public ResponseEntity<String> generateGreetings()
    {
    	String wish=service.generateSomeWish();
    	return new ResponseEntity<String>(wish, HttpStatus.OK);
    }
	
	
}
