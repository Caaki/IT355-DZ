package com.it355.dz08.repo;

import com.it355.dz08.entiteti.Superpower;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SuperpowerRepo extends JpaRepository<Superpower,Integer> {
    void deleteSuperheroById(int id);

    Optional<Superpower> findSuperpowerById(int id);
}
