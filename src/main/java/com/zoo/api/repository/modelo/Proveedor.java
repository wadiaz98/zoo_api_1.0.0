package com.zoo.api.repository.modelo;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(generator = "seq_sup", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_sup", sequenceName = "seq_sup")
	@Column(name = "sup_id")
	private Integer id;

	@Column(name = "sup_nombre")
	private String nombre;

	@Column(name = "sup_ruc")
	private String ruc;

	@Column(name = "sup_telefono")
	private String telefono;

	@Column(name = "sup_direccion")
	private String direccion;

	//Todas las areas de bodega menos el area de boleteria
	@Column(name = "sup_tipo")
	private String tipo;
	
	@Column(name = "sup_correo")
	private String correo;
	
	//TRUE:ACTIVO - FALSE:INACTIVO
	@Column(name = "sup_activo")
	private Boolean activo;

	// RELACIONES
	//GOOD PRACTICE
	@OneToMany(mappedBy = "proveedor", fetch = FetchType.EAGER)
	private List<Producto> productos;

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

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + ", ruc=" + ruc + ", telefono=" + telefono + ", direccion="
				+ direccion + ", tipo=" + tipo + ", correo=" + correo + ", activo=" + activo+"]"
				;
	}

	// TO STRING
	
}
