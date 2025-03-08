package com.example.demo.controller;

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
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@Autowired
	private ContactService contactService;

	@GetMapping("/add-contacts")
	public String addContacts() {
		return "contactAdd.jsp";
	}

	@PostMapping("/add-contacts")
	public ModelAndView addContacts(HttpServletRequest request, Contact contact) {

		HttpSession session = request.getSession(false);

		Integer uid = (Integer) session.getAttribute("uid");

		User user = userService.getById(uid);

		contact.setUser(user);

		boolean added = contactService.saveContact(contact);

		ModelAndView mv = new ModelAndView("home.jsp");
		mv.addObject("contacts", user.getContacts());
		if (added) {
			mv.addObject("msg", "New Contact added");
		} else {
			mv.addObject("msg", "failed adding Contact");
		}

		return mv;
	}
	
	@GetMapping("/delete")
	
	public ModelAndView deleteContact(@RequestParam String cid) {
		
		Integer id = Integer.parseInt(cid);
		
		ModelAndView mv = new ModelAndView("home.jsp");
		
		Contact contact = contactService.getById(id);
		
		mv.addObject("contacts", contact.getUser().getContacts());
		
		boolean deleted = contactService.deleteContact(id);
		
		
		if(deleted) {
			
			mv.addObject("msg", "Deleted");		
			
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
	
	@PostMapping("/update")
	public ModelAndView updateContact(Contact contacts) {
		
		Contact dbcontact = contactService.getById(contacts.getCid());
		dbcontact.setName(contacts.getName());
		dbcontact.setPhone(contacts.getPhone());
		dbcontact.setAdharNo(contacts.getAdharNo());
		
		ModelAndView mv = new ModelAndView("home.jsp");
		mv.addObject("contacts", dbcontact.getUser().getContacts());
		boolean updated = contactService.saveContact(dbcontact);
				
		if(updated) {
			mv.addObject("msg", "Data Updated");
		}
				
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
