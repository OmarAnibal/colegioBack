package com.aniguio.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aniguio.colegio.model.Persona;

@Repository
public interface IPersonaRepository extends IGenericRepo<Persona, Integer>{

}
