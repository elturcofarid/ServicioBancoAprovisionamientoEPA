/**
 * 
 */
package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;

/**
 * DTO para transporte de la informacion de urls
 * @author djaime
 *
 */
public class UrlDTO implements Serializable {

	/**ID para serializacion	 */
	private static final long serialVersionUID = -4341793016035606685L;

	/**id de la url	 */
	private Long idUrl;
	
	/**direccion url  */
	private String urlWeb;
	
	/**estado de la url	 */
	private String estado;

	/**
	 * Se encarga de obtener el valor del atributo idUrl
	 * @return the idUrl 
	 */
	public Long getIdUrl() {
		return idUrl;
	}

	/**
	 * Se encarga de establecer el valor del atributo idUrl
	 * @param idUrl the idUrl to set 
	 */
	public void setIdUrl(Long idUrl) {
		this.idUrl = idUrl;
	}

	/**
	 * Se encarga de obtener el valor del atributo urlWeb
	 * @return the urlWeb 
	 */
	public String getUrlWeb() {
		return urlWeb;
	}

	/**
	 * Se encarga de establecer el valor del atributo urlWeb
	 * @param urlWeb the urlWeb to set 
	 */
	public void setUrlWeb(String urlWeb) {
		this.urlWeb = urlWeb;
	}

	/**
	 * Se encarga de obtener el valor del atributo estado
	 * @return the estado 
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Se encarga de establecer el valor del atributo estado
	 * @param estado the estado to set 
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
