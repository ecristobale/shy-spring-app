package com.ecristobale.service;

import java.util.List;

import com.ecristobale.entity.InitialTestWrapper;
import com.ecristobale.entity.Question;

public interface InitialTestService {

	public InitialTestWrapper getInitialTest();

	public String getInitialTestResult(int totalPunctuation);

	public int getTotalPunctuation(List<Question> questions);
}
