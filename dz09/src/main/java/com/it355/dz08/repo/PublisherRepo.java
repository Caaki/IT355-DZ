package com.it355.dz08.repo;

import com.it355.dz08.entiteti.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublisherRepo extends JpaRepository<Publisher,Integer> {
    void deletePublisherById(int id);

    Optional<Publisher> findPublisherById(int id);
}
