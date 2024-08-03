package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class TeluskoController {
	 
	@Autowired
	private Environment envi;
	
	@Autowired
	private TeluskoFeignClient feighClient;
	
	@GetMapping("/moreinfo")
	public String get()
	{
//		RestTemplate template = new RestTemplate();
//		ResponseEntity<String> re= template.getForEntity("http://localhost:8484/info", String.class);
//		String apiResponse=re.getBody();
		String apiResponse=feighClient.invokeGetCourseInfo();
		String property = envi.getProperty("server.port");
	  return apiResponse+" -> "+property +" this course starts soon";
	}
}
