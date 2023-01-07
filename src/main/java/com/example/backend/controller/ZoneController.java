package com.example.backend.controller;

import com.example.backend.beans.Zone;
import com.example.backend.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/villes/zones")
@CrossOrigin("http://localhost:3000")
public class ZoneController {
    @Autowired
    ZoneRepository zoneRepository;
    @GetMapping("/all")
    public List<Zone> findAll(){
        return zoneRepository.findAll();
    }


}
