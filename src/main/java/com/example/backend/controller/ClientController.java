package com.example.backend.controller;


import com.example.backend.beans.Client;
import com.example.backend.exception.ResourceNotFoundException;
import com.example.backend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/villes")
@CrossOrigin("http://localhost:3000")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> getAllClients(){

        return clientRepository.findAll();
    }

    @PostMapping("/clients/add")
    public Client addClient(@RequestBody Client client){

        return clientRepository.save(client);
    }

    @PutMapping("/clients/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable long id, @RequestBody Client client){
        Client client1 = clientRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("client does not exit by id "+id));
        client1.setNom(client.getNom());
        client1.setPrenom(client.getPrenom());
        client1.setEmail(client.getEmail());
        client1.setPassword(client.getPassword());
        Client updatedClient = clientRepository.save(client1);
        return ResponseEntity.ok(updatedClient);
    }

    @DeleteMapping("/zones/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteClient(@PathVariable long id){
        Client client = clientRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("zone does not exit by id "+id));
        clientRepository.delete(client);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
