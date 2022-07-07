package com.aniguio.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aniguio.colegio.model.TipoIdentificacion;

@Repository
public interface ITipoIdentificacionRepository extends JpaRepository <TipoIdentificacion, Integer> {

}
