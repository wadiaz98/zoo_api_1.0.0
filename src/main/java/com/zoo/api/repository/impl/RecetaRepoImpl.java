package com.zoo.api.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zoo.api.repository.interfaces.IRecetaRepo;
import com.zoo.api.repository.modelo.Receta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RecetaRepoImpl implements IRecetaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Receta receta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(receta);
	}

	@Override
	public List<Receta> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Receta> query = this.entityManager.createQuery("SELECT r FROM Receta r", Receta.class);
		return query.getResultList();
	}

	@Override
	public List<Receta> buscarAnimal(String animal) {
		// TODO Auto-generated method stub
		TypedQuery<Receta> query = this.entityManager
				.createQuery("SELECT r FROM Receta r JOIN r.citaMedica c JOIN c.animal a WHERE "
						+ " a.nombreComun =: datoAnimal AND a.estado = true", Receta.class);
		query.setParameter("datoAnimal", animal);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public void actualizar(Receta receta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(receta);
	}

	@Override
	public Receta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Receta.class, id);
	}
}
