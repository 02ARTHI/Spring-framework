package com.telusko.springDataJPA1;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springDataJPA1.dao.CustomerInfo;
import com.telusko.springDataJPA1.service.CustomerServiceImpl;




@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		CustomerServiceImpl customerService = container.getBean(CustomerServiceImpl.class);
		
		CustomerInfo cx = new CustomerInfo( "arthi","cbe",LocalDateTime.of(1996,03,8,11,44),LocalTime.of(20,44),LocalDate.now());
		
		System.out.println(customerService.registerCustomer(cx));
	}

}
