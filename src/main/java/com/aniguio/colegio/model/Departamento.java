package com.aniguio.colegio.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Data
@Entity
@Table(name= "departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dep_id")
	private int id;
	
	@Column(name = "dep_nombre", nullable = false)
	private String nombre;
	
	
	@ManyToOne // la relacion es con pais
	@JoinColumn(name = "pais_id")
	private Pais pais;
	
	
	

}
