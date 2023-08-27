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
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(generator = "seq_cli", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_cli", sequenceName = "seq_cli")
	@Column(name = "cli_id")
	private Integer id;
	
	@Column(name = "cli_est")
	private Boolean estado;

	// RELACIONES

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "cli_id_dato")
	private Datos datos;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "cli_id_usr")
	private Usuario usuario;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	private List<Factura> facturas;

	// SETT Y GETTER
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Datos getDatos() {
		return datos;
	}

	public void setDatos(Datos datos) {
		this.datos = datos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	
	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + "]";
	}
}
