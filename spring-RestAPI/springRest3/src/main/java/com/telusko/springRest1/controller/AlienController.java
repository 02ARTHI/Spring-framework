package com.telusko.springRest1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springRest1.repo.Alien;

@RestController
@RequestMapping("/api5")
public class AlienController {
 
	  @GetMapping("/get")
	  public ResponseEntity<Alien> get()
	  {
		  Alien alien = new Alien();
		  alien.setId(1);
		  alien.setCity("cbe");
		  alien.setName("charlie");
		  
		  return new ResponseEntity<Alien>(alien, HttpStatus.OK);
		  
	  }
	  
	  @PostMapping("/save")
	  public ResponseEntity<String> save(@RequestBody Alien alien)
	  {
		  System.out.println(alien);
		  String status ="added to db";
		  return new ResponseEntity<String>(status, HttpStatus.OK); 
	  }
}
