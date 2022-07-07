package com.aniguio.colegio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aniguio.colegio.model.Departamento;
import com.aniguio.colegio.model.Municipio;

@Repository
public interface IMunicipioRepository extends JpaRepository<Municipio, Integer> {

	public List<Municipio> findByDepartamento(Departamento departamento);
	
}
