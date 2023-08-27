package com.zoo.api.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zoo.api.repository.interfaces.IClienteRepo;
import com.zoo.api.repository.modelo.Cliente;
import com.zoo.api.repository.modelo.Datos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cliente persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, id);
	}

	@Override
	public Cliente buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = this.entityManager.createQuery("SELECT c FROM Cliente c JOIN c.dato d WHERE "
				+ " d.cedula =: datoCedula AND c.estado = true AND d.estado = true", Cliente.class);
		query.setParameter("datoCedula", cedula);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	@Override
	public Cliente buscarUsuario(String usuario) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = this.entityManager.createQuery(
				"SELECT c FROM Cliente c JOIN c.usuario u WHERE "
						+ " u.usuario =: datoUsuario AND c.estado = true AND u.estado = true", Cliente.class);
		query.setParameter("datoUsuario", usuario);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	@Override
	public List<Cliente> buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = this.entityManager.createQuery(
				"SELECT c FROM Cliente c JOIN c.dato d WHERE "
						+ " d.nombre =: datoNombre AND c.estado = true AND d.estado = true", Cliente.class);
		query.setParameter("datoNombre", nombre);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	@Override
	public List<Cliente> buscarApellido(String apellido) {
		// TODO Auto-generated method stub

		TypedQuery<Cliente> query = this.entityManager.createQuery(
				"SELECT c FROM Cliente c JOIN c.dato d WHERE "
						+ " d.apellido =: datoApellido AND c.estado = true AND d.estado = true", Cliente.class);
		query.setParameter("datoApellido", apellido);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
		this.entityManager.merge(cliente);
	}

	@Override
	public List<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = this.entityManager.createQuery("SELECT c "
				+ " FROM Cliente c" 
				+ " JOIN c.dato d " 
				+ "JOIN c.usuario u where c.activo=true AND d.estado = true AND u.estado = true",
				Cliente.class);
		return query.getResultList();
	}

}
