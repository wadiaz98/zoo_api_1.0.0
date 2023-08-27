package com.zoo.api.service.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Animal;

public interface IAnimalService {

	public void ingresar(Animal animal);

	public void modificarAnimal(Animal animal);
	
	public void eliminar(Animal nombre);

	public Animal encontar(Integer id);

	public Animal encontarNombre(String nombre);

	public List<Animal> encontarCientifico(String nombreCientifico);

	public List<Animal> encontarEspecie(String especie);
	
	public List<Animal> buscarTodos();
}
