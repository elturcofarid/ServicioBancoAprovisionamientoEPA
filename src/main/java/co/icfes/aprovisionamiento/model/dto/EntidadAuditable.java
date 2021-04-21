package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Clase que contiene la informaci�n de usuarios y fechas de creaci�n/modificaci�n.
 * @author 
 *
 */
@MappedSuperclass
public abstract class EntidadAuditable implements Serializable {
	
	/**
	 * Atributo con serial para serializaci�n de la clase.
	 */
	private static final long serialVersionUID = 8431583776956543455L;

	/**
	 * Atributo que indica la fecha de creaci�n del registro.
	 */
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "FECHACREACION", insertable = true, updatable = false)
	protected Date fechaCreacion;

	/**
	 * Atributo que indica el usuario de creaci�n del registro.
	 */
	@Column(name = "USUARIOCREACION", insertable = true, updatable = false)
	protected String usuarioCreacion;

	/**
	 * Atributo que indica la fecha de modificaci�n del registro.
	 */
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "FECHAMODIFICACION", insertable = true, updatable = true)
	protected Date fechaModificacion;

	/**
	 * Atributo que indica el usuario de modificaci�n del registro.
	 */
	@Column(name = "USUARIOMODIFICACION", insertable = true, updatable = true)
	protected String usuarioModificacion;

//	@Column(name = "BORRADO", insertable = false, updatable = true)
//	protected String borrado;
	
	/**
	 * Constructor por default.
	 */
	public EntidadAuditable() {	
	}
	
	/**
	 * Constructor para consulta por JPA Criteria, MAX(fechaCreacion), MAX(fechaModificacion)
	 * @param fechaCreacion
	 * @param fechaModificacion
	 */
	public EntidadAuditable(Date fechaCreacion, Date fechaModificacion) {
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}
	
	/**
	 * Constructor por datos de creaci�n.
	 * @param fechaCreacion
	 * @param fechaModificacion
	 * @param usuarioCreacion
	 * @param usuarioModificacion
	 */
	public EntidadAuditable(Date fechaCreacion, Date fechaModificacion, String usuarioCreacion, 
			String usuarioModificacion) {
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
	}

//------------------------
	/**
	 * Crea una instancia de la clase con las fechas de creaci&oacute;n y modificaci&oacute;n iguales
	 * a la fecha actual; y define como usuario creaci&oacute;n y modificaci&oacute;n el que se pasa
	 * por par&aacute;metro.
	 *  
	 * @author pgarcia
	 * @param usuario
	 */
	public EntidadAuditable(String usuario) {
		
		final Date fecha = new Date(System.currentTimeMillis());
		this.fechaCreacion = fecha;
		this.fechaModificacion = null;
		this.usuarioCreacion = usuario;
		this.usuarioModificacion = null;
		
	}
	
//-------------------------------------------------------------------------------------------------
	
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
	
}