package com.it355.dz08.repo;

import com.it355.dz08.entiteti.Alignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlignmentRepo extends JpaRepository<Alignment,Integer> {

    void deleteAlignmentById(int id);

    Optional<Alignment> findAlignmentById(int id);
}
