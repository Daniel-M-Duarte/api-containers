package com.example.demo.resources;

import com.example.demo.entities.Containers;
import com.example.demo.repositories.ContainersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/containers")
public class ContainersResource {

    @Autowired
    ContainersRepository repository;

    @GetMapping("")
    public List<Containers> get(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Containers> getById(@PathVariable(value = "id")Long id){
        return repository.findById(id);
    }

    @PostMapping("")
    public Containers post(@RequestBody Containers containers){
        return repository.save(containers);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(value = "id")Long id){
        repository.deleteById(id);
    }

    @PutMapping("")
    public Containers put(@RequestBody Containers containers){
        return repository.save(containers);
    }
}
