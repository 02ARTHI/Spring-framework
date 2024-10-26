package com.example.demo.model;

public class QuestionWrapper {

	private int id;
	
	
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String questiontitle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getQuestiontitle() {
		return questiontitle;
	}
	public void setQuestiontitle(String questiontitle) {
		this.questiontitle = questiontitle;
	}
	@Override
	public String toString() {
		return "QuestionWrapper [id=" + id + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3
				+ ", option4=" + option4 + ", questiontitle=" + questiontitle + "]";
	}
	public QuestionWrapper(int id, String option1, String option2, String option3, String option4,
			String questiontitle) {
		super();
		this.id = id;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.questiontitle = questiontitle;
	}
	public QuestionWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
