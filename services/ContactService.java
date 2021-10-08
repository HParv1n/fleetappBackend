package com.ph.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ph.fleetapp.models.Contact;
import com.ph.fleetapp.repositories.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;
	

	public List<Contact> getContacts(){
		return contactRepository.findAll();
	}	
	
	
	public Optional<Contact> findById(int id) {
		return contactRepository.findById(id);
	}	
	
	
	public void delete(int id) {
		contactRepository.deleteById(id);
	}
	
	
	public void save(Contact contact) {
		contactRepository.save(contact);
	}

}
