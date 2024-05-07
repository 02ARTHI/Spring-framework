package com.telusko.SpringBoot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.SpringBoot01.service.Telusko;

@SpringBootApplication
public class SpringBoot01Application {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringBoot01Application.class, args);
		Telusko obj = container.getBean(Telusko.class);
		System.out.println(obj.buyTheCourse());
	}

}
