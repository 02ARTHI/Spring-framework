package com.telusko.services;

public class FedEx implements DeliveryService {
	
	static
	 {
		 System.out.println("fedex class loaded");
	 }
	 
	 public FedEx()
	 {
		 System.out.println("fedex bean is created");
	 }

	@Override
	public Boolean deliverProduct(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Product delivered with fedex service and amount paid is : "+ amount);
		return true;
	}

}
