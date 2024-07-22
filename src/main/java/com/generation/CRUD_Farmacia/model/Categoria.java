package com.generation.CRUD_Farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 5, max = 15, message = "O tamanho do atributo Nome deve ser entre 5 e 15 caracteres!")
	@NotBlank (message = "O atributo Nome não pode estar vazio!")
	private String nome;
	
	@Size(min = 10, max = 20, message = "O tamanho do atributo Descrição deve ser entre 10 e 20 caracteres!")
	@NotBlank (message = "O atributo Descrição não pode estar vazio!")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
