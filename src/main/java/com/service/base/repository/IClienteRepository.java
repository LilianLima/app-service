package com.service.base.repository;

import org.springframework.data.repository.CrudRepository;

import com.service.base.model.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Long> {
}
