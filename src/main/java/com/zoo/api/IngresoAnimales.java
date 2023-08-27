package com.zoo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zoo.api.repository.interfaces.IZoologicoRepo;
import com.zoo.api.repository.modelo.Animal;
import com.zoo.api.repository.modelo.Dieta;
import com.zoo.api.service.interfaces.IAnimalService;

@SpringBootApplication
public class IngresoAnimales implements CommandLineRunner {
	@Autowired
	private IZoologicoRepo iZoologicoRepo;

	@Autowired
	private IAnimalService iAnimalService;

	public static void main(String[] args) {
		SpringApplication.run(IngresoAnimales.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Reptiles
		Animal a1 = new Animal();
		a1.setNombre("Chomper");
		a1.setNombreComun("Caimán");
		a1.setEspecie("Reptiles");
		a1.setHabitat("Humedales");
		a1.setTamanio(2.5);
		a1.setPeso(40.0);
		a1.setComportamiento("Agresivo");
		
		
		Animal a2 = new Animal();
		a2.setNombre("Torti");
		a2.setNombreComun("Tortuga");
		a2.setEspecie("Reptiles");
		a2.setHabitat("Tierra y agua");
		a2.setTamanio(0.3);
		a2.setPeso(3.0);
		a2.setComportamiento("Tranquilo");

		Animal a3 = new Animal();
		a3.setNombre("George");
		a3.setNombreComun("Galápago");
		a3.setEspecie("Reptiles");
		a3.setHabitat("Islas Galápagos");
		a3.setTamanio(1.2);
		a3.setPeso(100.0);
		a3.setComportamiento("Reservado");

		Animal a4 = new Animal();
		a4.setNombre("Liz");
		a4.setNombreComun("Galápago");
		a4.setEspecie("Reptiles");
		a4.setHabitat("Islas Galápagos");
		a4.setTamanio(0.8);
		a4.setPeso(15.0);
		a4.setComportamiento("Curioso");

		Animal a5 = new Animal();
		a5.setNombre("Slinky");
		a5.setNombreComun("Serpiente");
		a5.setEspecie("Reptiles");
		a5.setHabitat("Bosques tropicales");
		a5.setTamanio(1.0);
		a5.setPeso(0.5);
		a5.setComportamiento("Veneno potente");

		Animal a6 = new Animal();
		a6.setNombre("Saara");
		a6.setNombreComun("Serpiente");
		a6.setEspecie("Reptiles");
		a6.setHabitat("Selvas tropicales");
		a6.setTamanio(5.5);
		a6.setPeso(10.0);
		a6.setComportamiento("Depredador");

		// Mamíferos
		Animal a7 = new Animal();
		a7.setNombre("Simba");
		a7.setNombreComun("León");
		a7.setEspecie("Mamíferos");
		a7.setHabitat("Sabanas");
		a7.setTamanio(1.2);
		a7.setPeso(190.0);
		a7.setComportamiento("Cazador");

		Animal a8 = new Animal();
		a8.setNombre("Rajah");
		a8.setNombreComun("Tigre");
		a8.setEspecie("Mamíferos");
		a8.setHabitat("Bosques y junglas");
		a8.setTamanio(1.5);
		a8.setPeso(220.0);
		a8.setComportamiento("Solitario");

		Animal a9 = new Animal();
		a9.setNombre("Kavi");
		a9.setNombreComun("Elefante");
		a9.setEspecie("Mamíferos");
		a9.setHabitat("Sabanas y bosques");
		a9.setTamanio(3.0);
		a9.setPeso(6000.0);
		a9.setComportamiento("Sociable");

		Animal a10 = new Animal();
		a10.setNombre("Zar");
		a10.setNombreComun("Jirafa");
		a10.setEspecie("Mamíferos");
		a10.setHabitat("Sabanas y llanuras");
		a10.setTamanio(5.5);
		a10.setPeso(1200.0);
		a10.setComportamiento("Herbívora");

		Animal a11 = new Animal();
		a11.setNombre("Bruno");
		a11.setNombreComun("Oso");
		a11.setEspecie("Mamíferos");
		a11.setHabitat("Bosques y montañas");
		a11.setTamanio(2.0);
		a11.setPeso(300.0);
		a11.setComportamiento("Omnívoro");

		Animal a12 = new Animal();
		a12.setNombre("Koko");
		a12.setNombreComun("Gorila");
		a12.setEspecie("Mamíferos");
		a12.setHabitat("Selvas y montañas");
		a12.setTamanio(1.6);
		a12.setPeso(180.0);
		a12.setComportamiento("Inteligente");

		Animal a13 = new Animal();
		a13.setNombre("Aria");
		a13.setNombreComun("Zebra");
		a13.setEspecie("Mamíferos");
		a13.setHabitat("Sabanas y praderas");
		a13.setTamanio(1.5);
		a13.setPeso(350.0);
		a13.setComportamiento("Herbívora");

		// Aves
		Animal a14 = new Animal();
		a14.setNombre("Pablo");
		a14.setNombreComun("Guacamayo");
		a14.setEspecie("Aves");
		a14.setHabitat("Selvas tropicales");
		a14.setTamanio(0.6);
		a14.setPeso(1.0);
		a14.setComportamiento("Colorido");

		Animal a15 = new Animal();
		a15.setNombre("Mango");
		a15.setNombreComun("Guacamayo");
		a15.setEspecie("Aves");
		a15.setHabitat("Bosques y selvas");
		a15.setTamanio(0.7);
		a15.setPeso(1.2);
		a15.setComportamiento("Sociable");

		Animal a16 = new Animal();
		a16.setNombre("Caruso");
		a16.setNombreComun("Cóndor");
		a16.setEspecie("Aves");
		a16.setHabitat("Montañas y acantilados");
		a16.setTamanio(3.0);
		a16.setPeso(11.0);
		a16.setComportamiento("Volador majestuoso");

		Animal a17 = new Animal();
		a17.setNombre("Canoro");
		a17.setNombreComun("Cóndor");
		a17.setEspecie("Aves");
		a17.setHabitat("Cañones y montañas");
		a17.setTamanio(2.7);
		a17.setPeso(9.0);
		a17.setComportamiento("Necrófago");

		Animal a18 = new Animal();
		a18.setNombre("Toco");
		a18.setNombreComun("Tucán");
		a18.setEspecie("Aves");
		a18.setHabitat("Selvas tropicales");
		a18.setTamanio(0.6);
		a18.setPeso(0.5);
		a18.setComportamiento("Pico colorido");

		// Anfibios
		Animal a19 = new Animal();
		a19.setNombre("Ranaquita");
		a19.setNombreComun("Rana temporaria");
		a19.setEspecie("Anfibios");
		a19.setHabitat("Húmedo");
		a19.setTamanio(0.1);
		a19.setPeso(0.01);
		a19.setComportamiento("Saltarín");

		Animal a20 = new Animal();
		a20.setNombre("Ribbo");
		a20.setNombreComun("Hyla versicolor");
		a20.setEspecie("Anfibios");
		a20.setHabitat("Bosques y charcas");
		a20.setTamanio(0.08);
		a20.setPeso(0.015);
		a20.setComportamiento("Vocal");

		Animal a21 = new Animal();
		a21.setNombre("Sapojo");
		a21.setNombreComun("Litoria caerulea");
		a21.setEspecie("Anfibios");
		a21.setHabitat("Áreas cercanas al agua");
		a21.setTamanio(0.1);
		a21.setPeso(0.015);
		a21.setComportamiento("Colorida");

		Animal a22 = new Animal();
		a22.setNombre("Ranello");
		a22.setNombreComun("Dendrobates auratus");
		a22.setEspecie("Anfibios");
		a22.setHabitat("Selvas tropicales");
		a22.setTamanio(0.05);
		a22.setPeso(0.003);
		a22.setComportamiento("Veneno");

		Animal a23 = new Animal();
		a23.setNombre("Ra");
		a23.setNombreComun("Phyllobates terribilis");
		a23.setEspecie("Anfibios");
		a23.setHabitat("Selvas y bosques");
		a23.setTamanio(0.04);
		a23.setPeso(0.002);
		a23.setComportamiento("Veneno mortal");

		Animal a24 = new Animal();
		a24.setNombre("Agam");
		a24.setNombreComun("Agalychnis callidryas");
		a24.setEspecie("Anfibios");
		a24.setHabitat("Bosques tropicales");
		a24.setTamanio(0.06);
		a24.setPeso(0.005);
		a24.setComportamiento("Ojos rojos");

		Animal a25 = new Animal();
		a25.setNombre("Croaky");
		a25.setNombreComun("Rana Campestre");
		a25.setEspecie("Anfibios");
		a25.setHabitat("Húmedo");
		a25.setTamanio(0.1);
		a25.setPeso(0.01);
		a25.setComportamiento("Saltarín");

		Animal a26 = new Animal();
		a26.setNombre("Saprin");
		a26.setNombreComun("Rana Norteña");
		a26.setEspecie("Anfibios");
		a26.setHabitat("Bosques y charcas");
		a26.setTamanio(0.08);
		a26.setPeso(0.015);
		a26.setComportamiento("Vocal");

		Animal a27 = new Animal();
		a27.setNombre("Salmander");
		a27.setNombreComun("Salamandra");
		a27.setEspecie("Anfibios");
		a27.setHabitat("Bosques húmedos");
		a27.setTamanio(0.25);
		a27.setPeso(0.02);
		a27.setComportamiento("Nocturna");

		Animal a28 = new Animal();
		a28.setNombre("Rafa");
		a28.setNombreComun("Sapo");
		a28.setEspecie("Anfibios");
		a28.setHabitat("Bosques y zonas húmedas");
		a28.setTamanio(0.15);
		a28.setPeso(0.03);
		a28.setComportamiento("Crepuscular");


		Animal[] arregloAnimales = { a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18,
				a19, a20, a21, a22, a23, a24, a25, a26, a27, a28 };

		for (Animal animal : arregloAnimales) {
			this.iAnimalService.ingresar(animal);
		}		
	}
}
