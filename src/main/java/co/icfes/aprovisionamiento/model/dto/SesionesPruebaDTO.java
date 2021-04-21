package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.List;

public class SesionesPruebaDTO implements Serializable{

	/** id para Serializacion */
	private static final long serialVersionUID = -4962471808401818231L;
	
	private String nombreSesion;
	private List<PruebaExamenDTO> pruebasExamen;
	
	
	/**
	 * 
	 */
	public SesionesPruebaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param nombreSesion
	 * @param pruebasExamen
	 */
	public SesionesPruebaDTO(String nombreSesion, List<PruebaExamenDTO> pruebasExamen) {
		this.nombreSesion = nombreSesion;
		this.pruebasExamen = pruebasExamen;
	}


	/**
	 * @return
	 */
	public String getNombreSesion() {
		return nombreSesion;
	}


	/**
	 * @param nombreSesion
	 */
	public void setNombreSesion(String nombreSesion) {
		this.nombreSesion = nombreSesion;
	}


	/**
	 * @return
	 */
	public List<PruebaExamenDTO> getPruebasExamen() {
		return pruebasExamen;
	}


	/**
	 * @param pruebasExamen
	 */
	public void setPruebasExamen(List<PruebaExamenDTO> pruebasExamen) {
		this.pruebasExamen = pruebasExamen;
	}
	
	

		
}
