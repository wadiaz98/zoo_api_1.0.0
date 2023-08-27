package com.zoo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.api.repository.modelo.Dieta;
import com.zoo.api.service.interfaces.IDietaService;

@RestController
@RequestMapping("/api/dieta")
public class DietaController {
	
	@Autowired
	private IDietaService idietaService;
	
	 @PostMapping("/dieta/insertar")
	    public void insertarDieta(@RequestBody Dieta dieta) {
		 idietaService.insertar(dieta);
	    }

	    @PutMapping("/dieta/actualizar")
	    public void actualizarDieta(@RequestBody Dieta dieta) {
	        if (buscarDietaPorId(dieta.getId()) != null) {
	        	idietaService.actualizar(dieta);
	        }
	    }

	    @GetMapping("/dieta/buscar/animal/{animal}")
	    public Dieta buscarDietaPorAnimal(@PathVariable String animal) {
	        return idietaService.buscarAnimal(animal);
	    }

	    @GetMapping("/dieta/buscar/todos")
	    public List<Dieta> buscarTodasLasDietas() {
	        return idietaService.buscarTodos();
	    }

	    @GetMapping("/dieta/buscar/{id}")
	    public Dieta buscarDietaPorId(@PathVariable Integer id) {
	        return idietaService.buscar(id);
	    }
	
	
	
}	

