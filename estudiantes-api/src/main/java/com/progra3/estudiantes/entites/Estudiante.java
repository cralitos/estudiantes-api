package com.progra3.estudiantes.entites;

public class Estudiante {
	
	private Long id;
	private String nombre;
	private String direccion;
	private String carnet;
	
	
	
	public Estudiante(Long id, String nombre, String direccion, String carnet) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.carnet = carnet;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	
	

}
