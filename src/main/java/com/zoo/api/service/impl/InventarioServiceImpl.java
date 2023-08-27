package com.zoo.api.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.IInventarioRepo;
import com.zoo.api.repository.modelo.Inventario;
import com.zoo.api.service.interfaces.IInventarioService;

@Service
public class InventarioServiceImpl implements IInventarioService {
	@Autowired
	private IInventarioRepo iInventarioRepo;

	@Override
	public void insertar(Inventario inventario) {
		inventario.setFechaIngreso(LocalDateTime.now());
		this.iInventarioRepo.insertar(inventario);
	}

	@Override
	public void salida(Integer id, Integer cantidad) {
		Inventario inventario =  this.iInventarioRepo.get(id);
		var tiempo = inventario.getProducto().getTiempoEntrega();
		var residuo = inventario.getCantidad()-cantidad;
		var alerta = tiempo * inventario.getGasto();
		if (alerta <= residuo) {
			System.err.println("ESTA ES LA ALERTA");
		}
		inventario.setFechaSalida(LocalDateTime.now());
		
		inventario.setCantidad(residuo);
		this.iInventarioRepo.actualizar(inventario);
	}

	@Override
	public List<Inventario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iInventarioRepo.getAll();
	}

	@Override
	public Inventario buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iInventarioRepo.get(id);
	}

}
