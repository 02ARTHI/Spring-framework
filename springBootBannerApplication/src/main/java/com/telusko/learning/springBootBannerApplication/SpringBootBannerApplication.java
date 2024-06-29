package com.telusko.learning.springBootBannerApplication;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication();
		app.setBannerMode(Mode.CONSOLE);
		app.run(SpringBootBannerApplication.class, args);
	}

}
