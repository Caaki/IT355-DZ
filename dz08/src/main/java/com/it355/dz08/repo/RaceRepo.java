package com.it355.dz08.repo;

import com.it355.dz08.entiteti.Race;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RaceRepo extends JpaRepository<Race,Integer> {
    void deleteRaceById(int id);

    Optional<Race> findRaceById(int id);
}
