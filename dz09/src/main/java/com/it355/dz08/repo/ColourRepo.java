package com.it355.dz08.repo;

import com.it355.dz08.entiteti.Colour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ColourRepo extends JpaRepository<Colour,Integer> {
    void deleteColourById(int id);

    Optional<Colour> findColourById(int id);
}
