package com.cadastro.copaDePeladas.services;

import com.cadastro.copaDePeladas.entities.Atletas;
import com.cadastro.copaDePeladas.repositories.AtletasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroService  {

    @Autowired
    private AtletasRepository atletasRepository;


    public Atletas salvar(Atletas atletas) {

        return atletasRepository.save(atletas);
    }

    public List<Atletas> listar() {

        return atletasRepository.findAll();
    }

    public Optional<Atletas> buscarAtletaPorID(Long id) {
        return atletasRepository.findById(id);
    }
}
