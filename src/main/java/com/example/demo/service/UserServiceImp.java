package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean save(User user) {
		Optional<User> data = userDao.findByEmail(user.getEmail());

		if (data.isPresent()) {
			return false;
		}

		boolean saved = userDao.save(user);

		return saved;
	}

	@Override
	public boolean login(String email, String pass) {
	Optional<User> user =	userDao.findByEmail(email);
	
	if(user.isPresent() && user.get().getPassword().equals(pass)) {
		return true;
	}
		return false;
	}

}
