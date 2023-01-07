package com.example.backend.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "reservation")
public class Reservation {

    @Id
    private Long id;

    @Column
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    @Column
    private String etat;


}
