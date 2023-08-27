package com.zoo.api.service.impl;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.IProductoRepo;
import com.zoo.api.repository.modelo.Producto;
import com.zoo.api.service.interfaces.IProductoService;

@Service
public class ProductoServiceImpl  implements IProductoService{

	@Autowired
	private IProductoRepo iProductoRepo;
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		producto.setActivo(true);
		this.iProductoRepo.insertar(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscar(id);
	}

	@Override
	public List<Producto> buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscarNombre(nombre);
	}

	@Override
	public Producto buscarCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscarCodigo(codigo);
	}

	@Override
	public List<Producto> buscarTipo(String tipo) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscarTipo(tipo);
	}

	@Override
	public List<Producto> buscarInnerJoin(String proveedorNombre) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscarInnerJoin(proveedorNombre);
	}

	@Override
	public List<Producto> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscarTodos();
	}

	@Override
	public void actualizar(Producto producto) {
		if(this.iProductoRepo.buscar(producto.getId()) != null) {
			this.iProductoRepo.actualizar(producto);	
		}
	}

	@Override
	public void eliminarEstado(Producto producto) {
		// TODO Auto-generated method stub
		producto.setActivo(false);
		this.actualizar(producto);
	}

}
