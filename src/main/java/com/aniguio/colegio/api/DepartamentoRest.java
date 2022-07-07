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

import com.aniguio.colegio.model.Departamento;
import com.aniguio.colegio.service.IDepartamentoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/departamento")
public class DepartamentoRest {
	
	@Autowired
	private IDepartamentoService service;
	
	@GetMapping("")
	public List<Departamento> listarTodos(){
		return service.listarTodos();
	}
	
	
	@GetMapping("{id}")
	public Departamento listarPorId(@PathVariable int id ) {
		return service.listarPorId(id);
	}
	
	@GetMapping("lista-por-pais/{id}")
	public List<Departamento> listarPorPaisId(@PathVariable int id ) {
		return service.listarPorPais(id);
	}
	
	@PostMapping("")
	public void registrar(@RequestBody Departamento entidad ) {
		service.registrar(entidad);
	}
	
	@PutMapping("")
	public void actualizar(@RequestBody Departamento entidad) {
		service.actualizar(entidad);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);
	}
	
	
	
	
	
	

}
