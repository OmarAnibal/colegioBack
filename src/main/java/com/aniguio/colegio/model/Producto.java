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
@Table (name = "producto")
public class Producto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "pro_id")
	private int id;
	
	@Column(name= "pro_nombre")
	private String nombre;
	
	@Column(name="pro_proveedor")
	private String proveedor;
	
	@Column(name= "pro_descripcion")
	private String descripcion;
	
	@Column(name= "pro_precio")
	private double precio;
	
	@Column(name = "pro_cantidad")
	private int cantidad;
	
	

}
