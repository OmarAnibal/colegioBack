package com.aniguio.colegio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniguio.colegio.model.Departamento;
import com.aniguio.colegio.model.Pais;
import com.aniguio.colegio.repository.IDepartamentoRepository;
import com.aniguio.colegio.repository.IPaisRepository;
import com.aniguio.colegio.service.IDepartamentoService;
import com.aniguio.colegio.service.IPaisServices;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Autowired
	private IDepartamentoRepository repo;
	
	@Autowired
	private IPaisServices servicePais;

	@Override
	public List<Departamento> listarTodos() {
		return repo.findAll();
	}

	@Override
	public Departamento listarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(Departamento entidad) {
		repo.save(entidad);
	}

	@Override
	public void actualizar(Departamento entidad) {
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Departamento> listarPorPais(int id) {
		
		Pais pais = servicePais.listarPorId(id);
		return repo.findByPais(pais);
	}

	

}
