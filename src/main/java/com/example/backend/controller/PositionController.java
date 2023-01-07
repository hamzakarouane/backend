package com.example.backend.controller;


import com.example.backend.beans.Position;
import com.example.backend.beans.User;
import com.example.backend.repository.PositionRepository;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("users/positions")
public class PositionController {

    @Autowired
    private PositionRepository positionRepository;


    @PostMapping("/save")
    public void save(@RequestBody Position position){
        positionRepository.save(position);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable (required = true) String id) {
        Position position = positionRepository.findById(Integer.parseInt(id));
        positionRepository.delete(position);
    }

    @GetMapping("/all")
    public List<Position> findAll(){
        return positionRepository.findAll();
    }

    @GetMapping(value = "/count")
    public long countPosition() {
        return positionRepository.count();
    }




}
