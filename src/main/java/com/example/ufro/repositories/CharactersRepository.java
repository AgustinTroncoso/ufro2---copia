package com.example.ufro.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ufro.models.Characters;
@Repository
public interface CharactersRepository extends JpaRepository<Characters, Long> {
        
        void deleteById(Long id);
}