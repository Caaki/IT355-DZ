package com.it355.dz08.services;

import com.it355.dz08.entiteti.Superhero;
import com.it355.dz08.exceptions.NotFoundByIdException;
import com.it355.dz08.repo.SuperheroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroService {

    private final SuperheroRepo superheroRepo;

    @Autowired
    public SuperheroService(SuperheroRepo superheroRepo) {
        this.superheroRepo = superheroRepo;
    }

    public List<Superhero> findAllSuperhero(){
        return superheroRepo.findAll();
    }

    public void deleteSuperhero(int id){
        superheroRepo.deleteSuperheroById(id);
    }

    public Superhero findSuperheroById(int id){
        return superheroRepo.findSuperheroById(id).orElseThrow(()-> new NotFoundByIdException("Nema entiteta sa tim id-jem"));
    }


}
