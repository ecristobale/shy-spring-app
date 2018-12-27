package com.ecristobale.entity;

import java.util.List;

public class InitialTestWrapper {

	private List<Question> questionsList = null;

	public InitialTestWrapper(List<Question> questionsList) {
		this.questionsList = questionsList;
	}

	public List<Question> getQuestionsList() {
		return questionsList;
	}

	public void setQuestionsList(List<Question> questionsList) {
		this.questionsList = questionsList;
	}
}
