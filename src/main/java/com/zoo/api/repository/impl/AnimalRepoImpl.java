package com.zoo.api.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zoo.api.repository.interfaces.IAnimalRepo;
import com.zoo.api.repository.modelo.Animal;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AnimalRepoImpl implements IAnimalRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Animal animal) {
		this.entityManager.persist(animal);

	}

	@Override
	public Animal buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Animal.class, id);
	}

	@Override
	public Animal buscarNombre(String nombre) {
		TypedQuery<Animal> query = this.entityManager.createQuery(
				"SELECT a FROM Animal a WHERE " + " a.nombre =: datoNombre AND a.estado = true", Animal.class);
		query.setParameter("datoNombre", nombre);

		try {
			return query.getSingleResult();
		} catch (Exception a) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Animal> buscarCientifico(String nombreCientifico) {
		TypedQuery<Animal> query = this.entityManager.createQuery(
				"SELECT a FROM Animal a WHERE " + " a.nombreCientifico =: datoNombreCientifico AND a.estado = true",
				Animal.class);
		query.setParameter("datoNombreCientifico", nombreCientifico);

		try {
			return query.getResultList();
		} catch (Exception a) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Animal> buscarEspecie(String especie) {
		TypedQuery<Animal> query = this.entityManager.createQuery(
				"SELECT a FROM Animal a WHERE " + " a.especie =: datoEspecie AND a.estado = true", Animal.class);
		query.setParameter("datoEspecie", especie);

		try {
			return query.getResultList();
		} catch (Exception a) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Animal> buscarNombreComun(String nombreComun) {

		TypedQuery<Animal> query = this.entityManager.createQuery(
				"SELECT a FROM Animal a WHERE " + " a.nombreComun =: datoNombreComun AND a.estado = true",
				Animal.class);
		query.setParameter("datoNombreComun", nombreComun);

		try {
			return query.getResultList();
		} catch (Exception a) {
			// TODO: handle exception
			return null;
		}

	}

	@Override
	public void actualizarAnimal(Animal animal) {
		// TODO Auto-generated method stub
		this.entityManager.merge(animal);
	}

	@Override
	public List<Animal> buscarTodos() {
		// TODO Auto-generated method stub
		
		TypedQuery<Animal> query = this.entityManager.createQuery("SELECT a FROM Animal a where a.estado=true",
				Animal.class);
		return query.getResultList();
	}

}
