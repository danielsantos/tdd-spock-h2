package com.danielrocha.tddspockh2.repository;

import com.danielrocha.tddspockh2.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
