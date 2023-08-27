package com.zoo.api.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zoo.api.repository.interfaces.IFacturaRepo;
import com.zoo.api.repository.modelo.Cliente;
import com.zoo.api.repository.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo{

	@PersistenceContext
	private EntityManager entityManager; 
	
	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}

	@Override
	public List<Factura> buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		
		TypedQuery<Factura> query = this.entityManager.createQuery(
				"SELECT f FROM Factura f JOIN f.cliente c JOIN c.dato d WHERE "
						+ " d.cedula =: datoCedula", Factura.class);
		query.setParameter("datoCedula", cedula);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Factura> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Factura> query = this.entityManager.createQuery("SELECT f FROM Factura f",
				Factura.class);
		return query.getResultList();
	}

}
