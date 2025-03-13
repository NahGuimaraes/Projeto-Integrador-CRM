package com.generation.CRM.repository;

import java.util.List;

import com.generation.CRM.model.ConvenioModel;

import jakarta.validation.Valid;

public interface ConvenioRepository {

	List<ConvenioModel> findAll();

	Object save(@Valid ConvenioModel convenio);

	Object findAll();

}
