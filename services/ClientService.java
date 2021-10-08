package com.ph.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ph.fleetapp.models.Client;
import com.ph.fleetapp.repositories.ClientRepositroy;

@Service
public class ClientService {

	@Autowired
	private ClientRepositroy clientRepository;
	
	public List<Client> getClients(){
		return clientRepository.findAll();
	}
	
	public void save(Client client) {
		clientRepository.save(client);
	}
	
	public Optional<Client> findById(int id) {
		return clientRepository.findById(id);
	}
	
	public void delete(Integer id) {
		clientRepository.deleteById(id);
	}

}
