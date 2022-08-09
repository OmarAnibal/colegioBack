package com.aniguio.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aniguio.colegio.model.Pais;

@Repository
public interface IPaisRepository extends IGenericRepo<Pais, Integer>  {

}
