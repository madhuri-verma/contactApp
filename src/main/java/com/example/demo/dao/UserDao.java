package com.example.demo.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Repository
public class UserDao {

	@Autowired
	private UserRepository userRepo;

	public Optional<User> findByEmail(String email) {

		return userRepo.findByEmail(email);
	}

	public boolean save(User user) {

		User saveUser = userRepo.save(user);

		return saveUser != null;
	}

	public User getById(Integer uid) {

		User user = userRepo.findById(uid).get();

		return user;
	}
}
