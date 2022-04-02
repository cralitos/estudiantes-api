package com.progra3.datos.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progra3.datos.entities.ClienteEntity;
import com.progra3.datos.repositories.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteRepository repository;
	
	@GetMapping
	public Iterable<ClienteEntity> findAll(){
		Iterable<ClienteEntity> listaClientes = repository.findAll();
		System.out.println("test");
		return listaClientes;
	}
	
	@PostMapping
	public ClienteEntity createCliente(@RequestBody ClienteEntity cliente) {
		return repository.save(cliente);
	}

}
