package co.icfes.aprovisionamiento.model.dto;

/**
 * DTO para datos de videos
 * @author anieto
 *
 */
public class VideosDTO {

	/**
	 * Variable encargada de almacenar el link del video
	 */
	private String source;
	
	/**
	 * Variable encargada de alamcenar la opcion del video
	 */
	private String option;
	

	public VideosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * Se encarga de obtener el valor de source
	 * @return el valor del atributo source
	 */
	public String getSource() {
		return source;
	}


	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}


	/**
	 * Se encarga de obtener el valor de option
	 * @return el valor del atributo option
	 */
	public String getOption() {
		return option;
	}


	/**
	 * @param option the option to set
	 */
	public void setOption(String option) {
		this.option = option;
	}
	
	
	
	
	
	
}
