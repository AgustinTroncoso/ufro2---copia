package com.example.ufro.models;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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

@Table(name="characters")
public class Characters {


    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="status", length=8)
    private String status;

    
    @Column(name="species", length=45)
    private String species;
    
    @Column(name="img", length=100)
    private String img;
    
    @Column(name="created", length=45)
    private String created;
    
    @Column(name="gender", length=45)
    private String gender;


    @Column(name="name", length=100)
    private String name;
    
    @Column(name="url", length=100)
    private String url;


    @ManyToOne
    @JoinColumn(name = "id_Location")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "id_Users")
    private User user;

        @ManyToMany
    @JoinTable(
        name = "characters_has_episode",
        joinColumns = @JoinColumn(name = "id_episode"),
        inverseJoinColumns = @JoinColumn(name = "id_characters")
    )
    private List<Episode> characteres = new ArrayList<>();
    

}
