package com.zoo.api.repository.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Inventario;

public interface IInventarioRepo {

	public void insertar(Inventario inventario);

	public List<Inventario> getAll();
	
	public Inventario get(Integer id);

	public void actualizar(Inventario inventario);

}
