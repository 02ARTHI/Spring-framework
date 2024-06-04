package com.telusko.springDataJPAMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.springDataJPAMongoDB.dto.CustomerDto;
import com.telusko.springDataJPAMongoDB.service.CustomerserviceImpl;

@SpringBootApplication
public class SpringDataJpaMongoDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaMongoDbApplication.class, args);
		CustomerserviceImpl service = container.getBean(CustomerserviceImpl.class);
		CustomerDto dto = new CustomerDto(2,"ramesh","pune");
	    System.out.println(service.registerCustomerInfo(dto));
		container.close();
	}           

}
