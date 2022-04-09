package com.progra3.datos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progra3.datos.dao.ProductoDao;
import com.progra3.datos.entities.Producto;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	//inyectamos el dao
	@Autowired
	private ProductoDao productoDao;

	//implementacion del metodo para listar
	@Override
	public List<Producto> findAll() {
		//se invoca al metodo findAll del dao
		return (List<Producto>)productoDao.findAll();
	}

	//implementacion del metodo para obtener producto especifico
	@Override
	public Producto findById(Long id) {		
		//se invoca al metodo del dao
		//el dao retorna un optional para proteger de valores nulos
		return productoDao.findById(id).orElse(null);
	}

	@Override
	public void createProducto(Producto producto) {
		productoDao.save(producto);
		
	}

	@Override
	public void modifyProducto(Long id, Producto producto) {
		if (productoDao.existsById(id)) {
			producto.setId(id);
			productoDao.save(producto);
		}
		
	}

	@Override
	public void deleteProducto(Long id) {
		if (productoDao.existsById(id)) {
			productoDao.deleteById(id);
		}
		
	}

}
