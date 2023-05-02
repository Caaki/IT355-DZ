package com.it355.dz08.repo;

import com.it355.dz08.entiteti.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SuperheroRepo extends JpaRepository<Superhero,Integer> {
    void deleteSuperheroById(int id);

    Optional<Superhero> findSuperheroById(int id);
}
