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
@Table(name = "dieta")
public class Dieta {

	@Id
	@GeneratedValue(generator = "seq_diet", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_diet", sequenceName = "seq_diet")
	@Column(name = "diet_id")
	private Integer id;

	@Column(name = "diet_cantidad")
	private Integer cantidad;

	@Column(name = "diet_nombre")
	private String nombre;

	// RELACIONES

	@OneToOne
	@JoinColumn(name = "diet_id_animal")
	private Animal animal;

	@OneToMany(mappedBy = "dieta", fetch = FetchType.EAGER)
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

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public List<Inventario> getInventarios() {
		return inventarios;
	}

	public void setInventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
	}

	@Override
	public String toString() {
		return "Dieta [id=" + id + ", cantidad=" + cantidad + ", nombre=" + nombre + "]";
	}

}
