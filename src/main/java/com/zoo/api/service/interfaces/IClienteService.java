package com.zoo.api.service.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Cliente;

public interface IClienteService {

	public void registrar(Cliente persona);

	public Cliente buscar(Integer id);

	public Cliente buscarCedula(String cedula);

	public Cliente buscarUsuario(String usuario);

	public List<Cliente> buscarNombre(String nombre);

	public List<Cliente> buscarApellido(String apellido);
	
	public void eliminar(Cliente cliente);
	
	public void actualizarCliente(Cliente cliente);
	
	public List<Cliente> buscarTodos();

}
