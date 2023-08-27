package com.zoo.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zoo.api.repository.modelo.Bodega;
import com.zoo.api.repository.modelo.Bodega.AreaBodega;
import com.zoo.api.repository.modelo.Zoologico;

@SpringBootApplication
public class ZooApiApplication implements CommandLineRunner {
//	@Autowired
//		private IProveedorService iProveedorService;
//	
//	@Autowired
//	private IProductoService productoService;
//	
	public static void main(String[] args) {
		SpringApplication.run(ZooApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
