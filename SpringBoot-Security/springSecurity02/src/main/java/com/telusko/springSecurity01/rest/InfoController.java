package com.telusko.springSecurity01.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class InfoController {
	
	public List<Student> students = new ArrayList<>(
			List.of(new Student(1,"arthi","devops"), new Student(2,"charlie","aws"))
			);
	@GetMapping("/info")
	public List<Student> get()
	{
		return students;
	}
	
	@GetMapping("/get")
	public String get2()
	{
		return "students info listed";
	}
	
	@PostMapping("/add")
	public String get3(@RequestBody Student student)
	{
		students.add(student);
		return "added to the students";
	}
	
	@GetMapping("/token")
	public CsrfToken get3(HttpServletRequest req)
	{
		return (CsrfToken) req.getAttribute("_csrf");
	}

}
