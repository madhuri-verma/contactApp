package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Contact;
import com.example.demo.entity.User;
import com.example.demo.service.ContactService;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/")
	public ModelAndView welcomePage() {
		
		ModelAndView mv = new ModelAndView("index.jsp");
		mv.addObject("user", new User());		
		return mv;
	}
	
	
	
	@PostMapping("/register")
	public ModelAndView register(User user) {
		
		boolean save = userService.save(user);
		
		ModelAndView mv = new ModelAndView();
		
		if(save) {
			mv.addObject("msg", "Registered successfully");
			mv.setViewName("login.jsp");
		}
		else {
			mv.addObject("msg", "Already Registered");
			mv.setViewName("index.jsp");
		}
		return mv;
	}
	
	@PostMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
		
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		boolean login = userService.login(email,pass);
		
		ModelAndView mv = new ModelAndView();
		if(login) {
			
			User user = userService.getUserByEmail(email);
			List<Contact> contact = user.getContacts();
			if(contact!=null) {
				
				mv.addObject("contacts", contact);
			}else {
				mv.addObject("msg", "No Data Found");
			}
			mv.setViewName("home.jsp");
		}
		else {
			mv.setViewName("login.jsp");
			mv.addObject("msg","invalid credentials");
		}
		return mv;
	}
	
}
