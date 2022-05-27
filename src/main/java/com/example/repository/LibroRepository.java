package com.example.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
          
        @Query("FROM Libro l ORDER BY titulo ASC")
        public List<Libro> findAllSortByTittle();
}