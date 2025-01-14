package com.edudemic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edudemic.entities.Curso;
import com.edudemic.entities.Profesor;
import com.edudemic.service.CursoService;
import com.edudemic.service.ProfesorService;


@Controller
public class ProfesorController {
	private ProfesorService profesorService;
	private CursoService cursoService;
	private List<Curso> listaCursos =new ArrayList<>();
	public ProfesorController(ProfesorService profesorService,CursoService cursoService) 
	{
		this.profesorService=profesorService;
		this.cursoService = cursoService;
	}
	
	@GetMapping("/registro/profesor")
	public String registrarProfesorForm(Model model) 
	{
		Profesor profesor = new Profesor();
		this.listaCursos = cursoService.listarCurso();

		model.addAttribute("profesor",profesor);
		model.addAttribute("listaCursos",listaCursos);
		return "/profesor/registroP";
	}
	@PostMapping("/profesores")
	public String registrarProfesor(@ModelAttribute("profesor") Profesor profesor) 
	{
		profesorService.registrarProfesor(profesor);
		return "redirect:/";
	}
}
