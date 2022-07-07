package com.aniguio.colegio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniguio.colegio.model.Producto;
import com.aniguio.colegio.repository.IProductoRepository;
import com.aniguio.colegio.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository repo;

	@Override
	public List<Producto> listarTodos() {

		return repo.findAll();
	}

	@Override
	public Producto listarPorId(int id) {

		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(Producto entidad) {
		repo.save(entidad);

	}

	@Override
	public void actualizar(Producto entidad) {
		repo.save(entidad);

	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);

	}

}
