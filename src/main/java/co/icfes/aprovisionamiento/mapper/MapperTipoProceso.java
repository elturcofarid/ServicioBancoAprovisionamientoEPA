package co.icfes.aprovisionamiento.mapper;

import co.icfes.aprovisionamiento.model.dto.TipoProcesoDTO;
import co.icfes.aprovisionamiento.model.entity.TipoProceso;

public class MapperTipoProceso {
	
	public TipoProcesoDTO toDto(TipoProceso entity) {
		return TipoProcesoDTO.builder()
				.idProcess(entity.idTipo)
				.nameProcess(entity.tipoNombre)
				.enumProcess(entity.tipoEnum)
				.build();
	}

}
