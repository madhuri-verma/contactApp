package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class APIController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}

	@GetMapping("/register")
	public String register() {
		return "index.jsp";
	}

	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		
		HttpSession session = request.getSession(false);
		Integer id = (Integer) session.getAttribute("uid");
		
		System.out.println(id+ "+++++++++++++++++++++++++++ID ++++++++++++++++++++");
		
		User user = userService.getById(id);
		System.out.println(user.getContacts() + "++++++++++++++++++++++++ user  ++++++++++++++++++++");
		
		ModelAndView mv = new ModelAndView("home.jsp");
		mv.addObject("contacts", user.getContacts());

		return "home.jsp";
	}
}
