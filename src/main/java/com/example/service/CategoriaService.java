package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.Categoria;
import com.example.repository.CategoriaRepository;

@Service
public class CategoriaService {

	private CategoriaRepository categoriaRepository;

	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}

	public List<Categoria> getAllCategorias() {
		return categoriaRepository.findAll();
	}

	public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}


	public void deleteCategoriaById(Long id) {
		categoriaRepository.deleteById(id);
	}


}