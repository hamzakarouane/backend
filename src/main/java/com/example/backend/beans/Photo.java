package com.example.backend.beans;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "photo")
public class Photo {

    @Id
    private Long id;
    @Column(name ="url" )
    private String url;


}
