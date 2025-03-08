package com.example.demo.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Contact;
import com.example.demo.repo.ContactRepository;

@Repository
public class ContactDao {

	@Autowired
	private ContactRepository contactRepo;

	public boolean saveContact(Contact contact) {

		Contact saved = contactRepo.save(contact);

		return saved != null;
	}

	public Contact getById(Integer cid) {
		Contact contact = contactRepo.findById(cid).get();

		return contact;
	}

	public boolean deleteContact(Integer cid) {

		Optional<Contact> opt = contactRepo.findById(cid);
		if (opt.isPresent()) {
			contactRepo.deleteById(cid);
			return true;
		}

		return false;
	}

}
