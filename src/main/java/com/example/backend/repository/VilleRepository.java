package com.example.backend.repository;

import com.example.backend.beans.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville, Integer> {
}
