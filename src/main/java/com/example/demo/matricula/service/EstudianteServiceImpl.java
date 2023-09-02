package com.example.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IEstudianteRepo;
import com.example.demo.matricula.repo.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
	
	@Autowired
	private IEstudianteRepo iEstudianteRepo;

	@Override
	public void ingresar(Estudiante estudiante) {
		this.iEstudianteRepo.crear(estudiante);
		
	}

	@Override
	public Estudiante encontrar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
