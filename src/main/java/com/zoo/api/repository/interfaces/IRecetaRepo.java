package com.zoo.api.repository.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Receta;

public interface IRecetaRepo {

	public void insertar(Receta receta);
	
	public Receta buscar(Integer id);

	public List<Receta> buscarTodos();

	public List<Receta> buscarAnimal(String animal);

	public void actualizar(Receta receta);
}
