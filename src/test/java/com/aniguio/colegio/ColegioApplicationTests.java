package com.aniguio.colegio;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aniguio.colegio.model.Persona;
import com.aniguio.colegio.service.IPersonaService;

@SpringBootTest
class ColegioApplicationTests {


	@Autowired
	private IPersonaService servicePersona;

	@Test
	void contextLoads() {
		
		
		
		List<Persona> listaPersona = servicePersona.listarTodos();
		for (Persona persona : listaPersona) {

			System.out.println(persona.toString());
		}

	

	}

}
