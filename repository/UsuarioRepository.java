package com.lojagames.lojagames.repository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lojagames.lojagames.model.Usuario;


@Repository
public interface UsuarioRepository  extends JpaRepository <Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}
