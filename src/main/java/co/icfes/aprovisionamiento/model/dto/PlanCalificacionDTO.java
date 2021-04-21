package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

public class PlanCalificacionDTO implements Serializable {

	/**Identificador de serializacion	 */
	private static final long serialVersionUID = -795332841112404736L;
	
	//identificador del plan de calificación
	private Long idPlan;
	//identificador de la aplicación
	private Long idAplicacion;
	//nombre del plan de calificación
	private String nombrePlan;
	
	/**
	 * @return the idPlan
	 */
	public Long getIdPlan() {
		return idPlan;
	}
	/**
	 * @param idPlan the idPlan to set
	 */
	public void setIdPlan(Long idPlan) {
		this.idPlan = idPlan;
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
	/**
	 * @return the nombrePlan
	 */
	public String getNombrePlan() {
		return nombrePlan;
	}
	/**
	 * @param nombrePlan the nombrePlan to set
	 */
	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}
}
