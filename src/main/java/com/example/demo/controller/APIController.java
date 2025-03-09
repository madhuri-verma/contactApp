package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Contact;
import com.example.demo.entity.User;
import com.example.demo.service.ContactService;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class APIController {

	@Autowired
	private UserService userService;

	@Autowired
	private ContactService contactService;

	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}

	@GetMapping("/register")
	public String register() {
		return "index.jsp";
	}

	@GetMapping("/home")
	public ModelAndView home(HttpServletRequest request) {

		HttpSession session = request.getSession(false);
		Integer id = (Integer) session.getAttribute("uid");

		ModelAndView mv = new ModelAndView();
		if (id != null) {
			User user = userService.getById(id);

			mv.addObject("contacts", user.getContacts());
			mv.setViewName("home.jsp");
		} else {
			mv.addObject("msg", "User Is not logged in");
			mv.setViewName("login.jsp");
		}

		return mv;
	}

	@GetMapping("/update")
	public ModelAndView update(@RequestParam String cid) {

		Integer id = Integer.parseInt(cid);

		Contact contact = contactService.getById(id);

		ModelAndView mv = new ModelAndView("update.jsp");

		mv.addObject("contacts", contact);

		return mv;
	}

	@GetMapping("/add-contacts")
	public String addContacts() {
		return "contactAdd.jsp";
	}
}
