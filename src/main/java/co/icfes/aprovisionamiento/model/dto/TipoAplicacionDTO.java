package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

public class TipoAplicacionDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8798514755354750099L;
	
	private Long idTipoAplicacion;
	private String aliasAplicacion;
	private String nombreAplicacion;
	
	public Long getIdTipoAplicacion() {
		return idTipoAplicacion;
	}
	public void setIdTipoAplicacion(Long idTipoAplicacion) {
		this.idTipoAplicacion = idTipoAplicacion;
	}
	public String getAliasAplicacion() {
		return aliasAplicacion;
	}
	public void setAliasAplicacion(String aliasAplicacion) {
		this.aliasAplicacion = aliasAplicacion;
	}
	public String getNombreAplicacion() {
		return nombreAplicacion;
	}
	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}
}
