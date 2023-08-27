package com.zoo.api.repository.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.CitaMedica;

public interface ICitaMedicaRepo {

	public void insertar(CitaMedica fichaMedica);

	public void actualizar(CitaMedica citaMedica);

	public List<CitaMedica> buscarAnimal(String animal);

	public List<CitaMedica> buscarVeterinario(String veterinario);

	public List<CitaMedica> buscarTodos();
	
	public CitaMedica buscar(Integer id);
}
