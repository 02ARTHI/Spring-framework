package com.telusko.ApacheKafkaPubs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.telusko.ApacheKafkaPubs.util.AppConstants;

@SpringBootApplication
public class ApacheKafkaPubsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaPubsApplication.class, args);
	}
	
	@KafkaListener(topics= AppConstants.TOPIC_NAME, groupId="group_telusko_customer")	
	public void subscribeMsgFromKafkaTopic(String cxData)
	{
		System.out.println("Message is coming from kafka server");
		System.out.println(cxData);
	}

}
