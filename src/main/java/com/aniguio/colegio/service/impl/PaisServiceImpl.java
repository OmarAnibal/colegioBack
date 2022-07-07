package com.aniguio.colegio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniguio.colegio.model.Pais;
import com.aniguio.colegio.repository.IPaisRepository;
import com.aniguio.colegio.service.IPaisServices;

@Service
public class PaisServiceImpl implements IPaisServices {
	
	@Autowired
	private IPaisRepository repo;
	
	@Override
	public List<Pais> listarTodos() {
		return repo.findAll();
	}

	@Override
	public Pais listarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(Pais entidad) {
		repo.save(entidad);
	}

	@Override
	public void actualizar(Pais entidad) {
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}

}
