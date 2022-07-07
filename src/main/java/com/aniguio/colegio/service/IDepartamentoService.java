package com.aniguio.colegio.service;

import java.util.List;

import com.aniguio.colegio.model.Departamento;

public interface IDepartamentoService extends ICrudService<Departamento>{
	
	public List<Departamento> listarPorPais(int id);
}
