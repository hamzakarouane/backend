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
public class DateKey implements Serializable{


    @Column(name = "terrainId")
    Long terrainId;

    @Column(name = "reservId")
    Long reservId;


}
