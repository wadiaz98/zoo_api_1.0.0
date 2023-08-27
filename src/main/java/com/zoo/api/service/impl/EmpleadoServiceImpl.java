package com.zoo.api.service.impl;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.IEmpleadoRepo;
import com.zoo.api.repository.modelo.Empleado;
import com.zoo.api.service.interfaces.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepo iEmpleadoRepo;

	@Override
	public void insertar(Empleado empleado) {

		empleado.setEstado(true);
		var f =  empleado.getDatos().getFechaNacimiento();
		if( f!= null) {
			var edad = (int)ChronoUnit.YEARS.between(LocalDateTime.now(), f);
			
			empleado.getDatos().setEdad(edad);
		}
		
		var usr = empleado.getUsuario();
		usr.setUsuario(empleado.getDatos().getCedula());
		usr.setContrasenia(empleado.getDatos().getCedula());
		this.iEmpleadoRepo.insertar(empleado);
	}

	@Override
	public Empleado buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepo.buscarCedula(cedula);
	}

	@Override
	public List<Empleado> buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepo.buscarApellido(apellido);
	}

	@Override
	public List<Empleado> buscarCargo(String cargo) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepo.buscarCargo(cargo);
	}

	@Override
	public List<Empleado> buscarDepartamento(String departamento) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepo.buscarDepartamento(departamento);
	}

	@Override
	public List<Empleado> buscarHorario(String horario) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepo.buscarHorario(horario);
	}

	@Override
	public List<Empleado> buscarEstadoCivil(String estadoCivil) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepo.buscarEstadoCivil(estadoCivil);
	}

	@Override
	public void eliminar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleado.setEstado(false);
		this.actualizarEmpleado(empleado);
	}

	@Override
	public void actualizarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		if (this.buscarEmpleado(empleado.getId()) != null) {
			this.iEmpleadoRepo.actualizarEmpleado(empleado);
		}

	}

	@Override
	public List<Empleado> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepo.buscarTodos();
	}

	@Override
	public Empleado buscarEmpleado(Integer id) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepo.buscarEmpleado(id);
	}

}
