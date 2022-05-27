package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.CategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    
    private CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;             
    }

	@GetMapping
    public String showAllCategorias(Model model) {
		model.addAttribute("categorias", categoriaService.getAllCategorias());
        return "categorias/lista";
    }  
    
    @GetMapping("/delete/{id}")
    public String deleteCategoria(@PathVariable Long id) {
        categoriaService.deleteCategoriaById(id);
        return "redirect:/categorias";
    }
    
}