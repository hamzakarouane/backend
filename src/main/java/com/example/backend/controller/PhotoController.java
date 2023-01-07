package com.example.backend.controller;

import com.example.backend.beans.Photo;
import com.example.backend.exception.ResourceNotFoundException;
import com.example.backend.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PhotoController {
    @Autowired
    private PhotoRepository photoRepository;

    @GetMapping("/photos")
    public List<Photo> getAllPhoto(){

        return photoRepository.findAll();
    }

    @PostMapping("/photos/add")
    public Photo addPhoto(@RequestBody Photo photo){

        return photoRepository.save(photo);
    }

    @PutMapping("/photos/{id}")
    public ResponseEntity<Photo> updatePhoto(@PathVariable long id, @RequestBody Photo photo){
        Photo photo1 = photoRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("photo does not exit by id "+id));
        photo1.setUrl(photo.getUrl());
        Photo updatedZone = photoRepository.save(photo1);
        return ResponseEntity.ok(updatedZone);
    }

    @DeleteMapping("/photos/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePhoto(@PathVariable long id){
        Photo photo = photoRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("zone does not exit by id "+id));
        photoRepository.delete(photo);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
