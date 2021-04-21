package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

public class RespuestaDTO implements Serializable {

	/**  **/
	private static final long serialVersionUID = 1715650015480755143L;

	private ProcesoDTO procesoDTO;
	
	private String mensajeProceso;
	
	private Boolean validacionPreinstalacion;
	
	public RespuestaDTO(){
		super();
		this.procesoDTO = new ProcesoDTO();
		this.mensajeProceso = "prueba respuesta";
		this.validacionPreinstalacion=false;
	}
	
	public RespuestaDTO(ProcesoDTO procesoDTO, String mensajeProceso){
		
	}

	/**
	 * @return the procesoDTO
	 */
	public ProcesoDTO getProcesoDTO() {
		return procesoDTO;
	}

	/**
	 * @param procesoDTO the procesoDTO to set
	 */
	public void setProcesoDTO(ProcesoDTO procesoDTO) {
		this.procesoDTO = procesoDTO;
	}

	/**
	 * @return the mensajeProceso
	 */
	public String getMensajeProceso() {
		return mensajeProceso;
	}

	/**
	 * @param mensajeProceso the mensajeProceso to set
	 */
	public void setMensajeProceso(String mensajeProceso) {
		this.mensajeProceso = mensajeProceso;
	}
	
	@Override
	public String toString() {
		return "RespuestaDTO [procesoDTO=" + procesoDTO + ", mensajeProceso=" + mensajeProceso + ", validacionPreinstalacion=" + validacionPreinstalacion + "]";
	}

	/**
	 * @return the validacionPreinstalacion
	 */
	public Boolean getValidacionPreinstalacion() {
		return validacionPreinstalacion;
	}

	/**
	 * @param validacionPreinstalacion the validacionPreinstalacion to set
	 */
	public void setValidacionPreinstalacion(Boolean validacionPreinstalacion) {
		this.validacionPreinstalacion = validacionPreinstalacion;
	}
	
	
}

