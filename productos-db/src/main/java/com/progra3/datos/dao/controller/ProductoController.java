package com.progra3.datos.dao.controller;

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

import com.progra3.datos.entities.Producto;
import com.progra3.datos.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	//inyectar el servicio de productos
	@Autowired
	ProductoService productoService;
	
	@GetMapping
	public List<Producto> listarProductos(){
		//invocar el metodo findAll del servicio
		return productoService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Producto obtenerProducto(@PathVariable Long id) {
		//invocar el metodo findById del producto
		return productoService.findById(id);
	}
	
	@PostMapping() //utilizamos post para crear un nuevo producto
	public void crearProducto(@RequestBody Producto producto) {
		productoService.createProducto(producto);
	}
	
	@PutMapping(value = "/{id}") //utilizamos put para modificar un producto existente
	public void modificarProducto(@PathVariable Long id, @RequestBody Producto producto) {
		productoService.modifyProducto(id, producto);
	}
	
	@DeleteMapping(value = "/{id}") //utilizamos delete para eliminar un producto
	public void modificarProducto(@PathVariable Long id) {
		productoService.deleteProducto(id);
	}

}
