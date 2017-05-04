package com.msmata.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		return "welcome";
	}

	@RequestMapping(value="/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		return "welcome";
	}

}
