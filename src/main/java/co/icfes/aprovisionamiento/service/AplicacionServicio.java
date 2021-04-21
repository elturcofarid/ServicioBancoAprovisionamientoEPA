package co.icfes.aprovisionamiento.service;

import java.util.List;

import co.icfes.aprovisionamiento.model.dto.AplicacionDTO;

public interface AplicacionServicio {

	public List<AplicacionDTO> consultarAplicacionesInstaladas();

	public List<AplicacionDTO> consultarAplicacionesVerificadas();
	
	public List<AplicacionDTO> consultarListaAplicacionesActivas();

}
