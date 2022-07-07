package com.aniguio.colegio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aniguio.colegio.model.Departamento;
import com.aniguio.colegio.model.Municipio;
import com.aniguio.colegio.model.Pais;

@Repository
public interface IDepartamentoRepository extends JpaRepository<Departamento, Integer>{

	//findByOBJETO_O_VARIABLE_QUE_SE_QUIERE_BUSCAR Y RECIBE COMO PARAMETRO EL OBJETO O VARIABLE
	//Ex.
	//findByPais(Pais pais) --- findByNombre(String nombre)
	
	
	public List<Departamento> findByPais(Pais pais);
}
