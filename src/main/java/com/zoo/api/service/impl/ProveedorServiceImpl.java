package com.zoo.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.IProveedorRepo;
import com.zoo.api.repository.modelo.Proveedor;
import com.zoo.api.service.interfaces.IProveedorService;

@Service
public class ProveedorServiceImpl implements IProveedorService{

	@Autowired
	private IProveedorRepo iProveedorRepo;
	
	@Override
	public void insertar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		proveedor.setActivo(true);
		this.iProveedorRepo.insertar(proveedor);
	}

	@Override
	public Proveedor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iProveedorRepo.buscar(id);
	}

	@Override
	public Proveedor buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iProveedorRepo.buscarNombre(nombre);
	}

	@Override
	public Proveedor buscarRuc(String ruc) {
		// TODO Auto-generated method stub
		return this.iProveedorRepo.buscarRuc(ruc);
	}

	@Override
	public List<Proveedor> buscarTipo(String tipo) {
		// TODO Auto-generated method stub
		return this.iProveedorRepo.buscarTipo(tipo);
	}

	@Override
	public List<Proveedor> buscarInnerJoin(String productoNombre) {
		// TODO Auto-generated method stub
		return this.buscarInnerJoin(productoNombre);
	}

	@Override
	public List<Proveedor> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iProveedorRepo.buscarTodos();
	}

	@Override
	public void actualizar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		
		if(this.iProveedorRepo.buscar(proveedor.getId()) != null) {
			this.iProveedorRepo.actualizar(proveedor);	
		}
		
	}

	@Override
	public void eliminar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		
		//1.Busco proveedor
		proveedor.setActivo(false);
		this.actualizar(proveedor);
	}

}
