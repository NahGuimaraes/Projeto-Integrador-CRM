package com.generation.farmacia.model;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

	@Entity
	@Table(name = "tb_categorias")
	public class Categoria {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "O atributo nome é obrigatório")
	    @Size(min = 3, max = 100, message = "O atributo nome deve conter entre 3 e 100 caracteres")
	    private String nome;

	    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	    @JsonIgnoreProperties("categoria")
	    private List<Produto> produtos;

	    @CreationTimestamp
	    private LocalDateTime dataCriacao;

	    @UpdateTimestamp
	    private LocalDateTime dataAtualizacao;

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

	    public List<Produto> getProdutos() {
	        return produtos;
	    }

	    public void setProdutos(List<Produto> produtos) {
	        this.produtos = produtos;
	    }

	    public LocalDateTime getDataCriacao() {
	        return dataCriacao;
	    }

	    public void setDataCriacao(LocalDateTime dataCriacao) {
	        this.dataCriacao = dataCriacao;
	    }

	    public LocalDateTime getDataAtualizacao() {
	        return dataAtualizacao;
	    }

	    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
	        this.dataAtualizacao = dataAtualizacao;
	    }
	}

