package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.List;

public class ComponenteDTO implements Serializable {

	/** Id para serializacion */
	private static final long serialVersionUID = -8887641661727320012L;

	private Long idPermiso;

	private String nombrePermiso;

	private String descrPermiso;

	private List<CaracteristicaComponenteDTO> listaCaracteristicas;

	private Long configurado;

	/**
	 * Permite obtener el id del componente o permiso
	 * 
	 * @return
	 */
	public Long getIdPermiso() {
		return idPermiso;
	}

	/**
	 * Permite cambiar el id del componente o permiso
	 * 
	 * @param idPermiso
	 */
	public void setIdPermiso(Long idPermiso) {
		this.idPermiso = idPermiso;
	}

	/**
	 * Permite obtener el nombre del componente o permiso
	 * 
	 * @return
	 */
	public String getNombrePermiso() {
		return nombrePermiso;
	}

	/**
	 * Permite cambiar el nombre del componente o permiso
	 * 
	 * @param nombrePermiso
	 */
	public void setNombrePermiso(String nombrePermiso) {
		this.nombrePermiso = nombrePermiso;
	}

	/**
	 * Permite obtener la descripción del componente o permiso
	 * 
	 * @return
	 */
	public String getDescrPermiso() {
		return descrPermiso;
	}

	/**
	 * Permite cambiar la descripción del componente o permiso
	 * 
	 * @param descrPermiso
	 */
	public void setDescrPermiso(String descrPermiso) {
		this.descrPermiso = descrPermiso;
	}

	/**
	 * Permite obtener la lista de características del componente o permiso
	 * 
	 * @return
	 */
	public List<CaracteristicaComponenteDTO> getListaCaracteristicas() {
		return listaCaracteristicas;
	}

	/**
	 * Permite cambiar la lista de características del componente o permiso
	 * 
	 * @param listaCaracteristicas
	 */
	public void setListaCaracteristicas(List<CaracteristicaComponenteDTO> listaCaracteristicas) {
		this.listaCaracteristicas = listaCaracteristicas;
	}

	/**
	 * Permite obtener si el componente o permiso se encuentra configurado o no
	 * 
	 * @return
	 */
	public Long getConfigurado() {
		return configurado;
	}

	/**
	 * Permite cambiar si el componente o permiso se encuentra configurado o no
	 * @param configurado
	 */
	public void setConfigurado(Long configurado) {
		this.configurado = configurado;
	}

}
