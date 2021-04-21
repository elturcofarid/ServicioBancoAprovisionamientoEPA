package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

//import co.gov.icfes.aprovisionamientoe.enums.EnumTipoProceso;
import co.icfes.aprovisionamiento.model.enums.EnumTipoProceso;

/**
 * FiltroProcesoMasivoDTO: Filtro para la ejecucion de la citacion masiva.
 */
public class FiltroProcesoMasivoDTO implements Serializable {

	/** serial por defecto. */
	private static final long serialVersionUID = 1L;

	/** identificador del proceso. */
	private Long idProceso;

	/** usuario. */
	private String usuario;

	/** lista de tipos de proceso. */
	private EnumTipoProceso tiposProceso;

	/** Nombre del proceso. */
	private String nombreProceso;

	/** Mensaje para el proceso. */
	private String mensajeProceso;

	
	
	
	public FiltroProcesoMasivoDTO(String usuario, EnumTipoProceso tiposProceso, String nombreProceso,
			String mensajeProceso) {
		super();
		this.usuario = usuario;
		this.tiposProceso = tiposProceso;
		this.nombreProceso = nombreProceso;
		this.mensajeProceso = mensajeProceso;
	}

	/**
	 * @return the idProceso
	 */
	public Long getIdProceso() {
		return idProceso;
	}

	/**
	 * @param idProceso the idProceso to set
	 */
	public void setIdProceso(Long idProceso) {
		this.idProceso = idProceso;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	

	/**
	 * @return the nombreProceso
	 */
	public String getNombreProceso() {
		return nombreProceso;
	}

	/**
	 * @param nombreProceso the nombreProceso to set
	 */
	public void setNombreProceso(String nombreProceso) {
		this.nombreProceso = nombreProceso;
	}

	/**
	 * @return the mensajeProceso
	 */
	public String getMensajeProceso() {
		return mensajeProceso;
	}

	/**
	 * @param mensajeProceso the mensajeProceso to set
	 */
	public void setMensajeProceso(String mensajeProceso) {
		this.mensajeProceso = mensajeProceso;
	}

	/**
	 * @return the tiposProceso
	 */
	public EnumTipoProceso getTiposProceso() {
		return tiposProceso;
	}

	/**
	 * @param tiposProceso the tiposProceso to set
	 */
	public void setTiposProceso(EnumTipoProceso tiposProceso) {
		this.tiposProceso = tiposProceso;
	}
	
	

}
