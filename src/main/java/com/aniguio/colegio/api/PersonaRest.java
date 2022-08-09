package com.aniguio.colegio.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.aniguio.colegio.service.IPersonaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/persona")
public class PersonaRest {

	@Autowired
	private IPersonaService service;

	@GetMapping("")
	public ResponseEntity<List<Persona>> listarTodos() {
		List<Persona> lista = service.listarTodos();
		return new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Persona> listarPorId(@PathVariable("id") Integer id) {
		Persona per = service.listarPorId(id);
		return new ResponseEntity<Persona>(per, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<String> registrar(@RequestBody Persona p){
		service.registrar(p);
		return new ResponseEntity<String>("**", HttpStatus.CREATED);
	}
	
	@PutMapping("")
	public ResponseEntity<String> actualizar(@RequestBody Persona p) {
		service.actualizar(p);
		return new ResponseEntity<String>("**", HttpStatus.ACCEPTED);
	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);
	}
}
