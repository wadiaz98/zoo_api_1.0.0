package com.zoo.api.service.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Receta;

public interface IRecetaService {

	public void insertar(Receta receta);

	public List<Receta> buscarTodos();

	public List<Receta> buscarAnimal(String animal);

	public void actualizar(Receta receta);

	public Receta buscar(Integer id);

}
