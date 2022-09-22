package com.victation.AppLocacao.model.repository;

import com.victation.AppLocacao.model.domain.Locatario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocatarioRepository extends CrudRepository <Locatario, Integer> {
}
