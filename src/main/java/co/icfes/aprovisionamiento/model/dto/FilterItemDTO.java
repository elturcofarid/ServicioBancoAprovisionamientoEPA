package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;

public class FilterItemDTO implements Serializable{
  
	/**ID para serializacion	 */
	private static final long serialVersionUID = 1361681524679315756L;
	
	/**Identificador del Item del armado	 */
	private String idItemArmado;
	
	/**Estado del Item el item. NV: no verificado, VE: Verificado, RE: Rechazado. */
	private String estadoItem;
	
	/**Fecha Inicio de la busqueda */
	private Date fechaInicio;
	
	/**Fecha Fin de la busqueda */
	private Date fechaFin;
	
	/**Tipo Contenido HTML,QTI */
	private String tipoContenido;
	
	
	/**Identificador del Item	 */
	private Long idItem;
	
	/**Identificador del Item Móvil el item NV: no verificado, VE: Verificado, RE: Rechazado. */
	private String estadoItemMovil;
	
	

	public FilterItemDTO() {
	}
	
	/**
	 * @return the estadoItem
	 */
	public String getEstadoItem() {
		return estadoItem;
	}
	/**
	 * @param estadoItem the estadoItem to set
	 */
	public void setEstadoItem(String estadoItem) {
		this.estadoItem = estadoItem;
	}
	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}
	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	/**
	 * @return the tipoContenido
	 */
	public String getTipoContenido() {
		return tipoContenido;
	}
	/**
	 * @param tipoContenido the tipoContenido to set
	 */
	public void setTipoContenido(String tipoContenido) {
		this.tipoContenido = tipoContenido;
	}
	/**
	 * @return the idItemArmado
	 */
	public String getIdItemArmado() {
		return idItemArmado;
	}
	/**
	 * @param idItemArmado the idItemArmado to set
	 */
	public void setIdItemArmado(String idItemArmado) {
		this.idItemArmado = idItemArmado;
	}
	/**
	 * @return the idItem
	 */
	public Long getIdItem() {
		return idItem;
	}
	/**
	 * @param idItem the idItem to set
	 */
	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	/**
	 */
	public String getEstadoItemMovil() {
		return estadoItemMovil;
	}
	
	/**
	 * @param estadoItemMovil the EstadoItemMovil to get
	 */
	public void setEstadoItemMovil(String estadoItemMovil) {
		this.estadoItemMovil = estadoItemMovil;
	}

}
