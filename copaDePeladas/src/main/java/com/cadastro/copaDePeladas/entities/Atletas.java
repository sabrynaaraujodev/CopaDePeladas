package com.cadastro.copaDePeladas.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@Component
@Entity
@Table(name = "atletas")
public class Atletas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "time")
    private String time;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "numero_camisa")
    private Integer numeroCamisa;

    @Column(name = "tamanho_camisa")
    private String tamanhoCamisa;

    @Column(name = "nome_camisa")
    private String nomeCamisa;



    public Atletas(Long id, String nome, String time, String categoria, Integer numeroCamisa, String tamanhoCamisa, String nomeCamisa, Date dataInscricao, Date dataAlteracao) {
        this.id = id;
        this.nome = nome;
        this.time = time;
        this.categoria = categoria;
        this.numeroCamisa = numeroCamisa;
        this.tamanhoCamisa = tamanhoCamisa;
        this.nomeCamisa = nomeCamisa;

    }

    public Atletas() {

    }

    @Override
    public String toString() {
        return "Atletas{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", time='" + time + '\'' +
                ", categoria='" + categoria + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                ", tamanhoCamisa='" + tamanhoCamisa + '\'' +
                ", nomeCamisa='" + nomeCamisa + '\'' +
                '}';
    }
}
