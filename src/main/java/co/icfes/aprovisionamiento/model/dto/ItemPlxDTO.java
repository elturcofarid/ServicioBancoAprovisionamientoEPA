package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;

//import co.gov.icfes.aprovisionamientoe.transformador.modelo.CuadernilloItem;
//import co.gov.icfes.aprovisionamientoe.transformador.modelo.ItemPLX;

public class ItemPlxDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8304364858342518714L;
	
	private Long idItemPlx;
	private String idItemArmado;
	private String codigoItemIcfes;
	private String contenidoItem;
	private Long idCuadItem;
	private Long idCuadernillo;
	private Long idPrueba;
	private Long cuaItemOrden;
	private String nombrePrueba;
	private String itemCodigoIcfes;
	private String itemCodigoContexto;
	private String instruccion;
	private Date fechaCreacion;
	private Long ordenQTI;
	private String recursosItem;
	private Long exapId;

	/**
	 * Atributo que indica el usuario de creaci�n del registro.
	 */
	private String usuarioCreacion;

	/**
	 * Atributo que indica la fecha de modificaci�n del registro.
	 */
	private Date fechaModificacion;

	/**
	 * Atributo que indica el usuario de modificaci�n del registro.
	 */
	private String usuarioModificacion;
	
	private String estadoValidacionItem;


	private String tipo;
	
	private String estadoPreinstalacion;
	
	private String observaciones;

	private Long numItemHijos;
	
	/**Almacena el contenido movil*/
	private String contenidoMovil;
	
	/** Almacena el estado de validacion movil*/
	private String estadoMovil;
	
	/** Almacena las observaciones del item movil*/
	private String observacionesMovil;

	public ItemPlxDTO() {
		
	}

	public ItemPlxDTO(String itemCodigoIcfes, Long itemOrder, Long pruebaId, String contenidoitem,
			String tipo, String idItemArmado, String nombrePrueba,Long ordenQTI,String recursosItem,String contenidoMovil) {
		this.codigoItemIcfes = itemCodigoIcfes;
		this.cuaItemOrden = itemOrder;
		this.idPrueba = pruebaId;
		this.contenidoItem = contenidoitem;
		this.tipo = tipo;
		this.idItemArmado = idItemArmado;
		this.nombrePrueba = nombrePrueba;	
		this.ordenQTI=ordenQTI;
		this.recursosItem = recursosItem;
		this.contenidoMovil = contenidoMovil;
	}


	/*sacar mapper
	public ItemPLX convertirEntity(ItemPlxDTO itemPlxDTO) {
		ItemPLX itemPlx = new ItemPLX();
		itemPlx.setIdItemPlx(itemPlxDTO.getIdItemPlx());
		itemPlx.setNumeroBanco(itemPlxDTO.getCodigoItemIcfes());
		itemPlx.setContenidoItem(itemPlxDTO.getContenidoItem());
		itemPlx.setTipo(itemPlxDTO.getTipo());
		itemPlx.setFechaCreacion(itemPlxDTO.getFechaCreacion());
		itemPlx.setUsuarioCreacion(itemPlxDTO.getUsuarioCreacion());
		itemPlx.setEstado(itemPlxDTO.getEstadoValidacionItem());
		itemPlx.setFechaModificacion(itemPlxDTO.getFechaModificacion());
		itemPlx.setUsuarioModificacion(itemPlxDTO.getUsuarioModificacion());
		itemPlx.setObservaciones(itemPlxDTO.getObservaciones());
		itemPlx.setNumItemHijos(itemPlxDTO.getNumItemHijos());
		itemPlx.setRecursosItem(itemPlxDTO.getRecursosItem());
		itemPlx.setIdItemArmado(itemPlxDTO.getIdItemArmado());
		itemPlx.setEstadoMovil(itemPlxDTO.getEstadoMovil());
		itemPlx.setObservacionesMovil(itemPlxDTO.getObservacionesMovil());
		itemPlx.setContenidoItemMovil(itemPlxDTO.getContenidoMovil());
     	return itemPlx;
	}

	public CuadernilloItem convertirCuadItem(ItemPlxDTO itemPlxDTO) {
		CuadernilloItem cuaItem = new CuadernilloItem();
		cuaItem.setIdCuadernillo(itemPlxDTO.getIdCuadernillo());
		cuaItem.setIdItem(itemPlxDTO.getIdItemPlx());
		cuaItem.setIdPrueba(itemPlxDTO.getIdPrueba());
		cuaItem.setOrdenItemCuad(itemPlxDTO.getCuaItemOrden());
		cuaItem.setNombrePrueba(itemPlxDTO.getNombrePrueba());
		cuaItem.setUsuarioCreacion(itemPlxDTO.getUsuarioCreacion());
		cuaItem.setFechaCreacion(itemPlxDTO.getFechaCreacion());
		cuaItem.setOrdenQTI(itemPlxDTO.getOrdenQTI());
		return cuaItem;
	}
	*/

	/**
	 * @return the idItemPlx
	 */
	public Long getIdItemPlx() {
		return idItemPlx;
	}

	/**
	 * @param idItemPlx
	 *            the idItemPlx to set
	 */
	public void setIdItemPlx(Long idItemPlx) {
		this.idItemPlx = idItemPlx;
	}

	/**
	 * @return the idCuadItem
	 */
	public long getIdCuadItem() {
		return idCuadItem;
	}

	/**
	 * @param idCuadItem
	 *            the idCuadItem to set
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
	 * @param idCuadernillo
	 *            the idCuadernillo to set
	 */
	public void setIdCuadernillo(Long idCuadernillo) {
		this.idCuadernillo = idCuadernillo;
	}

	/**
	 * @return the idPrueba
	 */
	public long getIdPrueba() {
		return idPrueba;
	}

	/**
	 * @param idPrueba
	 *            the idPrueba to set
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
	 * @param cuaItemOrden
	 *            the cuaItemOrden to set
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
	 * @param nombrePrueba
	 *            the nombrePrueba to set
	 */
	public void setNombrePrueba(String nombrePrueba) {
		this.nombrePrueba = nombrePrueba;
	}

	/**
	 * @return the idItemArmado
	 */
	public String getIdItemArmado() {
		return idItemArmado;
	}

	/**
	 * @param idItemArmado
	 *            the idItemArmado to set
	 */
	public void setIdItemArmado(String idItemArmado) {
		this.idItemArmado = idItemArmado;
	}

	


	/**
	 * @return the codigoItemIcfes
	 */
	public String getCodigoItemIcfes() {
		return codigoItemIcfes;
	}

	/**
	 * @param codigoItemIcfes
	 *            the codigoItemIcfes to set
	 */
	public void setCodigoItemIcfes(String codigoItemIcfes) {
		this.codigoItemIcfes = codigoItemIcfes;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return
	 */
	public String getEstadoPreinstalacion() {
		return estadoPreinstalacion;
	}

	/**
	 * @param estadoPreinstalacion
	 */
	public void setEstadoPreinstalacion(String estadoPreinstalacion) {
		this.estadoPreinstalacion = estadoPreinstalacion;
	}

	/**
<<<<<<< HEAD
	 * @return the itemCodigoIcfes
	 */
	public String getItemCodigoIcfes() {
		return itemCodigoIcfes;
	}



	/**
	 * @param itemCodigoIcfes the itemCodigoIcfes to set
	 */
	public void setItemCodigoIcfes(String itemCodigoIcfes) {
		this.itemCodigoIcfes = itemCodigoIcfes;
	}



	/**
	 * @return the itemCodigoContexto
	 */
	public String getItemCodigoContexto() {
		return itemCodigoContexto;
	}



	/**
	 * @param itemCodigoContexto the itemCodigoContexto to set
	 */
	public void setItemCodigoContexto(String itemCodigoContexto) {
		this.itemCodigoContexto = itemCodigoContexto;
	}



	/**
	 * @return the instruccion
	 */
	public String getInstruccion() {
		return instruccion;
	}



	/**
	 * @param instruccion the instruccion to set
	 */
	public void setInstruccion(String instruccion) {
		this.instruccion = instruccion;
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
	 * @return the fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}



	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	/**
	 * @return the usuarioModificacion
	 */
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}



	/**
	 * @param usuarioModificacion the usuarioModificacion to set
	 */
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}



	/**
	 * @return the estadoValidacionItem
	 */
	public String getEstadoValidacionItem() {
		return estadoValidacionItem;
	}



	/**
	 * @param estadoValidacionItem the estadoValidacionItem to set
	 */
	public void setEstadoValidacionItem(String estadoValidacionItem) {
		this.estadoValidacionItem = estadoValidacionItem;
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
	 * @return the contenidoItem
	 */
	public String getContenidoItem() {
		return contenidoItem;
	}

	/**
	 * @param contenidoItem the contenidoItem to set
	 */
	public void setContenidoItem(String contenidoItem) {
		this.contenidoItem = contenidoItem;
	}

	/**
	 * @return the numItemHijos
	 */
	public Long getNumItemHijos() {
		return numItemHijos;
	}

	/**
	 * @param numItemHijos the numItemHijos to set
	 */
	public void setNumItemHijos(Long numItemHijos) {
		this.numItemHijos = numItemHijos;
	}

	/**
	 * @return the ordenQTI
	 */
	public Long getOrdenQTI() {
		return ordenQTI;
	}

	/**
	 * @param ordenQTI the ordenQTI to set
	 */
	public void setOrdenQTI(Long ordenQTI) {
		this.ordenQTI = ordenQTI;
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

	/**
	 * @return the contenidoMovil
	 */
	public String getContenidoMovil() {
		return contenidoMovil;
	}

	/**
	 * @param contenidoMovil the contenidoMovil to set
	 */
	public void setContenidoMovil(String contenidoMovil) {
		this.contenidoMovil = contenidoMovil;
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

	public Long getExapId() {
		return exapId;
	}

	public void setExapId(Long exapId) {
		this.exapId = exapId;
	}
	
	
	

}
