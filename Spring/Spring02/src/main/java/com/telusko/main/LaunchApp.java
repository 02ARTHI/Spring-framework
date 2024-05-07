package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.config.Config;
import com.telusko.controller.Weblayer;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Weblayer webBean = container.getBean(Weblayer.class);
		webBean.disp();
		
		Config configbean = (Config) container.getBean(Config.class);
		configbean.disp();
	}

}
