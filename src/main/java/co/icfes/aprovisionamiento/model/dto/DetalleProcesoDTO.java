package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;
import java.util.ArrayList;


public class DetalleProcesoDTO implements Serializable {

	/**
	 * 
	/**Id para serializacion	 */
	private static final long serialVersionUID = 7320277463867976429L;

	
	private ProcesoDTO procesoDTO;
	
	private ArrayList<LogProcesoDTO>  listaLogProcesoDTO;

	public ProcesoDTO getProcesoDTO() {
		return procesoDTO;
	}

	public void setProcesoDTO(ProcesoDTO procesoDTO) {
		this.procesoDTO = procesoDTO;
	}

	public ArrayList<LogProcesoDTO> getListaLogProcesoDTO() {
		return listaLogProcesoDTO;
	}

	public void setListaLogProcesoDTO(ArrayList<LogProcesoDTO> listaLogProcesoDTO) {
		this.listaLogProcesoDTO = listaLogProcesoDTO;
	}
		
}
