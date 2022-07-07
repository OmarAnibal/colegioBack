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


@Entity
@Data
@Table(name = "producto_persona")

public class ProductoPersona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "pro_per_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name= "per_id")
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name= "pro_id")
	private Producto producto;
}
