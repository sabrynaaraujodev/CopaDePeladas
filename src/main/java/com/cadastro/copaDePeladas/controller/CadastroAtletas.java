package com.cadastro.copaDePeladas.controller;

import com.cadastro.copaDePeladas.entities.Atletas;
import com.cadastro.copaDePeladas.services.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


//TODO COLOCAR INTERFACES IMPLS NAO CHAMAR DIRETO


@RestController
@RequestMapping("/api/cadastro")
public class CadastroAtletas  {

    @Autowired
    private CadastroService cadastroService;

    @GetMapping(value = "/index")
    public ModelAndView index(){
        ModelAndView login = new ModelAndView("index");
        return login;
    }

    @GetMapping(value = "/cadastrarAtletas")
    public ModelAndView cadastrarAtletas(){
        ModelAndView cadastrarAtletas = new ModelAndView("cadastrarAtletas");
        return cadastrarAtletas;
    }


    @PostMapping (value = "/novo")
    public String adicionaAtleta(@RequestBody @Valid Atletas atletas) {
        cadastroService.salvar(atletas);
        return "Atleta salvo com sucesso";
    }


    @GetMapping(value = "/consultarAtletas")
    public ModelAndView listar(Model model){
        ModelAndView consulta = new ModelAndView("consultarAtletas");
        List<Atletas> atletas = cadastroService.listar();
        model.addAttribute("atletas",atletas);
        return consulta;
    }

    @GetMapping("/{id}")
    public Optional<Atletas> buscarAtletaPorID(@PathVariable Long id) {
        return cadastroService.buscarAtletaPorID(id);
    }

}
