package com.zoo.api.service.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Empleado;

public interface IEmpleadoService {

	/// INGRESO Y REGISTRO DE EMPLEADOS
	public void insertar(Empleado empleado);

	// ACTUALIZACION DE EMPLEADO
	public void actualizarEmpleado(Empleado empleado);

	// BUSQUEDA DE EMPLEADOS
	public Empleado buscarCedula(String cedula);

	public List<Empleado> buscarApellido(String apellido);

	public List<Empleado> buscarCargo(String cargo);

	public List<Empleado> buscarDepartamento(String departamento);

	public List<Empleado> buscarHorario(String horario);

	public List<Empleado> buscarEstadoCivil(String estadoCivil);

	public List<Empleado> buscarTodos();

	public Empleado buscarEmpleado(Integer id);

	public void eliminar(Empleado empleado);

}
