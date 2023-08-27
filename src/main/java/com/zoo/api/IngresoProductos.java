package com.zoo.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zoo.api.repository.modelo.Producto;
import com.zoo.api.service.interfaces.IProductoService;
import com.zoo.api.service.interfaces.IProveedorService;

@SpringBootApplication
public class IngresoProductos implements CommandLineRunner {
	
	@Autowired
	private IProveedorService iProveedorService;
	
	@Autowired
	private IProductoService iProductoService;

	public static void main(String[] args) {
		SpringApplication.run(IngresoProductos.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// 1.Zoologico
		
		//Area de medicina
		Producto p1 = new Producto();
		p1.setNombre("Paracetamol");
		p1.setTipo("medicina");
		p1.setCodigo("prtl001");
		p1.setDescripcion("Pastilla para calmar dolencias");
		p1.setPrecioUnitario(new BigDecimal(1.25));
		p1.setFechaVencimiento(LocalDateTime.of(2025,10,27,0,0));
		p1.setTiempoEntrega(15);
		p1.setProveedor(this.iProveedorService.buscar(1));
		
		Producto p2 = new Producto();
		p2.setNombre("Apronax");
		p2.setTipo("medicina");
		p2.setCodigo("aprx002");
		p2.setDescripcion("Relajante muscular");
		p2.setPrecioUnitario(new BigDecimal(1.05));
		p2.setFechaVencimiento(LocalDateTime.of(2025,02,17,0,0));
		p2.setTiempoEntrega(20);
		p2.setProveedor(this.iProveedorService.buscar(1));
		
		Producto p3 = new Producto();
		p3.setNombre("Lemonflu");
		p3.setTipo("medicina");
		p3.setCodigo("lmf003");
		p3.setDescripcion("Para el moquillo");
		p3.setPrecioUnitario(new BigDecimal(0.95));
		p3.setFechaVencimiento(LocalDateTime.of(2025,06,01,0,0));
		p3.setTiempoEntrega(15);
		p3.setProveedor(this.iProveedorService.buscar(2));
		
		Producto p4 = new Producto();
		p4.setNombre("Digestiv");
		p4.setTipo("medicina");
		p4.setCodigo("dgtv004");
		p4.setDescripcion("Mejora la digestion");
		p4.setPrecioUnitario(new BigDecimal(1.30));
		p4.setFechaVencimiento(LocalDateTime.of(2027,12,06,0,0));
		p4.setTiempoEntrega(20);
		p4.setProveedor(this.iProveedorService.buscar(2));
		
		//Area regalos
		
		Producto p5 = new Producto();
		p5.setNombre("Camiseta Leon");
		p5.setTipo("regalos");
		p5.setCodigo("cmst001");
		p5.setDescripcion("Camiseta con figura de leon");
		p5.setPrecioUnitario(new BigDecimal(3.15));
		p5.setTiempoEntrega(20);
		p5.setProveedor(this.iProveedorService.buscar(3));
		
		Producto p6 = new Producto();
		p6.setNombre("Camisetas surtidas");
		p6.setTipo("regalos");
		p6.setCodigo("cmsts002");
		p6.setDescripcion("Relajante muscular");
		p6.setPrecioUnitario(new BigDecimal(2.80));
		p6.setTiempoEntrega(20);
		p6.setProveedor(this.iProveedorService.buscar(3));
		
		Producto p7 = new Producto();
		p7.setNombre("Figura Oso");
		p7.setTipo("regalos");
		p7.setCodigo("fgro003");
		p7.setDescripcion("figura de oso mediana");
		p7.setPrecioUnitario(new BigDecimal(1.80));
		p7.setTiempoEntrega(29);
		p7.setProveedor(this.iProveedorService.buscar(4));
		
		Producto p8 = new Producto();
		p8.setNombre("Figura serpiente espacial");
		p8.setTipo("regalos");
		p8.setCodigo("fss004");
		p8.setDescripcion("Figura de serpiente con casco de astronauta");
		p8.setPrecioUnitario(new BigDecimal(2.10));
		p8.setTiempoEntrega(25);
		p8.setProveedor(this.iProveedorService.buscar(4));
		
		
		//Area Consumibles
		
		Producto p9 = new Producto();
		p9.setNombre("PapasAire");
		p9.setTipo("consumibles");
		p9.setCodigo("ppa001");
		p9.setDescripcion("Papas fritas de 30gr");
		p9.setPrecioUnitario(new BigDecimal(0.40));
		p9.setFechaVencimiento(LocalDateTime.of(2026,11,15,0,0));
		p9.setTiempoEntrega(30);
		p9.setProveedor(this.iProveedorService.buscar(5));
		
		Producto p10 = new Producto();
		p10.setNombre("DoriLocos");
		p10.setTipo("consumibles");
		p10.setCodigo("drl002");
		p10.setDescripcion("Frituras de maiz de 35 gr");
		p10.setPrecioUnitario(new BigDecimal(0.55));
		p10.setFechaVencimiento(LocalDateTime.of(2026,02,27,0,0));
		p10.setTiempoEntrega(26);
		p10.setProveedor(this.iProveedorService.buscar(5));
		
		Producto p11 = new Producto();
		p11.setNombre("Cola Perrito");
		p11.setTipo("consumibles");
		p11.setCodigo("clprr003");
		p11.setDescripcion("Bebidas gasesosa de 30mL");
		p11.setPrecioUnitario(new BigDecimal(0.65));
		p11.setFechaVencimiento(LocalDateTime.of(2026,06,01,0,0));
		p11.setTiempoEntrega(16);
		p11.setProveedor(this.iProveedorService.buscar(6));
		
		Producto p12 = new Producto();
		p12.setNombre("Te de jirafa");
		p12.setTipo("consumible");
		p12.setCodigo("tdj004");
		p12.setDescripcion("Te de limon de 60mL");
		p12.setPrecioUnitario(new BigDecimal(0.87));
		p12.setFechaVencimiento(LocalDateTime.of(2026,8,12,0,0));
		p12.setTiempoEntrega(20);
		p12.setProveedor(this.iProveedorService.buscar(6));
		
		//Area Alimento
		
		Producto p13 = new Producto();
		p13.setNombre("Cesped fresco");
		p13.setTipo("alimento");
		p13.setCodigo("csdf001");
		p13.setDescripcion("50 kg de cesped fresco");
		p13.setPrecioUnitario(new BigDecimal(15));
		p13.setFechaVencimiento(LocalDateTime.of(2023,9,15,0,0));
		p13.setTiempoEntrega(22);
		p13.setProveedor(this.iProveedorService.buscar(7));
		
		Producto p14 = new Producto();
		p14.setNombre("Pipas");
		p14.setTipo("alimento");
		p14.setCodigo("pps002");
		p14.setDescripcion("40 kg de semillas de girasol");
		p14.setPrecioUnitario(new BigDecimal(12.50));
		p14.setFechaVencimiento(LocalDateTime.of(2023,10,18,0,0));
		p14.setTiempoEntrega(25);
		p14.setProveedor(this.iProveedorService.buscar(7));
		
		Producto p15 = new Producto();
		p15.setNombre("Carne de res");
		p15.setTipo("alimento");
		p15.setCodigo("crds003");
		p15.setDescripcion("50 kg de carnes de res");
		p15.setPrecioUnitario(new BigDecimal(35));
		p15.setFechaVencimiento(LocalDateTime.of(2026,9,13,0,0));
		p15.setTiempoEntrega(21);
		p15.setProveedor(this.iProveedorService.buscar(8));
		
		Producto p16 = new Producto();
		p16.setNombre("Carne de rata");
		p16.setTipo("alimento");
		p16.setCodigo("crt004");
		p16.setDescripcion("45 kg de carne de rata");
		p16.setPrecioUnitario(new BigDecimal(27));
		p16.setFechaVencimiento(LocalDateTime.of(2026,9,12,0,0));
		p16.setTiempoEntrega(24);
		p16.setProveedor(this.iProveedorService.buscar(8));
		
		Producto p17 = new Producto();
		p17.setNombre("Boleto");
		p17.setTipo("boleto");
		p17.setCodigo("blt001");
		p17.setDescripcion("Boleto para entrar l parque");
		p17.setPrecioUnitario(new BigDecimal(6));
		p17.setTiempoEntrega(7);
		p17.setProveedor(this.iProveedorService.buscar(9));
		
		//Insertar productos
		
		List<Producto> ls = new ArrayList<Producto>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17));
		
		ls.forEach(x->iProductoService.insertar(x));
		
	}

}
