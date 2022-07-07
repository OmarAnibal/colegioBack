package com.aniguio.colegio.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniguio.colegio.model.Departamento;
import com.aniguio.colegio.model.Producto;
import com.aniguio.colegio.service.IProductoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/producto")
public class ProductoRest {
	
	@Autowired
	private IProductoService service;

	
	@GetMapping("")
	public List<Producto> listarTodos(){
		return service.listarTodos();
	}
	
	@GetMapping("{id}")
	public Producto listarPorId(@PathVariable int id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("")
	public void registrar(Producto entidad) {
		service.registrar(entidad);
	}
	
	@PutMapping("")
	public void actualizar(Producto entidad) {
		service.actualizar(entidad);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);
	}
	
	
	
	
	
	
	
	
	
}
