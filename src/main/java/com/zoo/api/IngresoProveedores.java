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
import com.zoo.api.repository.modelo.Proveedor;
import com.zoo.api.repository.modelo.Zoologico;
import com.zoo.api.service.interfaces.IProveedorService;

@SpringBootApplication
public class IngresoProveedores implements CommandLineRunner {
	@Autowired
	private IZoologicoRepo iZoologicoRepo;
	
	@Autowired
	private IProveedorService iProveedorService;

	public static void main(String[] args) {
		SpringApplication.run(IngresoProveedores.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//1. buscar zoo
		
				Zoologico zoologico = iZoologicoRepo.buscar(1);
				
				//2 definir bodegas 
				
				Bodega medicina = zoologico.getBodegas().get(0);
				Bodega regalos = zoologico.getBodegas().get(1);
				Bodega consumibles = zoologico.getBodegas().get(2);
				Bodega alimento = zoologico.getBodegas().get(3);
				Bodega oleteria = zoologico.getBodegas().get(4);
				
				//3. proveedores 2 por cada uno
				
				//medicina
				Proveedor provMedicina = new Proveedor();
				provMedicina.setNombre("medi animalitos");
				provMedicina.setRuc("1717844466001");
				provMedicina.setTelefono("021234567");
				provMedicina.setDireccion("Tumbaco");
				provMedicina.setTipo("medicina");
				provMedicina.setCorreo("medAnimalitos@gmail.com");
				
				Proveedor provMedicina2 = new Proveedor();
				provMedicina2.setNombre("animal crossing");
				provMedicina2.setRuc("1717844466002");
				provMedicina2.setTelefono("028089101");
				provMedicina2.setDireccion("Quitumbe");
				provMedicina2.setTipo("medicina");
				provMedicina2.setCorreo("anicros@gmail.com");
				
				//reg
				Proveedor provRegalos = new Proveedor();
				provRegalos.setNombre("ecotshirt");
				provRegalos.setRuc("1717844466003");
				provRegalos.setTelefono("023031844");
				provRegalos.setDireccion("San Juan");
				provRegalos.setTipo("regalos");
				provRegalos.setCorreo(provRegalos.getNombre()+ "@gmail.com");
				
				Proveedor provRegalos2 = new Proveedor();
				provRegalos2.setNombre("Figuritaz");
				provRegalos2.setRuc("1717844466004");
				provRegalos2.setTelefono("023021833");
				provRegalos2.setDireccion("CCI");
				provRegalos2.setTipo("regalos");
				provRegalos2.setCorreo(provRegalos2.getNombre()+ "@gmail.com");
				
				//consumibles
				Proveedor provConsumibles = new Proveedor();
				provConsumibles.setNombre("notRuffles");
				provConsumibles.setRuc("1717844466005");
				provConsumibles.setTelefono("023031845");
				provConsumibles.setDireccion("Puembo");
				provConsumibles.setTipo("consumibles");
				provConsumibles.setCorreo(provConsumibles.getNombre()+ "@gmail.com");
				
				Proveedor provConsumibles2 = new Proveedor();
				provConsumibles2.setNombre("LocaCola");
				provConsumibles2.setRuc("1717844466006");
				provConsumibles2.setTelefono("023021836");
				provConsumibles2.setDireccion("Machachi");
				provConsumibles2.setTipo("consumibles");
				provConsumibles2.setCorreo(provConsumibles2.getNombre()+ "@gmail.com");
				
				//Alimentos
				Proveedor provAlimentos = new Proveedor();
				provAlimentos.setNombre("PajaBrava");
				provAlimentos.setRuc("1717844466007");
				provAlimentos.setTelefono("023031847");
				provAlimentos.setDireccion("Nanegalito");
				provAlimentos.setTipo("alimento");
				provAlimentos.setCorreo(provConsumibles.getNombre()+ "@gmail.com");
				
				Proveedor provAlimentos2 = new Proveedor();
				provAlimentos2.setNombre("vacaVegana");
				provAlimentos2.setRuc("1717844466008");
				provAlimentos2.setTelefono("023021838");
				provAlimentos2.setDireccion("Otavalo");
				provAlimentos2.setTipo("alimento");
				provAlimentos2.setCorreo(provAlimentos2.getNombre()+ "@gmail.com");
				
				//Alimentos
				Proveedor provBoleteria = new Proveedor();
				provBoleteria.setNombre(zoologico.getNombre());
				provBoleteria.setRuc("1717844466009");
				provBoleteria.setTelefono(zoologico.getTelefono());
				provBoleteria.setDireccion(zoologico.getDireccion());
				provBoleteria.setTipo("boletos");
				provBoleteria.setCorreo(zoologico.getCorreo());
				
				//Insertar proveedores
				
				List<Proveedor> ls = new ArrayList<Proveedor>(Arrays.asList(provMedicina,provMedicina2,provRegalos, provRegalos2, provConsumibles, provConsumibles2, provAlimentos,provAlimentos2,provBoleteria));
				
				ls.forEach(x->iProveedorService.insertar(x));
	}

}
