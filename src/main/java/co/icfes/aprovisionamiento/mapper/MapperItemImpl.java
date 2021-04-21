package co.icfes.aprovisionamiento.mapper;

import java.nio.file.Path;
import java.util.Date;

import co.icfes.aprovisionamiento.model.dto.ItemDTO;
import co.icfes.aprovisionamiento.model.entity.Item;

public class MapperItemImpl {
	
	
	public ItemDTO toDto(Item item) {
		return ItemDTO.builder().idItem(item.getIdItem())
				.estado(item.getEstado())
				.identificadorArmado(item.getIdentificadorArmado())
				.nombreCarpeta(item.getNombreCarpeta())
				.tipoRespuesta(item.getTipoRespuesta())			
				.estadoCargueItem(item.getEstadoCargueItem())
				.observacionesValidacion(item.getObservacionesValidacion())
				.recursosItem(item.getRecursosItem())
				.estadoCargueItemMovil(item.getEstadoCargueItemMovil())
				.observacionesValidacionMovil(item.getObservacionesValidacionMovil())
				.build();
	}
	
    
	/*itemDTO = new ItemDTO();
	itemDTO.setIdItem(rs.getLong("ID"));
	itemDTO.setIdentificadorArmado(rs.getString("IDARMADO"));
	String estado = rs.getString("ESTADO");
	if (estado != null) {
		if (estado.equals(EnumEstadoCargueItem.RECHAZADO.getCodigo())) {
			itemDTO.setEstadoCargueItem(EnumEstadoCargueItem.RECHAZADO.getNombre());
		} else if (estado.equals(EnumEstadoCargueItem.NO_VERIFICADO.getCodigo())) {
			itemDTO.setEstadoCargueItem(EnumEstadoCargueItem.NO_VERIFICADO.getNombre());
		} else if (estado.equals(EnumEstadoCargueItem.VERIFICADO.getCodigo())) {
			itemDTO.setEstadoCargueItem(EnumEstadoCargueItem.VERIFICADO.getNombre());
		}
	}

	itemDTO.setFechaCargueFormateada(rs.getString("FECHA"));
	itemDTO.setObservacionesValidacion(rs.getString("OBSERVACIONES"));
	itemDTO.setRecursosItem(rs.getString("RECURSOS"));
	itemDTO.setUsuarioModificacion(rs.getString("USUARIO"));
	String estadoMovil = rs.getString("ESTADOCARGUEMOVIL");
	if (estadoMovil != null) {
		if (estadoMovil.equals(EnumEstadoCargueItem.RECHAZADO.getCodigo())) {
			itemDTO.setEstadoCargueItemMovil(EnumEstadoCargueItem.RECHAZADO.getNombre());
		} else if (estadoMovil.equals(EnumEstadoCargueItem.NO_VERIFICADO.getCodigo())) {
			itemDTO.setEstadoCargueItemMovil(EnumEstadoCargueItem.NO_VERIFICADO.getNombre());
		} else if (estadoMovil.equals(EnumEstadoCargueItem.VERIFICADO.getCodigo())) {
			itemDTO.setEstadoCargueItemMovil(EnumEstadoCargueItem.VERIFICADO.getNombre());
		}
	}
	itemDTO.setObservacionesValidacionMovil(rs.getString("OBSERVACIONESMOVIL"));
	listaItemBolsa.add(itemDTO);*/
	
	
	
	public Item convertirEntity(ItemDTO itemDTO) {
		Item item = new Item();
		item.setIdItem(itemDTO.getIdItem());
		item.setNombreCarpeta(itemDTO.getNombreCarpeta());
		item.setIdentificadorArmado(itemDTO.getIdentificadorArmado());
		item.setTipoRespuesta(itemDTO.getTipoRespuesta());
		item.setFechaCreacion(itemDTO.getFechaCreacion());
		item.setUsuarioCreacion(itemDTO.getUsuarioCreacion());
		item.setEstado(itemDTO.getEstado());
		item.setFechaModificacion(itemDTO.getFechaModificacion());
		item.setUsuarioModificacion(itemDTO.getUsuarioModificacion());
		item.setEstadoCargueItem(itemDTO.getEstadoCargueItem());
		item.setObservacionesValidacion(itemDTO.getObservacionesValidacion());
		item.setRecursosItem(itemDTO.getRecursosItem());		
		item.setEstadoCargueItemMovil(itemDTO.getEstadoCargueItemMovil());
		item.setObservacionesValidacionMovil(itemDTO.getObservacionesValidacionMovil());
		
		return item;
	}
	

}
