package com.it355.dz08.services;

import com.it355.dz08.entiteti.Comic;
import com.it355.dz08.exceptions.NotFoundByIdException;
import com.it355.dz08.repo.ComicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicService {

    private final ComicRepo comicRepo;

    @Autowired
    public ComicService(ComicRepo comicRepo) {
        this.comicRepo = comicRepo;
    }

    public List<Comic> findAllComics(){
        return comicRepo.findAll();
    }

    public void deleteComic(int id){
        comicRepo.deleteComicById(id);
    }

    public Comic findColourById(int id){
        return comicRepo.findComicById(id).orElseThrow(()-> new NotFoundByIdException("Nema entiteta sa tim id-jem"));
    }

}
