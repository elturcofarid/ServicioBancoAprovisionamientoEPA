package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Objeto que permite recopilar la información de la validación de armado
 * @author npastrana
 *
 */
public class ReporteGeneralDTO implements Serializable {

	/** Id serialización*/
	private static final long serialVersionUID = -3022668358942060870L;
	/** consecutivo para generar la tabla reporte*/
	private Long idReporte;
	/** Nombre de la aplicación*/
	private String nombreAplicacion;
	/** Nombre del cuadernillo */
	private String nombreCuadernillo;
	/** Número de sesión */
	private String nombreSesion;
	/** Nombre de la prueba */
	private String nombrePrueba;
	/** Código de para identificar el ítem*/
	private String codigoItemIcfes;
	/** Orden del ítem según sesión*/
	private Long ordenItem;
	/** estado del ítem en la validación de armado*/
	private String estadoItem;
	/** observaciones del gestor*/
	private String observaciones;
	/** usario q hace las observaciones*/
	private String usuario;
	/** identificador del usuario */
	private String idUsuario;
	/** fecha modificación */
	private Date fechaModificacion;
	/** fecha modificación formateada*/
	private String fechaModificacionFormateada;
	/**estado del ítem Movil en la validación de armado	 */
	private String estadoItemMovil;
	/**observaciones moviles del gestor	 */
	private String observacionesMoviles;
	
	private String idTipoRechazo;
	
	
	/**
	 * @return the idReporte
	 */
	public final Long getIdReporte() {
		return idReporte;
	}
	/**
	 * @param idReporte the idReporte to set
	 */
	public final void setIdReporte(final Long idReporte) {
		this.idReporte = idReporte;
	}
	/**
	 * @return the nombreAplicacion
	 */
	public final String getNombreAplicacion() {
		return nombreAplicacion;
	}
	/**
	 * @param nombreAplicacion the nombreAplicacion to set
	 */
	public final void setNombreAplicacion(final String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}
	/**
	 * @return the nombreCuadernillo
	 */
	public final String getNombreCuadernillo() {
		return nombreCuadernillo;
	}
	/**
	 * @param nombreCuadernillo the nombreCuadernillo to set
	 */
	public final void setNombreCuadernillo(final String nombreCuadernillo) {
		this.nombreCuadernillo = nombreCuadernillo;
	}
	/**
	 * @return the nombreSesion
	 */
	public final String getNombreSesion() {
		return nombreSesion;
	}
	/**
	 * @param nombreSesion the nombreSesion to set
	 */
	public final void setNombreSesion(final String nombreSesion) {
		this.nombreSesion = nombreSesion;
	}
	/**
	 * @return the nombrePrueba
	 */
	public final String getNombrePrueba() {
		return nombrePrueba;
	}
	/**
	 * @param nombrePrueba the nombrePrueba to set
	 */
	public final void setNombrePrueba(final String nombrePrueba) {
		this.nombrePrueba = nombrePrueba;
	}
	/**
	 * @return the codigoItemIcfes
	 */
	public final String getCodigoItemIcfes() {
		return codigoItemIcfes;
	}
	/**
	 * @param codigoItemIcfes the codigoItemIcfes to set
	 */
	public final void setCodigoItemIcfes(final String codigoItemIcfes) {
		this.codigoItemIcfes = codigoItemIcfes;
	}
	/**
	 * @return the ordenItem
	 */
	public final Long getOrdenItem() {
		return ordenItem;
	}
	/**
	 * @param ordenItem the ordenItem to set
	 */
	public final void setOrdenItem(final Long ordenItem) {
		this.ordenItem = ordenItem;
	}
	/**
	 * @return the estadoItem
	 */
	public final String getEstadoItem() {
		return estadoItem;
	}
	/**
	 * @param estadoItem the estadoItem to set
	 */
	public final void setEstadoItem(final String estadoItem) {
		this.estadoItem = estadoItem;
	}
	/**
	 * @return the observaciones
	 */
	public final String getObservaciones() {
		return observaciones;
	}
	/**
	 * @param observaciones the observaciones to set
	 */
	public final void setObservaciones(final String observaciones) {
		this.observaciones = observaciones;
	}
	/**
	 * @return the usuario
	 */
	public final String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public final void setUsuario(final String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the fechaModificacion
	 */
	public final Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public final void setFechaModificacion(final Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the idUsuario
	 */
	public final String getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public final void setIdUsuario(final String idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the fechaModificacionFormateada
	 */
	public final String getFechaModificacionFormateada() {
		return fechaModificacionFormateada;
	}

	/**
	 * @param fechaModificacionFormateada the fechaModificacionFormateada to set
	 */
	public final void setFechaModificacionFormateada(final String fechaModificacionFormateada) {
		this.fechaModificacionFormateada = fechaModificacionFormateada;
	}
	
	/**
	 * @return the estadoItemMovil
	 */
	public String getEstadoItemMovil() {
		return estadoItemMovil;
	}
	
	/**
	 * @param estadoItemMovil the estadoItemMovil to set 
	 */
	public void setEstadoItemMovil(String estadoItemMovil) {
		this.estadoItemMovil = estadoItemMovil;
	}
	
	/**
	 * @return the observacionesMoviles
	 */
	public String getObservacionesMoviles() {
		return observacionesMoviles;
	}
	
	/**
	 * @param observacionesMoviles the observacionesMoviles to set
	 */
	public void setObservacionesMoviles(String observacionesMoviles) {
		this.observacionesMoviles = observacionesMoviles;
	}
	public String getIdTipoRechazo() {
		return idTipoRechazo;
	}
	public void setIdTipoRechazo(String idTipoRechazo) {
		this.idTipoRechazo = idTipoRechazo;
	}
}
