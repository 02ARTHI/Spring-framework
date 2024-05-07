package com.telusko.SpringDataJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.SpringDataJDBC.dao.Springjdbc;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringDataJdbcApplication.class, args);
//	    Springjdbc jdbc = container.getBean(Springjdbc.class);
//	    jdbc.insert();
	}

}
