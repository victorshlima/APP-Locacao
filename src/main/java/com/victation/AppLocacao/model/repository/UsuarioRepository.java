package com.victation.AppLocacao.model.repository;

import com.victation.AppLocacao.model.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository <Usuario, Integer> {
}
