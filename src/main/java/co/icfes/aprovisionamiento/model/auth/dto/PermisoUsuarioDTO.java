package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTO que contiene los permisos de un usuario
 * @author djaime
 *
 */
public class PermisoUsuarioDTO implements Serializable {

	/**ID para serializacion	 */
	private static final long serialVersionUID = -4787246242317623801L;
	
	/**nombre del usuario	 */
	private String nombreUsuario;	
	
	/**la identificacion del usuario	 */
	private String identificacion;
	
	/**Lista de permisos del usuario	 */
	private List<PermisoDTO> permisos;

	/**
	 * Se encarga de obtener el valor del atributo nombreUsuario
	 * @return the nombreUsuario 
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Se encarga de establecer el valor del atributo nombreUsuario
	 * @param nombreUsuario the nombreUsuario to set 
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * Se encarga de obtener el valor del atributo identificacion
	 * @return the identificacion 
	 */
	public String getIdentificacion() {
		return identificacion;
	}

	/**
	 * Se encarga de establecer el valor del atributo identificacion
	 * @param identificacion the identificacion to set 
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	/**
	 * Se encarga de obtener el valor del atributo permisos
	 * @return the permisos 
	 */
	public List<PermisoDTO> getPermisos() {
		return permisos;
	}

	/**
	 * Se encarga de establecer el valor del atributo permisos
	 * @param permisos the permisos to set 
	 */
	public void setPermisos(List<PermisoDTO> permisos) {
		this.permisos = permisos;
	}

}
