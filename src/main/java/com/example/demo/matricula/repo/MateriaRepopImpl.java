package com.example.demo.matricula.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepopImpl implements IMateriaRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Materia materia) {
		this.entityManager.persist(materia);
		
	}

	@Override
	public Materia buscar(Integer id) {
		
		return this.entityManager.find(Materia.class, id);
	}
}
