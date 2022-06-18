package com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.repository;

import com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    //retorna uma lista de nomes
    List<Pessoa> findByName(String nome);

    //retorna uma lista de email
    List<Pessoa> findByEmail(String email);

    //retona o primeiro nome
    Optional<Pessoa> findFirstName(String nome);
}
