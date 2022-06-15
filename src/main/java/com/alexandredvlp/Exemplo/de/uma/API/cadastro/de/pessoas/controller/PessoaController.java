package com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.controller;

import com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.entity.Pessoa;
import com.alexandredvlp.Exemplo.de.uma.API.cadastro.de.pessoas.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    //methodo listar
    @GetMapping("/pessoa")
    public List<Pessoa> list() {
        return pessoaService.listar();
    }

    //method salvar
    @PostMapping("/pessoa")
    public Pessoa save(@RequestBody Pessoa pessoa) {
        return pessoaService.salvar(pessoa);
    }

    @PutMapping("/pessoa/atualizar")
    public ResponseEntity<Pessoa> atualizar(@RequestBody Pessoa pessoa) {
        Pessoa pessoa1 = pessoaService.salvar(pessoa);
        return new ResponseEntity<Pessoa>(pessoa1, HttpStatus.OK);
    }

    //method get por id
    @GetMapping("/pessoa/{id}")
    public Optional<Pessoa> findById(@PathVariable Long id) {
        return pessoaService.coletarPorId(id);
    }

    //method delete por id
    @GetMapping("/pessoa/delete/{id}")
    public ResponseEntity<Pessoa> deleteById(@PathVariable Long id) {
        pessoaService.deletar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
