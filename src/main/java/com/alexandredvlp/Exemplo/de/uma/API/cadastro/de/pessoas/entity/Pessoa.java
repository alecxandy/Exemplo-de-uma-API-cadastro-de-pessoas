package com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "trabalho_id") //cria uma coluna com as fk de trabalho
    private Trabalho trabalho;

    private String email;
}
