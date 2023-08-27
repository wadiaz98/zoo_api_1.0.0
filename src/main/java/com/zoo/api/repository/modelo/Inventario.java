package com.zoo.api.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {

	@Id
	@GeneratedValue(generator = "seq_inv", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_inv", sequenceName = "seq_inv")
	@Column(name = "inv_id")
	private Integer id;

	@Column(name = "inv_fecha_ingreso")
	private LocalDateTime fechaIngreso;

	@Column(name = "inv_fecha_salida")
	private LocalDateTime fechaSalida;

	// Codigo que maneja el zoologico
	@Column(name = "inv_codigo")
	private String codigo;

	@Column(name = "inv_cantidad")
	private Integer cantidad;

	@Column(name = "inv_gasto")
	private Integer gasto;

	// RELACIONES
	@OneToOne(mappedBy = "inventario", fetch = FetchType.EAGER)
	private Producto producto;

	@ManyToOne
	@JoinColumn(name = "inv_id_bode")
	private Bodega bodega;

	@ManyToOne
	@JoinColumn(name = "inv_id_deta")
	private Detalle detalle;

	@ManyToOne
	@JoinColumn(name = "inv_id_rece")
	private Receta receta;

	@ManyToOne
	@JoinColumn(name = "inv_id_diet")
	private Dieta dieta;

	// GETTER & SETTER
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

	public LocalDateTime getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDateTime fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getGasto() {
		return gasto;
	}

	public void setGasto(Integer gasto) {
		this.gasto = gasto;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public Detalle getDetalle() {
		return detalle;
	}

	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public Dieta getDieta() {
		return dieta;
	}

	public void setDieta(Dieta dieta) {
		this.dieta = dieta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Bodega getBodegas() {
		return bodega;
	}

	public void setBodegas(Bodega bodegas) {
		this.bodega = bodegas;
	}

	@Override
	public String toString() {
		return "Inventario [id=" + id + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", codigo="
				+ codigo + ", cantidad=" + cantidad + ", gasto=" + gasto + "]";
	}

}
