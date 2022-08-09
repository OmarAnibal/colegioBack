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
import com.aniguio.colegio.model.TipoIdentificacion;
import com.aniguio.colegio.service.ITipoIdentificacionService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/tipoidentificacion")
public class TipoIdentificacionRest {

	
	@Autowired
	private ITipoIdentificacionService service;

	@GetMapping("")
	public List<TipoIdentificacion> listarTodos() {
		System.out.println(service.listarTodos());
		return service.listarTodos();
	}
	
	@GetMapping("{id}")
	public TipoIdentificacion listarPorId(@PathVariable int id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("")
	public void registrar(@RequestBody TipoIdentificacion entidad) {
		service.registrar(entidad);
	}
	
	@PutMapping("")
	public void actualizar(@RequestBody TipoIdentificacion entidad) {
		service.actualizar(entidad);
	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);
	}
}
