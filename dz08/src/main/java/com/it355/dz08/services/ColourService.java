package com.it355.dz08.services;

import com.it355.dz08.entiteti.Colour;
import com.it355.dz08.exceptions.NotFoundByIdException;
import com.it355.dz08.repo.ColourRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColourService {

    private final ColourRepo colourRepo;

    @Autowired
    public ColourService(ColourRepo colourRepo) {
        this.colourRepo = colourRepo;
    }


    public List<Colour> findAllColours(){
        return colourRepo.findAll();
    }

    public void deleteAColour(int id){
        colourRepo.deleteColourById(id);
    }

    public Colour findColourById(int id){
        return colourRepo.findColourById(id).orElseThrow(()-> new NotFoundByIdException("Nema entiteta sa tim id-jem"));
    }



}
