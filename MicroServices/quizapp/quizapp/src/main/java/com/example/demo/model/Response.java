package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;


public class Response {
 
	private int id;
	private String responses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResponses() {
		return responses;
	}
	public void setResponses(String responses) {
		this.responses = responses;
	}
	public Response(int id, String responses) {
		super();
		this.id = id;
		this.responses = responses;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Response [id=" + id + ", responses=" + responses + "]";
	}
	
	
	
	
}
