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

import com.aniguio.colegio.model.PrestamoBiblioteca;
import com.aniguio.colegio.service.IPrestamoBibliotecaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/prestamobiblioteca")
public class PrestamoBibliotecaRest {

	
	@Autowired
	private IPrestamoBibliotecaService service;
	
	@GetMapping("")
	public List<PrestamoBiblioteca> listarTodos(){
		return service.listarTodos();
	}
	
	@GetMapping("{id}")
	public PrestamoBiblioteca listarPorId(@PathVariable int id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("")
	public void registrar(@RequestBody PrestamoBiblioteca entidad) {
		service.registrar(entidad);
	}
	
	@PutMapping
	public void actualizar(@RequestBody PrestamoBiblioteca entidad) {
		service.actualizar(entidad);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);
	}
	


}
