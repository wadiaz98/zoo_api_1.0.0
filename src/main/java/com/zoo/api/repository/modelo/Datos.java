package com.zoo.api.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "datos")
public class Datos {

	@Id
	@GeneratedValue(generator = "seq_dat", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_dat", sequenceName = "seq_dat")
	@Column(name = "dat_id")
	private Integer id;

	@Column(name = "dat_nombre")
	private String nombre;

	@Column(name = "dat_apellido")
	private String apellido;

	@Column(name = "dat_cedula")
	private String cedula;

	@Column(name = "dat_direccion")
	private String direccion;

	@Column(name = "dat_correo")
	private String correo;

	@Column(name = "dat_telefono")
	private String telefono;

	@Column(name = "dat_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;

	@Column(name = "dat_edad")
	private Integer edad;

	@Column(name = "dat_estado")
	private Boolean estado;

	// RELACIONES	
	@OneToOne(mappedBy = "datos", fetch =  FetchType.EAGER)
	private Empleado empleado;

	// GETTERS-SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", fechaNacimiento="
				+ fechaNacimiento + ", edad=" + edad + ", estado=" + estado + "]";
	}
}
