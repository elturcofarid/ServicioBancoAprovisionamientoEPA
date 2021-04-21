/**
 * 
 */
package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Data implements Serializable {

	/**
	 * long serialVersionUID: Atributo para el manejo .
	 */
	private static final long serialVersionUID = 1L;

	private String token;

	private Map<Object, Object> informacion = new HashMap<Object, Object>();

	/**
	 * Constructor de la clase .
	 */
	public Data() {
		super();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * Metodo que retorna el atributo informacion: Map<Object,Object>.
	 * @return atributo informacion: Map<Object,Object>
	 */
	public final Map<Object, Object> getInformacion() {
		return informacion;
	}

	/**
	 * Metodo que modifica el atributo informacion: Map<Object,Object>.
	 * @param informacion : Map<Object,Object> - para cambiar atributo informacion: Map<Object,Object>
	 */
	public final void setInformacion(Map<Object, Object> informacion) {
		this.informacion = informacion;
	}

}
