package com.aniguio.colegio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="marcas")
public class Marca {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id_marca")
	private int id;
	
	@Column(name="nombres")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name= "persona_id")
	private Persona persona;
	
	
	
	
	
	
	
		
}
