package com.rest.java.controller.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.java.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
