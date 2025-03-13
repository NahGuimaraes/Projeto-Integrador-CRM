package com.generation.CRM.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.CRM.model.Convenio;



public interface ConvenioRepository extends JpaRepository<Convenio, Long> {

	public List <Convenio> findAllByPrecoContainingIgnoreCase(@Param("preco") double preco);
}
