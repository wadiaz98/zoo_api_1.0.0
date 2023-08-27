package com.zoo.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.api.repository.interfaces.IFacturaRepo;
import com.zoo.api.repository.modelo.Factura;
import com.zoo.api.service.interfaces.IFacturaService;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepo iFacturaRepo;

	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.iFacturaRepo.insertar(factura);
	}

	@Override
	public List<Factura> buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iFacturaRepo.buscarCedula(cedula);
	}

	@Override
	public List<Factura> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iFacturaRepo.buscarTodos();
	}

}
