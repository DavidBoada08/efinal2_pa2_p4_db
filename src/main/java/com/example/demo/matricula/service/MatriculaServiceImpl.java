package com.example.demo.matricula.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IEstudianteRepo;
import com.example.demo.matricula.repo.IMateriaRepo;
import com.example.demo.matricula.repo.IMatriculaRepo;
import com.example.demo.matricula.repo.modelo.Estudiante;
import com.example.demo.matricula.repo.modelo.Materia;
import com.example.demo.matricula.repo.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMateriaRepo iMateriaRepo;
	
	@Autowired
	private IEstudianteRepo iEstudianteRepo;
	
	 @Autowired
	 private IMatriculaRepo iMatriculaRepo;

	@Override
	public void ingresar(Matricula matricula, String cedula, String materia1) {
		Matricula matri = new Matricula();
		Estudiante estu= new Estudiante();
		Materia mate1 = new Materia();
		Materia mate2 = new Materia();
		Materia mate3 = new Materia();
		Materia mate4 = new Materia();
		
		matri.setFecha(LocalDate.now());
		estu.getCedula();
		mate1.setCodigo(materia1);
		mate2.setCodigo(materia1);
		mate3.setCodigo(materia1);
		mate4.setCodigo(materia1);
		
		this.iMatriculaRepo.crear(matricula);
		
		
		
		
	}

	@Override
	public Materia encontar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	 

}
