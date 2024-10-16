package com.telusko.postg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Products")
@Data
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pid;
	private String pname;
	private Double pcost;

}
