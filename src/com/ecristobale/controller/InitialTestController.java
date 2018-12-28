package com.ecristobale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecristobale.entity.InitialTestWrapper;
import com.ecristobale.service.InitialTestService;

@Controller
@RequestMapping("/test")
public class InitialTestController {

	@Autowired
	InitialTestService initialTestService;
	
	@GetMapping("/initialTest")
	public String initialTest(Model theModel) {
		// Load questions to the model
		theModel.addAttribute("initialTestWrapper", initialTestService.getInitialTest());
		return "/test/initialTest";
	}
	
	@PostMapping("/initialTestResult")
	public String initialTestResult(@ModelAttribute("initialTestWrapper")
			InitialTestWrapper testWrapper, Model theModel) {
		int totalPunctuation = initialTestService.getTotalPunctuation(testWrapper.getQuestionsList());
		// Load the calculated result to the model and the test result
		theModel.addAttribute("totalPunctuation", totalPunctuation);
		theModel.addAttribute("initialTestResult", initialTestService.getInitialTestResult(totalPunctuation));
		return "/test/initialTestResult";
	}
}
