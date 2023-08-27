package com.zoo.api.repository.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Animal;

public interface IAnimalRepo {

	public void crear(Animal animal);

	public void actualizarAnimal(Animal animal);

	public Animal buscar(Integer id);

	public Animal buscarNombre(String nombre);

	public List<Animal> buscarCientifico(String nombreCientifico);

	public List<Animal> buscarNombreComun(String nombreComun);

	public List<Animal> buscarEspecie(String especie);
	
	public List<Animal> buscarTodos();

}
