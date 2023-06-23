package com.it355.dz08.services;

import com.it355.dz08.entiteti.Race;
import com.it355.dz08.exceptions.NotFoundByIdException;
import com.it355.dz08.repo.RaceRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceServices {

    private final RaceRepo raceRepo;

    public RaceServices(RaceRepo raceRepo) {
        this.raceRepo = raceRepo;
    }


    public List<Race> findAllRaces(){
        return raceRepo.findAll();
    }

    public void deleteRace(int id){
        raceRepo.deleteRaceById(id);
    }

    public Race findRaceById(int id){
        return raceRepo.findRaceById(id).orElseThrow(()-> new NotFoundByIdException("Nema entiteta sa tim id-jem"));
    }
}
