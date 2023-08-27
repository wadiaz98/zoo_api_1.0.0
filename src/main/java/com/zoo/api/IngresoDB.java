package com.zoo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zoo.api.repository.interfaces.IZoologicoRepo;
import com.zoo.api.repository.modelo.Bodega;
import com.zoo.api.repository.modelo.Bodega.AreaBodega;
import com.zoo.api.repository.modelo.Zoologico;

@SpringBootApplication
public class IngresoDB implements CommandLineRunner {
	@Autowired
	private IZoologicoRepo iZoologicoRepo;

	public static void main(String[] args) {
		SpringApplication.run(IngresoDB.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// 1.Zoologico
		Zoologico z1 = new Zoologico();

		z1.setCorreo("zoorl@gmail.com");
		z1.setDireccion("Av. America y Av. Universitaria");
		z1.setNombre("Zoologico Rey Leon");
		z1.setTelefono("023021832");

		// 2.Creacion de bodegas

		Bodega b1 = new Bodega();

		b1.setNombre(AreaBodega.Medicina.toString());
		b1.setZoologico(z1);

		Bodega b2 = new Bodega();

		b2.setNombre(AreaBodega.Regalos.toString());
		b2.setZoologico(z1);

		Bodega b3 = new Bodega();

		b3.setNombre(AreaBodega.Consumibles.toString());
		b3.setZoologico(z1);

		Bodega b4 = new Bodega();

		b4.setNombre(AreaBodega.Alimento.toString());
		b4.setZoologico(z1);

		Bodega b5 = new Bodega();

		b5.setNombre(AreaBodega.Boleteria.toString());
		b5.setZoologico(z1);

		Bodega b6 = new Bodega();

		b5.setNombre("Limpieza");
		b5.setZoologico(z1);

		// 3.Creo la lista de bodegas
		List<Bodega> lb = new ArrayList<>();
		lb.add(b1);
		lb.add(b2);
		lb.add(b3);
		lb.add(b4);
		lb.add(b5);
		lb.add(b6);

		// 4.Ingreso las bodegas al zoologico
		z1.setBodegas(lb);

		// 5.Ingreso zoo a la DB
		iZoologicoRepo.insertar(z1);
	}

}
