package com.cdac.zeezee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.zeezee.bean.LoginBean;
import com.cdac.zeezee.service.LoginService;


@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginpage() {

		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginpage(@ModelAttribute("login") LoginBean loginBean) {

		return "login";
	}

	@RequestMapping(value = "/submitlogin", method = RequestMethod.POST)
	public String checkLoginDetails(@ModelAttribute("login") LoginBean loginBean) {

		// BindingResult is only used in case of annotation-based validations (@Valid)
		return service.validate(loginBean) ? "success" : "invalid";
	}
}
