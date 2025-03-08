package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ContactDao;
import com.example.demo.entity.Contact;

@Service
public class ContactServiceImp implements ContactService {

	@Autowired
	private ContactDao contactDao;

	@Override
	public boolean saveContact(Contact contact) {
		
		boolean save = contactDao.saveContact(contact);
		
		return save;
	}

	@Override
	public Contact getById(Integer cid) {
		Contact contact = contactDao.getById(cid);
		return contact;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		boolean deleted = contactDao.deleteContact(cid);
		return deleted;
	}
	
}
