package com.example.backend.repository;

import com.example.backend.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findById(int id);


    User findUserByImei(String imei);

    boolean existsByImei(String imei);

}
