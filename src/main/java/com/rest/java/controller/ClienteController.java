package com.rest.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.rest.java.controller.entity.ClienteRepository;
import com.rest.java.model.Cliente;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	@PostMapping
	public Cliente criarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);		
	}
	
	@GetMapping
	public List <Cliente> buscarCliente(){
		return clienteRepository.findAll();
		
	}
	
	@GetMapping(path = {"/{id}"})
	public Cliente buscarPorId(@PathVariable long id){
	   return clienteRepository.findById(id).get();
	}
	
	@DeleteMapping(path = {"/{id}"})
	public void deletar(@PathVariable long id) {
		clienteRepository.deleteById(id);
	}
	
	
	
}


