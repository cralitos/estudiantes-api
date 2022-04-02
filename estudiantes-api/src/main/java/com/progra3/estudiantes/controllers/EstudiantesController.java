package com.progra3.estudiantes.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progra3.estudiantes.entites.Estudiante;
import com.progra3.estudiantes.services.CursoService;
import com.progra3.estudiantes.services.EstudianteService;
import com.progra3.estudiantes.services.EstudiantesServiceImpl;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
	
	@Autowired
	EstudianteService estudianteService;
	
	@Autowired
	CursoService cursoService;
	
	@GetMapping()
	public List<Estudiante> listarEstudiantes(){
		List<Estudiante> lista = estudianteService.listarEstudiantes();
		return lista;
	}
	
	@GetMapping("/{id}")
	public Estudiante buscarEstudiante(@PathVariable Long id) {
		Estudiante estudiante = estudianteService.buscarEstudiante(id);
		return estudiante;
	}
	
	@PostMapping
	public void crearEstudiante(@RequestBody Estudiante estudiante) {
		estudianteService.crearEstudiante(estudiante);
	}

}
