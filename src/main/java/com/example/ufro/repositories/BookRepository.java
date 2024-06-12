package com.example.ufro.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ufro.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
        
        void deleteById(Long id);
}