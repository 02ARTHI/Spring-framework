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
		
//		CustomerInfo cx = new CustomerInfo( "charlie","klr",LocalDateTime.of(1998,03,8,11,44),LocalTime.now(),LocalDate.of(2016, 4, 8));
//		System.out.println(customerService.registerCustomer(cx));
		
		customerService.fetchAllCxInfo().forEach(c->System.out.println(c));
		
	}

}
