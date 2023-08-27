package com.zoo.api.service.interfaces;

import java.util.List;

import com.zoo.api.repository.modelo.Producto;

public interface IProductoService {

	// INGRESO Y REGISTRO DE PRODUCTO
	public void insertar(Producto producto);

	// BUSCAR PRODUCTO
	public Producto buscar(Integer id);

	public List<Producto> buscarNombre(String nombre);

	public Producto buscarCodigo(String codigo);

	public List<Producto> buscarTipo(String tipo);

	// Verificaremos con un inner join si hay producto en proveedores
	public List<Producto> buscarInnerJoin(String proveedorService);

	// Metodo de busqueda para la vista
	public List<Producto> buscarTodos();

	// ACTUALIZAR PRODUCTO
	public void actualizar(Producto producto);

	// Eliminar
	// Para este método solo cambiaremos el estado del proveedor
	// de activo a inactivo
	// PROBAR LA FUNCIONALIDAD CON LA VISTA
	public void eliminarEstado(Producto producto);

}
