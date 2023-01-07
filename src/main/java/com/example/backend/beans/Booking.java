package com.example.backend.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Booking")
public class Booking {

    @EmbeddedId
    DateKey id;

    @Column
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    @Column
    private Time heur;

}
