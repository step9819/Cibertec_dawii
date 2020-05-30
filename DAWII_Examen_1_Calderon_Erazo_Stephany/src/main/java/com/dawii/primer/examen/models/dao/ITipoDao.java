package com.dawii.primer.examen.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dawii.primer.examen.models.entity.Tipo;

public interface ITipoDao extends JpaRepository<Tipo, Integer> {

}
