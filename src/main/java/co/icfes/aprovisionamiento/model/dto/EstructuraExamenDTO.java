package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.List;

public class EstructuraExamenDTO implements Serializable{

	/** id para serializacion  */
	private static final long serialVersionUID = -3340428871512802532L;
	
	private Long idAplicacion;
	private String nombreAplicacion;
	private String estadoAplicacion;
	private List<CuadernilloExamenDTO> cuadernillosExamen;
	
	
	/**
	 * Constructor de la clase
	 */
	public EstructuraExamenDTO() {
		
	}


	/**
	 * @return
	 */
	public Long getIdAplicacion() {
		return idAplicacion;
	}


	/**
	 * @param idAplicacion
	 */
	public void setIdAplicacion(Long idAplicacion) {
		this.idAplicacion = idAplicacion;
	}


	/**
	 * @return
	 */
	public String getNombreAplicacion() {
		return nombreAplicacion;
	}


	/**
	 * @param nombreAplicacion
	 */
	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}


	/**
	 * @return
	 */
	public List<CuadernilloExamenDTO> getCuadernillosExamen() {
		return cuadernillosExamen;
	}


	/**
	 * @param cuadernillosExamen
	 */
	public void setCuadernillosExamen(List<CuadernilloExamenDTO> cuadernillosExamen) {
		this.cuadernillosExamen = cuadernillosExamen;
	}

	/**
	 * @return the estadoAplicacion
	 */
	public String getEstadoAplicacion() {
		return estadoAplicacion;
	}

	/**
	 * @param estadoAplicacion the estadoAplicacion to set
	 */
	public void setEstadoAplicacion(String estadoAplicacion) {
		this.estadoAplicacion = estadoAplicacion;
	}
}
