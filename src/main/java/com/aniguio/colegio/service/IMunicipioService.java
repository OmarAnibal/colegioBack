package com.aniguio.colegio.service;

import java.util.List;

import com.aniguio.colegio.model.Municipio;

public interface IMunicipioService extends ICrudService<Municipio> {
	
	public List<Municipio> listarPorDepartamentoId(int id);
	
}
