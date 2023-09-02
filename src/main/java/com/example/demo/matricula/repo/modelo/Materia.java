package com.example.demo.matricula.repo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="materia")
public class Materia {
	
	@Id
	@SequenceGenerator(name = "mate_seq", initialValue = 1, sequenceName = "mate_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mate_seq")
	@Column(name = "mate_id")
	private Integer id;
	
	@Column(name = "mate_codigo")
	private String codigo;
	
	@Column(name = "mate_numero_creditos")
	private Integer numCreditos;
	
	@Column(name = "mate_cedulaProfesor")
	private String cedulaProfesor;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name="mate_estu_id")
	private Estudiante estudiante;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Integer getNumCreditos() {
		return numCreditos;
	}


	public void setNumCreditos(Integer numCreditos) {
		this.numCreditos = numCreditos;
	}


	public String getCedulaProfesor() {
		return cedulaProfesor;
	}


	public void setCedulaProfesor(String cedulaProfesor) {
		this.cedulaProfesor = cedulaProfesor;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


	@Override
	public String toString() {
		return "Materia [id=" + id + ", codigo=" + codigo + ", numCreditos=" + numCreditos + ", cedulaProfesor="
				+ cedulaProfesor + "]";
	}
	
	
	
	
	


}
