package com.cadastro.copaDePeladas.repositories;

import com.cadastro.copaDePeladas.entities.Atletas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AtletasRepository extends JpaRepository<Atletas, Long> {
}
