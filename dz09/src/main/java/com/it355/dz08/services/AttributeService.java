package com.it355.dz08.services;

import com.it355.dz08.entiteti.Attribute;
import com.it355.dz08.exceptions.NotFoundByIdException;
import com.it355.dz08.repo.AttributeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributeService {

    private final AttributeRepo attributeRepo;

    @Autowired
    public AttributeService(AttributeRepo attributeRepo) {
        this.attributeRepo = attributeRepo;
    }


    public List<Attribute> findAllAttributes(){
        return attributeRepo.findAll();
    }

    public void deleteAlignment(int id){
        attributeRepo.deleteAttributeById(id);
    }

    public Attribute findAttributeById(int id){
        return attributeRepo.findAttributeById(id).orElseThrow(()-> new NotFoundByIdException("Nema entiteta sa tim id-jem"));
    }

}
