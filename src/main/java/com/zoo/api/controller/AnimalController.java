package com.zoo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.api.repository.modelo.Animal;
import com.zoo.api.service.interfaces.IAnimalService;

@RestController
@RequestMapping("/api/animal")
public class AnimalController {

	@Autowired
	private IAnimalService iAnimalService;

	@PostMapping("/insertar")
	public void insertarCliente(Animal animal) {
		this.iAnimalService.ingresar(animal);
	}

	@PutMapping("/modificar")
	public void modificarAnimal(@RequestBody Animal animal) {
		iAnimalService.modificarAnimal(animal);
	}

	@DeleteMapping("/actualiza")
	public void eliminar(@RequestBody Animal animal) {
		iAnimalService.eliminar(animal);
	}

	@GetMapping("/{id}")
	public Animal encontrar(@PathVariable Integer id) {
		return iAnimalService.encontar(id);
	}

	@GetMapping("/nombre/{nombre}")
	public Animal encontrarNombre(@PathVariable String nombre) {
		return iAnimalService.encontarNombre(nombre);
	}

	@GetMapping("/cientifico/{nombreCientifico}")
	public List<Animal> encontrarCientifico(@PathVariable String nombreCientifico) {
		return iAnimalService.encontarCientifico(nombreCientifico);
	}

	@GetMapping("/especie/{especie}")
	public List<Animal> encontrarEspecie(@PathVariable String especie) {
		return iAnimalService.encontarEspecie(especie);
	}
	
	
	
	

}
