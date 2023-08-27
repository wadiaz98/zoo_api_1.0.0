package com.zoo.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zoo.api.repository.interfaces.IZoologicoRepo;
import com.zoo.api.repository.modelo.Bodega;
import com.zoo.api.repository.modelo.Inventario;
import com.zoo.api.repository.modelo.Zoologico;
import com.zoo.api.service.interfaces.IInventarioService;
import com.zoo.api.service.interfaces.IProductoService;

@SpringBootApplication
public class IngresoRInventario implements CommandLineRunner {
	@Autowired
	private IZoologicoRepo iZoologicoRepo;

	@Autowired
	private IProductoService iProductoService;

	@Autowired
	private IInventarioService iInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(IngresoRInventario.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// 1. buscar zoo

		Zoologico zoologico = iZoologicoRepo.buscar(1);

		// 2 definir bodegas

		Bodega medicina = zoologico.getBodegas().get(0);
		Bodega regalos = zoologico.getBodegas().get(1);
		Bodega consumibles = zoologico.getBodegas().get(2);
		Bodega alimento = zoologico.getBodegas().get(3);
		Bodega boleteria = zoologico.getBodegas().get(4);

		// 3. Buscar productos

		var lp = this.iProductoService.buscarTodos();

		System.out.println(lp);
		// 4. proveedores 2 por cada uno

		// Medicina
		int i = 0;
		Inventario i1 = new Inventario();
		i1.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i1.setCantidad(150);
		i1.setGasto(1);
		i1.setProducto(lp.get(i));
		i1.setBodega(medicina);

		i++;

		Inventario i2 = new Inventario();
		i2.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i2.setCantidad(200);
		i2.setGasto(5);
		i2.setProducto(lp.get(i));
		i2.setBodega(medicina);

		i++;

		Inventario i3 = new Inventario();
		i3.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i3.setCantidad(199);
		i3.setGasto(1);
		i3.setProducto(lp.get(i));
		i3.setBodega(medicina);

		i++;

		Inventario i4 = new Inventario();
		i4.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i4.setCantidad(200);
		i4.setGasto(10);
		i4.setProducto(lp.get(i));
		i4.setBodega(medicina);

		// Regalos

		i++;

		Inventario i5 = new Inventario();
		i5.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i5.setCantidad(500);
		i5.setGasto(15);
		i5.setProducto(lp.get(i));
		i5.setBodega(regalos);

		i++;

		Inventario i6 = new Inventario();
		i6.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i6.setCantidad(300);
		i6.setGasto(11);
		i6.setProducto(lp.get(i));
		i6.setBodega(regalos);
		i++;

		Inventario i7 = new Inventario();
		i7.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i7.setCantidad(350);
		i7.setGasto(25);
		i7.setProducto(lp.get(i));
		i7.setBodega(regalos);

		i++;

		Inventario i8 = new Inventario();
		i8.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i8.setCantidad(400);
		i8.setGasto(30);
		i8.setProducto(lp.get(i));
		i8.setBodega(regalos);

		// Consumibles

		i++;

		Inventario i9 = new Inventario();
		i9.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i9.setCantidad(290);
		i9.setGasto(35);
		i9.setProducto(lp.get(i));
		i9.setBodega(consumibles);

		i++;

		Inventario i10 = new Inventario();
		i10.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i10.setCantidad(300);
		i10.setGasto(20);
		i10.setProducto(lp.get(i));
		i10.setBodega(consumibles);

		i++;

		Inventario i11 = new Inventario();
		i11.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i11.setCantidad(400);
		i11.setGasto(30);
		i11.setProducto(lp.get(i));
		i11.setBodega(consumibles);

		i++;

		Inventario i12 = new Inventario();
		i12.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i12.setCantidad(380);
		i12.setGasto(25);
		i12.setProducto(lp.get(i));
		i12.setBodega(consumibles);

		// Alimento

		i++;

		Inventario i13 = new Inventario();
		i13.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i13.setCantidad(700);
		i13.setGasto(30);
		i13.setProducto(lp.get(i));
		i13.setBodega(alimento);

		i++;

		Inventario i14 = new Inventario();
		i14.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i14.setCantidad(300);
		i14.setGasto(10);
		i14.setProducto(lp.get(i));
		i14.setBodega(alimento);

		i++;

		Inventario i15 = new Inventario();
		i15.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i15.setCantidad(900);
		i15.setGasto(40);
		i15.setProducto(lp.get(i));
		i15.setBodega(alimento);
		i++;

		Inventario i16 = new Inventario();
		i16.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i16.setCantidad(700);
		i16.setGasto(10);
		i16.setProducto(lp.get(i));
		i16.setBodega(alimento);

		i++;

		// Boletos

		Inventario i17 = new Inventario();
		i17.setCodigo(lp.get(i).getTipo().charAt(0) + lp.get(i).getCodigo());
		i17.setCantidad(200);
		i17.setGasto(100);
		i17.setProducto(lp.get(i));
		i17.setBodega(boleteria);

		// Insertar inventario

		List<Inventario> ls = new ArrayList<Inventario>(
				Arrays.asList(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16));

		ls.forEach(x -> iInventarioService.insertar(x));
	}

}
