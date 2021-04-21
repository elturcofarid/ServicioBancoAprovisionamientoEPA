package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

public class ContenidoItemWeb_MovilDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3793517238645593228L;
	
	/** Almacena el contenido HTML transformado */
	private String contenidoHTML;
	
	/** Almacena el contenido en formato JSON transformado */
	private ItemMovilDTO contenidoMovil;

	/**
	 * Constructor de la clase
	 * @param contenidoHTML
	 * @param contenidoMovil
	 */
	public ContenidoItemWeb_MovilDTO(String contenidoHTML, ItemMovilDTO contenidoMovil) {
		super();
		this.contenidoHTML = contenidoHTML;
		this.contenidoMovil = contenidoMovil;
	}

	/**
	 * 
	 */
	public ContenidoItemWeb_MovilDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return
	 */
	public String getContenidoHTML() {
		return contenidoHTML;
	}

	/**
	 * @param contenidoHTML
	 */
	public void setContenidoHTML(String contenidoHTML) {
		this.contenidoHTML = contenidoHTML;
	}

	/**
	 * @return
	 */
	public ItemMovilDTO getContenidoMovil() {
		return contenidoMovil;
	}

	/**
	 * @param contenidoMovil
	 */
	public void setContenidoMovil(ItemMovilDTO contenidoMovil) {
		this.contenidoMovil = contenidoMovil;
	}
	
	
	

}
