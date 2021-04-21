package co.icfes.aprovisionamiento.model.dto;

import java.util.List;

//import co.gov.icfes.aprovisionamientoe.comun.modelo.EntidadAuditable;
//import co.gov.icfes.aprovisionamientoe.transformador.modelo.Combo;

public class ComboDTO {
	// validar el tema de Entidad auditabvle
	//extends EntidadAuditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4008334457814074648L;
	
	private Long idCombo;
	private String nombreCombo;
	private Long idAplicacion;
	private Long idComboArmado;
	private List<CuadernilloDTO> listaCuadernillo;
	
	public ComboDTO(Long comboId, String comboNombre) {
		this.idCombo=comboId;
		this.nombreCombo=comboNombre;
		
	}

	/*
	//construir este Mapper en una clase aparte
	 */
	/*
	public Combo convertirEntity(ComboDTO comboDTO){
		Combo combo = new Combo();
		combo.setIdCombo(comboDTO.getIdCombo());
		combo.setNombreCombo(comboDTO.getNombreCombo());
		combo.setIdAPlicacion(comboDTO.getIdAplicacion());
		combo.setIdComboArmado(comboDTO.getIdComboArmado());
		combo.setUsuarioCreacion(comboDTO.getUsuarioCreacion());
		combo.setFechaCreacion(comboDTO.getFechaCreacion());
		combo.setIdComboArmado(comboDTO.getIdCombo());
		return combo;		
	}

	 */
	
	public Long getIdCombo() {
		return idCombo;
	}
	public void setIdCombo(Long idCombo) {
		this.idCombo = idCombo;
	}
	public String getNombreCombo() {
		return nombreCombo;
	}
	public void setNombreCombo(String nombreCombo) {
		this.nombreCombo = nombreCombo;
	}
	public List<CuadernilloDTO> getListaCuadernillo() {
		return listaCuadernillo;
	}
	public void setListaCuadernillo(List<CuadernilloDTO> listaCuadernillo) {
		this.listaCuadernillo = listaCuadernillo;
	}

	/**
	 * @return the idAplicacion
	 */
	public Long getIdAplicacion() {
		return idAplicacion;
	}

	/**
	 * @param idAplicacion the idAplicacion to set
	 */
	public void setIdAplicacion(Long idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	/**
	 * @return the idComboArmado
	 */
	public Long getIdComboArmado() {
		return idComboArmado;
	}

	/**
	 * @param idComboArmado the idComboArmado to set
	 */
	public void setIdComboArmado(Long idComboArmado) {
		this.idComboArmado = idComboArmado;
	}
}
