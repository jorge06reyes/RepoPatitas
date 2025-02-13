package com.veterinaria.patitas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.veterinaria.patitas.entity.CitasEntity;


@Repository
public interface CitasReposity extends CrudRepository<CitasEntity, Integer>{
	
	List<CitasEntity> findAll();
}
