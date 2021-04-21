package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;

/**
 * DTO que representa el objeto recibido del servicio
 * de autorizacion de interoperabilidad
 * @author djaime
 *
 */
public class AutorizacionInteropDTO implements Serializable {

	/**ID para serializacion	 */
	private static final long serialVersionUID = -8050845751101117899L;
	
	/**Contiene el resultado de autorizacion para el rol tipo persona */
	private ResultadoAutorizacionDTO TPER;

	/**
	 * Se encarga de obtener el valor del atributo TPER
	 * @return ResultadoAutorizacionDTO
	 */
	public ResultadoAutorizacionDTO getTPER() {
		return TPER;
	}

	/**
	 * Se encarga de establecer el valor del atributo TPER
	 * @param tPER
	 */
	public void setTPER(ResultadoAutorizacionDTO tPER) {
		TPER = tPER;
	}
	

}
