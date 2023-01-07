package com.example.backend.controller;

import com.example.backend.beans.Terrain;
import com.example.backend.exception.ResourceNotFoundException;
import com.example.backend.repository.TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("users")
public class TerrainController {

    @Autowired
    private TerrainRepository terrainRepository;

    @GetMapping("/villes/terrains")
    public List<Terrain> getAllTerrain(){
        return terrainRepository.findAll();
    }

    @GetMapping("/villes/terrains/{id}")
    public Terrain getTerrainById(@PathVariable long id){
        Terrain terrain = terrainRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("terrain not exits by id "+id));
        return terrain;
    }
}
