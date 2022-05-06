package com.lojagames.lojagames.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generaton.lojadegames.model.Produto;

@Repository
public class ProdutoRepositorio extends JpaRepository<Produto, Long>{
	
		public List <Produto> findAllByTituloContainingIgnoreCase (String titulo);
}
