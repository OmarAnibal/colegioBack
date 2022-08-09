package com.aniguio.colegio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "pais")
public class Pais {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name= "pais_id")
	private int id;
	
	@Column(name = "pais_nombre", nullable = false )
	private String nombre;
	

}
