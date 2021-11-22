package br.uniso.tcc.controller;


import br.uniso.tcc.model.entity.Animal;
import br.uniso.tcc.model.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    @PostMapping("/animais")
    public void inserir(Animal a){
        repository.save(a);
    }

    @GetMapping("/animais")
    public List<Animal> listar(){
        List<Animal> animais = repository.findAll();
        return animais;
    }

}
