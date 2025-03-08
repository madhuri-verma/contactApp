package com.example.demo.service;

import com.example.demo.entity.Contact;

public interface ContactService {

	boolean saveContact(Contact contact);

	Contact getById(Integer cid);

	boolean deleteContact(Integer cid);

}
