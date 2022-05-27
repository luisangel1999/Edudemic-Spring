package com.edudemic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edudemic.repository.LibroRepository;
import com.edudemic.entities.Libro;

@Service
public class LibroService {
	private LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }
    
    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }
    public List<Libro> getAllLibrosByTitle() {
		return libroRepository.findAllSortByTitle();
	}
    
    public Libro registrarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    
    public Libro getLibroById(Long id) {
        return libroRepository.findById(id).get();
    }

    
    public Libro updateStudent(Libro libro) {
        return libroRepository.save(libro);
    }

    
    public void deleteStudentById(Long id) {
        libroRepository.deleteById(id);
    }
}
