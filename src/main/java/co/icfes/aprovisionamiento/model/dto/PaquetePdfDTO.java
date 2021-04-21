package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

//import co.gov.icfes.aprovisionamientoe.transformador.modelo.PaquetePDF;

public class PaquetePdfDTO implements Serializable {

	/** identificador de serialización*/
	private static final long serialVersionUID = -3680728856147763589L;

	private Long idPaquetePDF;
	private byte[] contenidoPdf;
	private Long idProcesoCargue;
	private Long idPaquete;
	
	/**
	 * @return the idPaquetePDF
	 */
	public Long getIdPaquetePDF() {
		return idPaquetePDF;
	}
	/**
	 * @param idPaquetePDF the idPaquetePDF to set
	 */
	public void setIdPaquetePDF(Long idPaquetePDF) {
		this.idPaquetePDF = idPaquetePDF;
	}
	/**
	 * @return the contenidoPdf
	 */
	public byte[] getContenidoPdf() {
		return contenidoPdf;
	}
	/**
	 * @param contenidoPdf the contenidoPdf to set
	 */
	public void setContenidoPdf(byte[] contenidoPdf) {
		this.contenidoPdf = contenidoPdf;
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

	/*
	public PaquetePDF convertirEntity(PaquetePdfDTO paquetePdfDto){
		PaquetePDF paquetePdfEnt = new PaquetePDF();
		paquetePdfEnt.setIdPaquetePDF(paquetePdfDto.getIdPaquetePDF());
		paquetePdfEnt.setContenidoPdf(paquetePdfDto.getContenidoPdf());
		paquetePdfEnt.setIdProcesoCargue(paquetePdfDto.getIdProcesoCargue());
		paquetePdfEnt.setIdPaquete(paquetePdfDto.getIdPaquete());
		return paquetePdfEnt;
	}

	 */
}
