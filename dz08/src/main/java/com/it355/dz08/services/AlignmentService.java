package com.it355.dz08.services;

import com.it355.dz08.entiteti.Alignment;
import com.it355.dz08.exceptions.NotFoundByIdException;
import com.it355.dz08.repo.AlignmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlignmentService {

    private final AlignmentRepo alignmentRepo;

    @Autowired
    public AlignmentService(AlignmentRepo alignmentRepo) {
        this.alignmentRepo = alignmentRepo;
    }

    public List<Alignment> findAllAlignment(){
        return alignmentRepo.findAll();
    }

    public void deleteAlignment(int id){
        alignmentRepo.deleteAlignmentById(id);
    }

    public Alignment findAlignmentById(int id){
        return alignmentRepo.findAlignmentById(id).orElseThrow(()-> new NotFoundByIdException("Nema entiteta sa tim id-jem"));
    }


}
