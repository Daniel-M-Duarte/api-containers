package com.example.demo.resources;

import com.example.demo.entities.Movimentacoes;
import com.example.demo.repositories.MovimentacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movimentacoes")
public class MovimentacoesResource {

    @Autowired
    MovimentacoesRepository repository;

    @GetMapping("")
    public List<Movimentacoes> get(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Movimentacoes> getById(@PathVariable(value = "id")Long id){
        return repository.findById(id);
    }

    @PostMapping("")
    public Movimentacoes post(@RequestBody Movimentacoes movimentacoes){
        return repository.save(movimentacoes);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(value = "id")Long id){
        repository.deleteById(id);
    }

    @PutMapping("")
    public Movimentacoes put(@RequestBody Movimentacoes movimentacoes){
        return repository.save(movimentacoes);
    }
}
