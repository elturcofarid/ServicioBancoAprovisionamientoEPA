package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;

//import co.gov.icfes.aprovisionamientoe.transformador.modelo.Paquete;

public class PaqueteDTO implements Serializable {

	/**Id de serialización	 */
	private static final long serialVersionUID = -5216964762214559376L;
	
	private Long idPaquete;
	private Date fechaCreacion;
	private String usuarioCreacion;
	private Long estadoPaquete;
	private String consecutivo;
	private Long idPlanCalificacion;
	private Long idProcesoCargue;
	
	/**
	 * @return the idPaquete
	 */
	public Long getIdPaquete() {
		return idPaquete;
	}
	/**
	 * @param idPaquete the idPaquete to set
	 */
	public void setIdPaquete(Long idPaquete) {
		this.idPaquete = idPaquete;
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
	/**
	 * @return the estadoPaquete
	 */
	public Long getEstadoPaquete() {
		return estadoPaquete;
	}
	/**
	 * @param estadoPaquete the estadoPaquete to set
	 */
	public void setEstadoPaquete(Long estadoPaquete) {
		this.estadoPaquete = estadoPaquete;
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
	 * @return the idPlanCalificacion
	 */
	public Long getIdPlanCalificacion() {
		return idPlanCalificacion;
	}
	/**
	 * @param idPlanCalificacion the idPlanCalificacion to set
	 */
	public void setIdPlanCalificacion(Long idPlanCalificacion) {
		this.idPlanCalificacion = idPlanCalificacion;
	}
	/**
	 * @return the idProcesoCargue
	 */
	public Long getIdProcesoCargue() {
		return idProcesoCargue;
	}
	/**
	 * @param idProcesoCargue the idProcesoCargue to set
	 */
	public void setIdProcesoCargue(Long idProcesoCargue) {
		this.idProcesoCargue = idProcesoCargue;
	}

	/*
	public Paquete convertirEntity(PaqueteDTO paqueteDto){
		Paquete paqueteEnt = new Paquete();
		paqueteEnt.setIdPaquete(paqueteDto.getIdPaquete());
		paqueteEnt.setFechaCreacion(paqueteDto.getFechaCreacion());
		paqueteEnt.setUsuarioCreacion(paqueteDto.getUsuarioCreacion());
		paqueteEnt.setEstadoPaquete(185L);
		paqueteEnt.setConsecutivo(paqueteDto.getConsecutivo());
		paqueteEnt.setIdProcesoCargue(paqueteDto.getIdProcesoCargue());
		paqueteEnt.setIdPlanCalificacion(paqueteDto.getIdPlanCalificacion());
		return paqueteEnt;		
	}
	*/


}
