package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ContactDao;

@Service
public class ContactServiceImp implements ContactService {

	@Autowired
	private ContactDao contactDao;
	
}
