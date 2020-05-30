package com.dawii.primer.examen.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.primer.examen.models.dao.ITipoDao;
import com.dawii.primer.examen.models.entity.Tipo;

@Service
public class TipoServiceImpl implements ITipoService {

	@Autowired
	private ITipoDao tipodao;
	
	@Override
	public List<Tipo> listTipo() {		
		return tipodao.findAll();
	}

}
