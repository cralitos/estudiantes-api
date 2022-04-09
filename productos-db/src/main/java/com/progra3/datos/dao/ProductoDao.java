package com.progra3.datos.dao;

import org.springframework.data.repository.CrudRepository;

import com.progra3.datos.entities.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
