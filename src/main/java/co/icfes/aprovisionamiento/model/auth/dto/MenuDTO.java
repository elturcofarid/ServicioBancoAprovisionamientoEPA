/**
 * 
 */
package co.icfes.aprovisionamiento.model.auth.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTO para transporte de la informacion de menus
 * @author djaime
 *
 */
public class MenuDTO implements Serializable {

	/**ID para serializacion */
	private static final long serialVersionUID = 3687118454605600077L;
	
	/**	id del menu */
	private Long idMenu;
	
	/**	estado del menu */
	private String estado;
	
	/**	nombre del menu */
	private String nombre;
	
	/**	descripcion del menu */
	private String descripcion;
	
	/**	flag que indica si el menu es visible */
	private String visible;
	
	/**	lista de submenus */
	private List<MenuDTO> submenus;
	
	/**	url del menu */
	private UrlDTO url;

	/**
	 * Se encarga de obtener el valor del atributo idMenu
	 * @return the idMenu 
	 */
	public Long getIdMenu() {
		return idMenu;
	}

	/**
	 * Se encarga de establecer el valor del atributo idMenu
	 * @param idMenu the idMenu to set 
	 */
	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
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
	 * Se encarga de obtener el valor del atributo visible
	 * @return the visible 
	 */
	public String getVisible() {
		return visible;
	}

	/**
	 * Se encarga de establecer el valor del atributo visible
	 * @param visible the visible to set 
	 */
	public void setVisible(String visible) {
		this.visible = visible;
	}

	/**
	 * Se encarga de obtener el valor del atributo submenus
	 * @return the submenus 
	 */
	public List<MenuDTO> getSubmenus() {
		return submenus;
	}

	/**
	 * Se encarga de establecer el valor del atributo submenus
	 * @param submenus the submenus to set 
	 */
	public void setSubmenus(List<MenuDTO> submenus) {
		this.submenus = submenus;
	}

	/**
	 * Se encarga de obtener el valor del atributo url
	 * @return the url 
	 */
	public UrlDTO getUrl() {
		return url;
	}

	/**
	 * Se encarga de establecer el valor del atributo url
	 * @param url the url to set 
	 */
	public void setUrl(UrlDTO url) {
		this.url = url;
	}

}
