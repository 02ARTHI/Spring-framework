package com.telusko.REST1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.REST1.service.IGreetingService;


@RestController
//@RequestMapping("/api")
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
	
	@PostMapping("/tourist")
    public ResponseEntity<String> acceptTouristInfo(@RequestBody Tourist tourist)
    {
    	boolean status=service.welcomeTourist(tourist);
    	String msg=null;
    	if(status==true)
    	{
    		msg="Tourist welcomed and req is considered";
    		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
    	}
    	else
    	{
    		msg="Tourist couldn't welcomed and req is not considered";
    		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
    	}
    	
    }
}
