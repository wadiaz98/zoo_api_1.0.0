package com.zoo.api.repository.impl;

import org.springframework.stereotype.Repository;

import com.zoo.api.repository.interfaces.IZoologicoRepo;
import com.zoo.api.repository.modelo.Zoologico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ZoologicoRepoImpl implements IZoologicoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Zoologico zoologico) {
		// TODO Auto-generated method stub
		this.entityManager.persist(zoologico);
	}

	@Override
	public Zoologico buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Zoologico.class, id);
	}

}
