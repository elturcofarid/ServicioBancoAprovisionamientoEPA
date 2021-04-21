package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

public class PruebaExamenDTO implements Serializable{

	/** id para Serializacion */
	private static final long serialVersionUID = -749576726149436010L;
	
	private Long idPrueba;
	private String nombrePrueba;

	/**
	 * 
	 */
	public PruebaExamenDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @return
	 */
	public Long getIdPrueba() {
		return idPrueba;
	}



	/**
	 * @param idPrueba
	 */
	public void setIdPrueba(Long idPrueba) {
		this.idPrueba = idPrueba;
	}



	/**
	 * 
	 */
	public PruebaExamenDTO(String nombrePrueba, Long idPrueba) {
		this.nombrePrueba = nombrePrueba;
		this.idPrueba = idPrueba;
	}

	/**
	 * @return
	 */
	public String getNombrePrueba() {
		return nombrePrueba;
	}

	/**
	 * @param nombrePrueba
	 */
	public void setNombrePrueba(String nombrePrueba) {
		this.nombrePrueba = nombrePrueba;
	}
	
	
	

}
