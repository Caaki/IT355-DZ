package com.it355.dz08.controllers;

import com.it355.dz08.entiteti.Alignment;
import com.it355.dz08.services.AlignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alignment")
public class AlignmentController {

    private final AlignmentService alignmentService;

    @Autowired
    public AlignmentController(AlignmentService alignmentService) {
        this.alignmentService = alignmentService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Alignment>> getAllAlignments(){
        List<Alignment> alignments = alignmentService.findAllAlignment();
        System.out.printf(alignments.toString());
        return new ResponseEntity<>(alignments, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Alignment> getAlignmentById(@PathVariable("id") int id){
        Alignment alignment = alignmentService.findAlignmentById(id);
        return new ResponseEntity<>(alignment,HttpStatus.OK);
    }
}
