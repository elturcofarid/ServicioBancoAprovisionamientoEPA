package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;

//import co.gov.icfes.aprovisionamientoe.transformador.modelo.SnpConsecutivo;

public class SnpConsecutivoDTO implements Serializable{

	/** Id de serialización*/
	private static final long serialVersionUID = -8000700273600105859L;
	
	private Long idSnpConsecutivo;
	private String snp;
	private String consecutivo;
	private Date fechaCreacion;
	private String usuarioCreacion;
	private Long idProceso;
	
	/**
	 * @return the idSnpConsecutivo
	 */
	public Long getIdSnpConsecutivo() {
		return idSnpConsecutivo;
	}
	/**
	 * @param idSnpConsecutivo the idSnpConsecutivo to set
	 */
	public void setIdSnpConsecutivo(Long idSnpConsecutivo) {
		this.idSnpConsecutivo = idSnpConsecutivo;
	}
	/**
	 * @return the snp
	 */
	public String getSnp() {
		return snp;
	}
	/**
	 * @param snp the snp to set
	 */
	public void setSnp(String snp) {
		this.snp = snp;
	}
	/**
	 * @return the consecutivo
	 */
	public String getConsecutivo() {
		return consecutivo;
	}
	/**
	 * @param consecutivo the consecutivo to set
	 */
	public void setConsecutivo(String consecutivo) {
		this.consecutivo = consecutivo;
	}
	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the usuarioCreacion
	 */
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	/**
	 * @param usuarioCreacion the usuarioCreacion to set
	 */
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	/*
	public SnpConsecutivo convertirEntity(SnpConsecutivoDTO snpDto){
		SnpConsecutivo snpCons = new SnpConsecutivo();
		snpCons.setIdSnpConsecutivo(snpDto.getIdSnpConsecutivo());
		snpCons.setConsecutivo(snpDto.getConsecutivo());
		snpCons.setFechaCreacion(snpDto.getFechaCreacion());
		snpCons.setSnp(snpDto.getSnp());
		snpCons.setUsuarioCreacion(snpDto.getUsuarioCreacion());
		snpCons.setIdProceso(snpDto.getIdProceso());
		return snpCons;
	}

	 */
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
}
