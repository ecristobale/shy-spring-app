package com.ecristobale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/negThoughts")
public class NegThoughtsController {

	@GetMapping("/identifying")
	public String concepts() {
		return "/negThoughts/identifying";
	}
}
