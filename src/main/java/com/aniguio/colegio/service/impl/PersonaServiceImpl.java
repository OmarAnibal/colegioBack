package com.aniguio.colegio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniguio.colegio.model.Persona;
import com.aniguio.colegio.repository.IPersonaRepository;
import com.aniguio.colegio.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepository repo;
	
	@Override
	public List<Persona> listarTodos() {

		return repo.findAll();
	}

	@Override
	public Persona listarPorId(int id) {

		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(Persona entidad) {
		repo.save(entidad);
		
	}

	@Override
	public void actualizar(Persona entidad) {
		repo.save(entidad);
		
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}

}
