package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase DTO que contiene la información asociada a la aplicacón.
 * @author jbonilla
 *
 */
public class ListaConfiguracionAplicacionDTO implements Serializable{
	
	
	
	/** id para Serializacion	 */
	private static final long serialVersionUID = 8511139666730679613L;
	
	private Long configurado;
	
	private List<ConfiguracionAplicacionDTO> listaConfiguracionAplicacionDTO;
	
	
	public ListaConfiguracionAplicacionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the configurado
	 */
	public Long getConfigurado() {
		return configurado;
	}
	/**
	 * @param configurado the configurado to set
	 */
	public void setConfigurado(Long configurado) {
		this.configurado = configurado;
	}
	/**
	 * @return the listaConfiguracionAplicacionDTO
	 */
	public List<ConfiguracionAplicacionDTO> getListaConfiguracionAplicacionDTO() {
		return listaConfiguracionAplicacionDTO;
	}
	/**
	 * @param listaConfiguracionAplicacionDTO the listaConfiguracionAplicacionDTO to set
	 */
	public void setListaConfiguracionAplicacionDTO(List<ConfiguracionAplicacionDTO> listaConfiguracionAplicacionDTO) {
		this.listaConfiguracionAplicacionDTO = listaConfiguracionAplicacionDTO;
	}
	
	

}
