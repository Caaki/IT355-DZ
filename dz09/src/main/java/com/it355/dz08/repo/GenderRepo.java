package com.it355.dz08.repo;

import com.it355.dz08.entiteti.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenderRepo extends JpaRepository<Gender,Integer> {
    void deleteGenderById(int id);

    Optional<Gender> findGenderById(int id);
}
