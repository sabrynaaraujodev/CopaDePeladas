package com.cadastro.copaDePeladas.controller;

import com.cadastro.copaDePeladas.entities.Atletas;
import com.cadastro.copaDePeladas.services.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


//TODO COLOCAR INTERFACES IMPLS NAO CHAMAR DIRETO


@RestController
@RequestMapping("/api/cadastro")
public class CadastroAtletas  {

    @Autowired
    private CadastroService cadastroService;


    @PostMapping(path = "/novo")
    public Atletas adicionaAtleta(@Valid @RequestBody Atletas atletas) {
        return cadastroService.salvar(atletas);
    }

    @GetMapping
    public ResponseEntity<List<Atletas>> listar() {
        List<Atletas> atletas = cadastroService.listar();
        return ResponseEntity.status(HttpStatus.OK).body(atletas);
    }

    @GetMapping("/{id}")
    public Optional<Atletas> buscarAtletaPorID(@PathVariable Long id) {
        return cadastroService.buscarAtletaPorID(id);
    }

}
