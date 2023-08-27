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
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "bodega")
public class Bodega {

	public enum AreaBodega {
		// Consumibles sera paras personas
		// Alimento sera para animales
		Medicina, Regalos, Consumibles, Alimento, Boleteria
	}

	@Id
	@GeneratedValue(generator = "seq_bode", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_bode", sequenceName = "seq_bode")
	@Column(name = "bode_id")
	private Integer id;

	@Column(name = "bode_nombre")
	private String nombre;

	// RELACIONES
	@OneToMany(mappedBy = "bodega", fetch = FetchType.EAGER)
	private List<Inventario> inventarios;

	@OneToMany(mappedBy = "bodega", fetch = FetchType.EAGER)
	private List<Empleado> empleados;

	@ManyToOne
	@JoinColumn(name = "bode_id_zoo")
	private Zoologico zoologico;

	// GETTER & SETTER

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

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Inventario> getInventario() {
		return inventarios;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventarios = inventario;
	}

	public Zoologico getZoologico() {
		return zoologico;
	}

	public void setZoologico(Zoologico zoologico) {
		this.zoologico = zoologico;
	}

	@Override
	public String toString() {
		return "Bodega [id=" + id + ", nombre=" + nombre + "]";
	}

}
