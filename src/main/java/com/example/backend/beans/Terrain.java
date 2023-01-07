package com.example.backend.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity()
@Table(name = "terrain")
public class Terrain {
    @Id
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String nom;
    @Column
    private String address;
    @Column
    private String lat;
    @Column
    private String longitude;
    @Column
    private String rank;
    @Column
    private String type;
    @Column
    private String etat;
    @Column
    private String description;
    @Column
    private String sol;
    @Column
    private String tarif;
    @Column
    private String photo;


}
