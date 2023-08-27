package com.zoo.api.repository.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Dieta;

public interface IDietaRepo {
	
	public void insertar(Dieta dieta);
	
	public void actualizar(Dieta dieta);
	
	public Dieta buscarAnimal(String animal);
	
	public List<Dieta> buscarTodos();
	
	public Dieta buscar(Integer id);
}
