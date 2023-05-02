package com.it355.dz08.services;

import com.it355.dz08.entiteti.Publisher;
import com.it355.dz08.exceptions.NotFoundByIdException;
import com.it355.dz08.repo.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    private final PublisherRepo publisherRepo;

    @Autowired
    public PublisherService(PublisherRepo publisherRepo) {
        this.publisherRepo = publisherRepo;
    }

    public List<Publisher> findAllPublishers(){
        return publisherRepo.findAll();
    }

    public void deletePublisher(int id){
        publisherRepo.deletePublisherById(id);
    }

    public Publisher findPublisherById(int id){
        return publisherRepo.findPublisherById(id).orElseThrow(()-> new NotFoundByIdException("Nema entiteta sa tim id-jem"));
    }

}
