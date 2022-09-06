package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repositiories.ContactRepositiory;
@Service
public class ContactServiceImpl implements ContactService {
	
	
	@Autowired
	private ContactRepositiory contactRepo;
	

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
      
		
	}


	@Override
	public List<Contact> listContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}


	@Override
	public Contact getOneContact(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact; 
		
	}


	}



	


