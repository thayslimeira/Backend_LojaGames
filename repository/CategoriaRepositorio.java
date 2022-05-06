package com.lojagames.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generaton.lojadegames.model.Categoria;

@Repository
public class CategoriaRepositorio  extends JpaRepository <Categoria, Long>  {

	public List <Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
}
