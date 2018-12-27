package com.ecristobale.dao;

import org.springframework.stereotype.Repository;

import com.ecristobale.entity.Question;

@Repository
public class InitialTestDAOImpl implements InitialTestDAO{

	@Override
	public Question[] getInitialTest() {
		// Access to DB, now it is mocked
		return new Question[] {new Question("Pregunta 01"), new Question("Pregunta 02")};
	}
}
