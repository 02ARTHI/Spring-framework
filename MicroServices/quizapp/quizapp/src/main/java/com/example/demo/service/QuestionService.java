package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.questiondao;
import com.example.demo.model.questions;

@Service
public class QuestionService {

	@Autowired
	private questiondao ques;

	public List<questions> getAllQuestions() {
		// TODO Auto-generated method stub
		return ques.findAll();
	}

}
