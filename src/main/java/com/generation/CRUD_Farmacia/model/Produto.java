package com.generation.CRUD_Farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size (min = 5, max = 25, message = "O atributo Nome deve ter entre 5 e 25 caracteres!")
	@NotBlank(message = "O atributo Nome não pode estar vazio!")
	private String nome;
	
	@Size (min = 10, max = 50, message = "O atributo Descrição deve ter entre 10 e 50 caracteres!")
	@NotBlank(message = "O atributo Descrição não pode estar vazio!")
	private String descricao;
	
	@Size (min = 5, max = 50, message = "O atributo Embalagem deve ter entre 5 e 15 caracteres!")
	@NotBlank(message = "O atributo Embalagem não pode estar vazio!")
	private String embalagem;
	
	private Double valor;
	
	@NotNull(message = "O Atributo estoque não pode estar vazio" )
	private int estoque;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public String getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}
