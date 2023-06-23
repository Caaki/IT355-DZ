package com.it355.dz08.repo;

import com.it355.dz08.entiteti.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AttributeRepo extends JpaRepository<Attribute, Integer> {
    void deleteAttributeById(int id);

    Optional<Attribute> findAttributeById(int id);
}
