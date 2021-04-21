package co.icfes.aprovisionamiento.service;

import java.util.List;

import co.icfes.aprovisionamiento.model.dto.TipoProcesoDTO;

public interface ProcesoServicio {

	public List<TipoProcesoDTO> consultarProcesosActivos(Long idRol);
	
}
