package co.icfes.aprovisionamiento.model.dto;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Atributo que contiene la información asociada a cada una de las preguntas encontradas en el item.
 * @author jbonilla
 *
 */
public class PreguntasDTO {
	
	/**
	 * Atributo que contiene el id de la pregunta a mostrar en el html.
	 */
	private String idPreguntas;
	
	/**
	 * Atributo utilizado para Preguntas P4 Ingles. Permite realizar un mapeo entre el grupo de respuestas y una pregunta.
	 */
	private String variableMapeo;
	
	/**
	 * Atributo que construye el ngModel a utilizar. (En caso de que sea necesario).
	 */
	private String idNgModel;
	
	/**
	 * Atributo que construye el name del select a generar para Preguntas P4 Ingles.
	 */
	private String name;
	
	/**
	 * Texto que contiene el enunciado de la pregunta.
	 */
	private String pregunta;
	
	/**
	 * Atributo que indica si la pregunta es ejemplo.
	 */
	private String ejemplo;
	
	/**
	 * Atributo que contiene la lista de posibles respuestas asociadas a la pregunta.
	 */
	private List<RespuestasDTO> respuestas;
	
	/**
	 * Atributo que contiene la lista de videos asociados al item.
	 */
	private List<VideosDTO> listaVideos;
	
	/**
	 * Atributo que contiene el video enunciado del item INSOR
	 */
	private VideosDTO videoEnunciadoINSOR;
	
	/**
	 * Atributo que marca el estilo de la respuesta
	 */
	private String estilo;
	
	private String codigoItem;
	
	
	public PreguntasDTO() {
		 this.respuestas = new ArrayList<RespuestasDTO>();
	}
	
	
	///////////////////////GETTER-SETTER///////////////////////////////////

	/**
	 * @return the idPreguntas
	 */
	public String getIdPreguntas() {
		return idPreguntas;
	}

	/**
	 * @param idPreguntas the idPreguntas to set
	 */
	public void setIdPreguntas(String idPreguntas) {
		this.idPreguntas = idPreguntas;
	}

	/**
	 * @return the idNgModel
	 */
	public String getIdNgModel() {
		return idNgModel;
	}

	/**
	 * @param idNgModel the idNgModel to set
	 */
	public void setIdNgModel(String idNgModel) {
		this.idNgModel = idNgModel;
	}

	/**
	 * @return the pregunta
	 */
	public String getPregunta() {
		return pregunta;
	}

	/**
	 * @param pregunta the pregunta to set
	 */
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	/**
	 * @return the respuestas
	 */
	public List<RespuestasDTO> getRespuestas() {
		return respuestas;
	}

	/**
	 * @param respuestas the respuestas to set
	 */
	public void setRespuestas(List<RespuestasDTO> respuestas) {
		this.respuestas = respuestas;
	}


	/**
	 * @return the estilo
	 */
	public String getEstilo() {
		return estilo;
	}


	/**
	 * @param estilo the estilo to set
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	

	/**
	 * Se encarga de obtener el valor de listaVideos
	 * @return el valor del atributo listaVideos
	 */
	public List<VideosDTO> getListaVideos() {
		return listaVideos;
	}


	/**
	 * @param listaVideos the listaVideos to set
	 */
	public void setListaVideos(List<VideosDTO> listaVideos) {
		this.listaVideos = listaVideos;
	}


	/**
	 * Se encarga de obtener el valor de videoEnunciadoINSOR
	 * @return el valor del atributo videoEnunciadoINSOR
	 */
	public VideosDTO getVideoEnunciadoINSOR() {
		return videoEnunciadoINSOR;
	}


	/**
	 * @param videoEnunciadoINSOR the videoEnunciadoINSOR to set
	 */
	public void setVideoEnunciadoINSOR(VideosDTO videoEnunciadoINSOR) {
		this.videoEnunciadoINSOR = videoEnunciadoINSOR;
	}


	/**
	 * @return the variableMapeo
	 */
	public String getVariableMapeo() {
		return variableMapeo;
	}


	/**
	 * @param variableMapeo the variableMapeo to set
	 */
	public void setVariableMapeo(String variableMapeo) {
		this.variableMapeo = variableMapeo;
	}


	/**
	 * @return the ejemplo
	 */
	public String getEjemplo() {
		return ejemplo;
	}


	/**
	 * @param ejemplo the ejemplo to set
	 */
	public void setEjemplo(String ejemplo) {
		this.ejemplo = ejemplo;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
