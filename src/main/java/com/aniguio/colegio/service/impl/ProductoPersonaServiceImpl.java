package com.aniguio.colegio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniguio.colegio.model.ProductoPersona;
import com.aniguio.colegio.repository.IProductoPersonaRepository;
import com.aniguio.colegio.service.IProductoPersonaService;

@Service
public class ProductoPersonaServiceImpl implements IProductoPersonaService {

	@Autowired
	private IProductoPersonaRepository repo;

	@Override
	public List<ProductoPersona> listarTodos() {

		return repo.findAll();
	}

	@Override
	public ProductoPersona listarPorId(int id) {

		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(ProductoPersona entidad) {

		repo.save(entidad);

	}

	@Override
	public void actualizar(ProductoPersona entidad) {

		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {

		repo.deleteById(id);
	}

}
