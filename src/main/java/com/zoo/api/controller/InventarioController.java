package com.zoo.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.api.repository.modelo.Inventario;
import com.zoo.api.service.interfaces.IInventarioService;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {
	

    private  IInventarioService iInventarioService;

    @PostMapping("/inventario/insertar")
    public void insertarInventario(@RequestBody Inventario inventario) {
        this.iInventarioService.insertar(inventario);
    }

    @PutMapping("/inventario/salida/{id}/{cantidad}")
    public void salidaInventario(@PathVariable Integer id, @PathVariable Integer cantidad) {
       this.iInventarioService.salida(id, cantidad);
    }

    @GetMapping("/inventario/buscar/todos")
    public List<Inventario> buscarTodosLosInventarios() {
        return this.iInventarioService.buscarTodos();
    }

    @GetMapping("/inventario/buscar/{id}")
    public Inventario buscarInventarioPorId(@PathVariable Integer id) {
       return this.iInventarioService.buscar(id);
    }
}
