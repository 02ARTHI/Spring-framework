package com.telusko.springActuator.controller;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController

public class GreetingController {
 
	 @GetMapping("/")
     //@ResponseBody
	 public ResponseEntity<String> get()
	 {
		 LocalDateTime date = LocalDateTime.now();
		 int hour = date.getHour();
		 String wish=null;
		 if(hour<12)
		 {
			 wish="Good morning";
		 }
		 else if(hour<16)
		 {
			 wish="Good afternoon";
		 }
		 else if(hour<20)
		 {
			 wish="Good evening";
		 }
		 else
		 {
			 wish="Good night";
		 }
		 return new ResponseEntity<String>(wish, HttpStatus.OK);
		 
	 }
}
