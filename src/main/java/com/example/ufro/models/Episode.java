package com.example.ufro.models;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name="episode")
public class Episode {


    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="air_date", length=45)
    private String air_date;


    @Column(name="characters", length=100)
    private String characters;
    
    @Column(name="episode", length=45)
    private String episode;

  
    
    @Column(name="created", length=100)
    private String created;
    
    @Column(name="url", length=100)
    private String url;

    @Column(name="name", length=100)
    private String name;
    
   


      @ManyToMany(mappedBy = "characteres")
    private List<Characters> charactes = new ArrayList<>();




}
