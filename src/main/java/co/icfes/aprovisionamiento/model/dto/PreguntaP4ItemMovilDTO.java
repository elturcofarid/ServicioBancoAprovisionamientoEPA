package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.List;

public class PreguntaP4ItemMovilDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8113235040811049419L;

	/** Representa el id de la pregunta **/
	private String idItemHijo;
	
	/** Representa el contenido de la pregunta **/
	private String pregunta;
	
	/** Representa la respuesta de ejemplo*/
	private String respuesta;
	
	/** Representa las respuestas simples del Item**/
	private List<RespuestasItemMovilDTO> respuestas;
	
	/** Parte final del item.*/
	private String tFinal;

	/**
	 * Constructor de la clase
	 * @param idItemHijo
	 * @param contenido
	 * @param respuestas
	 */
	public PreguntaP4ItemMovilDTO(String idItemHijo, String contenido, String respuesta, List<RespuestasItemMovilDTO> respuestas, String tFinal) {
		super();
		this.idItemHijo = idItemHijo;
		this.pregunta = contenido;
		this.respuesta = respuesta;
		this.respuestas = respuestas;
		this.tFinal = tFinal;
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
	 * @return the respuestas
	 */
	public List<RespuestasItemMovilDTO> getRespuestas() {
		return respuestas;
	}

	/**
	 * @param respuestas the respuestas to set
	 */
	public void setRespuestas(List<RespuestasItemMovilDTO> respuestas) {
		this.respuestas = respuestas;
	}

	/**
	 * @return the pregunta
	 */
	public String getPregunta() {
		return pregunta;
	}

	/**
	 * @param pregunta the pregunta to set
	 */
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	/**
	 * @return the tFinal
	 */
	public String gettFinal() {
		return tFinal;
	}

	/**
	 * @param tFinal the tFinal to set
	 */
	public void settFinal(String tFinal) {
		this.tFinal = tFinal;
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
