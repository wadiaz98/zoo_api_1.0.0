package com.zoo.api.repository.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Producto;

public interface IProductoRepo {

	// INGRESO Y REGISTRO DE PRODUCTO
	public void insertar(Producto producto);

	// BUSCAR PRODUCTO
	// Par esto verificamos que el producto y el proveedor esten activos
	public Producto buscar(Integer id);

	public List<Producto> buscarNombre(String nombre);

	public Producto buscarCodigo(String codigo);

	public List<Producto> buscarTipo(String tipo);

	// Verificaremos con un inner join si hay producto en proveedores
	// VAmos a buscar por el nombre del proveedor
	public List<Producto> buscarInnerJoin(String proveedorNombre);

	// Metodo de busqueda para la vista
	public List<Producto> buscarTodos();

	// ACTUALIZAR PRODUCTO
	public void actualizar(Producto producto);

}
