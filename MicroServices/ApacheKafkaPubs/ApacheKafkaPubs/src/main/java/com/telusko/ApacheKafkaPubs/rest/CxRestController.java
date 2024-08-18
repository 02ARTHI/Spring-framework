package com.telusko.ApacheKafkaPubs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.ApacheKafkaPubs.model.Customer;
import com.telusko.ApacheKafkaPubs.service.KafkaService;

@RestController
public class CxRestController
{
	@Autowired
	private KafkaService service;
	
	@PostMapping("/addcx")
	public String addCx(@RequestBody Customer cx)
	{
		return service.addCxMsg(cx);
	}

}
