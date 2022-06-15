package com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.service;


import com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.entity.Pessoa;
import com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    //@RequestMapping(value = "/pessoa", method = RequestMethod.GET) <- depreciate
    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    //method save Pessoa
    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    //retorna um objeto pessoa pelo id
    public Optional<Pessoa> coletarPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    //deletar pessoa  por id
    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }

}
