package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

	@RequestMapping("/hello")
	public ModelAndView firstPage() {
		return new ModelAndView("newwelcom");
	}

}
