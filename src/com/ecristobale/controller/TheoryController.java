package com.ecristobale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/theory")
public class TheoryController {

	@GetMapping("/concepts")
	public String concepts() {
		return "/theory/concepts";
	}
}
