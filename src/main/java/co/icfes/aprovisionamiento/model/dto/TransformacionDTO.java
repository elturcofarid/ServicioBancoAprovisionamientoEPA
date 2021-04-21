package co.icfes.aprovisionamiento.model.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase transformaciónDTO se encarga de cargar el contenido html del enunciado de cada item y se
 * asocian las respectivas preguntas asociadas al mismo.
 * @author jbonilla
 *
 */
public class TransformacionDTO {
	
	private String codigoItem;
	
	/**
	 * Atributo que contiene la información html del enunciado.
	 */
	private String contenido;
	
	/**
	 * Atributo que contiene la información de las preguntas asociadas al item.
	 */
	private List<PreguntasDTO> listaPreguntas;
	
	
	
	/**
	 * Atributo que contiene el tipo de plantilla que necesita para realizar la transformación.
	 */
	private String  nombrePlantilla;
	

	/**
	 * Atributo que contiene la ubicación de las plantillas de transformación.
	 */
	private String  ubicacionPlantillas;
	
	/**
	 * Constrcutor por default.
	 */
	public TransformacionDTO() {
		this.contenido = "";
		listaPreguntas = new ArrayList<PreguntasDTO>();
	}
	
	
	//////////////////////////////////GETTER-SETTER//////////////////////////////////////

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the listaPreguntas
	 */
	public List<PreguntasDTO> getListaPreguntas() {
		return listaPreguntas;
	}

	/**
	 * @param listaPreguntas the listaPreguntas to set
	 */
	public void setListaPreguntas(List<PreguntasDTO> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}


	/**
	 * @return the nombrePlantilla
	 */
	public String getNombrePlantilla() {
		return nombrePlantilla;
	}


	/**
	 * @param nombrePlantilla the nombrePlantilla to set
	 */
	public void setNombrePlantilla(String nombrePlantilla) {
		this.nombrePlantilla = nombrePlantilla;
	}


	/**
	 * @return the ubicacionPlantillas
	 */
	public String getUbicacionPlantillas() {
		return ubicacionPlantillas;
	}


	/**
	 * @param ubicacionPlantillas the ubicacionPlantillas to set
	 */
	public void setUbicacionPlantillas(String ubicacionPlantillas) {
		this.ubicacionPlantillas = ubicacionPlantillas;
	}


	/**
	 * @return the codigoItem
	 */
	public String getCodigoItem() {
		return codigoItem;
	}


	/**
	 * @param codigoItem the codigoItem to set
	 */
	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	

}
