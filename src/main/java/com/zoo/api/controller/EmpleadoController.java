package com.zoo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.api.repository.modelo.Empleado;
import com.zoo.api.service.interfaces.IEmpleadoService;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService iEmpleadoService;

	@PostMapping("/insertar")
	public void insertarCliente(Empleado empleado) {
		this.iEmpleadoService.insertar(empleado);
	}

	@PutMapping("/empleados")
	public void modificarEmpleado(@RequestBody Empleado empleado) {
		this.iEmpleadoService.actualizarEmpleado(empleado);
	}

	@PutMapping("/actualizar")
	public void eliminar(@PathVariable Empleado empleado) {
		this.iEmpleadoService.eliminar(empleado);
	}

	@GetMapping("/cedula/{cedula}")
	public Empleado buscarCedula(@PathVariable String cedula) {
		return this.iEmpleadoService.buscarCedula(cedula);
	}

	@GetMapping("/apellido/{apellido}")
	public List<Empleado> buscarApellido(@PathVariable String apellido) {
		return this.iEmpleadoService.buscarApellido(apellido);
	}

	@GetMapping("/cargo/{cargo}")
	public List<Empleado> buscarCargo(@PathVariable String cargo) {
		return this.iEmpleadoService.buscarCargo(cargo);
	}

	@GetMapping("/departamento/{departamento}")
	public List<Empleado> buscarDepartamento(@PathVariable String departamento) {
		return this.iEmpleadoService.buscarDepartamento(departamento);
	}

	@GetMapping("/horario/{horario}")
	public List<Empleado> buscarHorario(@PathVariable String horario) {
		return this.iEmpleadoService.buscarHorario(horario);
	}

	@GetMapping("/estado-civil/{estadoCivil}")
	public List<Empleado> buscarEstadoCivil(@PathVariable String estadoCivil) {
		return this.iEmpleadoService.buscarEstadoCivil(estadoCivil);
	}
}
