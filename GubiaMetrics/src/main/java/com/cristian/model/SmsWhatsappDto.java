package com.cristian.model;

import java.util.Date;

public class SmsWhatsappDto {

	private Long id;
	private String telefono;
	private String mensaje;
	private Date fecha;
	private Integer Sucursal;
	private Date fechaEnvio;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getSucursal() {
		return Sucursal;
	}
	public void setSucursal(Integer sucursal) {
		Sucursal = sucursal;
	}
	public Date getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	
    
	
}
