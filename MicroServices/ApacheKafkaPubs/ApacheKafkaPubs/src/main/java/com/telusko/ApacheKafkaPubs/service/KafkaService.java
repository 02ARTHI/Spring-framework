package com.telusko.ApacheKafkaPubs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.telusko.ApacheKafkaPubs.model.Customer;
import com.telusko.ApacheKafkaPubs.util.AppConstants;

@Service
public class KafkaService 
{
	
	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;
	
	public String addCxMsg(Customer cx)
	{
		
		kafkaTemplate.send(AppConstants.TOPIC_NAME, cx);
		return "Customer data added in kafka server";
		
	}

}
