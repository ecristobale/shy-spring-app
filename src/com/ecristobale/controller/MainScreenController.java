package com.ecristobale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainScreenController {

	@GetMapping
	public String mainScreen(Model theModel) {
		theModel.addAttribute("helloWorld", "hello world!");
		return "index";
	}
}
