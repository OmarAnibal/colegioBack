package com.aniguio.colegio.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniguio.colegio.model.Departamento;
import com.aniguio.colegio.model.Municipio;
import com.aniguio.colegio.service.IMunicipioService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/municipio")
public class MunicipioRest {
	
	@Autowired
	private IMunicipioService service;
	
	@GetMapping("")
	public List<Municipio> listarTodos(){
		return service.listarTodos();	
		}
	
	@GetMapping("listar-por-departamento/{id}")
	public List<Municipio> listarPorDepartamentoId(@PathVariable int id){
		return service.listarPorDepartamentoId(id);
	}
	
	
	
	

}
