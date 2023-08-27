package com.zoo.api.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zoo.api.repository.interfaces.IEmpleadoRepo;
import com.zoo.api.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Empleado empleado) {
		this.entityManager.persist(empleado);
	}

	@Override
	public Empleado buscarCedula(String cedula) {
		TypedQuery<Empleado> query = this.entityManager.createQuery(
				"SELECT e FROM Empleado e WHERE " + " e.cedula =: datoCedula AND e.estado = true", Empleado.class);
		query.setParameter("datoCedula", cedula);

		try {
			return query.getSingleResult();
		} catch (Exception e) {

			return null;
		}
	}

	@Override
	public List<Empleado> buscarApellido(String apellido) {
		TypedQuery<Empleado> query = this.entityManager.createQuery(
				"SELECT e FROM Empleado e WHERE " + " e.apellido =: datoApellido AND e.estado = true", Empleado.class);
		query.setParameter("datoApellido", apellido);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Empleado> buscarCargo(String cargo) {
		TypedQuery<Empleado> query = this.entityManager.createQuery(
				"SELECT e FROM Empleado e WHERE " + " e.cargo =: datoCargo AND e.estado = true", Empleado.class);
		query.setParameter("datoCargo", cargo);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Empleado> buscarDepartamento(String departamento) {
		TypedQuery<Empleado> query = this.entityManager.createQuery(
				"SELECT e FROM Empleado e WHERE " + " e.departamento =: datoDepartamento AND e.estado = true",
				Empleado.class);
		query.setParameter("datoDepartamento", departamento);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Empleado> buscarHorario(String horario) {
		TypedQuery<Empleado> query = this.entityManager.createQuery(
				"SELECT e FROM Empleado e WHERE " + " e.horario =: datoHorario AND e.estado = true", Empleado.class);
		query.setParameter("datoHorario", horario);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Empleado> buscarEstadoCivil(String estadoCivil) {
		TypedQuery<Empleado> query = this.entityManager.createQuery(
				"SELECT e FROM Empleado e WHERE " + " e.estadoCivil =: datoEstadoCivil AND e.estado = true",
				Empleado.class);
		query.setParameter("datoEstadoCivil", estadoCivil);

		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public void actualizarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empleado);
	}

	@Override
	public List<Empleado> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> query = this.entityManager.createQuery("SELECT e FROM Empleado e where e.estado= true",
				Empleado.class);
		return query.getResultList();
	}

	@Override
	public Empleado buscarEmpleado(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id);
	}

}
