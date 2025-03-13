package com.generation.CRM.repository;

import java.util.List;

import com.generation.CRM.model.CategoriaModel;

import jakarta.validation.Valid;

public interface CategoriaRepository {

	List<CategoriaModel> findAll();

	Object save(@Valid CategoriaModel categoria);

	Object findAll();

}
