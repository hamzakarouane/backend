package com.example.backend.beans;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "abonnement")
public class Abonnement {


    @EmbeddedId
    AbonnementKey id;

    @ManyToOne
    @MapsId("clientId")
    @JoinColumn(name = "client")
    Client client;

    @ManyToOne
    @MapsId("packId")
    @JoinColumn(name = "pack")
    Pack pack;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;




}
