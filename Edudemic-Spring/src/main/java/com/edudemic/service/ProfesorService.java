package com.edudemic.service;

import org.springframework.stereotype.Service;

import com.edudemic.entities.Profesor;
import com.edudemic.repository.ProfesorRepository;

@Service
public class ProfesorService {
	private ProfesorRepository profesorRepository;
	public ProfesorService(ProfesorRepository profesorRepository) 
	{
		this.profesorRepository=profesorRepository;
		}
	public Profesor registrarProfesor(Profesor p) 
	{
		return profesorRepository.save(p);
	}
}
