package com.zoo.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.IDietaRepo;
import com.zoo.api.repository.modelo.Dieta;
import com.zoo.api.service.interfaces.IDietaService;

@Service
public class DietaServiceImpl implements IDietaService {

	@Autowired
	private IDietaRepo iDietaRepo;

	@Override
	public void insertar(Dieta dieta) {
		// TODO Auto-generated method stub
		this.iDietaRepo.insertar(dieta);
	}

	@Override
	public void actualizar(Dieta dieta) {
		// TODO Auto-generated method stub
		if (this.buscar(dieta.getId()) != null)
			this.iDietaRepo.actualizar(dieta);
	}

	@Override
	public Dieta buscarAnimal(String animal) {
		// TODO Auto-generated method stub
		return this.iDietaRepo.buscarAnimal(animal);
	}

	@Override
	public List<Dieta> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iDietaRepo.buscarTodos();
	}

	@Override
	public Dieta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iDietaRepo.buscar(id);
	}

}
