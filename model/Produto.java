package com.lojagames.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produtos")
public class Produto {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O atributo título é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 5 e no máximo 100 caracteres. ")
	private String titulo;
	
	@Size (min=10, max = 1000)
	private String descricaoJogo;
	
	@NotBlank (message = "O preço do produto é obrigatório!")
	@Size (min=10, max = 300)
	private String valor;

	@ManyToOne
	@JsonIgnoreProperties ("produto")
	private Categoria categoria;
		
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricaoJogo() {
		return descricaoJogo;
	}

	public void setDescricaoJogo(String descricaoJogo) {
		this.descricaoJogo = descricaoJogo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
