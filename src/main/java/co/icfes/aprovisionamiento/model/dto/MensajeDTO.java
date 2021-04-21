package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.List;
import co.icfes.aprovisionamiento.model.enums.EnumTipoProceso;

public class MensajeDTO implements Serializable {

	/**
	 * Atributo que indica el numero de version de la clase serializada
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo que indica el tipo de proceso ejecutado.
	 */
	private EnumTipoProceso tipoProceso;
	
	
	/**
	 * Atributo que contiene la informaci�n necesaria para la ejecuci�n
	 * de la acci�n identificada por la cola 
	 */
	private Serializable mensaje;
	
	/**
	 * Atributo lista que contiene la informaci�n necesaria para la ejecuci�n
	 * de la acci�n identificada por la cola 
	 */
	private List<Serializable> mensajes;
	
	/**
	 * Atributo string.
	 */
	private String texto;
	
	/**
	 * Constructor por defecto
	 */
	public MensajeDTO(){
		
	}
	
	/**
	 * Constructor con tipificacionMensaje y Texto.
	 * @param tipoMensaje
	 * @param texto
	 */
	public MensajeDTO(EnumTipoProceso tipoMensaje, String texto) {
		super();
		this.tipoProceso = tipoMensaje;
		this.texto = texto;
	}

	/**
	 * @return the tipoProceso
	 */
	public EnumTipoProceso getTipoProceso() {
	    return tipoProceso;
	}

	/**
	 * @param tipoProceso the tipoProceso to set
	 */
	public void setTipoProceso(EnumTipoProceso tipoProceso) {
	    this.tipoProceso = tipoProceso;
	}
 

	/**
	 * @return the mensaje
	 */
	public Serializable getMensaje() {
	    return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(Serializable mensaje) {
	    this.mensaje = mensaje;
	}

	/**
	 * @return the mensajes
	 */
	public List<Serializable> getMensajes() {
	    return mensajes;
	}

	/**
	 * @param mensajes the mensajes to set
	 */
	public void setMensajes(List<Serializable> mensajes) {
	    this.mensajes = mensajes;
	}

	/**
	 * @return the texto
	 */
	public String getTexto() {
	    return texto;
	}

	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
	    this.texto = texto;
	}
	
	
	
}
