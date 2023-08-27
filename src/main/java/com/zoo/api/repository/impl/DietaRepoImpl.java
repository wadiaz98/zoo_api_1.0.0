package com.zoo.api.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zoo.api.repository.interfaces.IDietaRepo;
import com.zoo.api.repository.modelo.Dieta;
import com.zoo.api.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DietaRepoImpl implements IDietaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Dieta dieta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(dieta);
	}

	@Override
	public void actualizar(Dieta dieta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(dieta);
	}

	@Override
	public Dieta buscarAnimal(String animal) {
		// TODO Auto-generated method stub
		TypedQuery<Dieta> query = this.entityManager.createQuery("SELECT d FROM Dieta d JOIN d.animal a WHERE "
				+ " a.nombreComun =: datoAnimal AND a.estado = true", Dieta.class);
		query.setParameter("datoAnimal", animal);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Dieta> buscarTodos() {
		// TODO Auto-generated method stub
		
		TypedQuery<Dieta> query = this.entityManager.createQuery("SELECT d FROM Dieta d",
				Dieta.class);
		return query.getResultList();
	}

	@Override
	public Dieta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Dieta.class, id);
	}

}
