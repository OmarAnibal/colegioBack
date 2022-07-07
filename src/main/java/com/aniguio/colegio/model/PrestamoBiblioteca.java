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
@Table(name="prestamo_biblioteca")

public class PrestamoBiblioteca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pres_id")
	private int id;
	
	
	@Column(name = "pres_nombre")
	private String nombre;
	
	@Column(name="pres_autor")
	private String autor;
}
