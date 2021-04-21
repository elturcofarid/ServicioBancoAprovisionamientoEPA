package co.icfes.aprovisionamiento.model.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TipoProcesoDTO implements Serializable{

		
	/** id para Serializaci�n	 */
	private static final long serialVersionUID = 4085650499871085593L;
	private Long idProcess;
	private String nameProcess;
	private String stateProcess;
	private String enumProcess;

	public TipoProcesoDTO(Long idProcess, String nameProcess, String stateProcess, String enumProcess) {
		super();
		this.idProcess = idProcess;
		this.nameProcess = nameProcess;
		this.stateProcess = stateProcess;
		this.enumProcess = enumProcess;
		
	}
	
	

	public String getEnumProcess() {
		return enumProcess;
	}



	public void setEnumProcess(String enumProcess) {
		this.enumProcess = enumProcess;
	}



	public TipoProcesoDTO() {
		super();
	}
	

	public Long getIdProcess() {
		return idProcess;
	}

	public void setIdProcess(Long idProcess) {
		this.idProcess = idProcess;
	}

	public String getNameProcess() {
		return nameProcess;
	}

	public void setNameProcess(String nameProcess) {
		this.nameProcess = nameProcess;
	}

	public String getStateProcess() {
		return stateProcess;
	}

	public void setStateProcess(String stateProcess) {
		this.stateProcess = stateProcess;
	}
	
	@Override
	public String toString() {
	return "TipoProcesoDTO [idProcess=" + idProcess + ", nameProcess=" + nameProcess + ", stateProcess=" + stateProcess + ", enumProcess=" + enumProcess + "]";
	}
	
}
