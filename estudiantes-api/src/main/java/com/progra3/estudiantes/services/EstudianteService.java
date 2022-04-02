package com.progra3.estudiantes.services;

import java.util.List;

import com.progra3.estudiantes.entites.Estudiante;


public interface EstudianteService {
	
	public List<Estudiante> listarEstudiantes();
	public Estudiante buscarEstudiante(long id);
	public void crearEstudiante(Estudiante estudiante);

}
