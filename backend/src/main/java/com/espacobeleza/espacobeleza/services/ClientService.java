package com.espacobeleza.espacobeleza.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espacobeleza.espacobeleza.entities.Client;
import com.espacobeleza.espacobeleza.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repo;
	
	public List<Client> findAll(){
		return repo.findAll();
	}
}
