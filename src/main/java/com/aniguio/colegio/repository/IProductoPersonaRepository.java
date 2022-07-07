package com.aniguio.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aniguio.colegio.model.ProductoPersona;

@Repository
public interface IProductoPersonaRepository extends JpaRepository<ProductoPersona, Integer> {

}
