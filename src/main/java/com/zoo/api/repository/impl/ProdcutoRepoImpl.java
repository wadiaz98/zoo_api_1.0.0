package com.zoo.api.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zoo.api.repository.interfaces.IProductoRepo;
import com.zoo.api.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProdcutoRepoImpl implements IProductoRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public List<Producto> buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> query = this.entityManager
				.createQuery("SELECT p FROM Producto p where p.nombre=: datoNombre and p.proveedor.activo=true and p.activo=true", Producto.class);
		query.setParameter("datoNombre", nombre);
		return query.getResultList();
	}

	@Override
	public Producto buscarCodigo(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> query = this.entityManager
				.createQuery("SELECT p FROM Producto p where p.codigo=: datoNombre and p.proveedor.activo=true and p.activo=true", Producto.class);
		query.setParameter("datoNombre", codigo);
		return query.getResultList().get(0);
	}

	@Override
	public List<Producto> buscarTipo(String tipo) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> query = this.entityManager
				.createQuery("SELECT p FROM Producto p where p.tipo=: datoNombre and p.proveedor.activo=true and p.activo=true", Producto.class);
		query.setParameter("datoNombre", tipo);
		return query.getResultList();
	}

	//Verificar metodo. En este metodo verifico si el producto y el proveedor estan activos
	@Override
	public List<Producto> buscarInnerJoin(String proveedorNombre) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> myQuery = this.entityManager.createQuery(
				"SELECT pro FROM Producto pro JOIN pro.proveedor p WHERE p.nombre=:datoTipo and pro.activo=true and p.activo=true", Producto.class);
		myQuery.setParameter("datoTipo", proveedorNombre);
		return myQuery.getResultList();
	}

	@Override
	public List<Producto> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Producto> query = this.entityManager
				.createQuery("SELECT p FROM Producto p where p.proveedor.activo=true and p.activo=true", Producto.class);
		//query.setParameter("datoNombre", nombre);
		return query.getResultList();
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}



}
