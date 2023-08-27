package com.zoo.api.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zoo.api.repository.interfaces.IProveedorRepo;
import com.zoo.api.repository.modelo.Producto;
import com.zoo.api.repository.modelo.Proveedor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProveedorRepoImpl implements IProveedorRepo {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(proveedor);
	}

	@Override
	public Proveedor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Proveedor.class, id);
	}

	@Override
	public Proveedor buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Proveedor> query = this.entityManager.createQuery(
				"SELECT p FROM Proveedor p where p.nombre=: datoNombre and p.activo=true", Proveedor.class);
		query.setParameter("datoNombre", nombre);
		return query.getResultList().get(0);
	}

	@Override
	public Proveedor buscarRuc(String ruc) {
		// TODO Auto-generated method stub
		TypedQuery<Proveedor> query = this.entityManager
				.createQuery("SELECT p FROM Proveedor p where p.ruc=: datoRuc  and p.activo=true", Proveedor.class);
		query.setParameter("datoRuc", ruc);
		return query.getResultList().get(0);
	}

	@Override
	public List<Proveedor> buscarTipo(String tipo) {
		// TODO Auto-generated method stub
		TypedQuery<Proveedor> myQuery = this.entityManager
				.createQuery("SELECT p FROM Proveedor p where p.tipo=: datoTipo and p.activo=true", Proveedor.class);
		myQuery.setParameter("datoTipo", tipo);
		return myQuery.getResultList();
	}

	@Override
	public List<Proveedor> buscarInnerJoin(String productoNombre) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		TypedQuery<Proveedor> myQuery = this.entityManager.createQuery(
				"SELECT p FROM Proveedor p JOIN p.productos pro WHERE pro.proveedor.nombre=:datoTipo and p.activo=true",
				Proveedor.class);
		myQuery.setParameter("datoTipo", productoNombre);

		List<Proveedor> listaP = myQuery.getResultList();
		for (Proveedor p : listaP) {
			List<Producto> listaProdu = new ArrayList<>();
			for (Producto in : p.getProductos()) {
				if (in.getNombre().equals(productoNombre)) {
					listaProdu.add(in);
				}
			}
			p.setProductos(listaProdu);

		}

		return listaP;
	}

	@Override
	public List<Proveedor> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Proveedor> myQuery = this.entityManager.createQuery("SELECT p FROM Proveedor p where p.activo=true",
				Proveedor.class);
		
		return myQuery.getResultList();
	}

	@Override
	public void actualizar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(proveedor);
	}

}
