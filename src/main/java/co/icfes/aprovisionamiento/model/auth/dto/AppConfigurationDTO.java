/**
 * 
 */
package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;

/**
 * DTO para el transporte de la informacion de configuracion de plexi-config
 * @author djaime
 *
 */
public class AppConfigurationDTO implements Serializable {

	/**ID para serializacion	 */
	private static final long serialVersionUID = 8184768683239031094L;
	
	/**Url de autenticacion SSO */
	private String urlAutenticacion;
	
	/**Url de autorizacion SSO	 */
	private String urlAutorizacion;
	
	/**endpoint de los servicios rest	 */
	private String restEndpoint;
	
	/**Url a la que redirige la autenticacion del sso	 */
	private String urlHome;

	/**
	 * constructor de la clase
	 */
	public AppConfigurationDTO(){}
	
	/**
	 * Se encarga de obtener el valor del atributo urlAutenticacion
	 * @return the urlAutenticacion 
	 */
	public String getUrlAutenticacion() {
		return urlAutenticacion;
	}

	/**
	 * Se encarga de establecer el valor del atributo urlAutenticacion
	 * @param urlAutenticacion the urlAutenticacion to set 
	 */
	public void setUrlAutenticacion(String urlAutenticacion) {
		this.urlAutenticacion = urlAutenticacion;
	}

	/**
	 * Se encarga de obtener el valor del atributo urlAutorizacion
	 * @return the urlAutorizacion 
	 */
	public String getUrlAutorizacion() {
		return urlAutorizacion;
	}

	/**
	 * Se encarga de establecer el valor del atributo urlAutorizacion
	 * @param urlAutorizacion the urlAutorizacion to set 
	 */
	public void setUrlAutorizacion(String urlAutorizacion) {
		this.urlAutorizacion = urlAutorizacion;
	}

	/**
	 * Se encarga de obtener el valor del atributo restEndpoint
	 * @return the restEndpoint 
	 */
	public String getRestEndpoint() {
		return restEndpoint;
	}

	/**
	 * Se encarga de establecer el valor del atributo restEndpoint
	 * @param restEndpoint the restEndpoint to set 
	 */
	public void setRestEndpoint(String restEndpoint) {
		this.restEndpoint = restEndpoint;
	}

	/**
	 * Se encarga de obtener el valor del atributo urlHome
	 * @return the urlHome 
	 */
	public String getUrlHome() {
		return urlHome;
	}

	/**
	 * Se encarga de establecer el valor del atributo urlHome
	 * @param urlHome the urlHome to set 
	 */
	public void setUrlHome(String urlHome) {
		this.urlHome = urlHome;
	}

}
