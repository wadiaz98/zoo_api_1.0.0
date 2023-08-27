package com.zoo.api.repository.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Factura;

public interface IFacturaRepo {

	public void insertar(Factura factura);

	public List<Factura> buscarCedula(String cedula);

	public List<Factura> buscarTodos();

}
