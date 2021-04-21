package co.icfes.aprovisionamiento.model.dto;
/**
 * Clase DTO que contiene la información de las respuestas para la generación de los objetos respuestas.
 * @author jbonilla
 *
 */
public class RespuestasDTO {
	
	/**
	 * Atributo que contiene el identificador de la respuesta.
	 */
	private String idRespuesta;
	
	/**
	 * Atributo que contiene la información del atributo 'value' en el html.
	 */
	private String valueRespuesta;
	
	/**
	 * Atributo que contiene la información del valor de respuesta.
	 */
	private String valorRespuesta;
	
	/**
	 * Atributo que indica si la respuesta, es una respuesta de ejemplo
	 */
	private Boolean esEjemplo;
	
	/**
	 * Atributo que marca el estilo de la respuesta
	 */
	private String estilo;
	
	
	/**
	 * COnstructor por default.
	 */
	public RespuestasDTO() {
		
	}

	
	///////////////////////////GETTER-SETTER/////////////////////////////////////

	/**
	 * @return the idRespuesta
	 */
	public String getIdRespuesta() {
		return idRespuesta;
	}

	/**
	 * @param idRespuesta the idRespuesta to set
	 */
	public void setIdRespuesta(String idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	/**
	 * @return the valueRespuesta
	 */
	public String getValueRespuesta() {
		return valueRespuesta;
	}

	/**
	 * @param valueRespuesta the valueRespuesta to set
	 */
	public void setValueRespuesta(String valueRespuesta) {
		this.valueRespuesta = valueRespuesta;
	}

	/**
	 * @return the valorRespuesta
	 */
	public String getValorRespuesta() {
		return valorRespuesta;
	}

	/**
	 * @param valorRespuesta the valorRespuesta to set
	 */
	public void setValorRespuesta(String valorRespuesta) {
		this.valorRespuesta = valorRespuesta;
	}


	/**
	 * @return the esEjemplo
	 */
	public Boolean getEsEjemplo() {
		return esEjemplo;
	}


	/**
	 * @param esEjemplo the esEjemplo to set
	 */
	public void setEsEjemplo(Boolean esEjemplo) {
		this.esEjemplo = esEjemplo;
	}


	/**
	 * @return the estilo
	 */
	public String getEstilo() {
		return estilo;
	}


	/**
	 * @param estilo the estilo to set
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	
}
