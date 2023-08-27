package com.zoo.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.IClienteRepo;
import com.zoo.api.repository.modelo.Cliente;
import com.zoo.api.repository.modelo.Datos;
import com.zoo.api.service.interfaces.IClienteService;


@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo iClienteRepo;
	
	@Override
	public void registrar(Cliente persona) {
		// TODO Auto-generated method stub
		persona.setEstado(true);
		this.iClienteRepo.insertar(persona);
	}

	@Override
	public void eliminar(Cliente cliente) {
		// TODO Auto-generated method stub
		cliente.setEstado(false);
		this.actualizarCliente(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscar(id);
	}

	@Override
	public Cliente buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscarCedula(cedula);
	}

	@Override
	public Cliente buscarUsuario(String usuario) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscarUsuario(usuario);
	}

	@Override
	public List<Cliente> buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscarNombre(nombre);
	}

	@Override
	public List<Cliente> buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscarApellido(apellido);
	}

	@Override
	public void actualizarCliente(Cliente persona) {
		// TODO Auto-generated method stub
		if(this.buscar(persona.getId())!= null) {
			this.iClienteRepo.actualizarCliente(persona);
		}
		
	}

	@Override
	public List<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscarTodos();
	}

}
