package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

public class RespuestasItemMovilDTO implements Serializable{

	/** id para Serlializacion	 */
	private static final long serialVersionUID = 8040222213717102137L;
	
	/** Representa la clave de la respuesta **/
	private String clave;
	
	/** Representa el contenido de la respuesta **/
	private String contenido;

	/**
	 * Constructor de la clase
	 */
	public RespuestasItemMovilDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespuestasItemMovilDTO(String clave, String contenido) {
		super();
		this.clave = clave;
		this.contenido = contenido;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	
	
}
