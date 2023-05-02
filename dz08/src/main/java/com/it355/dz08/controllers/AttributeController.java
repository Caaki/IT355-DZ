package com.it355.dz08.controllers;

import com.it355.dz08.entiteti.Attribute;
import com.it355.dz08.entiteti.Colour;
import com.it355.dz08.services.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("attribute")
public class AttributeController {

    private final AttributeService attributeService;

    @Autowired
    public AttributeController(AttributeService attributeService) {
        this.attributeService = attributeService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Attribute>> getAllAttributes(){
        List<Attribute> attributes = attributeService.findAllAttributes();
        return new ResponseEntity<>(attributes, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Attribute> getAttributeById(@PathVariable("id") int id){
        Attribute attribute = attributeService.findAttributeById(id);
        return new ResponseEntity<>(attribute, HttpStatus.OK);
    }
}
