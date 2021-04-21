package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

public class FiltroProcesoDTO implements Serializable {
	/** Id para serializacion */
	private static final long serialVersionUID = 4203743116748090499L;
	public TipoProcesoDTO tipoProceso;
	public Long idAplicacion;
	public Long idProceso;
	public String usuario;
	private Boolean confElimPreinstalPrev;
	private Boolean incluirEnunciado;
	private String inicioConsecutivo;
	private Boolean incluirEtiquetas;

	public FiltroProcesoDTO() {
		super();

	}

	public FiltroProcesoDTO(TipoProcesoDTO tipoProceso, Long idAplicacion, Long idProceso, String usuario,
			Boolean confElimPreinstalPrev, Boolean incluirEnunciado, Long idPlanCalificacion,
			String inicioConsecutivo, Boolean incluirEtiquetas) {
		this.tipoProceso = tipoProceso;
		this.usuario = usuario;
		this.idProceso = idProceso;
		this.idAplicacion = idAplicacion;
		this.confElimPreinstalPrev = confElimPreinstalPrev;
		this.incluirEnunciado = incluirEnunciado;
		this.inicioConsecutivo = inicioConsecutivo;
		this.incluirEtiquetas = incluirEtiquetas;
	}

	/**
	 * @return
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
	 * @return the tipoProceso
	 */
	public TipoProcesoDTO getTipoProceso() {
		return tipoProceso;
	}

	/**
	 * @param tipoProceso the tipoProceso to set
	 */
	public void setTipoProceso(TipoProcesoDTO tipoProceso) {
		this.tipoProceso = tipoProceso;
	}

	/**
	 * @return the idAplicacion
	 */
	public Long getIdAplicacion() {
		return idAplicacion;
	}

	/**
	 * @param idAplicacion the idAplicacion to set
	 */
	public void setIdAplicacion(Long idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	@Override
	public String toString() {
		return "FiltroProcesoDTO [tipoProceso=" + tipoProceso + ", idAplicacion=" + idAplicacion + " idProceso="
				+ idProceso + " confElimPreinstalPrev=" + confElimPreinstalPrev + "incluirEnunciado=" + incluirEnunciado
				+ "inicioConsecutivo=" + inicioConsecutivo + "]";
	}

	/**
	 * @return the confElimPreinstalPrev
	 */
	public Boolean getConfElimPreinstalPrev() {
		return confElimPreinstalPrev;
	}

	/**
	 * @param confElimPreinstalPrev the confElimPreinstalPrev to set
	 */
	public void setConfElimPreinstalPrev(Boolean confElimPreinstalPrev) {
		this.confElimPreinstalPrev = confElimPreinstalPrev;
	}

	/**
	 * @return the incluirEnunciado
	 */
	public Boolean getIncluirEnunciado() {
		return incluirEnunciado;
	}

	/**
	 * @param incluirEnunciado the incluirEnunciado to set
	 */
	public void setIncluirEnunciado(Boolean incluirEnunciado) {
		this.incluirEnunciado = incluirEnunciado;
	}

	/**
	 * @return the inicioConsecutivo
	 */
	public String getInicioConsecutivo() {
		return inicioConsecutivo;
	}

	/**
	 * @param inicioConsecutivo the inicioConsecutivo to set
	 */
	public void setInicioConsecutivo(String inicioConsecutivo) {
		this.inicioConsecutivo = inicioConsecutivo;
	}

	/**
	 * @return the incluirEtiquetas
	 */
	public Boolean getIncluirEtiquetas() {
		return incluirEtiquetas;
	}

	/**
	 * @param incluirEtiquetas the incluirEtiquetas to set
	 */
	public void setIncluirEtiquetas(Boolean incluirEtiquetas) {
		this.incluirEtiquetas = incluirEtiquetas;
	}

}
