package com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descricao;

    @OneToMany(mappedBy = "trabalho")
    private List<Pessoa> pessoaList;
}
