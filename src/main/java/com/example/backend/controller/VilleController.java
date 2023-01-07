package com.example.backend.controller;

import com.example.backend.beans.Ville;
import com.example.backend.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/villes")
@CrossOrigin("http://localhost:3000")
public class VilleController {
    @Autowired
    VilleRepository villeRepository;
    @GetMapping("/all")
    public List<Ville> findAll(){
        return villeRepository.findAll();
    }


}