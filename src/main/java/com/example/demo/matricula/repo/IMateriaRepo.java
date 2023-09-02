package com.example.demo.matricula.repo;

import com.example.demo.matricula.repo.modelo.Materia;

public interface IMateriaRepo {
	
	public void crear(Materia materia);
	
	public Materia buscar(Integer id);

}
