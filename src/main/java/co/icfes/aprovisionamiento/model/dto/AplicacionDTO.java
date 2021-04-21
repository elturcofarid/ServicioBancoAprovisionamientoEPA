package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Builder;


@Builder
public class AplicacionDTO implements Serializable {

	/**Id para serializacion*/
	private static final long serialVersionUID = 21391057428313306L;

	//Identificador de la aplicación
	private Long idAplicacion;
	//Nombre de la aplicación
	private String nombreAplicacion; 
	//Descripción de la aplicación
	private String descrAplicacion;	
	//Fecha inicio de la aplicación
	private Date fechaInicio;	
	//Fecha fin de la aplicación
	private Date fechaFin;	
	//Indica si se encuentra o no instalada
	private String estadoInstalacion; 
	//descripción del tipo de aplicación
	private String tipoAplicacion;
	//identificador del tipo de aplicación
	private Long idTipoAplicacion;
	//Listado de componentes a los que puede acceder la aplicación
	private List<ListaComponentesDTO> listaComponentes;
	//formato de fecha inicio dd/mm/aaaa
	private String fechaInicioFormateada;
	//formato de fecha fin dd/mm/aaaa
	private String fechaFinFormateada;
	//listado de los tipos de aplicación disponibles
	private List<TipoAplicacionDTO> listaTipoApp;
	
	/**
	 * Propiedad que permite obtener el identificador de la aplicación
	 * @return idAplicacion
	 */
	public Long getIdAplicacion() {
		return idAplicacion;
	}
	
	/**
	 * Propiedad que permite cambiar el identificador de la aplicación
	 * @param idAplicacion
	 */
	public void setIdAplicacion(Long idAplicacion) {
		this.idAplicacion = idAplicacion;
	}
	
	/**
	 * Propiedad que permite obtener el nombre de la aplicación
	 * @return nombreAplicacion
	 */
	public String getNombreAplicacion() {
		return nombreAplicacion;
	}

	/**
	 * Propiedad que permite obtener el nombre de la aplicación
	 * @param nombreAplicacion
	 */
	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}

	/**
	 * Metodo que retorna el atributo descrAplicacion: String.
	 * @return atributo descrAplicacion: String
	 */
	public String getDescrAplicacion() {
		return descrAplicacion;
	}

	/**
	 * Metodo que modifica el atributo descrAplicacion: String.
	 * @param  descrAplicacion : String - para cambiar atributo descrAplicacion: String
	 */
	public void setDescrAplicacion(String descrAplicacion) {
		this.descrAplicacion = descrAplicacion;
	}
	
	/**
	 * Metodo que retorna el atributo fechaInicio: Date.
	 * @return atributo fechaInicio: Date
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * Metodo que modifica el atributo fechaInicio: Date.
	 * @param  fechaInicio : Date - para cambiar atributo fechaInicio: Date
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * Metodo que retorna el atributo fechaFin: Date.
	 * @return atributo fechaFin: Date
	 */
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * Metodo que modifica el atributo fechaFin: Date.
	 * @param  fechaFin : Date - para cambiar atributo fechaFin: Date
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * Retorna la propiedad estado de instalación
	 * @return estadoInstalacion
	 */
	public String getEstadoInstalacion() {
		return estadoInstalacion;
	}

	/**
	 * Permite el ingreso de la propiedad estado de la instalación
	 * @param estadoInstalacion
	 */
	public void setEstadoInstalacion(String estadoInstalacion) {
		this.estadoInstalacion = estadoInstalacion;
	}

	/**
	 * Retorna la propiedad Tipo Aplicacion
	 * @return
	 */
	public String getTipoAplicacion() {
		return tipoAplicacion;
	}

	/**
	 * Permite el ingreso de la propiedad Tipo Aplicacion
	 * @param tipoAplicacion
	 */
	public void setTipoAplicacion(String tipoAplicacion) {
		this.tipoAplicacion = tipoAplicacion;
	}

	/**
	 * Retorna la propiedad id Tipo Aplicacion
	 * @return
	 */
	public Long getIdTipoAplicacion() {
		return idTipoAplicacion;
	}

	/**
	 * Permite el ingreso de la propiedad id Tipo Aplicación
	 * @param idTipoAplicacion
	 */
	public void setIdTipoAplicacion(Long idTipoAplicacion) {
		this.idTipoAplicacion = idTipoAplicacion;
	}	

	/**
	 * Propiedad que permite obtener la fecha de inicio formato dd/mm/yyyy hh:mm:ss
	 * @return fechaInicioFormateada
	 */
	public String getFechaInicioFormateada() {
		return fechaInicioFormateada;
	}

	/**
	 * Propiedad que permite cambiar la fecha de inicio formato dd/mm/yyyy hh:mm:ss
	 * @param fechaInicioFormateada
	 */
	public void setFechaInicioFormateada(String fechaInicioFormateada) {
		this.fechaInicioFormateada = fechaInicioFormateada;
	}

	/**
	 * Propiedad que permite obtener la fecha de fin formato dd/mm/yyyy hh:mm:ss
	 * @return fechaFinFormateada
	 */
	public String getFechaFinFormateada() {
		return fechaFinFormateada;
	}

	/**
	 * Propiedad que permite cambiar la fecha de fin formato dd/mm/yyyy hh:mm:ss
	 * @param fechaFinFormateada
	 */
	public void setFechaFinFormateada(String fechaFinFormateada) {
		this.fechaFinFormateada = fechaFinFormateada;
	}

	/**
	 * Propiedad que permite obtener la lista de tipo de aplicacion
	 * @return
	 */
	public List<TipoAplicacionDTO> getListaTipoApp() {
		return listaTipoApp;
	}

	/**
	 * Propiedad que permite modificar la lista de tipo de aplicacion
	 * @param listaTipoApp
	 */
	public void setListaTipoApp(List<TipoAplicacionDTO> listaTipoApp) {
		this.listaTipoApp = listaTipoApp;
	}

	/**
	 * Propiedad que permite obtener la lista de tipo de componentes de la aplicación
	 * @return listaComponentes
	 */
	public List<ListaComponentesDTO> getListaComponentes() {
		return listaComponentes;
	}

	/**
	 * Propiedad que permite cambiar la lista de tipo de componentes de la aplicación
	 * @param listaComponentes
	 */
	public void setListaComponentes(List<ListaComponentesDTO> listaComponentes) {
		this.listaComponentes = listaComponentes;
	}
}
