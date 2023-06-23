package com.it355.dz08.services;

import com.it355.dz08.entiteti.Gender;
import com.it355.dz08.exceptions.NotFoundByIdException;
import com.it355.dz08.repo.GenderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService {

    private final GenderRepo genderRepo;

    @Autowired
    public GenderService(GenderRepo genderRepo) {
        this.genderRepo = genderRepo;
    }


    public List<Gender> findAllGenders(){
        return genderRepo.findAll();
    }

    public void deleteGender(int id){
        genderRepo.deleteGenderById(id);
    }

    public Gender findGenderById(int id){
        return genderRepo.findGenderById(id).orElseThrow(()-> new NotFoundByIdException("Nema entiteta sa tim id-jem"));
    }


}
