package com.zoo.api.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zoo.api.repository.interfaces.IInventarioRepo;
import com.zoo.api.repository.modelo.Inventario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class InventarioRepoImpl implements IInventarioRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(inventario);
	}

	@Override
	public List<Inventario> getAll() {
		// TODO Auto-generated method stub
		TypedQuery<Inventario> query = this.entityManager.createQuery("SELECT i FROM Inventario i where i.activo=true",
				Inventario.class);
		return query.getResultList();
	}

	@Override
	public void actualizar(Inventario inventario) {
		this.entityManager.merge(inventario);
	}

	@Override
	public Inventario get(Integer id) {
		return this.entityManager.find(Inventario.class, id);
	}

}
