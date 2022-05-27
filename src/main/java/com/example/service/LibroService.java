package com.example.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.entities.Libro;
import com.example.repository.LibroRepository;

@Service
public class LibroService{
    
    private LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }
     
    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }
    
    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
    }


}