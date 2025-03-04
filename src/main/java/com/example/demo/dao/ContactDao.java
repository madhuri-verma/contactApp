package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.ContactRepository;

@Repository
public class ContactDao {
	
	@Autowired
	private ContactRepository contactRepo;
	
}
