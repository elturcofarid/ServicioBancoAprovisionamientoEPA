/**
 * 
 */
package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTO para transporte de la informacion de modulos
 * @author djaime
 *
 */
public class ModuloDTO implements Serializable {

	/**ID para serializacion	 */
	private static final long serialVersionUID = -1939958504653353652L;
	
	/**el id del modulo	 */
	private Long idModulo;
	
	/**El estado del modulo	 */
	private String estado;
	
	/**el nombre del modulo	 */
	private String nombre;
	
	/**la descripcion del modulo	 */
	private String descripcion;
	
	/**la ur del modulo	 */
	private String url;
	
	/**Submodulos del modulo	 */
	private List<ModuloDTO> submodulos;
	
	/**menus del modulo	 */
	private List<MenuDTO> menus;

	/**
	 * Se encarga de obtener el valor del atributo idModulo
	 * @return the idModulo 
	 */
	public Long getIdModulo() {
		return idModulo;
	}

	/**
	 * Se encarga de establecer el valor del atributo idModulo
	 * @param idModulo the idModulo to set 
	 */
	public void setIdModulo(Long idModulo) {
		this.idModulo = idModulo;
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
	 * Se encarga de obtener el valor del atributo url
	 * @return the url 
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Se encarga de establecer el valor del atributo url
	 * @param url the url to set 
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Se encarga de obtener el valor del atributo submodulos
	 * @return the submodulos 
	 */
	public List<ModuloDTO> getSubmodulos() {
		return submodulos;
	}

	/**
	 * Se encarga de establecer el valor del atributo submodulos
	 * @param submodulos the submodulos to set 
	 */
	public void setSubmodulos(List<ModuloDTO> submodulos) {
		this.submodulos = submodulos;
	}

	/**
	 * Se encarga de obtener el valor del atributo menus
	 * @return the menus 
	 */
	public List<MenuDTO> getMenus() {
		return menus;
	}

	/**
	 * Se encarga de establecer el valor del atributo menus
	 * @param menus the menus to set 
	 */
	public void setMenus(List<MenuDTO> menus) {
		this.menus = menus;
	}

}
