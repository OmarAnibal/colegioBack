package com.aniguio.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aniguio.colegio.model.PrestamoBiblioteca;

@Repository
public interface IprestamoBibliotecaRepository extends IGenericRepo<PrestamoBiblioteca, Integer> {

}
