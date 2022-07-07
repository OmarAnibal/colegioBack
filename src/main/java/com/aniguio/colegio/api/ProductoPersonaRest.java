package com.aniguio.colegio.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniguio.colegio.model.Persona;
import com.aniguio.colegio.model.ProductoPersona;
import com.aniguio.colegio.service.IPersonaService;
import com.aniguio.colegio.service.IProductoPersonaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/productopersona")
public class ProductoPersonaRest {

	
	@Autowired
	private IProductoPersonaService service;

	@GetMapping("")
	public List<ProductoPersona> listarTodos() {
		return service.listarTodos();
	}
	
	@GetMapping("{id}")
	public ProductoPersona listarPorId(@PathVariable int id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("")
	public void registrar(@RequestBody ProductoPersona entidad) {
		service.registrar(entidad);
	}
	
	@PutMapping("")
	public void actualizar(@RequestBody ProductoPersona entidad) {
		service.actualizar(entidad);
	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);
	}
}
