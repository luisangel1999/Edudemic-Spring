package com.edudemic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edudemic.service.CategoriaService;
import com.edudemic.service.LibroService;
import com.edudemic.entities.Categoria;
import com.edudemic.entities.Libro;

@Controller
public class LibroController {

	private LibroService libroService;
	private CategoriaService categoriaService;
	private List<Categoria> listaCategorias =new ArrayList<>();
	public LibroController(LibroService libroService, CategoriaService categoriaService ) {
		this.libroService = libroService;
		this.categoriaService = categoriaService;
	}

	@GetMapping("/registro/libro")
	public String registrarLibroForm(Model model) {
		Libro libro = new Libro();
		this.listaCategorias = categoriaService.listarCategoria();
		model.addAttribute("libro", libro);
		model.addAttribute("listaCategorias",listaCategorias);
		return "/libro/registrolibro";
	}

	

	@PostMapping("/libros")
	public String registrarLibro(@ModelAttribute("libro") Libro libro) {
		libroService.registrarLibro(libro);
		return "redirect:/";
	}

}