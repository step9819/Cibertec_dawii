package com.dawii.primer.examen.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dawii.primer.examen.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Integer> {

}
