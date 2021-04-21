package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.List;

public class ItemMovilDTO implements Serializable{

	/**	 */
	private static final long serialVersionUID = -117624110184648682L;

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

	/**
	 * Constructor de la clase
	 * @param tipoItem
	 * @param idItem
	 * @param contexto
	 * @param respuestas
	 * @param preguntasP2
	 * @param itemP4
	 */
	public ItemMovilDTO(String tipoItem, String idItem, String contexto, Long conteo, List<RespuestasItemMovilDTO> respuestas,
			List<PreguntaP2ItemMovilDTO> preguntasP2, List<PreguntaP4ItemMovilDTO> itemP4) {
		super();
		this.tipoItem = tipoItem;
		this.idItem = idItem;
		this.contexto = contexto;
		this.respuestas = respuestas;
		this.preguntasP2 = preguntasP2;
		this.itemP4 = itemP4;
	}

	public ItemMovilDTO() {
		super();
		// TODO Auto-generated constructor stub
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
}
