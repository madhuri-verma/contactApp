package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.UserRepository;

@Repository
public class UserDao {

	@Autowired
	private UserRepository userRepo;
}
