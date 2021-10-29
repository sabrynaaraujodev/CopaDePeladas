package com.cadastro.copaDePeladas.repositories;

import com.cadastro.copaDePeladas.entities.Atletas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AtletasRepository extends JpaRepository<Atletas, Long> {
}
