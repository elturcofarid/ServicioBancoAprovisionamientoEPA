package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTO que contiene el resultado de autorizacion para un usuario
 * @author djaime
 *
 */
public class ResultadoAutorizacionDTO implements Serializable {

	/**ID para serializacion	 */
	private static final long serialVersionUID = -8350343760648471892L;
	
	/**nombre del usuario autenticado */
	private String usuario;
	
	/**Id del usuario autenticado	 */
	private Long idUsuario;
	
	/**Lista de permisos del usuario */
	private List<PermisoUsuarioDTO> permisosUsuario;
	
	/**Estado del token	 */
	private String estado;
	
	/**estado del usuario */
	private String estadoUsuario;

	/**
	 * Se encarga de obtener el valor del atributo usuario
	 * @return the usuario 
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Se encarga de establecer el valor del atributo usuario
	 * @param usuario the usuario to set 
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Se encarga de obtener el valor del atributo idUsuario
	 * @return the idUsuario 
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Se encarga de establecer el valor del atributo idUsuario
	 * @param idUsuario the idUsuario to set 
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * Se encarga de obtener el valor del atributo permisosUsuario
	 * @return the permisosUsuario 
	 */
	public List<PermisoUsuarioDTO> getPermisosUsuario() {
		return permisosUsuario;
	}

	/**
	 * Se encarga de establecer el valor del atributo permisosUsuario
	 * @param permisosUsuario the permisosUsuario to set 
	 */
	public void setPermisosUsuario(List<PermisoUsuarioDTO> permisosUsuario) {
		this.permisosUsuario = permisosUsuario;
	}

	/**
	 * Se encarga de obtener el valor del atributo estado
	 * @return the estado 
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Se encarga de establecer el valor del atributo estado
	 * @param estado the estado to set 
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Se encarga de obtener el valor del atributo estadoUsuario
	 * @return the estadoUsuario 
	 */
	public String getEstadoUsuario() {
		return estadoUsuario;
	}

	/**
	 * Se encarga de establecer el valor del atributo estadoUsuario
	 * @param estadoUsuario the estadoUsuario to set 
	 */
	public void setEstadoUsuario(String estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

}
