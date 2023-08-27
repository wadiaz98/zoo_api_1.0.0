package com.zoo.api.repository.modelo;

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
@Table(name = "animal")
public class Animal {

	@Id
	@GeneratedValue(generator = "seq_ani", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_ani", sequenceName = "seq_ani")
	@Column(name = "ani_id")
	private Integer id;

	@Column(name = "ani_nombre")
	private String nombre;

	@Column(name = "ani_nombre_comun")
	private String nombreComun;

	@Column(name = "ani_nombre_cientifico")
	private String nombreCientifico;

	@Column(name = "ani_especie")
	private String especie;

	@Column(name = "ani_habitat")
	private String habitat;

	@Column(name = "ani_tamanio")
	private Double tamanio;

	@Column(name = "ani_peso")
	private Double peso;

	@Column(name = "ani_comportamiento")
	private String comportamiento;

	@Column(name = "ani_estado")
	private Boolean estado;

	// RELACIONES

	@OneToMany(mappedBy = "animal", fetch = FetchType.EAGER)
	private List<CitaMedica> citaMedicas;

	@OneToOne(mappedBy = "animal", fetch = FetchType.EAGER)
	private Dieta dieta;

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

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public Double getTamanio() {
		return tamanio;
	}

	public void setTamanio(Double tamanio) {
		this.tamanio = tamanio;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getComportamiento() {
		return comportamiento;
	}

	public void setComportamiento(String comportamiento) {
		this.comportamiento = comportamiento;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public List<CitaMedica> getCitaMedicas() {
		return citaMedicas;
	}

	public void setCitaMedicas(List<CitaMedica> citaMedicas) {
		this.citaMedicas = citaMedicas;
	}

	public Dieta getDieta() {
		return dieta;
	}

	public void setDieta(Dieta dieta) {
		this.dieta = dieta;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico
				+ ", especie=" + especie + ", habitat=" + habitat + ", tamanio=" + tamanio + ", peso=" + peso
				+ ", comportamiento=" + comportamiento + ", estado=" + estado + "]";
	}
}
