package com.service.base.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.base.model.Cliente;
import com.service.base.service.ClienteService;

@CrossOrigin
@RestController("/clientes")
public class ClienteResource {
	 
	@Autowired
	private ClienteService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
		return ResponseEntity.ok(service.save(cliente));
	}

	public ClienteService getService() {
		return service;
	}

	public void setService(ClienteService service) {
		this.service = service;
	}
}
