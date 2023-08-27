package com.zoo.api.repository.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.ICitaMedicaRepo;
import com.zoo.api.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica fichaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(fichaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public List<CitaMedica> buscarAnimal(String animal) {
		// TODO Auto-generated method stub

		TypedQuery<CitaMedica> query = this.entityManager
				.createQuery("SELECT c FROM CitaMedica c JOIN c.animal a WHERE "
						+ " a.nombreComun =: datoAnimal AND a.estado = true", CitaMedica.class);
		query.setParameter("datoAnimal", animal);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<CitaMedica> buscarVeterinario(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica> query = this.entityManager
				.createQuery("SELECT c FROM CitaMedica c JOIN c.empleado e JOIN e.dato d WHERE "
						+ " d.cedula =: datoCedula AND a.estado = true", CitaMedica.class);
		query.setParameter("datoApellido", cedula);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<CitaMedica> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica> query = this.entityManager.createQuery("SELECT c FROM CitaMedica c",
				CitaMedica.class);
		return query.getResultList();
	}

	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}

}
