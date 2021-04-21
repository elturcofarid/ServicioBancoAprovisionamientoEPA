package co.icfes.aprovisionamiento.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import org.eclipse.persistence.annotations.ReturnInsert;

//import co.gov.icfes.aprovisionamientoe.comun.modelo.EntidadAuditable;

/**
 * Entity implementation class for Entity: Actividad
 * 
 */
@Entity
@Table(name = "APROV_PROCESO")
public class Proceso implements Serializable {//extends EntidadAuditable 

	/**	 */
	private static final long serialVersionUID = 8883203459935343202L;

	/**
	 * Query consultas JPQL
	 */
	public static final String ACTUALIZAR_PROCESO = "Proceso.ACTUALIZAR_PROCESO";
	public static final String CONSULTAR_PROCESOS = "Proceso.CONSULTAR_PROCESOS";
	public static final String CONSULTAR_ARMADO_APLICACION = "Proceso.CONSULTAR_ARMADO_APLICACION";
	public static final String QUERY_APLICACIONES = "Proceso.QUERY_APLICACIONES";
	public static final String BORRAR_ARMADO = "Proceso.BORRAR_ARMADO";
	public static final String CONSULTAR_PROCESO = "Proceso.CONSULTAR_PROCESO";
	public static final String CONSULTA_HIJOS_ITEM = "Proceso.CONSULTA_HIJOS_ITEM";
	public static final String CONSULTA_HIJOS_VALIDACION_EXAPID = "Proceso.CONSULTA_HIJOS_VALIDACION_EXAPID";
	public static final String QUERY_APLICACIONES_VERIFICADAS = "Proceso.QUERY_APLICACIONES_VERIFICADAS";
	public static final String QUERY_PROCESOS_EN_EJECUCION = "Proceso.QUERY_PROCESOS_EN_EJECUCION";
	public static final String QUERY_APLICACIONES_INSTALADAS = "Proceso.QUERY_APLICACIONES_INSTALADAS"; 
	public static final String QUERY_APLICACION_BY_ID = "Proceso.QUERY_APLICACION_BY_ID";
	public static final String CONSULTAR_BANDERA_APLICACION_MOVIL = "Proceso.CONSULTAR_BANDERA_APLICACION_MOVIL";
	public static final String QUERY_COPIA_MULTIMEDIA = "Proceso.COPIA_MULTIMEDIA";
	

	public Proceso() {
	}

	@Id
	//@ReturnInsert(returnOnly = true)
	@Column(name = "APPR_ID")
	private Long idProceso;

	@Column(name = "APPR_NOMBRE")
	private String nombre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "APPR_FECHAINICIO")
	private Date fechaInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "APPR_FECHAFIN")
	private Date fechaFin;

	@Column(name = "APPR_ESTADO")
	private Long estado;

	@Column(name = "APPR_NUMTOTALREGISTROS")
	private Integer numeroTotalRegistro;

	@Column(name = "APPR_NUMPROCESADOS")
	private Integer numeroRegsProcesados;

	/**
	 * Representa el campo APPR_NUMEXITOSOS en base de datos
	 */
	@Column(name = "APPR_NUMEXITOSOS")
	private Integer numeroRegsExitosos;

	/**
	 * Representa el campo APPR_NUMERRADOS en base de datos
	 */
	@Column(name = "APPR_NUMERRADOS")
	private Integer numeroRegsErrados;

	/**
	 * Representa el campo APPR_PORCENTAJE en base de datos
	 */
	@Column(name = "APPR_PORCENTAJE")
	private Long numeroPorcentaje;

	/**
	 * Guarda la aplicación parala cual se lanzo el proceso
	 */
	@Column(name = "APPR_APLIID")
	private Long idAplicacion;
	
	/**
	 * Asociado al id del tipo de proceso 
	 */
	@Column(name = "TIPO_ID")
	private Long idTipoProceso;
	
	public Proceso(String nombre, Date fechaInicio, Date fechaFin, Long estado, Integer numeroTotalRegistro,
			Integer numeroRegistrosProcesados, Integer numeroRegsExitosos, Integer numeroRegsErrados, Long idAplicacion, Long idTipoProceso) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
		this.numeroTotalRegistro = numeroTotalRegistro;
		this.numeroRegsProcesados = numeroRegistrosProcesados;
		this.numeroRegsErrados = numeroRegsErrados;
		this.numeroRegsExitosos = numeroRegsExitosos;
		this.idAplicacion=idAplicacion;
		this.idTipoProceso = idTipoProceso;
		
	}

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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the numeroTotalRegistro
	 */
	public Integer getNumeroTotalRegistro() {
		return numeroTotalRegistro;
	}

	/**
	 * @param numeroTotalRegistro
	 *            the numeroTotalRegistro to set
	 */
	public void setNumeroTotalRegistro(Integer numeroTotalRegistro) {
		this.numeroTotalRegistro = numeroTotalRegistro;
	}

	/**
	 * @return the numeroRegsProcesados
	 */
	public Integer getNumeroRegsProcesados() {
		return numeroRegsProcesados;
	}

	/**
	 * @param numeroRegsProcesados
	 *            the numeroRegsProcesados to set
	 */
	public void setNumeroRegsProcesados(Integer numeroRegsProcesados) {
		this.numeroRegsProcesados = numeroRegsProcesados;
	}	

	/**
	 * @return Procentaje de procesados
	 */
	public Long getNumeroPorcentaje() {
		return numeroPorcentaje;
	}


	/**
	 * @param numeroPorcentaje
	 */
	public void setNumeroPorcentaje(Long numeroPorcentaje) {
		this.numeroPorcentaje = numeroPorcentaje;
	}
	
	/**
	 * @return numeroRegsExitosos
	 */
	public Integer getNumeroRegsExitosos() {
		return numeroRegsExitosos;
	}


	/**
	 * @param numeroRegsExitosos
	 */
	public void setNumeroRegsExitosos(Integer numeroRegsExitosos) {
		this.numeroRegsExitosos = numeroRegsExitosos;
	}


	/**
	 * @return numeroRegsErrados
	 */
	public Integer getNumeroRegsErrados() {
		return numeroRegsErrados;
	}


	/**
	 * @param numeroRegsErrados
	 */
	public void setNumeroRegsErrados(Integer numeroRegsErrados) {
		this.numeroRegsErrados = numeroRegsErrados;
	}

	public Long getIdAplicacion() {
		return idAplicacion;
	}

	public void setIdAplicacion(Long idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	/**
	 * @return the idTipoProceso
	 */
	public Long getIdTipoProceso() {
		return idTipoProceso;
	}

	/**
	 * @param idTipoProceso the idTipoProceso to set
	 */
	public void setIdTipoProceso(Long idTipoProceso) {
		this.idTipoProceso = idTipoProceso;
	}


}
