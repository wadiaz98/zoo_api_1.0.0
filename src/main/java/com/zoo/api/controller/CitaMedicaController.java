package com.zoo.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.api.repository.interfaces.ICitaMedicaRepo;
import com.zoo.api.repository.modelo.CitaMedica;

@RestController
@RequestMapping("/api/citaMedica")

public class CitaMedicaController {
	
	 private  ICitaMedicaRepo iCitaMedicaRepo;

    @PostMapping("/citas/insertar")
    public void insertarCitaMedica(@RequestBody CitaMedica fichaMedica) {
        iCitaMedicaRepo.insertar(fichaMedica);
    }

    @PutMapping("/citas/actualizar")
    public void actualizarCitaMedica(@RequestBody CitaMedica citaMedica) {
        if (buscarCitaMedicaPorId(citaMedica.getId()) != null) {
            iCitaMedicaRepo.actualizar(citaMedica);
        }
    }

    @GetMapping("/citas/buscar/animal/{animal}")
    public List<CitaMedica> buscarCitasPorAnimal(@PathVariable String animal) {
        return iCitaMedicaRepo.buscarAnimal(animal);
    }

    @GetMapping("/citas/buscar/veterinario/{cedula}")
    public List<CitaMedica> buscarCitasPorVeterinario(@PathVariable String cedula) {
        return iCitaMedicaRepo.buscarVeterinario(cedula);
    }

    @GetMapping("/citas/buscar/todos")
    public List<CitaMedica> buscarTodasLasCitas() {
        return iCitaMedicaRepo.buscarTodos();
    }

    @GetMapping("/citas/buscar/{id}")
    public CitaMedica buscarCitaMedicaPorId(@PathVariable Integer id) {
        return iCitaMedicaRepo.buscar(id);
    }

}
