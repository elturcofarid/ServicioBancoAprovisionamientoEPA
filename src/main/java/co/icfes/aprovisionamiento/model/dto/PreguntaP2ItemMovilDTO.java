package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

/**
 * @author anieto
 *
 */
public class PreguntaP2ItemMovilDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3512563751431813219L;

	/** Representa el id de la pregunta **/
	private String idItemHijo;
	
	/** Representa el contenido de la pregunta **/
	private String contenido;
	
	/** Representa respuesta por default*/
	private String respuesta;

	
	/**
	 * Constructor de la clase
	 * @param idItemHijo
	 * @param contenido
	 * @param respuesta
	 */
	public PreguntaP2ItemMovilDTO(String idItemHijo, String contenido, String respuesta) {
		this.idItemHijo = idItemHijo;
		this.contenido = contenido;
		this.respuesta = respuesta;
	}


	/**
	 * @return the idItemHijo
	 */
	public String getIdItemHijo() {
		return idItemHijo;
	}


	/**
	 * @param idItemHijo the idItemHijo to set
	 */
	public void setIdItemHijo(String idItemHijo) {
		this.idItemHijo = idItemHijo;
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


	/**
	 * @return the respuesta
	 */
	public String getRespuesta() {
		return respuesta;
	}


	/**
	 * @param respuesta the respuesta to set
	 */
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
}
