package com.capgemini.batatas.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.batatas.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}