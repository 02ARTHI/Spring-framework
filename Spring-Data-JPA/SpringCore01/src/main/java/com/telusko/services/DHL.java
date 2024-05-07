package com.telusko.services;

public class DHL implements DeliveryService {
	
	static
	 {
		 System.out.println("DHL class loaded");
	 }
	 
	 public DHL()
	 {
		 System.out.println(" DHL bean is created");
	 }

	@Override
	public Boolean deliverProduct(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Product delivered with DHL service and amount paid is : "+ amount);
		return true;
	}

}
