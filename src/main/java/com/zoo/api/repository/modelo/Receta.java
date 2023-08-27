package com.zoo.api.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "receta")
public class Receta {

	@Id
	@GeneratedValue(generator = "seq_rece", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_rece", sequenceName = "seq_rece")
	@Column(name = "rece_id")
	private Integer id;

	@Column(name = "rece_cantidad")
	private Integer cantidad;

	@Column(name = "rece_nombre")
	private String nombre;

	// RELACIONES

	@OneToOne(mappedBy = "receta", fetch = FetchType.EAGER)
	private CitaMedica citaMedica;

	@OneToMany(mappedBy = "receta", fetch = FetchType.EAGER)
	private List<Inventario> inventarios;

	// GETTER & SETTER

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CitaMedica getCitaMedica() {
		return citaMedica;
	}

	public void setCitaMedica(CitaMedica citaMedica) {
		this.citaMedica = citaMedica;
	}

	public List<Inventario> getInventarios() {
		return inventarios;
	}

	public void setInventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
	}

	@Override
	public String toString() {
		return "Receta [id=" + id + ", cantidad=" + cantidad + ", nombre=" + nombre + "]";
	}

}
