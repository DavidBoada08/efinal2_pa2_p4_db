package com.example.demo.matricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.matricula.repo.modelo.Materia;
import com.example.demo.matricula.service.IMateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	
	@Autowired
	private IMateriaService iMateriaService;
	
	@GetMapping("/nuevo")
	private String nuevaMateria (Materia materia) {
		return"vistaNuevaMateria";
	}
	
	@PostMapping("/ingresarMateria")
	private String ingresoNuevaMateria (Materia materia) {
		this.iMateriaService.ingresar(materia);
		return"redirect:/materias/nuevo";
	}
	

}
