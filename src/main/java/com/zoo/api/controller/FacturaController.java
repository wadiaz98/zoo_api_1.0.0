package com.zoo.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.api.repository.modelo.Factura;
import com.zoo.api.service.interfaces.IFacturaService;

@RestController
@RequestMapping("/api/factura")
public class FacturaController {
	
    private  IFacturaService iFacturaService;


    @PostMapping("/factura/insertar")
    public void insertarFactura(@RequestBody Factura factura) {
    	iFacturaService.insertar(factura);
    }

    @GetMapping("/factura/buscar/cedula/{cedula}")
    public List<Factura> buscarFacturasPorCedula(@PathVariable String cedula) {
        return iFacturaService.buscarCedula(cedula);
    }

    @GetMapping("/factura/buscar/todos")
    public List<Factura> buscarTodasLasFacturas() {
        return iFacturaService.buscarTodos();
    }


}
