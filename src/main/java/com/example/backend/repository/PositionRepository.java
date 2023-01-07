package com.example.backend.repository;

import com.example.backend.beans.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,Integer> {

    Position findById(int id);


}
