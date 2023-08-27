package com.zoo.api.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "cita_medica")
public class CitaMedica {

	@Id
	@GeneratedValue(generator = "seq_cita", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_cita", sequenceName = "seq_cita")
	@Column(name = "cita_id")
	private Integer id;
	@Column(name = "cita_fecha_ingreso")
	private LocalDateTime fechaIngreso;
	@Column(name = "cita_fecha_agenda")
	private LocalDateTime fechaAgenda;
	@Column(name = "cita_especialida")
	private String especialidad;
	@Column(name = "cita_diagnostico")
	private String diagnostico;

	// RELACIONES
	@ManyToOne
	@JoinColumn(name = "cita_id_animal")
	private Animal animal;

	@ManyToOne
	@JoinColumn(name = "cita_id_ficha_medica")
	private FichaMedica fichaMedica;

	@OneToOne
	@JoinColumn(name = "cita_id_receta")
	private Receta receta;

	@OneToMany(mappedBy = "citaMedica")
	private List<Empleado> empleados;

	// GETTE & SETTER
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public FichaMedica getFichaMedica() {
		return fichaMedica;
	}

	public void setFichaMedica(FichaMedica fichaMedica) {
		this.fichaMedica = fichaMedica;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	// TO STRING
	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", fechaIngreso=" + fechaIngreso + ", fechaAgenda=" + fechaAgenda
				+ ", especialidad=" + especialidad + ", diagnostico=" + diagnostico + "]";
	}

}
