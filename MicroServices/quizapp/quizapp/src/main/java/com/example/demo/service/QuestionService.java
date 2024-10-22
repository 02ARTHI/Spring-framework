package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.questiondao;
import com.example.demo.model.questions;

@Service
public class QuestionService {

	@Autowired
	private questiondao ques;

	public ResponseEntity<List<questions>> getAllQuestions() {
		try
		{
		return new ResponseEntity<>(ques.findAll(), HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<List<questions>> getByCategory(String category) {
		try
		{
			return new ResponseEntity<>(ques.findByCategory(category),HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
		
	}

	public ResponseEntity<String> addQuestion(questions ques2) {
		ques.save(ques2);
		return new ResponseEntity<>("success",HttpStatus.CREATED);
	}

}
