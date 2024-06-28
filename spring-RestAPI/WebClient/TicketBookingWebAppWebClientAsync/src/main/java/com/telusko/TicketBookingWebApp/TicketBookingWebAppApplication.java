package com.telusko.TicketBookingWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.telusko.TicketBookingWebApp.reqres.Ticket;

@SpringBootApplication
public class TicketBookingWebAppApplication {
 
	private static String GET_URL="http://localhost:9090/ticket/api/book-ticket/getTicket/{ticketNumber}";
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingWebAppApplication.class, args);
		
	
		System.out.println("request to api started");
		WebClient webClient = WebClient.create();
		//String ticket = webClient.get().uri(GET_URL,98).retrieve().bodyToMono(String.class).block();
		 webClient.get().uri(GET_URL,98).retrieve().bodyToMono(String.class).subscribe(TicketBookingWebAppApplication::handleResponse);
		System.out.println("request to api ended");
	}
	
	public static void handleResponse(String ticket)
	{
		System.out.println(ticket);
	}

}
