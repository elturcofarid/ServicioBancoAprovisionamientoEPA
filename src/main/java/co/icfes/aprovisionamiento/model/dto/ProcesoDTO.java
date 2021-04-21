package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;

/*
import co.gov.icfes.aprovisionamientoe.enums.EnumEstadoProceso;
import co.gov.icfes.aprovisionamientoe.enums.EnumTipoProceso;
import co.gov.icfes.aprovisionamientoe.transformador.modelo.Proceso;
import co.gov.icfes.aprovisionamientoe.utils.DateUtils;
*/

public class ProcesoDTO implements Serializable {

	/**Id para serializacion	 */
	private static final long serialVersionUID = 4094397688180176524L;

	private Long idProceso;

	private String nombreProceso;

	private Date fechaInicio;

	private Date fechaFin;

	private Long estado;

	private String usuarioCreacion;

	private Date fechaCreacion;

	private Date fechaModificacion;

	private String usuarioModificacion;

	private Integer numeroTotalRegistros=0;

	private Integer numeroRegistrosProcesados=0;
	
	private Integer numeroRegProcExito=0;
	
	private Integer numeroRegProcError=0;

	private TipoProcesoDTO tipoProceso;
	
	private Long porcentaje=0L;

	private String descripEstado;
	
	private String fechaInicioFormateada;

	private String fechaFinalFormateada;
	
	private Long idAplicacion;
	
	private String nombreAplicacion;
	
	private Integer numeroRegProcConExitoTemp=0;
	
	private String parametroConfRutaImagenes;
	
	private String parametroConfRutaPlantillas;
	
	private Boolean incluirEnunciado;

	private String inicioConsecutivo;
	
	private Boolean incuilrEtiquetas;

	/*
	public Proceso convertirEntity(ProcesoDTO procesoDTO) {
		Proceso proceso = new Proceso();
		proceso.setIdProceso(procesoDTO.getIdProceso());
		proceso.setNombre(procesoDTO.getNombreProceso());
		proceso.setFechaInicio(procesoDTO.getFechaInicio());
		proceso.setFechaFin(procesoDTO.getFechaFin());
		proceso.setNumeroTotalRegistro(procesoDTO.getNumeroTotalRegistros());
		proceso.setUsuarioCreacion(procesoDTO.getUsuarioCreacion());
		proceso.setFechaCreacion(procesoDTO.getFechaCreacion());
		proceso.setFechaModificacion(procesoDTO.getFechaModificacion());
		proceso.setNumeroRegsProcesados(procesoDTO.getNumeroRegistrosProcesados());
		proceso.setEstado(procesoDTO.getEstado());
		proceso.setNumeroRegsExitosos(procesoDTO.getNumeroRegProcExito() == null ? 0 : procesoDTO.getNumeroRegProcExito());
		proceso.setNumeroRegsErrados(procesoDTO.getNumeroRegProcError() == null ? 0 : procesoDTO.getNumeroRegProcError());
		proceso.setNumeroPorcentaje(procesoDTO.getPorcentaje()== null ? 0 : procesoDTO.getPorcentaje());
		proceso.setEstado(procesoDTO.getEstado());
		proceso.setIdAplicacion(procesoDTO.getIdAplicacion());
		proceso.setIdTipoProceso(procesoDTO.getTipoProceso().getIdProcess());
		return proceso;
	}

	public ProcesoDTO(Proceso proceso) {
		this.setIdProceso(proceso.getIdProceso());
		this.setFechaInicio(proceso.getFechaInicio());
		this.setFechaFin(proceso.getFechaFin());
		this.setNumeroTotalRegistros(proceso.getNumeroTotalRegistro());
		this.setUsuarioCreacion(proceso.getUsuarioCreacion());
		this.setFechaCreacion(proceso.getFechaCreacion());
		this.setFechaModificacion(proceso.getFechaModificacion());
		this.setNumeroRegistrosProcesados(proceso.getNumeroRegsProcesados());
		this.setEstado(proceso.getEstado());
			
		if (Long.valueOf(proceso.getEstado()).compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_VALIDADO.getCodigo()))==0) {			
			this.setDescripEstado(EnumEstadoProceso.PROCESO_VALIDADO.getDescripcion());	
		}else if (Long.valueOf(proceso.getEstado()).compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_EN_VALIDACION.getCodigo()))==0) {			
			this.setDescripEstado(EnumEstadoProceso.PROCESO_EN_VALIDACION.getDescripcion());		
		}else if (Long.valueOf(proceso.getEstado()).compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_VALIDADO_CON_ERRORES.getCodigo()))==0) {
			this.setDescripEstado(EnumEstadoProceso.PROCESO_VALIDADO_CON_ERRORES.getDescripcion());	
		}else if (Long.valueOf(proceso.getEstado()).compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_SIN_REGISTROS_PROCESAR.getCodigo()))==0) {
			this.setDescripEstado(EnumEstadoProceso.PROCESO_SIN_REGISTROS_PROCESAR.getDescripcion());	
		}else if (Long.valueOf(proceso.getEstado()).compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_FINALIZADO.getCodigo()))==0) {			
			this.setDescripEstado(EnumEstadoProceso.PROCESO_FINALIZADO.getDescripcion());		
		}else if (Long.valueOf(proceso.getEstado()).compareTo(Long.valueOf(EnumEstadoProceso.PROCESO_FINALIZADO_ERRORES.getCodigo()))==0) {			
		   this.setDescripEstado(EnumEstadoProceso.PROCESO_FINALIZADO_ERRORES.getDescripcion());		
	    }
		
		if(proceso.getFechaInicio()!=null){
			this.setFechaInicioFormateada(DateUtils.format(proceso.getFechaInicio(),DateUtils.FORMAT_ddMMyyyyHHmmss));
		}
		if(proceso.getFechaFin()!=null){
			this.setFechaFinalFormateada(DateUtils.format(proceso.getFechaFin(),DateUtils.FORMAT_ddMMyyyyHHmmss));
		}
		if (proceso.getNombre().equals(EnumTipoProceso.TRANFORMAR_QTI_HTML.getNombre())) {			
			this.setNombreProceso(EnumTipoProceso.TRANFORMAR_QTI_HTML.getDescripcion());
		}else {	
			this.setNombreProceso(EnumTipoProceso.REALIZAR_PREINSTALACION.getDescripcion());	
		}
	}

	 */

	public ProcesoDTO(Long idProceso, String nombreProceso, Date fechaInicio, Date fechaFin, Long estado,
			String usuarioCreacion, Date fechaCreacion, Date fechaModificacion, String usuarioModificacion,
			Integer numeroTotalRegistros, Integer numeroRegistrosProcesados, TipoProcesoDTO tipoProceso,
			String mensajeProceso, String nombreAplicacion) {
		super();
		this.idProceso = idProceso;
		this.nombreProceso = nombreProceso;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioModificacion = usuarioModificacion;
		this.numeroTotalRegistros = numeroTotalRegistros;
		this.numeroRegistrosProcesados = numeroRegistrosProcesados;
		this.tipoProceso = tipoProceso;
		this.mensajeProceso = mensajeProceso;
		this.nombreAplicacion=nombreAplicacion;
	}
	
	

	public ProcesoDTO() {
		super();
	}



	/** Mensaje para el proceso. */
	private String mensajeProceso;

	/**
	 * @return the idProceso
	 */
	public Long getIdProceso() {
		return idProceso;
	}

	/**
	 * @param idProceso
	 *            the idProceso to set
	 */
	public void setIdProceso(Long idProceso) {
		this.idProceso = idProceso;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio
	 *            the fechaInicio to set
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
	 * @param fechaFin
	 *            the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the estado
	 */
	public Long getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(Long estado) {
		this.estado = estado;
	}

	/**
	 * @return the usuarioCreacion
	 */
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	/**
	 * @param usuarioCreacion
	 *            the usuarioCreacion to set
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
	 * @param fechaModificacion
	 *            the fechaModificacion to set
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
	 * @param usuarioModificacion
	 *            the usuarioModificacion to set
	 */
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	/**
	 * @return the nombreProceso
	 */
	public String getNombreProceso() {
		return nombreProceso;
	}

	/**
	 * @param nombreProceso
	 *            the nombreProceso to set
	 */
	public void setNombreProceso(String nombreProceso) {
		this.nombreProceso = nombreProceso;
	}

	/**
	 * @return the mensajeProceso
	 */
	public String getMensajeProceso() {
		return mensajeProceso;
	}

	/**
	 * @param mensajeProceso
	 *            the mensajeProceso to set
	 */
	public void setMensajeProceso(String mensajeProceso) {
		this.mensajeProceso = mensajeProceso;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion
	 *            the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the tipoProceso
	 */
	public TipoProcesoDTO getTipoProceso() {
		return tipoProceso;
	}

	/**
	 * @param tipoProceso
	 *            the tipoProceso to set
	 */
	public void setTipoProceso(TipoProcesoDTO tipoProceso) {
		this.tipoProceso = tipoProceso;
	}

	/**
	 * @return the numeroTotalRegistros
	 */
	public Integer getNumeroTotalRegistros() {
		return numeroTotalRegistros;
	}

	/**
	 * @param numeroTotalRegistros
	 *            the numeroTotalRegistros to set
	 */
	public void setNumeroTotalRegistros(Integer numeroTotalRegistros) {
		this.numeroTotalRegistros = numeroTotalRegistros;
	}

	/**
	 * @return the numeroRegistrosProcesados
	 */
	public Integer getNumeroRegistrosProcesados() {
		return numeroRegistrosProcesados;
	}

	/**
	 * @param numeroRegistrosProcesados
	 *            the numeroRegistrosProcesados to set
	 */
	public void setNumeroRegistrosProcesados(Integer numeroRegistrosProcesados) {
		this.numeroRegistrosProcesados = numeroRegistrosProcesados;
	}



	/**
	 * @return the descripEstado
	 */
	public String getDescripEstado() {
		return descripEstado;
	}

	/**
	 * @param descripEstado the descripEstado to set
	 */
	public void setDescripEstado(String descripEstado) {
		this.descripEstado = descripEstado;
	}

	/**
	 * @return the fechaInicioFormateada
	 */
	public String getFechaInicioFormateada() {
		return fechaInicioFormateada;
	}

	/**
	 * @param fechaInicioFormateada the fechaInicioFormateada to set
	 */
	public void setFechaInicioFormateada(String fechaInicioFormateada) {
		this.fechaInicioFormateada = fechaInicioFormateada;
	}

	/**
	 * @return the fechaFinalFormateada
	 */
	public String getFechaFinalFormateada() {
		return fechaFinalFormateada;
	}

	/**
	 * @param fechaFinalFormateada the fechaFinalFormateada to set
	 */
	public void setFechaFinalFormateada(String fechaFinalFormateada) {
		this.fechaFinalFormateada = fechaFinalFormateada;
	}

	/**
	 * @return the porcentaje
	 */
	public Long getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(Long porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Integer getNumeroRegProcError() {
		return numeroRegProcError;
	}

	public void setNumeroRegProcError(Integer numeroRegProcError) {
		this.numeroRegProcError = numeroRegProcError;
	}

	public Integer getNumeroRegProcExito() {
		return numeroRegProcExito;
	}

	public void setNumeroRegProcExito(Integer numeroRegProcExito) {
		this.numeroRegProcExito = numeroRegProcExito;
	}

	/**
	 * @return the idAplicacion
	 */
	public Long getIdAplicacion() {
		return idAplicacion;
	}

	/**
	 * @param idAplicacion the idAplicacion to set
	 */
	public void setIdAplicacion(Long idAplicacion) {
		this.idAplicacion = idAplicacion;
	}
	
	@Override
	public String toString(){
		return "ProcesoDTO [idProceso=" + idProceso 
				+ ", nombreProceso=" + nombreProceso + ", fechaInicio = "+ fechaInicio + ", fechaFin="+ fechaFin 
				+ ", estado=" + estado + ", usuarioCreacion=" + usuarioCreacion + ", fechaCreacion=" + fechaCreacion 
				+ ", fechaModificacion= "+ fechaModificacion + ", usuarioModificacion= "+ usuarioModificacion 
				+ ", numeroTotalRegistros = " + numeroTotalRegistros +", numeroRegistrosProcesados="+numeroRegistrosProcesados
				+ ", numeroRegProcExito= " + numeroRegProcExito+ ", numeroRegProcError= "+ numeroRegProcError 
				+ ", tipoProceso= "+ tipoProceso + ", porcentaje=" + porcentaje + ", descripEstado="+ descripEstado
				+ ", fechaInicioFormateada=" + fechaInicioFormateada + ", fechaFinalFormateada=" + fechaFinalFormateada 
				+ ", idAplicacion=" + idAplicacion +" ]";
	}

	public String getNombreAplicacion() {
		return nombreAplicacion;
	}

	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}

	/**
	 * @return the numeroRegProcConExitoTemp
	 */
	public Integer getNumeroRegProcConExitoTemp() {
		return numeroRegProcConExitoTemp;
	}

	/**
	 * @param numeroRegProcConExitoTemp the numeroRegProcConExitoTemp to set
	 */
	public void setNumeroRegProcConExitoTemp(Integer numeroRegProcConExitoTemp) {
		this.numeroRegProcConExitoTemp = numeroRegProcConExitoTemp;
	}

	/**
	 * @return the parametroConfRutaImagenes
	 */
	public String getParametroConfRutaImagenes() {
		return parametroConfRutaImagenes;
	}

	/**
	 * @param parametroConfRutaImagenes the parametroConfRutaImagenes to set
	 */
	public void setParametroConfRutaImagenes(String parametroConfRutaImagenes) {
		this.parametroConfRutaImagenes = parametroConfRutaImagenes;
	}

	/**
	 * @return the parametroConfRutaPlantillas
	 */
	public String getParametroConfRutaPlantillas() {
		return parametroConfRutaPlantillas;
	}

	/**
	 * @param parametroConfRutaPlantillas the parametroConfRutaPlantillas to set
	 */
	public void setParametroConfRutaPlantillas(String parametroConfRutaPlantillas) {
		this.parametroConfRutaPlantillas = parametroConfRutaPlantillas;
	}

	/**
	 * @return the incluirEnunciado
	 */
	public Boolean getIncluirEnunciado() {
		return incluirEnunciado;
	}

	/**
	 * @param incluirEnunciado the incluirEnunciado to set
	 */
	public void setIncluirEnunciado(Boolean incluirEnunciado) {
		this.incluirEnunciado = incluirEnunciado;
	}

	/**
	 * @return the inicioConsecutivo
	 */
	public String getInicioConsecutivo() {
		return inicioConsecutivo;
	}

	/**
	 * @param inicioConsecutivo the inicioConsecutivo to set
	 */
	public void setInicioConsecutivo(String inicioConsecutivo) {
		this.inicioConsecutivo = inicioConsecutivo;
	}

	/**
	 * @return the incuilrEtiquetas
	 */
	public Boolean getIncuilrEtiquetas() {
		return incuilrEtiquetas;
	}

	/**
	 * @param incuilrEtiquetas the incuilrEtiquetas to set
	 */
	public void setIncuilrEtiquetas(Boolean incuilrEtiquetas) {
		this.incuilrEtiquetas = incuilrEtiquetas;
	}
	
	
	
	
}
