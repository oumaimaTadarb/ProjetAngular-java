package com.management.restcontrollers;

import com.management.entities.Disponibility;
import com.management.repositories.DisponibilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class DisponibiltyRestController {
    @Autowired
    DisponibilityRepository disponibilityRepository;

    @GetMapping("/disponibilities")
    public List<Disponibility> getAllDisponibilities(){
        return disponibilityRepository.findAll();
    }

    @GetMapping("/disponibilities/{id}")
    public Disponibility getDisponibilityById(@PathVariable("id") Long id){
        return disponibilityRepository.findById(id).get();
    }
}
