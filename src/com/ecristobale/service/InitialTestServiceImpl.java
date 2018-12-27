package com.ecristobale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecristobale.dao.InitialTestDAO;
import com.ecristobale.entity.InitialTestWrapper;
import com.ecristobale.entity.Question;
import com.ecristobale.utils.InitialTestUtils;

@Service
public class InitialTestServiceImpl implements InitialTestService{

	@Autowired
	InitialTestDAO initialTestDAO;
	
	//@Transactional <-- when ORM is implemented
	@Override
	public InitialTestWrapper getInitialTest() {
		return initialTestDAO.getInitialTest();
	}

	@Override
	public String getInitialTestResult(int totalPunctuation) {
		return "Resultado del test inicial";
	}

	@Override
	public int getTotalPunctuation(List<Question> questions) {
		return InitialTestUtils.calculateTotalPunctuation(questions);
	}
}
