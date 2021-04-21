package co.icfes.aprovisionamiento.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.icfes.aprovisionamiento.model.dto.EntidadAuditable;


@Entity
@Table(name = "APROV_ITEM")
public class Item extends EntidadAuditable { //implements Serializable {

		
	public static final String INSERTAR_ITEM = "Item.INSERTAR_ITEM";
	public static final String CONSULTAR_ITEM_BOLSA = "Item.CONSULTAR_ITEM_BOLSA";
	public static final String ACTUALIZAR_ESTADO_ITEM="Item.ACTUALIZAR_ESTADO_ITEM";
	public static final String QUERY_ITEM_BOLSA_X_IDARMADO="Item.QUERY_ITEM_BOLSA_X_IDARMADO";
	public static final String DELETE_ITEM_NO_PROCESADOS="Item.DELETE_ITEM_NO_PROCESADOS";
	public static final String ACTUALIZAR_ESTADO_MOVIL="Item.ACTUALIZAR_ESTADO_MOVIL";
	
			
	@Id
//	@ReturnInsert (returnOnly=true)
	@Column(name = "APIT_ID")
	private Long idItem;

	@Column(name = "APIT_CARPETA")
	private String nombreCarpeta;
		
	
	@Column(name = "APIT_ESTADO")
	private Long estado;
	
	@Column(name = "APIT_IDARMADO")
	private String identificadorArmado;

	
	@Column(name = "APIT_TIPORESPUESTA")
	private String tipoRespuesta;
	
	
	@Column(name = "APIT_ESTADOCARGUE")
	private String estadoCargueItem;
	
	
	@Column(name = "APIT_OBSERVACIONES")
	private String observacionesValidacion;
	
	@Column(name = "APIT_RECURSOS")
	private String recursosItem;

   	@Column(name = "APIT_ESTADOCARGUEMOVIL")
	private String estadoCargueItemMovil;
   	   	
   	@Column(name="APIT_OBSERVACIONESMOVIL")
   	private String observacionesValidacionMovil;

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
	 * @return the nombreCarpeta
	 */
	public String getNombreCarpeta() {
		return nombreCarpeta;
	}



	/**
	 * @param nombreCarpeta the nombreCarpeta to set
	 */
	public void setNombreCarpeta(String nombreCarpeta) {
		this.nombreCarpeta = nombreCarpeta;
	}



	/**
	 * @return the estado
	 */
	public Long getEstado() {
		return estado;
	}



	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Long estado) {
		this.estado = estado;
	}



	/**
	 * @return the identificadorArmado
	 */
	public String getIdentificadorArmado() {
		return identificadorArmado;
	}



	/**
	 * @param identificadorArmado the identificadorArmado to set
	 */
	public void setIdentificadorArmado(String identificadorArmado) {
		this.identificadorArmado = identificadorArmado;
	}



	/**
	 * @return the tipoRespuesta
	 */
	public String getTipoRespuesta() {
		return tipoRespuesta;
	}



	/**
	 * @param tipoRespuesta the tipoRespuesta to set
	 */
	public void setTipoRespuesta(String tipoRespuesta) {
		this.tipoRespuesta = tipoRespuesta;
	}



	/**
	 * @return the estadoCargueItem
	 */
	public String getEstadoCargueItem() {
		return estadoCargueItem;
	}



	/**
	 * @param estadoCargueItem the estadoCargueItem to set
	 */
	public void setEstadoCargueItem(String estadoCargueItem) {
		this.estadoCargueItem = estadoCargueItem;
	}



	/**
	 * @return the observacionesValidacion
	 */
	public String getObservacionesValidacion() {
		return observacionesValidacion;
	}



	/**
	 * @param observacionesValidacion the observacionesValidacion to set
	 */
	public void setObservacionesValidacion(String observacionesValidacion) {
		this.observacionesValidacion = observacionesValidacion;
	}

	/**
	 * @return the recursosItem
	 */
	public String getRecursosItem() {
		return recursosItem;
	}

	/**
	 * @param recursosItem the recursosItem to set
	 */
	public void setRecursosItem(String recursosItem) {
		this.recursosItem = recursosItem;
	}
	
	public String getEstadoCargueItemMovil() {
		return estadoCargueItemMovil;
	}



	public void setEstadoCargueItemMovil(String estadoCargueItemMovil) {
		this.estadoCargueItemMovil = estadoCargueItemMovil;
	}
	
	public String getObservacionesValidacionMovil() {
		return observacionesValidacionMovil;
	}



	public void setObservacionesValidacionMovil(String observacionesValidacionMovil) {
		this.observacionesValidacionMovil = observacionesValidacionMovil;
	}
}
