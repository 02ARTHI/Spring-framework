package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.services.FedEx;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Amazon obj = new Amazon();
//       obj.setService(new FedEx());
//       obj.deliveryTheProduct(400.09);
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Amazon amz = container.getBean(Amazon.class);
		Boolean status = amz.deliveryTheProduct(400.0);
		if(status)
		{
			System.out.println("product delivered");
		}
		else
		{
			System.out.println("product not delivered");
		}
		
		
	}

}
