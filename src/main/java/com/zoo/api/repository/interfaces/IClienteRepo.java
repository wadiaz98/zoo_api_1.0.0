package com.zoo.api.repository.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Cliente;

public interface IClienteRepo {

	public void insertar(Cliente persona);

	public void actualizarCliente(Cliente cliente);

	public Cliente buscar(Integer id);

	public Cliente buscarCedula(String cedula);

	public Cliente buscarUsuario(String usuario);

	public List<Cliente> buscarNombre(String nombre);

	public List<Cliente> buscarApellido(String apellido);
	
	public List<Cliente> buscarTodos();
}
