package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

//import javax.persistence.Column;

//import co.gov.icfes.aprovisionamientoe.transformador.modelo.ItemPLX;

public class ItemPreinstaladoDTO implements Serializable {

	/** id para Serializacion	 */
	private static final long serialVersionUID = -2149727821675494580L;
	
	private Long idItemPlx;
	private Long idItemArmado;
	private String codigoItemIcfes;
	private Blob contenidoEncriptado;
	private String contenidoDesEncriptado;
	private Long idCuadItem;
	private Long idCuadernillo;
	private Long idPrueba;
	private Long cuaItemOrden;
	private String nombrePrueba;
	private String tipo;
	private String estadoPreinstalacion;
	private String observaciones;
	private Date  fechaCreacion; 
	private String  usuarioCreacion;
	private Long tipoRechazo;
	private String estadoMovil;
	private String observacionesMovil;
	private String contenidoItemMovil;	
	private String recursosItem;
	private String idApli;
	private String IdTipoRechazo;
	
	public ItemPreinstaladoDTO() {
		super();
	}

	/*sacar mapper
	public ItemPLX convertirEntity(ItemPreinstaladoDTO itemPreinstalado){
		
		ItemPLX itemPlx = new ItemPLX();
		itemPlx.setIdItemPlx(itemPreinstalado.getIdItemPlx());
		itemPlx.setEstado(itemPreinstalado.getEstadoPreinstalacion());
		itemPlx.setObservaciones(itemPreinstalado.getObservaciones());
		return itemPlx;
	}
	*/


	/**
	 * @return the idItemPlx
	 */
	public Long getIdItemPlx() {
		return idItemPlx;
	}

	/**
	 * @param idItemPlx the idItemPlx to set
	 */
	public void setIdItemPlx(Long idItemPlx) {
		this.idItemPlx = idItemPlx;
	}

	/**
	 * @return the idItemArmado
	 */
	public Long getIdItemArmado() {
		return idItemArmado;
	}

	/**
	 * @param idItemArmado the idItemArmado to set
	 */
	public void setIdItemArmado(Long idItemArmado) {
		this.idItemArmado = idItemArmado;
	}

	/**
	 * @return the codigoItemIcfes
	 */
	public String getCodigoItemIcfes() {
		return codigoItemIcfes;
	}

	/**
	 * @param codigoItemIcfes the codigoItemIcfes to set
	 */
	public void setCodigoItemIcfes(String codigoItemIcfes) {
		this.codigoItemIcfes = codigoItemIcfes;
	}

	/**
	 * @return the contenidoEncriptado
	 */
	public Blob getContenidoEncriptado() {
		return contenidoEncriptado;
	}

	/**
	 * @param contenidoEncriptado the contenidoEncriptado to set
	 */
	public void setContenidoEncriptado(Blob contenidoEncriptado) {
		this.contenidoEncriptado = contenidoEncriptado;
	}

	/**
	 * @return the contenidoDesEncriptado
	 */
	public String getContenidoDesEncriptado() {
		return contenidoDesEncriptado;
	}

	/**
	 * @param contenidoDesEncriptado the contenidoDesEncriptado to set
	 */
	public void setContenidoDesEncriptado(String contenidoDesEncriptado) {
		this.contenidoDesEncriptado = contenidoDesEncriptado;
	}

	/**
	 * @return the idCuadItem
	 */
	public Long getIdCuadItem() {
		return idCuadItem;
	}

	/**
	 * @param idCuadItem the idCuadItem to set
	 */
	public void setIdCuadItem(Long idCuadItem) {
		this.idCuadItem = idCuadItem;
	}

	/**
	 * @return the idCuadernillo
	 */
	public Long getIdCuadernillo() {
		return idCuadernillo;
	}

	/**
	 * @param idCuadernillo the idCuadernillo to set
	 */
	public void setIdCuadernillo(Long idCuadernillo) {
		this.idCuadernillo = idCuadernillo;
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
	 * @return the cuaItemOrden
	 */
	public Long getCuaItemOrden() {
		return cuaItemOrden;
	}

	/**
	 * @param cuaItemOrden the cuaItemOrden to set
	 */
	public void setCuaItemOrden(Long cuaItemOrden) {
		this.cuaItemOrden = cuaItemOrden;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the estadoPreinstalacion
	 */
	public String getEstadoPreinstalacion() {
		return estadoPreinstalacion;
	}

	/**
	 * @param estadoPreinstalacion the estadoPreinstalacion to set
	 */
	public void setEstadoPreinstalacion(String estadoPreinstalacion) {
		this.estadoPreinstalacion = estadoPreinstalacion;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
	 * @return the tipoRechazo
	 */
	public Long getTipoRechazo() {
		return tipoRechazo;
	}

	/**
	 * @param tipoRechazo the tipoRechazo to set
	 */
	public void setTipoRechazo(Long tipoRechazo) {
		this.tipoRechazo = tipoRechazo;
	}

	/**
	 * @return the estadoMovil
	 */
	public String getEstadoMovil() {
		return estadoMovil;
	}

	/**
	 * @param estadoMovil the estadoMovil to set
	 */
	public void setEstadoMovil(String estadoMovil) {
		this.estadoMovil = estadoMovil;
	}

	/**
	 * @return the observacionesMovil
	 */
	public String getObservacionesMovil() {
		return observacionesMovil;
	}

	/**
	 * @param observacionesMovil the observacionesMovil to set
	 */
	public void setObservacionesMovil(String observacionesMovil) {
		this.observacionesMovil = observacionesMovil;
	}

	/**
	 * @return the contenidoItemMovil
	 */
	public String getContenidoItemMovil() {
		return contenidoItemMovil;
	}

	/**
	 * @param contenidoItemMovil the contenidoItemMovil to set
	 */
	public void setContenidoItemMovil(String contenidoItemMovil) {
		this.contenidoItemMovil = contenidoItemMovil;
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

	public String getIdApli() {
		return idApli;
	}

	public void setIdApli(String idApli) {
		this.idApli = idApli;
	}

	

	public String getIdTipoRechazo() {
		return IdTipoRechazo;
	}

	public void setIdTipoRechazo(String idTipoRechazo) {
		IdTipoRechazo = idTipoRechazo;
	}


}
