package com.progra3.estudiantes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progra3.estudiantes.dao.EstudianteDao;
import com.progra3.estudiantes.entities.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	
	@Autowired
	EstudianteDao estudianteDao;

	@Override
	public List<Estudiante> findAll() {
		
		return (List<Estudiante>) estudianteDao.findAll();
	}

	@Override
	public Estudiante findById(Long id) {
		
		return estudianteDao.findById(id).orElse(null);
	}

	@Override
	public void createEstudiante(Estudiante estudiante) {
		estudianteDao.save(estudiante);
		
	}

	@Override
	public void modifyEstudiante(Long id, Estudiante estudiante) {
		if (estudianteDao.existsById(id)) {
			estudiante.setId(id);
			estudianteDao.save(estudiante);
		}
		
	}

	@Override
	public void deleteEstudiante(Long id) {
		if (estudianteDao.existsById(id)) {			
			estudianteDao.deleteById(id);
		}
		
	}

}
