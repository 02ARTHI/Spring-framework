package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.QuizDao;
import com.example.demo.dao.questiondao;
import com.example.demo.model.QuestionWrapper;
import com.example.demo.model.Quiz;
import com.example.demo.model.questions;

@Service
public class QuizService {
	
	@Autowired
	private QuizDao quizDao;

	@Autowired
	private questiondao ques;
	
	public ResponseEntity<String> createQuizFomQuestions(String category, int num, String title) {
		
		List<questions> question= ques.createAQuizWithNumOfQues(category,num);
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(question);
		quizDao.save(quiz);
		return new ResponseEntity<>("SUCCESS",HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
		Optional<Quiz> quiz = quizDao.findById(id);
		List<questions> quesFromDB = quiz.get().getQuestions();
		List<QuestionWrapper> quesForUser = new ArrayList<>();
		
		return new ResponseEntity<>(quesForUser,HttpStatus.CREATED);
	}

}
