package com.zoo.api.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@GeneratedValue(generator = "seq_emp", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_emp", sequenceName = "seq_emp")
	@Column(name = "emp_id")
	private Integer id;

	@Column(name = "emp_cargo")
	private String cargo;

	@Column(name = "emp_departamento")
	private String deparatmento;

	@Column(name = "emp_horario")
	private String horario;

	@Column(name = "emp_sueldo")
	private BigDecimal sueldo;

	@Column(name = "emp_contrato")
	private String tipoContrato;

	@Column(name = "emp_estado_civil")
	private String estadoCivil;

	@Column(name = "emp_estado")
	private Boolean estado;

	// RELACIONES
	@ManyToOne()
	@JoinColumn(name = "emp_id_bodega")
	private Bodega bodega;

	@ManyToOne()
	@JoinColumn(name = "emp_id_cita_medica")
	private CitaMedica citaMedica;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "emp_id_datos")
	private Datos datos;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "emp_id_usr")
	private Usuario usuario;

	// GETTERS-SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDeparatmento() {
		return deparatmento;
	}

	public void setDeparatmento(String deparatmento) {
		this.deparatmento = deparatmento;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public CitaMedica getCitaMedica() {
		return citaMedica;
	}

	public void setCitaMedica(CitaMedica citaMedica) {
		this.citaMedica = citaMedica;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
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

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", cargo=" + cargo + ", deparatmento=" + deparatmento + ", horario=" + horario
				+ ", sueldo=" + sueldo + ", tipoContrato=" + tipoContrato + ", estadoCivil=" + estadoCivil + ", estado="
				+ estado + "]";
	}

	// TO STRING

}
