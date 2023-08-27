package com.zoo.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.IAnimalRepo;
import com.zoo.api.repository.modelo.Animal;
import com.zoo.api.service.interfaces.IAnimalService;

@Service
public class AnimalServiceImpl implements IAnimalService {

	@Autowired
	private IAnimalRepo iAnimalRepo;

	@Override
	public void ingresar(Animal animal) {
		animal.setEstado(true);
		this.iAnimalRepo.crear(animal);

	}

	@Override
	public Animal encontar(Integer id) {
		// TODO Auto-generated method stub
		return this.iAnimalRepo.buscar(id);
	}

	@Override
	public List<Animal> encontarCientifico(String nombreCientifico) {
		// TODO Auto-generated method stub
		return this.iAnimalRepo.buscarCientifico(nombreCientifico);
	}

	@Override
	public List<Animal> encontarEspecie(String especie) {
		// TODO Auto-generated method stub
		return this.iAnimalRepo.buscarEspecie(especie);
	}

	@Override
	public Animal encontarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iAnimalRepo.buscarNombre(nombre);
	}

	@Override
	public void modificarAnimal(Animal animal) {
		// TODO Auto-generated method stub

		if (this.encontar(animal.getId()) != null)
			this.iAnimalRepo.actualizarAnimal(animal);
	}

	@Override
	public void eliminar(Animal animal) {
		// TODO Auto-generated method stub
		animal.setEstado(false);
		this.modificarAnimal(animal);
	}

	@Override
	public List<Animal> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iAnimalRepo.buscarTodos();
	}

}
