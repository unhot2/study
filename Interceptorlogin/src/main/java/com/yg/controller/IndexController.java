package com.yg.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yg.dto.NoticeDTO;
import com.yg.dto.UserDTO;
import com.yg.service.LoginService;

@Controller
public class IndexController {

	@Autowired
	// service, dao가 interface를 구현하지 않았기 때문에 Qualifier로 어떤클래스를 찾는지 등록
	@Qualifier("service")
	LoginService service;

	@RequestMapping(value = {"/","/interceptor"}, method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping("login")
	public String loginForm() {
		return "login/loginForm";
	}

	@RequestMapping(value = "loginProcess", method = RequestMethod.POST)
	public String loginProcess(HttpSession session, UserDTO dto) {
		String returnURL = "";
		if (session.getAttribute("login") != null) {
			session.removeAttribute("login");
		}
		UserDTO user = service.login(dto);
		if (user != null) {
			session.setAttribute("login", user);
			returnURL = "redirect:listPage";
		} else {
			
			returnURL = "redirect:login";
		}
		return returnURL;
	}

	@RequestMapping("listPage")
	public String listPage(Model model) {
		List<NoticeDTO> list = service.list();
		model.addAttribute("pagelist", list);
		return "/board/listPage";
	}

	@RequestMapping("write")
	public String write(HttpServletResponse response) throws IOException {
		return "/board/write";
	}
	
	@RequestMapping("detail")
	public String detail(NoticeDTO dto,Model model) {
		model.addAttribute("detail",service.detail(dto));
		return "/board/detail";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:listPage";
	}

}
