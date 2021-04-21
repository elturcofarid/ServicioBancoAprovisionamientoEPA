/**
 * 
 */
package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;

/**
 * DTO para transporte de la informacion de roles
 * @author djaime
 *
 */
public class RolDTO implements Serializable {

	/**ID para serializacion */
	private static final long serialVersionUID = 4545057215859574852L;
	
	/**Id del rol	 */
	private Long idRol;
	
	/**estado en que se encuentra el rol	 */
	private String estado;
	
	/**nombre del rol	 */
	private String nombre;
	
	/**descripcion del rol	 */
	private String descripcion;
	
	/**tipo de rol	 */
	private String tipo;

	/**
	 * Se encarga de obtener el valor del atributo idRol
	 * @return the idRol 
	 */
	public Long getIdRol() {
		return idRol;
	}

	/**
	 * Se encarga de establecer el valor del atributo idRol
	 * @param idRol the idRol to set 
	 */
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
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
	 * Se encarga de obtener el valor del atributo nombre
	 * @return the nombre 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Se encarga de establecer el valor del atributo nombre
	 * @param nombre the nombre to set 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Se encarga de obtener el valor del atributo descripcion
	 * @return the descripcion 
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Se encarga de establecer el valor del atributo descripcion
	 * @param descripcion the descripcion to set 
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Se encarga de obtener el valor del atributo tipo
	 * @return the tipo 
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Se encarga de establecer el valor del atributo tipo
	 * @param tipo the tipo to set 
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
