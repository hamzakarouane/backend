package com.example.backend.beans;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "pack")
public class Pack {

    @Id
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "tarif")
    private String tarif;

    @Column(name = "nbr_m")
    private float nbr_m;

    @Column(name = "type")
    private String type;




}
