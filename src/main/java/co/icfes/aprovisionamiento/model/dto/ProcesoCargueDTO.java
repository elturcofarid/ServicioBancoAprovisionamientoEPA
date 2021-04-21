package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;

//import co.gov.icfes.aprovisionamientoe.transformador.modelo.ProcesoCargue;

public class ProcesoCargueDTO implements Serializable {

	/** Id de serialización*/
	private static final long serialVersionUID = 5080670131452229851L;
	
	private Long idProcesoCargue;
	private Long idUsuario;
	private Long idPlanCalificacion;
	private Date fechaCreacion;
	private Long totalPdfsProcesar;
	private Long totalPaquetesCargar;
	
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
	/**
	 * @return the idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}
	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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
	 * @return the totalPdfsProcesar
	 */
	public Long getTotalPdfsProcesar() {
		return totalPdfsProcesar;
	}
	/**
	 * @param totalPdfsProcesar the totalPdfsProcesar to set
	 */
	public void setTotalPdfsProcesar(Long totalPdfsProcesar) {
		this.totalPdfsProcesar = totalPdfsProcesar;
	}
	
	/**
	 * @return the totalPaquetesCargar
	 */
	public Long getTotalPaquetesCargar() {
		return totalPaquetesCargar;
	}
	/**
	 * @param totalPaquetesCargar the totalPaquetesCargar to set
	 */
	public void setTotalPaquetesCargar(Long totalPaquetesCargar) {
		this.totalPaquetesCargar = totalPaquetesCargar;
	}

	/*
	public ProcesoCargue convertirEntity(ProcesoCargueDTO procesoCargueDto){
		ProcesoCargue procesoCargue = new ProcesoCargue();
		procesoCargue.setIdProcesoCargue(procesoCargueDto.getIdProcesoCargue());
		procesoCargue.setIdUsuario(procesoCargueDto.getIdUsuario());
		procesoCargue.setIdPlanCalificacion(procesoCargueDto.getIdPlanCalificacion());
		procesoCargue.setTotalPaquetesCargar(procesoCargueDto.getTotalPaquetesCargar());
		procesoCargue.setTotalPdfsProcesar(procesoCargueDto.getTotalPdfsProcesar());
		procesoCargue.setRutaImagenes("PDF");
		procesoCargue.setRutaMetadata("PDF");
		procesoCargue.setFechaCreacion(procesoCargueDto.getFechaCreacion());
		return procesoCargue;		
	}
	*/


}
