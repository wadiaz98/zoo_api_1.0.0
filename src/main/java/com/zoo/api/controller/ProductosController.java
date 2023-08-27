package com.zoo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.api.repository.modelo.Producto;
import com.zoo.api.service.interfaces.IProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductosController {

	@Autowired
	private IProductoService iProductoService;

	
	@PostMapping("/insertar")
	public void insertarCliente(Producto producto) {
		this.iProductoService.insertar(producto);
	}

	@GetMapping("/nombre/{nombre}")
	public List<Producto> buscarPorNombre(@PathVariable String nombre) {
		return iProductoService.buscarNombre(nombre);
	}

	@GetMapping("/codigo/{codigo}")
	public Producto buscarPorCodigo(@PathVariable String codigo) {
		return iProductoService.buscarCodigo(codigo);
	}

	@GetMapping("/tipo/{tipo}")
	public List<Producto> buscarPorTipo(@PathVariable String tipo) {
		return iProductoService.buscarTipo(tipo);
	}

	@GetMapping("/proveedor/{proveedorNombre}")
	public List<Producto> buscarPorProveedor(@PathVariable String proveedorNombre) {
		return iProductoService.buscarInnerJoin(proveedorNombre);
	}

	@GetMapping("/producto/todos")
	public List<Producto> buscarTodos() {
		return iProductoService.buscarTodos();
	}

	@PutMapping("/productoActualizado")
	public void actualizarProducto(@RequestBody Producto producto) {
		iProductoService.actualizar(producto);
	}

}
