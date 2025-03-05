package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class APIController {
	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}

	@GetMapping("/register")
	public String register() {
		return "index.jsp";
	}

	@GetMapping("/home")
	public String home() {
		return "home.jsp";
	}
}
