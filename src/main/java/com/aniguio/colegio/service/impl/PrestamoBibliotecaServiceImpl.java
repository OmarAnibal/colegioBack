package com.aniguio.colegio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniguio.colegio.model.PrestamoBiblioteca;
import com.aniguio.colegio.repository.IprestamoBibliotecaRepository;
import com.aniguio.colegio.service.IPrestamoBibliotecaService;

@Service
public class PrestamoBibliotecaServiceImpl implements IPrestamoBibliotecaService {

	@Autowired
	private IprestamoBibliotecaRepository repo;

	@Override
	public List<PrestamoBiblioteca> listarTodos() {
		return repo.findAll();
	}

	@Override
	public PrestamoBiblioteca listarPorId(int id) {

		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(PrestamoBiblioteca entidad) {
		repo.save(entidad);

	}

	@Override
	public void actualizar(PrestamoBiblioteca entidad) {
		repo.save(entidad);

	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);

	}

}
