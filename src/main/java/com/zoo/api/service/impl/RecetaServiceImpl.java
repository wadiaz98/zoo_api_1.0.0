package com.zoo.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.IRecetaRepo;
import com.zoo.api.repository.modelo.Receta;
import com.zoo.api.service.interfaces.IRecetaService;

@Service
public class RecetaServiceImpl implements IRecetaService{

	@Autowired
	private IRecetaRepo iRecetaRepo;

	@Override
	public void insertar(Receta receta) {
		// TODO Auto-generated method stub
		this.iRecetaRepo.insertar(receta);
	}

	@Override
	public List<Receta> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iRecetaRepo.buscarTodos();
	}

	@Override
	public List<Receta> buscarAnimal(String animal) {
		// TODO Auto-generated method stub
		return this.iRecetaRepo.buscarAnimal(animal);
	}

	@Override
	public void actualizar(Receta receta) {
		// TODO Auto-generated method stub
		if(this.buscar(receta.getId())!= null)
			this.iRecetaRepo.actualizar(receta);
	}

	@Override
	public Receta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iRecetaRepo.buscar(id);
	}
	
	
	
}
