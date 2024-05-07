package com.telusko.services;

public class BlueDart implements DeliveryService {
	
	static
	 {
		 System.out.println("BlueDart class loaded");
	 }
	 
	 public BlueDart()
	 {
		 System.out.println("BlueDart bean is created");
	 }

	@Override
	public Boolean deliverProduct(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Product delivered with Bluedart service and amount paid is : "+ amount);
		return true;
	}

}
