package com.ecristobale.utils;

import java.util.List;

import com.ecristobale.entity.Question;

public class InitialTestUtils {

	public static int calculateTotalPunctuation(List<Question> questions) {
		int totalPunctuation = 0;
		for(Question question:questions) {
			totalPunctuation += question.getPunctuation();
		}
		return totalPunctuation;
	}
}
