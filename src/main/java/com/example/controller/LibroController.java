package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.LibroService;
import com.example.service.CategoriaService;

@Controller
@RequestMapping("/libros")
public class LibroController {
    
    private LibroService libroService;
    private CategoriaService categoriaService;
    

    public LibroController(LibroService libroService, CategoriaService categoriaService ) {
        this.libroService = libroService;
        this.categoriaService=categoriaService;
        
    }   
    
	@GetMapping
    public String showAllLibros(Model model) {
        model.addAttribute("libros", libroService.getAllLibros());
        return "libros/lista";
    }
    
    @GetMapping("/libros/categorias")
    public String Libros(Model model) {

        return "index";
    }    
    


}