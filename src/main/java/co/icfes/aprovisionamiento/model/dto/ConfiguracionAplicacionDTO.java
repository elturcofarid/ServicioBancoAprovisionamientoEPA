package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

//import co.gov.icfes.aprovisionamientoe.comun.modelo.ConfiguracionAplicacion;

public class ConfiguracionAplicacionDTO implements Serializable {

	/**Id para serializacion*/
	private static final long serialVersionUID = 5151927285591384600L;
	
	private Long idConfAplicacion;
	private Long idAplicacion;
	private Long idParametro;
	private Long idTipoAplicacion;
	private Long idCaracteristica;
	
	/**
	 * Permite obtener el identificador de la configuración
	 * @return
	 */
	public Long getIdConfAplicacion() {
		return idConfAplicacion;
	}
	
	/**
	 * Permite cambiar el identificador de la configuración
	 * @param idConfAplicacion
	 */
	public void setIdConfAplicacion(Long idConfAplicacion) {
		this.idConfAplicacion = idConfAplicacion;
	}
	
	/**
	 * Permite obtener el identificador de la aplicación
	 * @return
	 */
	public Long getIdAplicacion() {
		return idAplicacion;
	}
	
	/**
	 * Permite cambiar el identificador de la aplicación
	 * @param idAplicacion
	 */
	public void setIdAplicacion(Long idAplicacion) {
		this.idAplicacion = idAplicacion;
	}
	
	/**
	 * Permite obtener el identificador del parámetro o permiso
	 * @return
	 */
	public Long getIdParametro() {
		return idParametro;
	}
	
	/**
	 * Permite cambiar el identificador del parámetro o permiso
	 * @param idParametro
	 */
	public void setIdParametro(Long idParametro) {
		this.idParametro = idParametro;
	}
	
	/**
	 * Permite obtener el identificador del tipo de aplicación
	 * @return
	 */
	public Long getIdTipoAplicacion() {
		return idTipoAplicacion;
	}
	
	/**
	 * Permite cambiar el identificador del tipo de aplicación
	 * @param idTipoAplicacion
	 */
	public void setIdTipoAplicacion(Long idTipoAplicacion) {
		this.idTipoAplicacion = idTipoAplicacion;
	}
	
	/**
	 * Permite obtener el identificador de la característica
	 * @return
	 */
	public Long getIdCaracteristica() {
		return idCaracteristica;
	}
	
	/**
	 * Permite cambiar el identificador de la característica
	 * @param idCaracteristica
	 */
	public void setIdCaracteristica(Long idCaracteristica) {
		this.idCaracteristica = idCaracteristica;
	}


	/*mapper llevarlo afuera/
	/**
	 * Permite el mapeo del DTO a la entidad ConfiguracionAplicacion
	 * @return
	 */
	/*
	public ConfiguracionAplicacion toConfiguracion() {
		ConfiguracionAplicacion nuevo = new ConfiguracionAplicacion();
		nuevo.setIdConfAplicacion(this.idConfAplicacion);
		nuevo.setIdAplicacion(this.idAplicacion);
		nuevo.setIdCaracteristica(this.idCaracteristica);
		nuevo.setIdParametro(this.idParametro);
		nuevo.setIdTipoAplicacion(this.idTipoAplicacion);
		return nuevo;
	}

	 */

}
