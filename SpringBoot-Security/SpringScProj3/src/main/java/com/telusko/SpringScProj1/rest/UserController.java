package com.telusko.SpringScProj1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.SpringScProj1.dao.Users;
import com.telusko.SpringScProj1.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@PostMapping("registeru")
	public Users register(@RequestBody Users user)
	{
//	     String encode = encoder.encode(user.getPassword());
//	     System.out.println(encode);
//	     user.setPassword(encode);
		user.setPassword(encoder.encode(user.getPassword()));
		System.out.println(user.getPassword());
		return service.saveTheUser(user);
		
	}
	
}
