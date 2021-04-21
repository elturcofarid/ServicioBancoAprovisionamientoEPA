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
@Table(name = "APROV_LOGPROCESO")
public class LogProceso implements Serializable { //extends EntidadAuditable  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4338192488544943454L;
	/**	 */
	
	
	public static final String INSERTAR_LOGPROCESO= "LogProceso.INSERTAR_LOGPROCESO";
	public static final String CONSULTAR_LOGPROCESO= "LogProceso.CONSULTAR_LOGPROCESO";
	
	
	@Id
	//@ReturnInsert (returnOnly=true)
	@Column(name = "APLO_ID")
	private Long idLogProceso;
	  
	@Column(name = "APPR_ID")
	private Long idProceso;
	
	@Column(name = "APIT_IDARMADO")
	private String idItemArmado;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "APLO_FECHAHORA")
	private Date fechaGeneroError;
	
	
	@Column(name = "APLO_LOG")
	private String descripcionError;


	public Long getIdLogProceso() {
		return idLogProceso;
	}


	public void setIdLogProceso(Long idLogProceso) {
		this.idLogProceso = idLogProceso;
	}


	public Long getIdProceso() {
		return idProceso;
	}


	public void setIdProceso(Long idProceso) {
		this.idProceso = idProceso;
	}




	public Date getFechaGeneroError() {
		return fechaGeneroError;
	}


	public void setFechaGeneroError(Date fechaGeneroError) {
		this.fechaGeneroError = fechaGeneroError;
	}


	public String getDescripcionError() {
		return descripcionError;
	}


	public void setDescripcionError(String descripcionError) {
		this.descripcionError = descripcionError;
	}


	/**
	 * @return the idItemArmado
	 */
	public String getIdItemArmado() {
		return idItemArmado;
	}


	/**
	 * @param idItemArmado the idItemArmado to set
	 */
	public void setIdItemArmado(String idItemArmado) {
		this.idItemArmado = idItemArmado;
	}
	
	
	
	


}
