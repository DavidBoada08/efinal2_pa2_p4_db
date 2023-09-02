package com.example.demo.matricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.matricula.repo.modelo.Matricula;
import com.example.demo.matricula.service.IMateriaService;
import com.example.demo.matricula.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	@Autowired
	private IMateriaService iMateriaService;
	
	@GetMapping("/nuevo")
	private String paginaNuevaMatricula(Matricula matricula) {
		return "vistaNuevaMatricula";
	}
	
	@PostMapping("/nuevo")
	private String ingresarNuevaMatricula(Matricula matricula,String cedula, String materia) {
		this.iMatriculaService.ingresar(matricula, cedula, materia);
		return "redirect;/matriculas/nuevo";
	}

}
