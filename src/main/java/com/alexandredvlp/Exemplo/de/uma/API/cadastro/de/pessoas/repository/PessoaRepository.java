package com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.repository;

import com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
