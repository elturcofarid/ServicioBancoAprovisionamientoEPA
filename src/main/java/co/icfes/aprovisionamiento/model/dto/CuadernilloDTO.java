package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.sql.Blob;
import java.util.List;

/*
import co.gov.icfes.aprovisionamientoe.comun.modelo.EntidadAuditable;
import co.gov.icfes.aprovisionamientoe.transformador.modelo.ComboCuadernillo;
import co.gov.icfes.aprovisionamientoe.transformador.modelo.Cuadernillo;
*/

public class CuadernilloDTO /*extends EntidadAuditable implements Serializable {
validar lo de auditable*/{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8088884866749879178L;
	
	private Long idCuadernillo;
	private String nombreCuadernillo;
	private Long idSesion;
	private List<ItemPlxDTO> listaItem;
	private Long comboCuadId;
	private Long comboId;
	private Blob contenido;
	private String contenido1;
	private Long idCuadernilloArmado;
	
	public CuadernilloDTO(Long cuadId, String cuadNombre, Long sesionId) {
		this.idCuadernillo=cuadId;
		this.nombreCuadernillo=cuadNombre;
		this.idSesion=sesionId;
	}

	/*sacar el mapper de aqui
	public Cuadernillo convertirEntity(CuadernilloDTO cuadernilloDTO) {
		Cuadernillo cuadernillo = new Cuadernillo();		
		cuadernillo.setIdCuadernillo(cuadernilloDTO.getIdCuadernillo());
		cuadernillo.setNombreCuadernillo(cuadernilloDTO.getNombreCuadernillo());
		cuadernillo.setContenido(cuadernilloDTO.getContenido());
		cuadernillo.setContenido1(cuadernilloDTO.getContenido1());	
		cuadernillo.setUsuarioCreacion(cuadernilloDTO.getUsuarioCreacion());
		cuadernillo.setFechaCreacion(cuadernilloDTO.getFechaCreacion());
		cuadernillo.setIdCuadernilloArmado(cuadernilloDTO.getIdCuadernillo());
		return cuadernillo;
	}



	public ComboCuadernillo convertirComboCuad(CuadernilloDTO cuadernilloDTO) {
		ComboCuadernillo comboCuadernillo = new ComboCuadernillo();
		comboCuadernillo.setIdComboCuad(cuadernilloDTO.getComboCuadId());
		comboCuadernillo.setIdCuadernillo(cuadernilloDTO.getIdCuadernillo());
		comboCuadernillo.setIdCombo(cuadernilloDTO.getComboId());
		comboCuadernillo.setIdComCuadSesion(cuadernilloDTO.getIdSesion());
		comboCuadernillo.setFechaCreacion(cuadernilloDTO.getFechaCreacion());
		comboCuadernillo.setUsuarioCreacion(cuadernilloDTO.getUsuarioCreacion());
		return comboCuadernillo;
	}*/
	
	/**
	 * @return the idCuadernillo
	 */
	public Long getIdCuadernillo() {
		return idCuadernillo;
	}
	/**
	 * @param idCuadernillo the idCuadernillo to set
	 */
	public void setIdCuadernillo(Long idCuadernillo) {
		this.idCuadernillo = idCuadernillo;
	}
	/**
	 * @return the nombreCuadernillo
	 */
	public String getNombreCuadernillo() {
		return nombreCuadernillo;
	}
	/**
	 * @param nombreCuadernillo the nombreCuadernillo to set
	 */
	public void setNombreCuadernillo(String nombreCuadernillo) {
		this.nombreCuadernillo = nombreCuadernillo;
	}
	/**
	 * @return the idSesion
	 */
	public Long getIdSesion() {
		return idSesion;
	}
	/**
	 * @param idSesion the idSesion to set
	 */
	public void setIdSesion(Long idSesion) {
		this.idSesion = idSesion;
	}
	/**
	 * @return the listaItem
	 */
	public List<ItemPlxDTO> getListaItem() {
		return listaItem;
	}
	/**
	 * @param listaItem the listaItem to set
	 */
	public void setListaItem(List<ItemPlxDTO> listaItem) {
		this.listaItem = listaItem;
	}
	/**
	 * @return the comboCuadId
	 */
	public Long getComboCuadId() {
		return comboCuadId;
	}
	/**
	 * @param comboCuadId the comboCuadId to set
	 */
	public void setComboCuadId(Long comboCuadId) {
		this.comboCuadId = comboCuadId;
	}
	/**
	 * @return the comboId
	 */
	public long getComboId() {
		return comboId;
	}
	/**
	 * @param comboId the comboId to set
	 */
	public void setComboId(Long comboId) {
		this.comboId = comboId;
	}	

	/**
	 * @return the contenido
	 */
	public Blob getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(Blob contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the contenido1
	 */
	public String getContenido1() {
		return contenido1;
	}

	/**
	 * @param contenido1 the contenido1 to set
	 */
	public void setContenido1(String contenido1) {
		this.contenido1 = contenido1;
	}

	/**
	 * @return the idCuadernilloArmado
	 */
	public Long getIdCuadernilloArmado() {
		return idCuadernilloArmado;
	}

	/**
	 * @param idCuadernilloArmado the idCuadernilloArmado to set
	 */
	public void setIdCuadernilloArmado(Long idCuadernilloArmado) {
		this.idCuadernilloArmado = idCuadernilloArmado;
	}	
}
