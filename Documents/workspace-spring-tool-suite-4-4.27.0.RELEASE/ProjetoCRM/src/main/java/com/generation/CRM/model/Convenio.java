package com.generation.CRM.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
@Table(name = "tb_convenio")
public class Convenio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    
    @NotBlank(message = "O nome do convenio é obrigatorio!")
    @Size(min = 5, max = 100)
    private String nome;
    
    @ManyToOne
    @JsonIgnoreProperties("convenio")
    private Tipo tipo;
    
    @NotNull(message = "O preco do convenio é obrigatorio!")
    private BigDecimal preco;
    
    @NotBlank(message = "A cobertura é obrigatoria!")
    @Size(min = 15, max = 1000)
    private String cobertura;
    
    @NotBlank(message = "A acomodacao é obrigatoria!")
    @Size(min = 15, max = 1000)
    private String acomodacao;

    public Convenio() {
    }

    public Convenio(String nome, Tipo tipo, BigDecimal preco, String cobertura, String acomodacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.cobertura = cobertura;
        this.acomodacao = acomodacao;
    }

    // Getters e Setters
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

	public String getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(String acomodacao) {
		this.acomodacao = acomodacao;
	}
    
    
    
}