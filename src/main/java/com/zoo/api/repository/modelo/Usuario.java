package com.zoo.api.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario{

	@Id
	@GeneratedValue(generator = "seq_usr", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_usr", sequenceName = "seq_usr")
	@Column(name = "usr_id")
	private Integer id;

	@Column(name = "usr_usuario")
	private String usuario;

	@Column(name = "usr_contrasenia")
	private String contrasenia;
	
	@Column(name = "usr_estado")
	private Boolean estado;

	// RELACIONES
	@OneToOne(mappedBy = "usuario", fetch = FetchType.EAGER)
	private Cliente cliente;
	
	@OneToOne(mappedBy = "usuario", fetch = FetchType.EAGER)
	private Empleado empleado;

	// GETTERS-SETTERS

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", contrasenia=" + contrasenia + "]";
	}

}
