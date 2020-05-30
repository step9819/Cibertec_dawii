package com.dawii.primer.examen.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dawii.primer.examen.models.dao.IClienteDao;
import com.dawii.primer.examen.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clientedao;

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clientedao.save(cliente);
	}

}
