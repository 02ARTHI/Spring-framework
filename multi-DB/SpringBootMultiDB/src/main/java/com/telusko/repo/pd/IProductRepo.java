package com.telusko.repo.pd;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.postg.model.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> 
{

}
