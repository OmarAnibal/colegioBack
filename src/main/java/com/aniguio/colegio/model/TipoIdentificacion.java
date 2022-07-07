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
@Table(name = "tipo_identificacion")
public class TipoIdentificacion {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "ti_id")
	private int id;
	
	@Column(name= "ti_nombre", nullable = false)
	private String nombre;
	
	@Column(name = "ti_descripcion", nullable = false)
	private String descripcion;
	
}
