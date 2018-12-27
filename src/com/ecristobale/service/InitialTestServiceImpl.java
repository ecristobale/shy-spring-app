package com.ecristobale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecristobale.dao.InitialTestDAO;
import com.ecristobale.entity.Question;

@Service
public class InitialTestServiceImpl implements InitialTestService{

	@Autowired
	InitialTestDAO initialTestDAO;
	
	//@Transactional <-- when ORM is implemented
	@Override
	public Question[] getInitialTest() {
		return initialTestDAO.getInitialTest();
	}
}
