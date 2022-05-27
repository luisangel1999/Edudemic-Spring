package com.example.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

        @Query("FROM Categoria c ORDER BY nombre ASC")
        public List<Categoria> findAll();
}