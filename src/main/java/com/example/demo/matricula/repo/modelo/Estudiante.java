package com.example.demo.matricula.repo.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
	
	@Id
	@SequenceGenerator(name = "estu_seq", initialValue = 1, sequenceName = "estu_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_seq")
	@Column(name = "estu_id")
	private Integer id;
	@Column(name = "estu_nombre")
	private String nombre;
	@Column(name = "estu_apellido")
	private String apellido;
	@Column(name = "estu_cedula")
	private String cedula;
	@Column(name = "estu_direccion")
	private String direccion;
	@Column(name = "estu_telefono")
	private String telefono;
	
	@OneToMany(cascade = CascadeType.ALL )
	@Column(name="estu_mate_id")
	private Materia materia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
