package com.ecristobale.dao;

import java.util.Arrays;

import org.springframework.stereotype.Repository;

import com.ecristobale.entity.InitialTestWrapper;
import com.ecristobale.entity.Question;

@Repository
public class InitialTestDAOImpl implements InitialTestDAO{

	@Override
	public InitialTestWrapper getInitialTest() {
		// Access to DB, now it is mocked
		return new InitialTestWrapper(Arrays.asList(new Question("Pregunta01"), new Question("Pregunta02")));
	}
}
