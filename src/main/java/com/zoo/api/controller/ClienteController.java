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

import com.zoo.api.repository.modelo.Cliente;
import com.zoo.api.service.interfaces.IClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	@Autowired
	private IClienteService iClienteService;

	@PostMapping("/insertar")
	public void insertarCliente(Cliente cliente) {
		this.iClienteService.registrar(cliente);
	}

	@PutMapping("/clientes")
	public void actualizarPersona(@RequestBody Cliente persona) {
		iClienteService.actualizarCliente(persona);
	}

	@DeleteMapping("/actualizar")
	public void eliminar(@RequestBody Cliente cliente) {
		this.iClienteService.eliminar(cliente);
	}

	@GetMapping("/{id}")
	public Cliente buscar(@PathVariable Integer id) {
		return iClienteService.buscar(id);
	}

	@GetMapping("/cedula/{cedula}")
	public Cliente buscarCedula(@PathVariable String cedula) {
		return iClienteService.buscarCedula(cedula);
	}

	@GetMapping("/usuario/{usuario}")
	public Cliente buscarUsuario(@PathVariable String usuario) {
		return iClienteService.buscarUsuario(usuario);
	}

	@GetMapping("/nombre/{nombre}")
	public List<Cliente> buscarNombre(@PathVariable String nombre) {
		return iClienteService.buscarNombre(nombre);
	}

	@GetMapping("/apellido/{apellido}")
	public List<Cliente> buscarApellido(@PathVariable String apellido) {
		return iClienteService.buscarApellido(apellido);
	}
}
