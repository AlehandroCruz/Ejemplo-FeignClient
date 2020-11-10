package com.gnp.model;

import lombok.Data;

@Data
public class Model {

	private Long id;
	private String mensaje;
	
	
	public Model (Long id, String mensaje) {
		this.id = id;
		this.mensaje = mensaje;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
