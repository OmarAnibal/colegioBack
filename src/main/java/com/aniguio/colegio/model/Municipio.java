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
@Table (name = "municipio")
public class Municipio {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="mun_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "dep_id", nullable = false)
	private Departamento departamento;
	
	@Column(name = "mun_nombre", nullable = false) 
	private String nombre;
	
	

	
	
}
