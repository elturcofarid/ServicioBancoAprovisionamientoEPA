package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.List;

public class CuadernilloExamenDTO implements Serializable, Comparable<CuadernilloExamenDTO>{

	/** id para Serializacion */
	private static final long serialVersionUID = 6582956743525028297L;
	
	private Long idCuadernillo;
	private String nombreCuadernillo;
	/** Atributo que indica el orden de la sesión asociada al cuadernillo.*/
	private Long ordenSesion;
	private List<SesionesPruebaDTO> sesionesExamen;
	
	/**
	 * 
	 */
	public CuadernilloExamenDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return
	 */
	public String getNombreCuadernillo() {
		return nombreCuadernillo;
	}

	/**
	 * @param nombreCuadernillo
	 */
	public void setNombreCuadernillo(String nombreCuadernillo) {
		this.nombreCuadernillo = nombreCuadernillo;
	}

	/**
	 * @return
	 */
	public List<SesionesPruebaDTO> getSesionesExamen() {
		return sesionesExamen;
	}

	/**
	 * @param sesionesExamen
	 */
	public void setSesionesExamen(List<SesionesPruebaDTO> sesionesExamen) {
		this.sesionesExamen = sesionesExamen;
	}

	/**
	 * Se encarga de obtener el valor de idCuadernillo
	 * @return el valor del atributo idCuadernillo
	 */
	public Long getIdCuadernillo() {
		return idCuadernillo;
	}

	/**
	 * @param idCuadernillo the idCuadernillo to set
	 */
	public void setIdCuadernillo(Long idCuadernillo) {
		this.idCuadernillo = idCuadernillo;
	}


	@Override
	public int compareTo(CuadernilloExamenDTO o) {
		return this.getOrdenSesion().compareTo(o.getOrdenSesion());
	}

	/**
	 * Se encarga de obtener el valor de ordenSesion
	 * @return el valor del atributo ordenSesion
	 */
	public Long getOrdenSesion() {
		return ordenSesion;
	}

	/**
	 * @param ordenSesion the ordenSesion to set
	 */
	public void setOrdenSesion(Long ordenSesion) {
		this.ordenSesion = ordenSesion;
	}
	
	
	
	

}
