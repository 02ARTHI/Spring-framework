package com.telusko.main;

import com.telusko.services.DeliveryService;

public class Amazon {
   
	 private DeliveryService service;
	 
	 static
	 {
		 System.out.println("amzon class loaded");
	 }
	 
	 public Amazon()
	 {
		 System.out.println("amazon bean is created");
	 }
	 
	 

	public Amazon(DeliveryService service) {
		super();
		this.service = service;
	}



	public void setService(DeliveryService service) {
		this.service = service;
	} 
	
	public Boolean deliveryTheProduct(Double amount)
	  {
		return service.deliverProduct(amount);
	
	  }
}
