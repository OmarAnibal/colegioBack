package com.aniguio.colegio.repository;

import org.springframework.stereotype.Repository;

import com.aniguio.colegio.model.Producto;

@Repository
public interface IProductoRepository extends IGenericRepo<Producto, Integer> {

}
