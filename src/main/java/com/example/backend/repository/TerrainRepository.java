package com.example.backend.repository;

import com.example.backend.beans.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerrainRepository extends JpaRepository<Terrain,Long> {
}
