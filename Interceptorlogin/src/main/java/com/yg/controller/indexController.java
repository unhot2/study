package com.yg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yg.dto.userDTO;
import com.yg.service.loginService;

@Controller
public class indexController {

	@Autowired
	@Qualifier("service")
	loginService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}

	@RequestMapping("login")
	public String login(userDTO dto, Model model) {
		model.addAttribute("user",service.login(dto));
		return "login";
	}

}
