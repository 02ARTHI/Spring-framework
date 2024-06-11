package com.telusko.springRest1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springRest1.repo.Alien;

@RestController
@RequestMapping("/api")
public class AlienController {
 
	  @GetMapping("/get")
	  public Alien get()
	  {
		  Alien alien = new Alien();
		  alien.setId(1);
		  alien.setCity("cbe");
		  alien.setName("charlie");
		  return alien;
	  }
}
