package com.generation.CRM.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.CRM.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioRepository, Long> {

	    public Optional<UsuarioRepository> findByEmail(String email);

		public Object save(UsuarioModel usuario);

		public void setNome(String nome);

		public void setEmail(String email);

}
