package com.example.backend.controller;

import com.example.backend.beans.User;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
    @RequestMapping("users")
public class UserController {


    @Autowired
    UserRepository userRepository;




    @PostMapping("/save")
    public void save(@RequestBody User user){
        userRepository.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable (required = true) String id) {
        User user = userRepository.findById(Integer.parseInt(id));
        userRepository.delete(user);
    }

    @GetMapping("/all")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping(value = "/count")
    public long countUser() {
        return userRepository.count();
    }

    @GetMapping("/findByImei/{imei}")
    public User findUserByImei(@PathVariable (required = true) String imei){

        return userRepository.findUserByImei(imei);

    }

   /* @PostMapping("/service/registration")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        if(userRepository.findByUsername(user.getUsername()) != null){
            //Status Code: 409
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        //Default role = user
        user.setRole(Role.USER);
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
    }*/



    /*@GetMapping("/service/login/{username}/{password}")
    public User getUser(@PathVariable (required = true) String username,@PathVariable (required = true) String password){
        //Principal principal = request.getUserPrincipal();
        Optional<User> userOptional = userRepository.findByUsername(username);
        User user = new User();
        if(userOptional.isPresent()){
            user = userOptional.get();

            if(user.getPassword().equals(password)){
                return user;
            }
        }
        //username = principal.getName()
        return null;
    }*/
}
