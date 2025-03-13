package com.generation.CRM.repository;

import java.util.List;

import com.generation.CRM.model.Convenio;

import jakarta.validation.Valid;

public interface ConvenioRepository {

	List<Convenio> findAll();

	Object save(@Valid Convenio convenio);

	Object findAll();

}
