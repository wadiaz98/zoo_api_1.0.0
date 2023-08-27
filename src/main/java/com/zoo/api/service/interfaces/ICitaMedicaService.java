package com.zoo.api.service.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.CitaMedica;

public interface ICitaMedicaService {

	public void insertar(CitaMedica fichaMedica);

	public void actualizar(CitaMedica citaMedica);

	public List<CitaMedica> buscarAnimal(String animal);

	public List<CitaMedica> buscarVeterinario(String veterinario);

	public List<CitaMedica> buscarTodos();

	public CitaMedica buscar(Integer id);

}
