package com.it355.dz08.controllers;

import com.it355.dz08.entiteti.Superhero;
import com.it355.dz08.services.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/superhero")
public class SuperheroController {

    private final SuperheroService superheroService;

    @Autowired
    public SuperheroController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Superhero>> getAllSuperheroes(){
        List<Superhero> superheroes = superheroService.findAllSuperhero();
        return new ResponseEntity<>(superheroes, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Superhero> getSuperheroeById(@PathVariable("id") int id){
        Superhero superhero = superheroService.findSuperheroById(id);
        return new ResponseEntity<>(superhero, HttpStatus.OK);
    }

}
