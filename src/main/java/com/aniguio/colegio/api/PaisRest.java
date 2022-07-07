package com.aniguio.colegio.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniguio.colegio.model.Pais;
import com.aniguio.colegio.service.IPaisServices;
import com.aniguio.colegio.service.ITipoIdentificacionService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/pais")
public class PaisRest {

	@Autowired
	private IPaisServices service;
	
	
	@GetMapping("")
	public List<Pais> listarTodos(){
		return service.listarTodos();
	}
	
	@GetMapping("{id}")
	public Pais listarPorId(@PathVariable int id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("")
	public void registrar(@RequestBody Pais entidad){
		service.registrar(entidad);
	}
	
	
	
	
}
