/**
 * 
 */
package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTO que contiene la informacion de permiso
 * @author djaime
 *
 */
public class PermisoDTO implements Serializable {

	/**ID para serializacion	 */
	private static final long serialVersionUID = -2962252434491581106L;
	
	/**Rol del usuario	 */
	private RolDTO rol;
	
	/**Lista de modulos a los que el usuario tiene acceso */
	private List<ModuloDTO> modulos;

	/**
	 * Se encarga de obtener el valor del atributo rol
	 * @return the rol 
	 */
	public RolDTO getRol() {
		return rol;
	}

	/**
	 * Se encarga de establecer el valor del atributo rol
	 * @param rol the rol to set 
	 */
	public void setRol(RolDTO rol) {
		this.rol = rol;
	}

	/**
	 * Se encarga de obtener el valor del atributo modulos
	 * @return the modulos 
	 */
	public List<ModuloDTO> getModulos() {
		return modulos;
	}

	/**
	 * Se encarga de establecer el valor del atributo modulos
	 * @param modulos the modulos to set 
	 */
	public void setModulos(List<ModuloDTO> modulos) {
		this.modulos = modulos;
	}
	

}
