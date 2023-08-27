package com.zoo.api.repository.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Proveedor;

public interface IProveedorRepo {
	
	// INGRESO Y REGISTRO DE EMPLEADOS
	public void insertar(Proveedor proveedor);

	// BUSCAR PROVEEDOR

	// Para estos metodos, verificaremos si estan activos
	// para mostrar los resultados correspondientes
	public Proveedor buscar(Integer id);

	public Proveedor buscarNombre(String nombre);

	public Proveedor buscarRuc(String ruc);

	public List<Proveedor> buscarTipo(String tipo);

	// Verificaremos con un inner join si hay proveedores en el producto
	// Ademas, buscamos por el nombre del producto
	public List<Proveedor> buscarInnerJoin(String productoNombre);

	// Metodo de busqueda para la vista
	public List<Proveedor> buscarTodos();

	// ACTUALIZAR PROVEEDOR
	public void actualizar(Proveedor proveedor);

}
