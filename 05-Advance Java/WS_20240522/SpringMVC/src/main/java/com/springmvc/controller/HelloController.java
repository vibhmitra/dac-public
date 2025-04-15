package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")	// This specifies that when User request this path response with this method.
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Welcome to Spring MVC! He-Haww!!!! :P");
		return "hello";	// return the whole method to the hello.jsp
	}
}