package com.it355.dz08.services;

import com.it355.dz08.entiteti.Superpower;
import com.it355.dz08.exceptions.NotFoundByIdException;
import com.it355.dz08.repo.SuperpowerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperpowerService {

    private final SuperpowerRepo superpowerRepo;

    public SuperpowerService(SuperpowerRepo superpowerRepo) {
        this.superpowerRepo = superpowerRepo;
    }

    public List<Superpower> findAllSuperpower(){
        return superpowerRepo.findAll();
    }

    public void deleteSuperpower(int id){
        superpowerRepo.deleteSuperheroById(id);
    }

    public Superpower findSuperpowerById(int id){
        return superpowerRepo.findSuperpowerById(id).orElseThrow(()-> new NotFoundByIdException("Nema entiteta sa tim id-jem"));
    }
}
