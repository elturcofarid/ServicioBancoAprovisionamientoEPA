package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;

/**
 * DTO para el transporte de la informacion de autorizacion
 * @author djaime
 *
 */
public class AuthorizationDTO implements Serializable {

	/**ID para serializacion	 */
	private static final long serialVersionUID = -5506108873105725312L;
	
	private String estado = "valido";
	
	public AuthorizationDTO(){
		
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
