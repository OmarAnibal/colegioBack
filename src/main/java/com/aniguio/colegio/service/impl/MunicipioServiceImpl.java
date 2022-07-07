package com.aniguio.colegio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniguio.colegio.model.Departamento;
import com.aniguio.colegio.model.Municipio;
import com.aniguio.colegio.repository.IMunicipioRepository;
import com.aniguio.colegio.service.IDepartamentoService;
import com.aniguio.colegio.service.IMunicipioService;

@Service
public class MunicipioServiceImpl implements IMunicipioService {
	
	@Autowired
	private IDepartamentoService servicioDepartamento;
	
	@Autowired
	private IMunicipioRepository repo;

	@Override
	public List<Municipio> listarTodos() {
		return repo.findAll();
	}

	@Override
	public Municipio listarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(Municipio entidad) {
		repo.save(entidad);
	}

	@Override
	public void actualizar(Municipio entidad) {
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Municipio> listarPorDepartamentoId(int id) {
		
		Departamento departamento = servicioDepartamento.listarPorId(id);
		
		return repo.findByDepartamento(departamento);
	}

}
