package com.zoo.api.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(generator = "seq_pro", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_pro", sequenceName = "seq_pro")
	@Column(name = "pro_id")
	private Integer id;

	@Column(name = "pro_nombre")
	private String nombre;

	@Column(name = "pro_tipo")
	private String tipo;

	@Column(name = "pro_codigo")
	private String codigo;

	@Column(name = "pro_descripcion")
	private String descripcion;

	@Column(name = "pro_precio_unitario")
	private BigDecimal precioUnitario;

	@Column(name = "pro_fecha_vencimiento")
	private LocalDateTime fechaVencimiento;

	@Column(name = "pro_tiempo_entrega")
	private Integer tiempoEntrega;

	// TRUE:ACTIVO - FALSE:INACTIVO
	@Column(name = "pro_activo")
	private Boolean activo;

	// RELACIONES
	@ManyToOne
	@JoinColumn(name = "pro_id_proveedor") // La pk de autor
	private Proveedor proveedor;

	@OneToOne()
	@JoinColumn(name = "pro_id_inventario")
	private Inventario inventario;

	// GETTERS-SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public LocalDateTime getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Integer getTiempoEntrega() {
		return tiempoEntrega;
	}

	public void setTiempoEntrega(Integer tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}

	public Boolean getActivo() {
		return activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", codigo=" + codigo + ", descripcion="
				+ descripcion + ", precioUnitario=" + precioUnitario + ", fechaVencimiento=" + fechaVencimiento
				+ ", tiempoEntrega=" + tiempoEntrega + ", activo=" + activo + ", proveedor=" + proveedor + "]";
	}

}
