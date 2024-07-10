package com.telusko.TicketBookingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(title="Ticket Booking API",
		version="1.0",
		description="This API is to book ticket"),
		
		servers=@Server(
				url="http://localhost:8484/TicketBookingApp",
				description="This is the server where our API is deployed ")			
				)
	
public class TicketBookingAppApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(TicketBookingAppApplication.class, args);
	}

}
