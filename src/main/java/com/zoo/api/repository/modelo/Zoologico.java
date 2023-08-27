package com.zoo.api.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "zoologico")
public class Zoologico {
	@Id
	@GeneratedValue(generator = "seq_zoo", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_zoo", sequenceName = "seq_zoo")
	@Column(name = "zoo_id")
	private Integer id;
	@Column(name = "zoo_nombre")
	private String nombre;
	@Column(name = "zoo_direccion")
	private String direccion;
	@Column(name = "zoo_telefono")
	private String telefono;
	@Column(name = "zoo_correo")
	private String correo;

	// RELACIONES
	@OneToMany(mappedBy = "zoologico", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private List<Bodega> bodegas;

	// GETTER & SETTTER

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Bodega> getBodegas() {
		return bodegas;
	}

	public void setBodegas(List<Bodega> bodegas) {
		this.bodegas = bodegas;
	}

	@Override
	public String toString() {
		return "Zoologico [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", correo=" + correo + "]";
	}

}
