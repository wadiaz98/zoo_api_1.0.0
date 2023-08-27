package com.zoo.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zoo.api.repository.modelo.Datos;
import com.zoo.api.repository.modelo.Empleado;
import com.zoo.api.repository.modelo.Usuario;
import com.zoo.api.service.interfaces.IEmpleadoService;

@SpringBootApplication
public class IngresoEmpleados implements CommandLineRunner {

	@Autowired

	private IEmpleadoService iEmpleadoService;

	public static void main(String[] args) {
		SpringApplication.run(IngresoEmpleados.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Empleado empl = new Empleado();

		// Veterinaria, Bodega, Limpieza, AtencionCliente, Administracion,

		// Mantenimiento
		empl.setDeparatmento("Administracion");
		empl.setEstadoCivil("casado");
		// Duenio, Mantenieminto
		// Gerente
		// Empleado
		empl.setCargo("Duenio");
		// Matutino, Vespertino
		empl.setHorario("Matutino");
		// Completo Parcial
		empl.setTipoContrato("Completo");
		empl.setSueldo(new BigDecimal(700));
		Datos dt = new Datos();
		dt.setNombre("Marco");
		dt.setApellido("Cedenio");
		dt.setCedula("1234567890");
		dt.setCorreo(dt.getNombre().concat(dt.getApellido()).toLowerCase().concat("@gmail.com"));
		dt.setDireccion("El Inca");
		dt.setFechaNacimiento(LocalDateTime.of(1989, 12, 11, 0, 0));
		dt.setEmpleado(empl);
		dt.setTelefono("0987654432");
		empl.setDatos(dt);
		Usuario usr = new Usuario();
		empl.setUsuario(usr);

		// Mantenimiento

		Empleado emplM = new Empleado();
		emplM.setDeparatmento("Mantenimiento");
		emplM.setEstadoCivil("soltero");
		emplM.setCargo("Empleado");
		emplM.setHorario("Matutino");
		emplM.setTipoContrato("Parcial");
		emplM.setSueldo(new BigDecimal(300));
		Datos dt2 = new Datos();
		dt2.setNombre("Willan");
		dt2.setApellido("Diaz");
		dt2.setCedula("1234567891");
		dt2.setCorreo(dt2.getNombre().concat(dt2.getApellido()).toLowerCase().concat("@gmail.com"));
		dt2.setDireccion("Quitumbe");
		dt2.setFechaNacimiento(LocalDateTime.of(1998, 6, 1, 0, 0));
		dt2.setEmpleado(emplM);
		dt2.setTelefono("0987654321");
		emplM.setDatos(dt2);
		emplM.setUsuario(usr);

		Empleado emplMG = new Empleado();
		emplMG.setDeparatmento("Mantenimiento");
		emplMG.setEstadoCivil("soltero");
		emplMG.setCargo("Mantenimiento");
		emplMG.setHorario("Vespertino");
		emplMG.setTipoContrato("Completo");
		emplMG.setSueldo(new BigDecimal(600));
		Datos dt3 = new Datos();
		dt3.setNombre("Serghy");
		dt3.setApellido("Castillo");
		dt3.setCedula("1717844466");
		dt3.setCorreo(dt3.getNombre().concat(dt3.getApellido()).toLowerCase().concat("@gmail.com"));
		dt3.setDireccion("Quito sur");
		dt3.setFechaNacimiento(LocalDateTime.of(1997, 12, 7, 0, 0));
		dt3.setEmpleado(emplM);
		dt3.setTelefono("09607192338");
		emplMG.setDatos(dt3);
		emplMG.setUsuario(usr);

		// Veterinaria
		Empleado emplV = new Empleado();
		emplV.setDeparatmento("Veterinaria");
		emplV.setEstadoCivil("casado");
		emplV.setCargo("Empleado");
		emplV.setHorario("Matutino");
		emplV.setTipoContrato("Parcial");
		emplV.setSueldo(new BigDecimal(300));
		Datos dt4 = new Datos();
		dt4.setNombre("Reymon");
		dt4.setApellido("Hidalgo");
		dt4.setCedula("1717171717");
		dt4.setCorreo(dt4.getNombre().concat(dt4.getApellido()).toLowerCase().concat("@gmail.com"));
		dt4.setDireccion("San Diego");
		dt4.setFechaNacimiento(LocalDateTime.of(2001, 6, 7, 0, 0));
		dt4.setEmpleado(emplV);
		dt4.setTelefono("0909090909");
		emplV.setDatos(dt4);
		emplV.setUsuario(usr);

		Empleado emplVG = new Empleado();
		emplVG.setDeparatmento("Veterinaria");
		emplVG.setEstadoCivil("casado");
		emplVG.setCargo("Gerente");
		emplVG.setHorario("Vespertino");
		emplVG.setTipoContrato("Completo");
		emplVG.setSueldo(new BigDecimal(500));
		Datos dt5 = new Datos();
		dt5.setNombre("Christina");
		dt5.setApellido("Rivera");
		dt5.setCedula("1616161616");
		dt5.setCorreo(dt5.getNombre().concat(dt5.getApellido()).toLowerCase().concat("@gmail.com"));
		dt5.setDireccion("La Colmena");
		dt5.setFechaNacimiento(LocalDateTime.of(2000, 6, 7, 0, 0));
		dt5.setEmpleado(emplVG);
		dt5.setTelefono("0909090909");
		emplVG.setDatos(dt5);
		emplVG.setUsuario(usr);

		// bodega

		Empleado emplB1 = new Empleado();
		emplB1.setDeparatmento("Bodega");
		emplB1.setEstadoCivil("Casado");
		emplB1.setCargo("Empleado");
		emplB1.setHorario("Matutino");
		emplB1.setTipoContrato("Completo");
		emplB1.setSueldo(new BigDecimal(400));
		Datos dt6 = new Datos();
		dt6.setNombre("Carlos");
		dt6.setApellido("Perez");
		dt6.setCedula("1701234567");
		dt6.setCorreo(dt6.getNombre().concat(dt6.getApellido()).toLowerCase().concat("@gmail.com"));
		dt6.setDireccion("Av. Amazonas N24-56 y Juan León Mera");
		dt6.setFechaNacimiento(LocalDateTime.of(1985, 5, 15, 0, 0));
		dt6.setEmpleado(emplB1);
		dt6.setTelefono("0907123456");
		emplB1.setDatos(dt6);
		emplB1.setUsuario(usr);

		Empleado emplB2 = new Empleado();
		emplB2.setDeparatmento("Bodega");
		emplB2.setEstadoCivil("Soltero");
		emplB2.setCargo("Empleado");
		emplB2.setHorario("Matutino");
		emplB2.setTipoContrato("Completo");
		emplB2.setSueldo(new BigDecimal(400));
		Datos dt12 = new Datos();
		dt12.setNombre("Sebastián");
		dt12.setApellido("Cordero");
		dt12.setCedula("0903456789");
		dt12.setCorreo(dt12.getNombre().concat(dt12.getApellido()).toLowerCase().concat("@gmail.com"));
		dt12.setDireccion("Av. 12 de Octubre N56-78 y Wilson, Quito");
		dt12.setFechaNacimiento(LocalDateTime.of(2000, 2, 7, 0, 0));
		dt12.setEmpleado(emplB2);
		dt12.setTelefono("0909789012");
		emplB2.setDatos(dt12);
		emplB2.setUsuario(usr);

		Empleado emplB3 = new Empleado();
		emplB3.setDeparatmento("Bodega");
		emplB3.setEstadoCivil("casado");
		emplB3.setCargo("Empleado");
		emplB3.setHorario("Matutino");
		emplB3.setTipoContrato("Completo");
		emplB3.setSueldo(new BigDecimal(400));
		Datos dt13 = new Datos();
		dt13.setNombre("Carolina");
		dt13.setApellido("Ramírez");
		dt13.setCedula("0502345678");
		dt13.setCorreo(dt13.getNombre().concat(dt13.getApellido()).toLowerCase().concat("@gmail.com"));
		dt13.setDireccion("Calle Juan Pío Montúfar N34-56 y Av. 10 de Agosto, Quito");
		dt13.setFechaNacimiento(LocalDateTime.of(1993, 4, 18, 0, 0));
		dt13.setEmpleado(emplB3);
		dt13.setTelefono("0905890123");
		emplB3.setDatos(dt13);
		emplB3.setUsuario(usr);

		Empleado emplB4 = new Empleado();
		emplB4.setDeparatmento("Bodega");
		emplB4.setEstadoCivil("Soltera");
		emplB4.setCargo("Empleado");
		emplB4.setHorario("Matutino");
		emplB4.setTipoContrato("Completo");
		emplB4.setSueldo(new BigDecimal(400));
		Datos dt14 = new Datos();
		dt14.setNombre("Luisa");
		dt14.setApellido("Mendoza");
		dt14.setCedula("1704567890");
		dt14.setCorreo(dt14.getNombre().concat(dt14.getApellido()).toLowerCase().concat("@gmail.com"));
		dt14.setDireccion("Calle García Moreno N67-89 y Av. 12 de Octubre, Quito");
		dt14.setFechaNacimiento(LocalDateTime.of(1992, 8, 20, 0, 0));
		dt14.setEmpleado(emplB4);
		dt14.setTelefono("0904567890");
		emplB4.setDatos(dt14);
		emplB4.setUsuario(usr);

		Empleado emplB5 = new Empleado();
		emplB5.setDeparatmento("Bodega");
		emplB5.setEstadoCivil("Casado");
		emplB5.setCargo("Empleado");
		emplB5.setHorario("Matutino");
		emplB5.setTipoContrato("Completo");
		emplB5.setSueldo(new BigDecimal(400));
		Datos dt15 = new Datos();
		dt15.setNombre("Diego");
		dt15.setApellido("Sánchez");
		dt15.setCedula("0904567890");
		dt15.setCorreo(dt15.getNombre().concat(dt15.getApellido()).toLowerCase().concat("@gmail.com"));
		dt15.setDireccion("Av. República N34-56 y Calle Los Shyris, Quito");
		dt15.setFechaNacimiento(LocalDateTime.of(1992, 8, 20, 0, 0));
		dt15.setEmpleado(emplB5);
		dt15.setTelefono("0905678901");
		emplB5.setDatos(dt15);
		emplB5.setUsuario(usr);

		Empleado emplB6 = new Empleado();
		emplB6.setDeparatmento("Bodega");
		emplB6.setEstadoCivil("Casado");
		emplB6.setCargo("Empleado");
		emplB6.setHorario("Matutino");
		emplB6.setTipoContrato("Completo");
		emplB6.setSueldo(new BigDecimal(400));
		Datos dt16 = new Datos();
		dt16.setNombre("Valentina");
		dt16.setApellido("Paredes");
		dt16.setCedula("1706789012");
		dt16.setCorreo(dt16.getNombre().concat(dt16.getApellido()).toLowerCase().concat("@gmail.com"));
		dt16.setDireccion("Av. República N34-56 y Calle Los Shyris, Quito");
		dt16.setFechaNacimiento(LocalDateTime.of(1988, 12, 12, 0, 0));
		dt16.setEmpleado(emplB6);
		dt16.setTelefono("0906789012");
		emplB6.setDatos(dt16);
		emplB6.setUsuario(usr);

		Empleado emplBG = new Empleado();
		emplBG.setDeparatmento("Bodega");
		emplBG.setEstadoCivil("Soltera");
		emplBG.setCargo("Gerente");
		emplBG.setHorario("Vespertino");
		emplBG.setTipoContrato("Completo");
		emplBG.setSueldo(new BigDecimal(700));
		Datos dt7 = new Datos();
		dt7.setNombre("María");
		dt7.setApellido("Fernández ");
		dt7.setCedula("0502345678");
		dt7.setCorreo(dt7.getNombre().concat(dt7.getApellido()).toLowerCase().concat("@gmail.com"));
		dt7.setDireccion("Calle La Ronda N12-34 y García Moreno, Quito");
		dt7.setFechaNacimiento(LocalDateTime.of(1990, 9, 8, 0, 0));
		dt7.setEmpleado(emplBG);
		dt7.setTelefono("0908234567");
		emplBG.setDatos(dt7);
		emplBG.setUsuario(usr);

		// Limpieza
		Empleado emplL = new Empleado();
		emplL.setDeparatmento("Limpieza");
		emplL.setEstadoCivil("Casado");
		emplL.setCargo("Empleado");
		emplL.setHorario("Matutino");
		emplL.setTipoContrato("Completo");
		emplL.setSueldo(new BigDecimal(400));
		Datos dt8 = new Datos();
		dt8.setNombre("Andrés");
		dt8.setApellido("Rodríguez");
		dt8.setCedula("0803456123");
		dt8.setCorreo(dt8.getNombre().concat(dt8.getApellido()).toLowerCase().concat("@gmail.com"));
		dt8.setDireccion("Av. 6 de Diciembre N56-78 y Luis Cordero, Quito");
		dt8.setFechaNacimiento(LocalDateTime.of(1978, 6, 3, 0, 0));
		dt8.setEmpleado(emplL);
		dt8.setTelefono("0909345678");
		emplL.setDatos(dt8);
		emplL.setUsuario(usr);

		Empleado emplLG = new Empleado();
		emplLG.setDeparatmento("Limpieza");
		emplLG.setEstadoCivil("Soltera");
		emplLG.setCargo("Gerente");
		emplLG.setHorario("Vespertino");
		emplLG.setTipoContrato("Completo");
		emplLG.setSueldo(new BigDecimal(700));
		Datos dt9 = new Datos();
		dt9.setNombre("Laura");
		dt9.setApellido("Velasco");
		dt9.setCedula("0902345678");
		dt9.setCorreo(dt9.getNombre().concat(dt9.getApellido()).toLowerCase().concat("@gmail.com"));
		dt9.setDireccion("Calle La Ronda N12-34 y García Moreno, Quito");
		dt9.setFechaNacimiento(LocalDateTime.of(1995, 1, 21, 0, 0));
		dt9.setEmpleado(emplLG);
		dt9.setTelefono("0906456789");
		emplLG.setDatos(dt9);
		emplLG.setUsuario(usr);

		// Atencion a cliente

		Empleado emplAC = new Empleado();
		emplAC.setDeparatmento("Limpieza");
		emplAC.setEstadoCivil("Casado");
		emplAC.setCargo("Empleado");
		emplAC.setHorario("Matutino");
		emplAC.setTipoContrato("Completo");
		emplAC.setSueldo(new BigDecimal(700));
		Datos dt10 = new Datos();
		dt10.setNombre("Ricardo");
		dt10.setApellido("Gómez");
		dt10.setCedula("1801234567");
		dt10.setCorreo(dt10.getNombre().concat(dt10.getApellido()).toLowerCase().concat("@gmail.com"));
		dt10.setDireccion(" Av. Eloy Alfaro N78-90 y Gaspar de Villarroel, Quito");
		dt10.setFechaNacimiento(LocalDateTime.of(1982, 3, 12, 0, 0));
		dt10.setEmpleado(emplAC);
		dt10.setTelefono("0907567890");
		emplAC.setDatos(dt10);
		emplAC.setUsuario(usr);

		Empleado emplACG = new Empleado();
		emplACG.setDeparatmento("Limpieza");
		emplACG.setEstadoCivil("Soltera");
		emplACG.setCargo("Gerente");
		emplACG.setHorario("Vespertino");
		emplACG.setTipoContrato("Completo");
		emplACG.setSueldo(new BigDecimal(700));
		Datos dt11 = new Datos();
		dt11.setNombre("Patricia");
		dt11.setApellido("López");
		dt11.setCedula("1703456123");
		dt11.setCorreo(dt11.getNombre().concat(dt11.getApellido()).toLowerCase().concat("@gmail.com"));
		dt11.setDireccion("Calle Los Shyris N23-45 y Av. Naciones Unidas, Quito");
		dt11.setFechaNacimiento(LocalDateTime.of(1989, 11, 30, 0, 0));
		dt11.setEmpleado(emplLG);
		dt11.setTelefono("0908678901");
		emplLG.setDatos(dt9);
		emplLG.setUsuario(usr);

		// Administracion
		Empleado emplAt = new Empleado();
		emplAt.setDeparatmento("Administracion");
		emplAt.setEstadoCivil("Casado");
		emplAt.setCargo("Empleado");
		emplAt.setHorario("Matutino");
		emplAt.setTipoContrato("Completo");
		emplAt.setSueldo(new BigDecimal(450));
		Datos dt17 = new Datos();
		dt17.setNombre("Gabriel");
		dt17.setApellido("Torres");
		dt17.setCedula("0806789012");
		dt17.setCorreo(dt17.getNombre().concat(dt17.getApellido()).toLowerCase().concat("@gmail.com"));
		dt17.setDireccion("Av. Luis Cordero N45-67 y Calle Juan Pío Montúfar, Quito");
		dt17.setFechaNacimiento(LocalDateTime.of(1997, 3, 25, 0, 0));
		dt17.setEmpleado(emplAt);
		dt17.setTelefono("0907890123");
		emplAt.setDatos(dt17);
		emplAt.setUsuario(usr);

		Empleado emplAtG = new Empleado();
		emplAtG.setDeparatmento("Limpieza");
		emplAtG.setEstadoCivil("Soltera");
		emplAtG.setCargo("Gerente");
		emplAtG.setHorario("Vespertino");
		emplAtG.setTipoContrato("Completo");
		emplAtG.setSueldo(new BigDecimal(700));
		Datos dt18 = new Datos();
		dt18.setNombre("Isabel");
		dt18.setApellido("Vargas");
		dt18.setCedula("1805678901");
		dt18.setCorreo(dt18.getNombre().concat(dt18.getApellido()).toLowerCase().concat("@gmail.com"));
		dt18.setDireccion("Av. Naciones Unidas N23-45 y Calle Iñaquito, Quito");
		dt18.setFechaNacimiento(LocalDateTime.of(1989, 11, 30, 0, 0));
		dt18.setEmpleado(emplAtG);
		dt18.setTelefono("0908901234");
		emplAtG.setDatos(dt18);
		emplAtG.setUsuario(usr);

		List<Empleado> listE = List.of(empl, emplAC, emplACG, emplAt, emplAtG, emplB1, emplB2, emplB3, emplB4, emplB5,
				emplB6, emplBG, emplL, emplLG, emplM, emplMG, emplV, emplVG);

		listE.forEach(x -> this.iEmpleadoService.insertar(x));

	}

}
