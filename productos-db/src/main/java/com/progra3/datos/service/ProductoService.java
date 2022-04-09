package com.progra3.datos.service;

import java.util.List;

import com.progra3.datos.entities.Producto;


public interface ProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
	public void createProducto(Producto producto);
	public void modifyProducto(Long id, Producto producto);
	public void deleteProducto(Long id);

}
