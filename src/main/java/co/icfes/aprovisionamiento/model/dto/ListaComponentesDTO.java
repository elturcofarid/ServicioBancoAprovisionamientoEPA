package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase utilizada para la configuración de componentes asociados a una aplicación.
 * @author jbonilla
 *
 */
public class ListaComponentesDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1240543691305613242L;
	
	private Long IdTipoAplicacion;
	private List<ComponenteDTO> listaComponentes;
	/**
	 * @return the idTipoAplicacion
	 */
	public Long getIdTipoAplicacion() {
		return IdTipoAplicacion;
	}
	/**
	 * @param idTipoAplicacion the idTipoAplicacion to set
	 */
	public void setIdTipoAplicacion(Long idTipoAplicacion) {
		IdTipoAplicacion = idTipoAplicacion;
	}
	/**
	 * @return the listaComponentes
	 */
	public List<ComponenteDTO> getListaComponentes() {
		return listaComponentes;
	}
	/**
	 * @param listaComponentes the listaComponentes to set
	 */
	public void setListaComponentes(List<ComponenteDTO> listaComponentes) {
		this.listaComponentes = listaComponentes;
	}
}
