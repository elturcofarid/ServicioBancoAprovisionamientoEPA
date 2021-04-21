package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

//import co.gov.icfes.aprovisionamientoe.transformador.modelo.PdfContenido;

public class PdfContenidoDTO implements Serializable{

	/**Identificador serialización*/
	private static final long serialVersionUID = -4728196506008895155L;
	
	private Long idPdfContenido;
	private String nombrePdf;
	private byte[] contenidoPdf;	
	private Long idPrueba;	
	private String credencial;
	private String snp;
	private String itemNumero;
	private String respuestaAbierta;
	private String itemContenido;
	private String nombreCuadernillo;
	private String nombrePrueba;
	private Long idCombo;
	
	/**
	 * @return the idPdfContenido
	 */
	public Long getIdPdfContenido() {
		return idPdfContenido;
	}
	/**
	 * @param idPdfContenido the idPdfContenido to set
	 */
	public void setIdPdfContenido(Long idPdfContenido) {
		this.idPdfContenido = idPdfContenido;
	}
	/**
	 * @return the nombrePdf
	 */
	public String getNombrePdf() {
		return nombrePdf;
	}
	/**
	 * @param nombrePdf the nombrePdf to set
	 */
	public void setNombrePdf(String nombrePdf) {
		this.nombrePdf = nombrePdf;
	}
	
	/**
	 * @return the idPrueba
	 */
	public Long getIdPrueba() {
		return idPrueba;
	}
	/**
	 * @param idPrueba the idPrueba to set
	 */
	public void setIdPrueba(Long idPrueba) {
		this.idPrueba = idPrueba;
	}
	/**
	 * @return the credencial
	 */
	public String getCredencial() {
		return credencial;
	}
	/**
	 * @param credencial the credencial to set
	 */
	public void setCredencial(String credencial) {
		this.credencial = credencial;
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
	 * @return the itemNumero
	 */
	public String getItemNumero() {
		return itemNumero;
	}
	/**
	 * @param itemNumero the itemNumero to set
	 */
	public void setItemNumero(String itemNumero) {
		this.itemNumero = itemNumero;
	}
	/**
	 * @return the respuestaAbierta
	 */
	public String getRespuestaAbierta() {
		return respuestaAbierta;
	}
	/**
	 * @param respuestaAbierta the respuestaAbierta to set
	 */
	public void setRespuestaAbierta(String respuestaAbierta) {
		this.respuestaAbierta = respuestaAbierta;
	}
	/**
	 * @return the itemContenido
	 */
	public String getItemContenido() {
		return itemContenido;
	}
	/**
	 * @param itemContenido the itemContenido to set
	 */
	public void setItemContenido(String itemContenido) {
		this.itemContenido = itemContenido;
	}
	/**
	 * @return the nombreCuadernillo
	 */
	public String getNombreCuadernillo() {
		return nombreCuadernillo;
	}
	/**
	 * @param nombreCuadernillo the nombreCuadernillo to set
	 */
	public void setNombreCuadernillo(String nombreCuadernillo) {
		this.nombreCuadernillo = nombreCuadernillo;
	}
	/**
	 * @return the nombrePrueba
	 */
	public String getNombrePrueba() {
		return nombrePrueba;
	}
	/**
	 * @param nombrePrueba the nombrePrueba to set
	 */
	public void setNombrePrueba(String nombrePrueba) {
		this.nombrePrueba = nombrePrueba;
	}	
	/**
	 * @return the idCombo
	 */
	public Long getIdCombo() {
		return idCombo;
	}
	/**
	 * @param idCombo the idCombo to set
	 */
	public void setIdCombo(Long idCombo) {
		this.idCombo = idCombo;
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
	 * Convierte el Objeto PdfContenidoDTO a la entidad PdfContenido
	 * @return PdfContenido
	 */
	/*
	public PdfContenido toPdfContenido(){
		PdfContenido nuevoPdf = new PdfContenido();
		nuevoPdf.setIdPdfContenido(this.idPdfContenido);
		nuevoPdf.setNombrePdf(this.nombrePdf);
		nuevoPdf.setContenidoPdf(this.contenidoPdf);
		nuevoPdf.setItemNumero(this.itemNumero);
		nuevoPdf.setIdPrueba(this.idPrueba);
		nuevoPdf.setCredencial(this.credencial);
		nuevoPdf.setSnp(this.snp);
		return nuevoPdf;
	}
	*/

}
