package com.ecristobale.entity;

public class Question {

	String question;
	int punctuation;
	
	public Question() {}
	
	public Question(String question) {
		this.question = question;
		//this.punctuation = punctuation;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getPunctuation() {
		return punctuation;
	}

	public void setPunctuation(int punctuation) {
		this.punctuation = punctuation;
	}
}
