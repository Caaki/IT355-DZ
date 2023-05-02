package com.it355.dz08.repo;

import com.it355.dz08.entiteti.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComicRepo extends JpaRepository<Comic,Integer> {
    void deleteComicById(int id);

    Optional<Comic> findComicById(int id);
}
