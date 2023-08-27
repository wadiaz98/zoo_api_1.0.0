package com.zoo.api.repository.interfaces;

import com.zoo.api.repository.modelo.Zoologico;

public interface IZoologicoRepo {

	public void insertar(Zoologico zoologico);
	
	public Zoologico buscar(Integer id);

}
