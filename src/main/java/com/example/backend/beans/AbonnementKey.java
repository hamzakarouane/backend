package com.example.backend.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class AbonnementKey implements Serializable {

    @Column(name = "clientId")
    Long clientId;

    @Column(name = "packId")
    Long packId;





}
