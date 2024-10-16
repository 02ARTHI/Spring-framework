package com.telusko.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.mysql.model.Customer;
import com.telusko.postg.model.Product;
import com.telusko.repo.cx.ICustomerRepo;
import com.telusko.repo.pd.IProductRepo;

@RestController
public class MultiDbController 
{
	@Autowired
	private ICustomerRepo cxRepo;
	
	@Autowired
	private IProductRepo prodRepo;
	
	@PostMapping("/add-cx")
	public String registerCx(@RequestBody Customer cx)
	{
		cxRepo.save(cx);
		return "Customer is saved";
	}
	
	@PostMapping("/add-pd")
	public String registerCx(@RequestBody Product pd)
	{
		prodRepo.save(pd);
		return "Product info saved is saved";
	}
	
	@GetMapping("/getallcx")
	public List<Customer> fetchAllCx()
	{
		return cxRepo.findAll();
	}
	
	@GetMapping("/getallpd")
	public List<Product> fetchAllPd()
	{
		return prodRepo.findAll();
	}
	
	
	

}
