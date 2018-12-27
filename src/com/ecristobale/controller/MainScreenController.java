package com.ecristobale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecristobale.service.InitialTestService;

@Controller
@RequestMapping("/test")
public class MainScreenController {

	@Autowired
	InitialTestService initialTestService;
	
	@GetMapping("/initialTest")
	public String mainScreen(Model theModel) {
		// Load questions to the model
		theModel.addAttribute("questions", initialTestService.getInitialTest());
		return "/test/initialTest";
	}
}
