package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import co.gov.icfes.aprovisionamientoe.transformador.modelo.ItemContenido;

/**
 * @author ygamboa Clase encargada enviar al bean la información del paso de
 *         cada actividad
 *
 */
public class ItemContenidoDTO implements Serializable {

	
	/**
	 * long serialVersionUID: Atributo para el manejo .
	 */
	private static final long serialVersionUID = -2381492220362501410L;
	private static Logger logger = LoggerFactory.getLogger(ItemContenidoDTO.class);
	
	private Long idItemContenido;
	private Long idItem;
	private String tipoContenido;
	private Long estado;
	private String valorCampo;
	private Date fechaCreacion;
	private String usuarioCreacion;
	private Date fechaModificacion;
	private String usuarioModificacion;
	private String tipoRespuesta;
	private String identificadorArmado ;
	private String recursosItem;
	private String valorCampoMovil;
	


/*sacar mapper
	public ItemContenido convertirEntity(ItemContenidoDTO itemContenidoDTO) throws Exception {
		ItemContenido itemContenido = new ItemContenido();
	    itemContenido.setIdItem(itemContenidoDTO.getIdItem());
	    itemContenido.setIdItemContenido(itemContenidoDTO.getIdItemContenido());
	    itemContenido.setTipoContenido(itemContenidoDTO.getTipoContenido());
	    itemContenido.setValorCampo(itemContenidoDTO.getValorCampo());
	    itemContenido.setValorCampoMovil(itemContenidoDTO.getValorCampoMovil());
		itemContenido.setFechaCreacion(itemContenidoDTO.getFechaCreacion());
		itemContenido.setUsuarioCreacion(itemContenidoDTO.getUsuarioCreacion());
		itemContenido.setEstado(itemContenidoDTO.getEstado());
		itemContenido.setFechaModificacion(itemContenidoDTO.getFechaModificacion());
		itemContenido.setUsuarioModificacion(itemContenidoDTO.getUsuarioModificacion());
		return itemContenido;
	}
*/
		

	public ItemContenidoDTO(Long idItem, String tipoContenido, Long estado, String valorCampo, Date fechaCreacion,
			String usuarioCreacion, String valorCampoMovil) {
		super();
		this.idItem = idItem;
		this.tipoContenido = tipoContenido;
		this.estado = estado;
		this.valorCampo = valorCampo;
		this.fechaCreacion = fechaCreacion;
		this.usuarioCreacion = usuarioCreacion;
		this.valorCampoMovil = valorCampoMovil;
	}


	public ItemContenidoDTO() {
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
	 * @return the idItemContenido
	 */
	public Long getIdItemContenido() {
		return idItemContenido;
	}



	/**
	 * @param idItemContenido the idItemContenido to set
	 */
	public void setIdItemContenido(Long idItemContenido) {
		this.idItemContenido = idItemContenido;
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
	 * @return the valorCampo
	 */
	public String getValorCampo() {
		return valorCampo;
	}



	/**
	 * @param valorCampo the valorCampo to set
	 */
	public void setValorCampo(String valorCampo) {
		this.valorCampo = valorCampo;
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



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idItemContenido == null) ? 0 : idItemContenido.hashCode());
		return result;
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



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemContenidoDTO other = (ItemContenidoDTO) obj;
		if (idItemContenido == null) {
			if (other.idItemContenido != null)
				return false;
		} else if (!idItemContenido.equals(other.idItemContenido))
			return false;
		return true;
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
	 * @return the valorCampoMovil
	 */
	public String getValorCampoMovil() {
		return valorCampoMovil;
	}



	/**
	 * @param valorCampoMovil the valorCampoMovil to set
	 */
	public void setValorCampoMovil(String valorCampoMovil) {
		this.valorCampoMovil = valorCampoMovil;
	}
	
}

