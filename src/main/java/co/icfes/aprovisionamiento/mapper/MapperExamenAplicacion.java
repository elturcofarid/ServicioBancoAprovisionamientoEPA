package co.icfes.aprovisionamiento.mapper;

import co.icfes.aprovisionamiento.model.dto.AplicacionDTO;
import co.icfes.aprovisionamiento.model.entity.ExamenAplicacion;

public class MapperExamenAplicacion {

	
	public ExamenAplicacion toEntity(AplicacionDTO dto) {
		
		
		return null;
	}
	
	public AplicacionDTO toDto(ExamenAplicacion entity) {
         return AplicacionDTO.builder().idAplicacion(entity.exapApliId)
         .nombreAplicacion(entity.exapApliNombre)
         .fechaInicio(entity.exapApliFechaInicio)
         .fechaFin(entity.exapApliFechaFin)
         .descrAplicacion(entity.exapDescripcion).build();         
	}
}
