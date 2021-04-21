package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.List;

public class ItemMovilPreinstaladoDTO implements Serializable{

	/**	 */
	private static final long serialVersionUID = 4198887077775179686L;
	
	/** Representa en tipo del item**/
	private String tipoItem;
	
	/** Representa el id del Item**/
	private String idItem;
	
	/** Representa el codigo del item**/
	private String codigoItem;
	
	/** Almacena el contexto y pregunta del item **/ 
	private String contexto;
	
	/** Representa las respuestas simples del Item**/
	private List<RespuestasItemMovilDTO> respuestas;
	
	/** Almacena las preguntas de tipo P2 **/
	private List<PreguntaP2ItemMovilDTO> preguntasP2;
	
	/** Almacena el contenido del item P4 **/
	private List<PreguntaP4ItemMovilDTO> itemP4;
	
	private String estadoMovil;
	private String observacionesMovil;
	
	private String usuarioModificador;
	private Long tipoRechazo;

	/**
	 * Constructor de la clase
	 * @param tipoItem
	 * @param idItem
	 * @param contexto
	 * @param respuestas
	 * @param preguntasP2
	 * @param itemP4
	 */
	public ItemMovilPreinstaladoDTO(String tipoItem, String idItem, String contexto, Long conteo, List<RespuestasItemMovilDTO> respuestas,
			List<PreguntaP2ItemMovilDTO> preguntasP2, List<PreguntaP4ItemMovilDTO> itemP4, String estadoMovil, String observacionesMovil) {
		super();
		this.tipoItem = tipoItem;
		this.idItem = idItem;
		this.contexto = contexto;
		this.respuestas = respuestas;
		this.preguntasP2 = preguntasP2;
		this.itemP4 = itemP4;
		this.estadoMovil = estadoMovil;
		this.observacionesMovil = observacionesMovil;
	}

	public ItemMovilPreinstaladoDTO() {
		super();
	}

	/**
	 * @return the tipoItem
	 */
	public String getTipoItem() {
		return tipoItem;
	}

	/**
	 * @param tipoItem the tipoItem to set
	 */
	public void setTipoItem(String tipoItem) {
		this.tipoItem = tipoItem;
	}

	/**
	 * @return the idItem
	 */
	public String getIdItem() {
		return idItem;
	}

	/**
	 * @param idItem the idItem to set
	 */
	public void setIdItem(String idItem) {
		this.idItem = idItem;
	}

	/**
	 * @return the contexto
	 */
	public String getContexto() {
		return contexto;
	}

	/**
	 * @param contexto the contexto to set
	 */
	public void setContexto(String contexto) {
		this.contexto = contexto;
	}

	/**
	 * @return the respuestas
	 */
	public List<RespuestasItemMovilDTO> getRespuestas() {
		return respuestas;
	}

	/**
	 * @param respuestas the respuestas to set
	 */
	public void setRespuestas(List<RespuestasItemMovilDTO> respuestas) {
		this.respuestas = respuestas;
	}

	/**
	 * @return the preguntasP2
	 */
	public List<PreguntaP2ItemMovilDTO> getPreguntasP2() {
		return preguntasP2;
	}

	/**
	 * @param preguntasP2 the preguntasP2 to set
	 */
	public void setPreguntasP2(List<PreguntaP2ItemMovilDTO> preguntasP2) {
		this.preguntasP2 = preguntasP2;
	}

	/**
	 * @return the itemP4
	 */
	public List<PreguntaP4ItemMovilDTO> getItemP4() {
		return itemP4;
	}

	/**
	 * @param itemP4 the itemP4 to set
	 */
	public void setItemP4(List<PreguntaP4ItemMovilDTO> itemP4) {
		this.itemP4 = itemP4;
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

	/**
	 * @return the estadoMovil
	 */
	public String getEstadoMovil() {
		return estadoMovil;
	}

	/**
	 * @param estadoMovil the estadoMovil to set
	 */
	public void setEstadoMovil(String estadoMovil) {
		this.estadoMovil = estadoMovil;
	}

	/**
	 * @return the observacionesMovil
	 */
	public String getObservacionesMovil() {
		return observacionesMovil;
	}

	/**
	 * @param observacionesMovil the observacionesMovil to set
	 */
	public void setObservacionesMovil(String observacionesMovil) {
		this.observacionesMovil = observacionesMovil;
	}

	/**
	 * @return the usuarioModificador
	 */
	public String getUsuarioModificador() {
		return usuarioModificador;
	}

	/**
	 * @param usuarioModificador the usuarioModificador to set
	 */
	public void setUsuarioModificador(String usuarioModificador) {
		this.usuarioModificador = usuarioModificador;
	}

	/**
	 * @return the tipoRechazo
	 */
	public Long getTipoRechazo() {
		return tipoRechazo;
	}

	/**
	 * @param tipoRechazo the tipoRechazo to set
	 */
	public void setTipoRechazo(Long tipoRechazo) {
		this.tipoRechazo = tipoRechazo;
	}

}
