package co.icfes.aprovisionamiento.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APROV_ITEMCONTENIDO")
public class ItemContenido {//extends EntidadAuditable implements Serializable {

	@Id
	@Column(name = "APIC_ID")
	private Long idItemContenido;
	
	@Column(name = "APIT_ID")
	private Long idItem;

	@Column(name = "APIC_TIPO")
	private String tipoContenido;

	@Column(name = "APIC_ESTADO")
	private Long estado;

	@Column(name = "APIC_VALOR")
	private String valorCampo;
	
	@Column(name = "APIC_VALORMOVIL")
	private String valorCampoMovil;


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
