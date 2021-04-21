package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

public class FiltroPruebaExamenDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6329471838507805075L;

	private Long idAplicacion;
	
	private Long idPrueba;
	
	private String nombrePrueba;
	
	private Long idCuadernillo;
	
	private String estadoItem;

	public FiltroPruebaExamenDTO() {
		super();
	}

	/**
	 * Retorna el id de la Prueba
	 * @return
	 */
	public Long getIdPrueba() {
		return idPrueba;
	}

	/**
	 * Setea el id de la Prueba
	 * @param idPrueba
	 */
	public void setIdPrueba(Long idPrueba) {
		this.idPrueba = idPrueba;
	}

	/**
	 * Retorna el nombre de la Prueba
	 * @return
	 */
	public String getNombrePrueba() {
		return nombrePrueba;
	}

	/**
	 * Setea nombre de Prueba
	 * @param nombrePrueba
	 */
	public void setNombrePrueba(String nombrePrueba) {
		this.nombrePrueba = nombrePrueba;
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

	/**
	 * @return the estadoItem
	 */
	public String getEstadoItem() {
		return estadoItem;
	}

	/**
	 * @param estadoItem the estadoItem to set
	 */
	public void setEstadoItem(String estadoItem) {
		this.estadoItem = estadoItem;
	}
}
