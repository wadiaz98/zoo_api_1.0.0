package com.zoo.api.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ficha_medica")
public class FichaMedica {

	@Id
	@GeneratedValue(generator = "seq_fica", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_fica", sequenceName = "seq_fica")
	@Column(name = "fica_id")
	private Integer id;

	// RELACIONES

	@OneToMany(mappedBy = "fichaMedica")
	private List<CitaMedica> citaMedicas;

	// GETTER & SETTER

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<CitaMedica> getCitaMedicas() {
		return citaMedicas;
	}

	public void setCitaMedicas(List<CitaMedica> citaMedicas) {
		this.citaMedicas = citaMedicas;
	}

	@Override
	public String toString() {
		return "FichaMedica [id=" + id + "]";
	}

}
