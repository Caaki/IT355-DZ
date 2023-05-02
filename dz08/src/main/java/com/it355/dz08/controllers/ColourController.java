package com.it355.dz08.controllers;

import com.it355.dz08.entiteti.Alignment;
import com.it355.dz08.entiteti.Colour;
import com.it355.dz08.services.ColourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/colour")
public class ColourController {

    private final ColourService colourService;

    @Autowired
    public ColourController(ColourService colourService) {
        this.colourService = colourService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Colour>> getAllColours(){
        List<Colour> colours = colourService.findAllColours();
        return new ResponseEntity<>(colours, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Colour> getColourById(@PathVariable("id") int id){
        Colour colour = colourService.findColourById(id);
        return new ResponseEntity<>(colour, HttpStatus.OK);
    }
}
