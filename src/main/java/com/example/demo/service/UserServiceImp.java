package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;
	
	
}
