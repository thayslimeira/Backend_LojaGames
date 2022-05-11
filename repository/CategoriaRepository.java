package com.lojagames.lojagames.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lojagames.lojagames.model.Categoria;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	


	
}
