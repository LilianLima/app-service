package com.service.base.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.base.model.Cliente;
import com.service.base.repository.IClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private IClienteRepository repository;

	public Cliente save(Cliente cliente) {
		return repository.save(cliente);
	}
	
	public Iterable<Cliente> findAll(){
		return repository.findAll();
	}
	
	public IClienteRepository getRepository() {
		return repository;
	}

	public void setRepository(IClienteRepository repository) {
		this.repository = repository;
	}
}
