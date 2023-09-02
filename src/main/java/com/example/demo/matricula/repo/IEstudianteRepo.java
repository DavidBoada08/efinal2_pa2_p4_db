package com.example.demo.matricula.repo;

import com.example.demo.matricula.repo.modelo.Estudiante;

public interface IEstudianteRepo {
	
	public void crear(Estudiante estudiante);
	
	public Estudiante buscar(Integer id);
	

}
