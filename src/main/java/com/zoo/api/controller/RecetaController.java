package com.zoo.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.api.repository.modelo.Receta;
import com.zoo.api.service.interfaces.IRecetaService;

@RestController
@RequestMapping("/api/receta")
public class RecetaController {
	
	 private  IRecetaService iRecetaService;

	   

	    @PostMapping("/receta/insertar")
	    public void insertarReceta(@RequestBody Receta receta) {
	        this.iRecetaService.insertar(receta);
	    }

	    @GetMapping("/receta/buscar/todos")
	    public List<Receta> buscarTodasLasRecetas() {
	        return this.iRecetaService.buscarTodos();
	    }

	    @GetMapping("/receta/buscar/animal/{animal}")
	    public List<Receta> buscarRecetasPorAnimal(@PathVariable String animal) {
	        return this.iRecetaService.buscarAnimal(animal);
	    }

	    @PutMapping("/receta/actualizar")
	    public void actualizarReceta(@RequestBody Receta receta) {
	        this.iRecetaService.actualizar(receta);
	    }

	    @GetMapping("/receta/buscar/{id}")
	    public Receta buscarRecetaPorId(@PathVariable Integer id) {
	       return  this.iRecetaService.buscar(id);
	    }

}
