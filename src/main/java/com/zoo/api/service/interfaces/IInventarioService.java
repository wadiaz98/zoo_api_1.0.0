package com.zoo.api.service.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Inventario;

public interface IInventarioService {

	public void insertar(Inventario inventario);

	public void salida(Integer id, Integer cantidad);

	public List<Inventario> buscarTodos();

	public Inventario buscar(Integer id);

}
