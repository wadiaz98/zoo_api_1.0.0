package com.zoo.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.ICitaMedicaRepo;
import com.zoo.api.repository.modelo.CitaMedica;
import com.zoo.api.service.interfaces.ICitaMedicaService;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{
	
	@Autowired
	private ICitaMedicaRepo iCitaMedicaRepo;

	@Override
	public void insertar(CitaMedica fichaMedica) {
		// TODO Auto-generated method stub
		this.iCitaMedicaRepo.insertar(fichaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		if(this.buscar(citaMedica.getId())!= null)
		this.iCitaMedicaRepo.actualizar(citaMedica);
	}

	@Override
	public List<CitaMedica> buscarAnimal(String animal) {
		// TODO Auto-generated method stub
		return this.iCitaMedicaRepo.buscarAnimal(animal);
	}

	@Override
	public List<CitaMedica> buscarVeterinario(String cedula) {
		// TODO Auto-generated method stub
		return this.iCitaMedicaRepo.buscarVeterinario(cedula);
	}

	@Override
	public List<CitaMedica> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iCitaMedicaRepo.buscarTodos();
	}

	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCitaMedicaRepo.buscar(id);
	}
}
