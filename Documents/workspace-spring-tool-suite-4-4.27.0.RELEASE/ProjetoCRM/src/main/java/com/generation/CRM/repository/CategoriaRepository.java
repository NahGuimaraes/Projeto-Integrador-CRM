package com.generation.CRM.repository;

import java.util.List;

import com.generation.CRM.model.Categoria;

import jakarta.validation.Valid;

public interface CategoriaRepository {

	List<Categoria> findAll();

	Object save(@Valid Categoria categoria);

	Object findAll();

}
