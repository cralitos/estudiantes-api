package com.progra3.estudiantes.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.progra3.estudiantes.entites.Estudiante;

@Service
public class EstudiantesServiceImpl implements EstudianteService {
	
	private static AtomicLong sequence = new AtomicLong();
	private static List<Estudiante> lista = new ArrayList<Estudiante>() {{
		add(new Estudiante(sequence.incrementAndGet(),"estudiante","direccion1","carnetq"));
		add(new Estudiante(sequence.incrementAndGet(),"estudiante2","direccion2","carnet2"));
		add(new Estudiante(sequence.incrementAndGet(),"estudiante3","direccion3","carnet3"));
	}};
	
	public List<Estudiante> listarEstudiantes(){
		return lista;
	}

	@Override
	public Estudiante buscarEstudiante(long id) {
		for (Estudiante e: lista) {
			if (e.getId().equals(id))
				return e;
		}
		return null;
	}

	@Override
	public void crearEstudiante(Estudiante estudiante) {
		estudiante.setId(sequence.incrementAndGet());
		lista.add(estudiante);
		
	}

}
