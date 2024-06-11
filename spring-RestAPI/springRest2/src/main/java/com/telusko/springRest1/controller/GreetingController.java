package com.telusko.springRest1.controller;

import java.net.http.HttpResponse;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api")
public class GreetingController {
 
	 @GetMapping("/welcome")
     public String get()
	 {
		return"welcome back to web app"; 
		 
	 }
	 
	 @GetMapping("/welcome2")
     public String getmsg(@RequestParam(value="name", required=false , defaultValue="arthi") String name)
	 {
		return"Hello " + name+ " welcome back to web app"; 
		 
	 }
	 
	 @GetMapping("/welcome3/{name}")
     public String getmsgnew(@PathVariable(value="name", required=false ) String name)
	 {
		return"Hello " + name+ " welcome back to web app"; 
		 
	 }
}
