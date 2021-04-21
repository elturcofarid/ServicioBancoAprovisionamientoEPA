package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

public class CaracteristicaComponenteDTO implements Serializable{

	/**Id para serializacion*/
	private static final long serialVersionUID = -7848625029877591209L;
	
	private Long idCaracteristica;

	private String nombreCaracteristica;
	
	private Long configurado;

	/**
	 * Permite obtener el identificador de la característica asociado a un permiso o componente
	 * @return
	 */
	public Long getIdCaracteristica() {
		return idCaracteristica;
	}

	/**
	 * Permite cambiar el identificador de la característica asociado a un permiso o componente
	 * @param idCaracteristica
	 */
	public void setIdCaracteristica(Long idCaracteristica) {
		this.idCaracteristica = idCaracteristica;
	}

	/**
	 * Permite obtener el nombre de la característica asociado a un permiso o componente
	 * @return
	 */
	public String getNombreCaracteristica() {
		return nombreCaracteristica;
	}

	/**
	 * Permite cambiar el identificador de la característica asociado a un permiso o componente
	 * @param nombreCaracteristica
	 */
	public void setNombreCaracteristica(String nombreCaracteristica) {
		this.nombreCaracteristica = nombreCaracteristica;
	}

	/**
	 * Permite obtener el id de la característica asociado a un permiso o componente
	 * @return
	 */
	public Long getConfigurado() {
		return configurado;
	}

	/**
	 * Permite cambiar el id de la característica asociado a un permiso o componente
	 * @param configurado
	 */
	public void setConfigurado(Long configurado) {
		this.configurado = configurado;
	} 

}
