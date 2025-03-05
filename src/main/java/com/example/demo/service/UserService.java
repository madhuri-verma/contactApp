package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

	boolean save(User user);

	boolean login(String email, String pass);

	User getUserByEmail(String email);

}
