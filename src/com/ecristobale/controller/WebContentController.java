package com.ecristobale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blogs")
public class WebContentController {

	@GetMapping("/sitios_web")
	public String concepts() {
		return "/blogs/sitios_web";
	}
}
