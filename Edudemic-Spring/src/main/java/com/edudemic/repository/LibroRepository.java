package com.edudemic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edudemic.entities.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{
	@Query("FROM Libro l ORDER BY titulo ASC")
    public List<Libro> findAllSortByTitle();
}
