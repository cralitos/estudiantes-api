package com.progra3.estudiantes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progra3.estudiantes.entities.Estudiante;
import com.progra3.estudiantes.services.EstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	EstudianteService estudianteService;
	
	@GetMapping
	public List<Estudiante> listarEstudiantes(){
		return estudianteService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Estudiante obtenerEstudiante(@PathVariable Long id) {
		return estudianteService.findById(id);
	}
	
	@PostMapping
	public void crearEstudiante(@RequestBody Estudiante estudiante) {
		estudianteService.createEstudiante(estudiante);
	}
	
	@PutMapping("/{id}")
	public void modificarEstudiante (@PathVariable Long id, @RequestBody Estudiante estudiante) {
		estudianteService.modifyEstudiante(id, estudiante);
	}
	
	@DeleteMapping("/{id}")
	public void borrarEstudiante(@PathVariable Long id) {
		estudianteService.deleteEstudiante(id);
	}

}
