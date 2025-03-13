package com.generation.CRM.repository;

import java.util.List;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.CRM.model.Convenio;



public interface ConvenioRepository extends JpaRepository<Convenio, Long> {

	public List <Convenio> findAllByPrecoContainingIgnoreCase(@Param("preco") double preco);
=======
import com.generation.CRM.model.ConvenioModel;

import jakarta.validation.Valid;

public interface ConvenioRepository {

	List<ConvenioModel> findAll();

	Object save(@Valid ConvenioModel convenio);

	Object findAll();

>>>>>>> fa156a0123ae3d25130a65842037afbfb566344a
}
