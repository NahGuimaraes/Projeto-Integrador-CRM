package com.generation.farmacia.model;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
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

	    @NotBlank(message = "O atributo nome é obrigatório")
	    @Size(min = 3, max = 100, message = "O atributo nome deve conter entre 3 e 100 caracteres")
	    private String nome;

	    @NotBlank(message = "O atributo descricao é obrigatório")
	    @Size(min = 10, max = 1000, message = "O atributo descricao deve conter entre 10 e 1000 caracteres")
	    private String descricao;

	    @NotNull(message = "O atributo preco é obrigatório")
	    private Double preco;

	    @ManyToOne
	    @JsonIgnoreProperties("produtos")
	    private Categoria categoria;

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

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public Double getPreco() {
	        return preco;
	    }

	    public void setPreco(Double preco) {
	        this.preco = preco;
	    }

	    public Categoria getCategoria() {
	        return categoria;
	    }

	    public void setCategoria(Categoria categoria) {
	        this.categoria = categoria;
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
