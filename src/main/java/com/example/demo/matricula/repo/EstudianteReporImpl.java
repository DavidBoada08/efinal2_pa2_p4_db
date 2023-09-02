package com.example.demo.matricula.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteReporImpl implements IEstudianteRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Estudiante estudiante) {
		
		this.entityManager.persist(estudiante);
		
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}
	
	
	
	

}
