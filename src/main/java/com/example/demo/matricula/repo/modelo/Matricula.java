package com.example.demo.matricula.repo.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="matricula")
public class Matricula {
	
	@Id
	@SequenceGenerator(name = "matri_seq", initialValue = 1, sequenceName = "matri_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matri_seq")
	@Column(name = "matri_id")
	private Integer id;
	
	@Column(name = "matri_fecha")
	private LocalDate fecha;
	
	
	@ManyToMany()
	@JoinColumn(name="matri_estu")
	private Estudiante estudiante;
	
	@ManyToMany()
	@JoinColumn(name="matri_mate")
	private Materia materia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fecha=" + fecha + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
