package com.example.backend.beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @OneToMany(mappedBy = "ville", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Zone> zones;
}
