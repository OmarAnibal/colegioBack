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
@Table(name = "persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "per_id")
	private int id;

	@Column(name = "per_nombre")
	private String nombre;

	@Column(name = "per_apellido")
	private String apellido;

	@Column(name = "per_direccion")
	private String direccion;

	@Column(name = "per_email")
	private String email;
	
	@Column(name="per_telefono")
	private String telefono;
	
	@Column(name="numero")
	private String numero;
	
	@ManyToOne
	@JoinColumn(name= "mun_id", nullable = false)
	private Municipio municipio;
	
	@ManyToOne
	@JoinColumn(name="ti_id", nullable = false)
	private TipoIdentificacion tipoIdentificacion;
	
	
}
