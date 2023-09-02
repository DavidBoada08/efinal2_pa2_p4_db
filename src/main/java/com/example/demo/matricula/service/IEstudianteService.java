package com.example.demo.matricula.service;

import com.example.demo.matricula.repo.modelo.Estudiante;

public interface IEstudianteService {
	

	public void ingresar(Estudiante estudiante);
	
	public Estudiante encontrar(Integer id);

}
