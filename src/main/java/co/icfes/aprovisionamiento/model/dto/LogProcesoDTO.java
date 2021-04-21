package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.Date;

//import co.gov.icfes.aprovisionamientoe.transformador.modelo.LogProceso;


public class LogProcesoDTO implements Serializable {

	/**
	 * 
	/**Id para serializacion	 */
	private static final long serialVersionUID = 7320277463867976429L;

	
	
	private Long idLogProceso;
	
	private Long idProceso;
		
	private Long idItem;
	
	private String idCarpeta;
	
	private String idArmado;
	
	private Date fechaGeneroError;
	
	private String descripcionError;
		
	private String usuarioCreacion;

	private Date fechaCreacion;

	private Date fechaModificacion;

	private String usuarioModificacion;
	
	private String fechaInicioFormateada;
	
	
	
	/*
	private Long estado;
	
	private Integer numeroTotalRegistros=0;

	private Integer numeroRegistrosProcesados=0;
	
	private Long porcentaje;*/
	
	

	public Long getIdLogProceso() {
		return idLogProceso;
	}

	public String getfechaInicioFormateada() {
		return fechaInicioFormateada;
	}

	public void setfechaInicioFormateada(String fechaInicioFormateada) {
		this.fechaInicioFormateada = fechaInicioFormateada;
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

	public Long getIdItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
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

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public String getIdCarpeta() {
		return idCarpeta;
	}

	public void setIdCarpeta(String idCarpeta) {
		this.idCarpeta = idCarpeta;
	}

	public String getIdArmado() {
		return idArmado;
	}

	public void setIdArmado(String idArmado) {
		this.idArmado = idArmado;
	}
	
	/* sacar mapper
	public LogProceso convertirEntity(){
		LogProceso logEnt = new LogProceso();
		logEnt.setIdLogProceso(this.getIdLogProceso());
		logEnt.setDescripcionError(this.getDescripcionError());
		logEnt.setFechaCreacion(new Date());
		logEnt.setIdProceso(this.getIdProceso());
		logEnt.setIdItemArmado(this.getIdItem().toString());
		logEnt.setUsuarioCreacion(this.getUsuarioCreacion());
		logEnt.setFechaGeneroError(this.getFechaGeneroError());
		return logEnt;
	}
	*/



	
}
