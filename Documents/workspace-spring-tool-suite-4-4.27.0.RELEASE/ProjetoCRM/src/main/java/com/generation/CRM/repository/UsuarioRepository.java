package com.generation.CRM.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.CRM.model.Usuario;

public interface UsuarioRepository extends JpaRepository<UsuarioRepository, Long> {

	    public Optional<UsuarioRepository> findByEmail(String email);

		public Object save(Usuario usuario);

		public void setNome(String nome);

		public void setEmail(String email);

}
