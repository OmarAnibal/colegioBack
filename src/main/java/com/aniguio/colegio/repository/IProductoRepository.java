package com.aniguio.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aniguio.colegio.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
